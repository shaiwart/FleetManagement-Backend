drop database project_v3; 
create database Project_v3; 
use project_v3; 




INSERT INTO state (state_id, state_name) VALUES
(1, 'ANDAMAN AND NICOBAR ISLANDS'),
(2, 'ANDHRA PRADESH'),
(3, 'ARUNACHAL PRADESH'),
(4, 'ASSAM'),
(5, 'BIHAR'),
(6, 'CHATTISGARH'),
(7, 'CHANDIGARH'),
(8, 'DAMAN AND DIU'),
(9, 'DELHI'),
(10, 'DADRA AND NAGAR HAVELI'),
(11, 'GOA'),
(12, 'GUJARAT'),
(13, 'HIMACHAL PRADESH'),
(14, 'HARYANA'),
(15, 'JAMMU AND KASHMIR'),
(16, 'JHARKHAND'),
(17, 'KERALA'),
(18, 'KARNATAKA'),
(19, 'LAKSHADWEEP'),
(20, 'MEGHALAYA'),
(21, 'MAHARASHTRA'),
(22, 'MANIPUR'),
(23, 'MADHYA PRADESH'),
(24, 'MIZORAM'),
(25, 'NAGALAND'),
(26, 'ORISSA'),
(27, 'PUNJAB'),
(28, 'PONDICHERRY'),
(29, 'RAJASTHAN'),
(30, 'SIKKIM'),
(31, 'TAMIL NADU'),
(32, 'TRIPURA'),
(33, 'UTTARAKHAND'),
(34, 'UTTAR PRADESH'),
(35, 'WEST BENGAL'),
(36, 'TELANGANA');





INSERT INTO city (city_id, city_name, state_id) VALUES
(2101, 'Ahmednagar', 21),
(2102, 'Akola', 21),
(2103, 'Amravati', 21),
(2104, 'Aurangabad', 21),
(2105, 'Beed', 21),
(2106, 'Bhandara', 21),
(2107, 'Buldhana', 21),
(2108, 'Chandrapur', 21),
(2109, 'Dhule', 21),
(2110, 'Gadchiroli', 21),
(2111, 'Gondia', 21),
(2112, 'Hingoli', 21),
(2113, 'Jalgaon', 21),
(2114, 'Jalna', 21),
(2115, 'Kolhapur', 21),
(2116, 'Latur', 21),
(2117, 'Mahabaleshwar', 21),
(2118, 'Mumbai', 21),
(2119, 'Mumbai City', 21),
(2120, 'Mumbai Suburban', 21),
(2121, 'Nagpur', 21),
(2122, 'Nanded', 21),
(2123, 'Nandurbar', 21),
(2124, 'Nashik', 21),
(2125, 'Osmanabad', 21),
(2126, 'Parbhani', 21),
(2127, 'Pune', 21),
(2128, 'Raigad', 21),
(2129, 'Ratnagiri', 21),
(2130, 'Sangli', 21),
(2131, 'Satara', 21),
(2132, 'Solapur', 21),
(2133, 'Sindhudurg', 21),
(2134, 'Thane', 21),
(2135, 'Wardha', 21),
(2136, 'Washim', 21),
(2137, 'Yavatmal', 21);


INSERT INTO city (city_id, city_name, state_id) VALUES
(2201, 'Bishnupur', 22),
(2202, 'Chandel', 22),
(2203, 'Churachandpur', 22),
(2204, 'Imphal East', 22),
(2205, 'Imphal West', 22),
(2206, 'Senapati', 22),
(2207, 'Tamenglong', 22),
(2208, 'Thoubal', 22),
(2209, 'Ukhrul', 22);





