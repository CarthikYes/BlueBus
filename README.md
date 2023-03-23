
![Logo](https://raw.githubusercontent.com/CarthikYes/Images/main/BB.PNG)


# Blue Bus Reservation System

 **C.L.I BASED APPLICATION**

This application, which allows **Passengers** to browse the **Bus Schedule / Timetable** and arrange a **Reservation** for their trip.  

The application's primary objective is to provide **Passengers with both a Simple & User-Friendly Reservation Experience.**

The application will be used by the **two** categories of users:

- **Admin (Administrator)**

- **User (Passenger)** 
## Tech Stack

- JAVA
- J.D.B.C
- MYSQL







## System Structure

The platform allows a passenger to browse through the bus schedule and make a reservation, as well as the Administrator to add buses, routes, view and confirm customer reservations.

When a person books or reserves a ticket, the reservation goes to Administrator for confirmation and the status is set as "Waiting" for the particular reservation. 

Once the Administrator verifies and confirms the reservation, the status changes from "Pending / Waiting" to "Confirmed". 

- Administrator
    -
    - Add New Buses into Depot
    - Remove Buses from Depot
    - Add New Route into Timetable
    - Delete Route from Timetable 
    - Confirm Passenger's Reservations

- User / Passenger
    -
    - Book New Reservations
    - Cancel Reservations
    - Check Reservations Status




## Setting & Installation 

Install the Spring Tools Suite 
```bash
https://spring.io/tools
```

Install MySQL Community Server

```bash
https://dev.mysql.com/downloads/mysql/
```

Clone the Project

```bash
git clone https://github.com/CarthikYes/BlueBus.git
```

Open MySQL Server
```bash
Create a New Database in SQL: Bus_Reservation_System 
```
Go to the Project Directory & Open SQL Folder > SQL Tables

```bash
Create The Same Tables in Your Bus_Reservation_System Database 
```

Create a Admin For Your Database

```bash
INSERT INTO ADMIN VALUES('userdefine','userdefine');
```




## Run Locally


Go to the Project Directory

```bas
Open the Bus_Ticket_Reservation_System Folder With S.T.S 
```

Go to Build Path > Libraries > Class_Path

```bash
 Add the Jar File Present in JDBC Driver As External Jar
```
Go to Utility Package > Data Base Utility 

```bash
Connection = DriverManager.getConnection(url, "root", "ENTER YOUR SQL SERVER PASSWORD");
```

Go to Run Package 

```bash
NOTE : Insert Data Into Database Either Through Application OR Through MySQL By Entering the Queries From SQL Queries  
```

```bash
Run as Java Application !
```





