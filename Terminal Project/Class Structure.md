
### 1. **Class Structure**
- **Airport**: Central class managing the overall system.
- **Flight**: Represents individual flights.
- **Airline**: Represents different airlines operating in the airport.
- **Passenger**: Represents individual passengers.
- **Ticket**: Represents tickets booked by passengers.
- **Staff**: Represents airport staff, including ground staff and aircrew.
- **Gate**: Represents boarding gates.
- **Baggage**: Represents baggage handling.
- **Schedule**: Manages flight schedules.

### 2. **Attributes and Methods**
#### **Airport**
- **Attributes**: 
  - List of flights
  - List of staff
  - List of gates
- **Methods**: 
  - Add/remove flight
  - Add/remove airline
  - Add/remove staff
  - Allocate gate to flight
  - Display flight schedule

#### **Flight**
- **Attributes**: 
  - Flight number
  - Airline
  - Departure and arrival times
  - Origin and destination
  - List of passengers
  - Gate
- **Methods**: 
  - Add/remove passenger
  - Update flight status (on-time, delayed, cancelled)
  - Assign gate

#### **Airline**
- **Attributes**: 
  - Name
  - Code
  - List of flights
- **Methods**: 
  - Add/remove flight
  - Update airline information

#### **Passenger**
- **Attributes**: 
  - Name
  - Passport number
  - Ticket
  - Contact details
- **Methods**: 
  - Book/cancel ticket
  - Update personal details

#### **Ticket**
- **Attributes**: 
  - Ticket number
  - Passenger
  - Flight
  - Seat number
  - Price
- **Methods**: 
  - Issue ticket
  - Cancel ticket
  - Update seat number

#### **Staff**
- **Attributes**: 
  - Name
  - Staff ID
  - Role (ground staff, aircrew)
  - Contact details
- **Methods**: 
  - Assign to flight/gate
  - Update personal details

#### **Gate**
- **Attributes**: 
  - Gate number
  - Current flight
- **Methods**: 
  - Assign flight to gate
  - Release gate

#### **Baggage**
- **Attributes**: 
  - Baggage ID
  - Passenger
  - Flight
  - Status (checked-in, in transit, delivered)
- **Methods**: 
  - Check-in baggage
  - Track baggage status


### 3. **Interactions and Relationships**
- **Composition**: Airport has flights, airlines, staff, and gates.
- **Aggregation**: Flight has passengers and is associated with an airline.
- **Inheritance**: Different types of staff (e.g., ground staff, aircrew) inheriting from a base Staff class.
- **Association**: Passengers book tickets for flights.

### 4. **Functional Requirements**
- **Flight Management**: Adding, removing, updating flight details.
- **Passenger Management**: Booking, cancelling tickets, checking in, managing personal details.
- **Staff Management**: Assigning staff to flights/gates, updating staff details.
- **Gate Management**: Allocating gates to flights, updating gate status.
- **Baggage Handling**: Checking in baggage, tracking baggage status.
- **Schedule Management**: Creating and updating flight schedules.

### 5. **Non-Functional Requirements**
- **Scalability**: System should handle increasing number of flights, passengers, and staff.
- **Usability**: User-friendly interface for interaction.
- **Performance**: Efficient handling of data and operations.
- **Security**: Ensuring data privacy and security for passengers and staff.

