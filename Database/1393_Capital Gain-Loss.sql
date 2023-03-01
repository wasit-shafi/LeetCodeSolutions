/* Referred discussion section */

/* METHOD 1 : using CTE + join */

with stocks_buy as (
        select
            stock_name,
            sum(price) as buy_price
        from stocks
        where operation = 'Buy'
        group by
            stock_name
    ),
    stocks_sell as (
        select
            stock_name,
            sum(price) as sell_price
        from stocks
        where
            operation = 'Sell'
        group by stock_name
    )
select
    stocks_buy.stock_name, (
        stocks_sell.sell_price - stocks_buy.buy_price
    ) as capital_gain_loss
from stocks_buy
    join stocks_sell on stocks_buy.stock_name = stocks_sell.stock_name;

/* METHOD 2: using case/if within aggregate function */

/* using if() */
/* 
select
    stock_name,
    sum(
        if(operation = 'buy', - price, price)
    ) as capital_gain_loss
from stocks
group by stock_name; */

/* using case */

/* select
    stock_name,
    sum(
        case
            when operation = 'Buy' then - price
            else price
        end
    ) as capital_gain_loss
from stocks
group by stock_name; */

/* METHOD 3: using  window function*/

/* select
    distinct stock_name,
    sum(
        if(operation = 'Buy', - price, price)
    ) over(partition by stock_name) as capital_gain_loss
from stocks; */