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

    Example:
    all-car
car-by-colour: This command is used get all cars by colour.

OPTIONS:

    --col String
    Write the colour of Car
    [Mandatory]

    Example:
    car-by-colour --col black

Parking Lot Commands

park-car: This command is used to park the car.

OPTIONS:

    --regNo String
    Write the registration number of Car
    [Mandatory]

    --col String
    Write the colour of the car
    [Mandatory]

    Example:
    park-car --regNo MH12TV1342 --col black

create-parking: This command is used to create parking lot.

OPTIONS:
    
    --cpty Integer
    Write the capacity of parking space
    [Mandatory]

    Example:
    create-parking --cpty 100


Ticket Commands

tickets-by-col: This command is used to get ticket no's by car colour.

OPTIONS:

    --col String
    Write the colour of Car
    [Mandatory]

    Example:
    tickets-by-col --col black

ticket-by-reg-no: This command is used to get ticket no by car registration no.

OPTIONS:

    --regNo String
    Write the registration number of Car
    [Mandatory]

    Example:
    ticket-by-reg-no --regNo MH12TV1342