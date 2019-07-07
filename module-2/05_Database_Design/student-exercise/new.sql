SELECT name
FROM park
ORDER BY name ASC;

SELECT * 
FROM park
WHERE park_id = 1;

SELECT * 
FROM site
JOIN reservation ON reservation.side_id = site.site_id
WHERE site.site_id = 1;


SELECT reservation.from_date , reservation.to_date, site.site_number, site.max_occupancy, site.accessible, site.max_rv_length,site.utilities
FROM reservation
right JOIN site ON site.site_id = reservation.site_id
WHERE site.campground_id = 1 AND  not ('2019-07-17'  >= reservation.from_date and '2019-07-17'  <= reservation.to_date) OR reservation.from_date IS NULL 
AND ('2019-07-30' NOT BETWEEN reservation.from_date AND reservation.to_date)  OR reservation.from_date IS NULL 
ORDER BY site.site_id ASC


SELECT first_name, last_name, email, activebool  
FROM customer
WHERE last_name ILIKE'%SON%' OR first_name ILIKE '%SON%'
ORDER BY last_name 


DELETE FROM reviews WHERE username = 'WEFF'