INSERT INTO airport (airport_id, airport_code, airport_name) VALUES (1, 1001, 'Airport 1');
INSERT INTO airport (airport_id, airport_code, airport_name) VALUES (2, 1002, 'Airport 2');
INSERT INTO airport (airport_id, airport_code, airport_name) VALUES (3, 1003, 'Airport 3');
INSERT INTO airport (airport_id, airport_code, airport_name) VALUES (4, 1004, 'Airport 4');
INSERT INTO airport (airport_id, airport_code, airport_name) VALUES (5, 1005, 'Airport 5');







INSERT INTO hubs (address, contact_number, hub_name, city_id) VALUES
('123 Main St', '123-456-7890', 'Central Hub', 2101);


INSERT INTO hubs (address, contact_number, hub_name, city_id, airport_id) VALUES
('456 Elm St', '987-654-3210', 'Northern Hub', 2118, 1);


INSERT INTO hubs (address, contact_number, hub_name, city_id, airport_id) VALUES
('789 Oak St', '555-123-4567', 'Southern Hub', 2127, 2);


INSERT INTO hubs (address, contact_number, hub_name, city_id) VALUES
('101 Maple Ave', '444-555-6666', 'Eastern Hub', 2130);


INSERT INTO hubs (address, contact_number, hub_name, city_id) VALUES
('222 Pine Rd', '888-999-0000', 'Western Hub', 2134);






INSERT INTO car_category (category_name, daily_rates, monthly_rates, weekly_rates, img_path) VALUES
('Economy', 45.99, 799.99, 249.99, 'img/economy_car.jpg');


INSERT INTO car_category (category_name, daily_rates, monthly_rates, weekly_rates, img_path) VALUES
('Compact', 55.99, 899.99, 279.99, 'img/compact_car.jpg');


INSERT INTO car_category (category_name, daily_rates, monthly_rates, weekly_rates, img_path) VALUES
('Midsize', 65.99, 999.99, 299.99, 'img/midsize_car.jpg');


INSERT INTO car_category (category_name, daily_rates, monthly_rates, weekly_rates, img_path) VALUES
('SUV', 75.99, 1199.99, 349.99, 'img/suv_car.jpg');


INSERT INTO car_category (category_name, daily_rates, monthly_rates, weekly_rates, img_path) VALUES
('Luxury', 99.99, 1699.99, 499.99, 'img/luxury_car.jpg');








INSERT INTO car (availabiity, capacity, car_name, car_numberplate, color, fuel_type, milage, hub_id, category_id)
VALUES (0, 5, 'Toyota Corolla', 123456, 'R', 'Petrol', 20.5, 1, 1);


INSERT INTO car (availabiity, capacity, car_name, car_numberplate, color, fuel_type, milage, hub_id, category_id)
VALUES (1, 4, 'Honda Civic', 987654, 'B', 'Petrol', 22.0, 3, 2);


INSERT INTO car (availabiity, capacity, car_name, car_numberplate, color, fuel_type, milage, hub_id, category_id)
VALUES (1, 7, 'Ford Focus', 567890, 'G', 'Petrol', 18.5, 2, 3);


INSERT INTO car (availabiity, capacity, car_name, car_numberplate, color, fuel_type, milage, hub_id, category_id)
VALUES (1, 5, 'Nissan Rogue', 345678, 'S', 'Diesel', 24.5, 4, 4);


INSERT INTO car (availabiity, capacity, car_name, car_numberplate, color, fuel_type, milage, hub_id, category_id)
VALUES (1, 4, 'Mercedes S-Class', 111222, 'B', 'Petrol', 14.0, 4, 5);





