
Home page 
- get cities by stateId [done 
- get hubs by cityId [done 



Booking page
- POST in booking table [done 
- GET record from booking table by (phone number or email) [both done 
	- This will be used by Employee at the time of handover. 
	- Need a custom query for this to get the latest booking by a user. 
	- Select * from booking where phone_number = 12345 order by booking_date_and_time DESC; 
- Note: i made some chages in entity. added cascadetype.ALL - so if any issues occurs during POST . thoda dekh lena. 
- When we try to serialize an instance of “Item,” Jackson will throw a JsonMappingException exception => https://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion
- https://stackoverflow.com/questions/36034983/stackoverflow-exception-while-using-hibernate-and-jackson-on-bi-directional-obje 
- abc 


Car 
- UPDATE - isAvailable = 0/1 
- UPDATE - fuelStatus 





User 
- POST - put all details of a user into user table 
- GET - get user by emailId + password 
- UPDATE - 
 