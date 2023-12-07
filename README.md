# Parking System Command Line Utility
Command Line Utility Car Parking System

Steps for Project Setup

1. Follow the steps to run Car Parking Ticketing System.
2. Clone Parking Lot Command Line Utility.
3. Open the terminal in same directory
4. Type "./mvnw -Pnative native:compile -DskipTests=true" - This will create executable in target folder.
5. Run the executable
6. Or you can directly run the project in your IDE.

Commands:

Car Commands

all-car: This command is used get all cars in the parking.

car-by-colour: This command is used get all cars by colour.

OPTIONS:

    --col String
    Write the colour of Car

Parking Lot Commands

park-car: This command is used to park the car.

OPTIONS:

    --regNo String
    Write the registration number of Car

    --col String
    Write the colour of the car

create-parking: This command is used to create parking lot.

OPTIONS:
    
    --cpty Integer
       Write the capacity of parking space


Ticket Commands

tickets-by-col: This command is used to get ticket no's by car colour.

OPTIONS:

    --col String
       Write the colour of Car

ticket-by-reg-no: This command is used to get ticket no by car registration no.

OPTIONS:

    --regNo String
    Write the registration number of Car