INSERT INTO users (aadhar_no, address, dl_no, first_name, is_employee, last_name, email_id, mobile_number, passport_no, password, state_id, hub_id, city_id)
VALUES 
    (1234567890, '123 Main St', 'DL12345', 'John', 1, 'Doe', 'john@example.com', '555-123-4567', 9876543210, 'password1', 1, 1, 2101),
    (9876543210, '456 Elm St', 'DL54321', 'Jane', 0, 'Smith', 'jane@example.com', '555-987-6543', 1234567890, 'password2', 2, null, 2102),
    (5555555555, '789 Oak St', 'DL67890', 'Alice', 0, 'Johnson', 'alice@example.com', '555-555-5555', 5555555555, 'password3', 3, null, 2103),
    (9999999999, '101 Pine St', 'DL00001', 'Bob', 0, 'Brown', 'bob@example.com', '555-999-9999', 1111111111, 'password4', 4, null, 2104),
    (2222222222, '202 Cedar St', 'DL22222', 'Eva', 0, 'Lee', 'eva@example.com', '555-222-2222', 2222222222, 'password5', 1, null, 2105),
    (7777777777, '303 Birch St', 'DL77777', 'David', 0, 'Wong', 'david@example.com', '555-777-7777', 7777777777, 'password6', 2, null, 2106),
    (8888888888, '404 Maple St', 'DL88888', 'Olivia', 1, 'Taylor', 'olivia@example.com', '555-888-8888', 8888888888, 'password7', 3, 3, 2107),
    (3333333333, '505 Redwood St', 'DL33333', 'Michael', 1, 'Anderson', 'michael@example.com', '555-333-3333', 3333333333, 'password8', 4, 2, 2108),
    (6666666666, '606 Spruce St', 'DL66666', 'Sophia', 0, 'Martinez', 'sophia@example.com', '555-666-6666', 6666666666, 'password9', 1, null, 2109),
    (4444444444, '707 Walnut St', 'DL44444', 'James', 0, 'Garcia', 'james@example.com', '555-444-4444', 4444444444, 'password10', 2, null, 2110);







INSERT INTO Booking (aadhar_no, booking_date_and_time, dlnumber, email_id, first_name, last_name, mobile_number, passport_no, city_id, drop_hub_hub_id, pickup_hub_hub_id, state_id, user_id)
VALUES
    ('123456789012', '2023-08-01 10:00:00', 'DL123456', 'user1@example.com', 'John', 'Doe', '1234567890', 'AB123456', 2101, 1, 2, 21, 1),
    ('987654321012', '2023-08-02 11:00:00', 'DL987654', 'user2@example.com', 'Jane', 'Smith', '9876543210', 'CD987654', 2101, 3, 4, 21, 2),
    ('555555555555', '2023-08-03 12:00:00', 'DL555555', 'user3@example.com', 'Michael', 'Johnson', '5555555555', 'EF555555', 2101, 1, 1, 21, 3),
    ('111111111111', '2023-08-04 13:00:00', 'DL111111', 'user4@example.com', 'Emily', 'Brown', '1111111111', 'GH111111', 2101, 2, 2, 21, 4),
    ('999999999999', '2023-08-05 14:00:00', 'DL999999', 'user5@example.com', 'David', 'Wilson', '9999999999', 'IJ999999', 2101, 2, 3, 21, 5);



INSERT INTO Billing (bill_amount, billing_name, customer_aadhar_no, customer_mobile_no, customer_pass_no, end_date, fuel_status, start_date, user_email_id, category_id, booking_id, car_id, drop_hub_hub_id, pickup_hub_hub_id)
VALUES
    (150.0, 'Billing 1', '123456789012', '1234567890', 'pass123', '2023-08-10', 'Full', '2023-08-01', 'user1@example.com', 1, 1, 1, 2, 3),
    (200.0, 'Billing 2', '987654321012', '9876543210', 'pass456', '2023-08-15', 'Empty', '2023-08-05', 'user2@example.com', 2, 2, 2, 3, 4),
    (175.0, 'Billing 3', '555555555555', '5555555555', 'pass789', '2023-08-20', 'Half', '2023-08-10', 'user3@example.com', 3, 3, 3, 4, 5),
    (220.0, 'Billing 4', '111111111111', '1111111111', 'pass101', '2023-08-25', 'Full', '2023-08-15', 'user4@example.com', 4, 4, 4, 5, 4),
    (300.0, 'Billing 5', '999999999999', '9999999999', 'pass111', '2023-08-30', 'Full', '2023-08-20', 'user5@example.com', 5, 5, 5, 2, 3);





