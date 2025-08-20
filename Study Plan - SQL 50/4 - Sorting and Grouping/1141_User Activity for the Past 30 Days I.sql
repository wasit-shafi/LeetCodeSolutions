/* Referred solutions: https://leetcode.com/problems/user-activity-for-the-past-30-days-i/solutions/1961049/just-do-what-is-asked-step-by-step/ */
SELECT
  activity_date AS day,
  COUNT(DISTINCT user_id) AS active_users
FROM
  Activity
WHERE
  (
    activity_date > '2019-06-27'
    AND activity_date <= '2019-07-27'
  )
GROUP BY
  activity_date;