########################################################################################

// Booking table entry JSON 
{
  "bookingDateAndTime": "2023-08-22T15:30:00",
  "firstName": "James",
  "lastName": "Garcia",
  "mobileNumber": "9876543210",
  "emailId": "jane.smith@example.com",
  "dLNumber": "DL987654",
  "aadharNo": "123456789012",
  "passportNo": "987654321",
  "user": {
    "userId": 10
  },
  "state": {
    "stateId": 2
  },
  "city": {
    "cityId": 2110
  },
  "pickupHub": {
    "hubId": 2
  },
  "dropHub": {
    "hubId": 3
  },
  "category": {
    "categoryId": 1
  }
}



// Booking table entry JSON 

{
    "bookingDateAndTime": "2023-08-22T15:30:00",
    "firstName": "James",
    "lastName": "Garcia",
    "mobileNumber": "9876543210",
    "emailId": "jane.smith@example.com",
    "dLNumber": "DL987654",
    "aadharNo": "123456789012",
    "passportNo": "987654321",
    "user": {
        "userId": 1
    },
    "state": {
        "stateId": 1
    },
    "city": {
        "cityId": 2110
    },
    "pickupHub": {
        "hubId": 1
    },
    "dropHub": {
        "hubId": 2
    },
    "category": {
        "categoryId": 1
    }
}



UPDATE car_category
SET
    category_name = CASE
        WHEN category_id = 1 THEN 'Economy'
        WHEN category_id = 2 THEN 'Compact'
        WHEN category_id = 3 THEN 'Midsize'
        WHEN category_id = 4 THEN 'SUV'
        WHEN category_id = 5 THEN 'Luxury'
    END,
    daily_rates = CASE
        WHEN category_id = 1 THEN 45.99
        WHEN category_id = 2 THEN 55.99
        WHEN category_id = 3 THEN 65.99
        WHEN category_id = 4 THEN 75.99
        WHEN category_id = 5 THEN 99.99
    END,
    img_path = CASE
        WHEN category_id = 1 THEN '/Images/Car/economy_car.jpg'
        WHEN category_id = 2 THEN '/Images/Car/compact_car.jpg'
        WHEN category_id = 3 THEN '/Images/Car/midsize_car.jpg'
        WHEN category_id = 4 THEN '/Images/Car/suv1.jpg'
        WHEN category_id = 5 THEN '/Images/Car/luxury_car.jpg'
    END,
    monthly_rates = CASE
        WHEN category_id = 1 THEN 799.99
        WHEN category_id = 2 THEN 899.99
        WHEN category_id = 3 THEN 999.99
        WHEN category_id = 4 THEN 1199.99
        WHEN category_id = 5 THEN 1699.99
    END,
    weekly_rates = CASE
        WHEN category_id = 1 THEN 249.99
        WHEN category_id = 2 THEN 279.99
        WHEN category_id = 3 THEN 299.99
        WHEN category_id = 4 THEN 349.99
        WHEN category_id = 5 THEN 499.99
    END
WHERE category_id IN (1, 2, 3, 4, 5);





//Billing Table Entry Json

{
    "billingName": "Billing 1",
    "billAmount": 150.0,
    "fuelStatus": "Full",
    "startDate": "2023-08-01",
    "endDate": "2023-08-10",
    "userEmailId": "user1@example.com",
    "customerMobileNo": "1234567890",
    "customerAadharNo": "123456789012",
    "customerPassNo": "pass123",
    "car": {
      "carId": 1
    },
    "booking": {
      "bookingId": 5
    },
    "pickupHub": {
      "hubId": 2
    },
    "dropHub": {
      "hubId": 3
    }
  }