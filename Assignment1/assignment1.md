INFO5100 Application Engineering and Development
Assignment 1
Jiaqi Chen
NUID:001548358
Spring 2021

1. Order Pizza from Dominos

Object: User
Data: name, phone, email, address, zip code, order 
Behaviors:
Login DominosAPP() {
           DominosAPP.login (name);
}
FindAStore(){
           Enter(Zip Code)->FindAOpenStore;
}
AddPizzaToCart(){
           SelectPizza(Type, Size, Number);
}
AddSidesToCart(){
          SelectSides(Type, Number);
}
EnterContactInformation(){
          User(FirstName. LastName. Phone. Email);
} 
SelectDeliverMethod
          if(OrderDelivery ())
                      EnterDeliveryAddress(); 
          else 
                      StoreAddress();    
Review (){
          System.out.println(this.order);           
}
Payment(){
           if (CreditCard. CardAvailable())
                       DominosAPP.complete(order);
          else
                       Error;
}
ContactDominos(){
          Service.call (order. Store. Data.phone);
}

Object: DominosStore
Data: location, phone, Pizza (Type, Size, Number), Sides (Type, Number), order, businessTime
Behaviors:
ConfirmOrder ( ) {
               System.out.println (PizzaAndSides);
               if (confirm) return true;
               else             return false;
}

RemindPickup ( ) {
               If (user select carryout)
                          Remind (OrderReady);  
}               
Call (number) {
                PhoneCall (order.user.data.number);
}

Object: DominosAPP
Data: status
Behaviors:
Login(username){
               List namelist
               for (each name in the namelist){
                        if (username == name) return true;
                        else return false;
}
MaintainData(order){
               RecordOrder(store. items. number. status);
}
 
Object: CreditCard
Data: type, bankName, cardNumber, address, expireDate, securityCode
Behavior:
cardAvailable(){
              currentDate = new date();
              return currenDate.compareTo(expireDate); 
}

Object: MapService
Data: storeLocation
Behavior:
findAStore(zip code) {
               List<store> storeList;
               For (each store in storeList){
               if (store has the same zip code)
                       return StoreLocation;
               }
               else
                       return NearStoreLocation;              
}

2. Design a platform for buying tickets of local events.

Object: User
Data: name, phone, email, Location
Behaviors:
Login Platform () {
            login (name);
}
SearchEvent(){
            EnterKeyInfo(ZipCode/CityName.DesireDate.EventType/name);
}               
addEventTicketToCart(){
            if(AvailableTicketNumber>0)           
                    addTickets;
           else   SearchAnotherEvent;
}            
EnterContactInformation(){
           User(FirstName. LastName. Phone. Email);
Review (){
           System.out.println(this.order);           
}
Payment(){
           if (CreditCard. CardAvailable())
                       completeOrder();
}
Cancel (){
           if (currentDate is three days earlier than eventDate){
                   orderEnd();  
}
          else
                   Error;
}
PhoneCall(){
           HelpService.Call();
}

Object: Host
Data: eventInfo(type, location, date, time, TicketNumber, SaleStartDate, SaleEndDate)
Behaviors:
UploadEvent(){
            EventInfo();
}

Object:Platform
data: status, availableTicketNumber
Behaviors:
Login(username){
               List namelist;
               for (each name in the namelist){
                        if (username == name) return true;
                        else return false;
}
MaintainData(order){
               RecordOrder(event. ticket.number. status)
}
UpdateTicketNumber(){   
                 
                 while(orderComplete)
                            availableTicketNumber= availableTicketNumber-order.ticketNumber;
                  while(orderCancel)
                            availableTicketNumber= availableTicketNumber+order.ticketNumber;
}

Object: CreditCard
Data: type, bankName, cardNumber, address, expireDate, securityCode
Behaviors:
cardAvailable(){
              currentDate = new Date();
              return currenDate.compareTo(expireDate); 
}

Object: MapService
Data: eventLocation
Behaviors:
findEvents() {
               List<event> eventList;
               For (each event in eventList){
               if (store has the same zip code/cityname){
                       return eventLocation;
               }
               else
                       return NearEventLocation;              
}

Object: HelpService
Data: 
Behavior:
           Call(number) {
                            Phone.Call(number);
}
  
3. Design a Car Rental System.

Object: User
Data: name, phone, email, address, zip code, order, DriverLicence. 
Behavior:
Login () {
           login (name);
}
FindAStore (){
           Enter(Zip Code)->FindAOpenStore;
}
AddCarToCart( ) {
           SelectCar(Size, Maker, Model, rentDate);
}
EnterDriverInformation(){
          Driver(FirstName. LastName. DriverLicenseID. Phone. DriverNumber);
}
Review () {
          System.out.println(this.order);           
}
Payment(){
           if (CreditCard. CardAvailable())
                       ordercomplete();
          else
               Error;
}
ContactCarRentalStore(){
           Service.call (order.Store.Data.phone);
}

Object: CarRentalStore
Data: location, phone, car (Size, Maker, Model), order, businessTime
Behaviors:
ConfirmOrder () {
               System.out.println ()
               if (confirm) return true;
               else              return false;
}
             
Call (number) {
                PhoneCall (order.user.data.number);
}

Object: CarRentalSystem
Data: status
Behaviour:
Login(username){
               List namelist
               for (each name in the namelist){
                        if (username == name) return true;
                        else                                   return false;
}
MaintainData(order){
               RecordOrder(store. items. status);
}

Object: CreditCard
Data: type, bankName, cardNumber, address, expireDate, securityCode
Behavior:
cardAvailable(){
              currentDate = new date()
              return currenDate.compareTo(expireDate); 
}

Object: MapService
Data: storeLocation
Behavior:
findAStore(zip code) {
               List<store> storeList;
               For (each store in storeList){
               if (store has the same zip code){
                       return StoreLocation;
               }
               else
                       return NearStoreLocation;              
}
 
4. Design a Parking lot.

Objects, data and behaviors: 
Driver
             Data: name phone email
             Behaviors: DriveVehicle, PayParkingTicket, CallService
Vehicle:
             Data: vehicle plate
             
Counter:
             Data: availableSpotNumber
             
ParkingLotGate:
            Data: status 
            
Camera
            Data:Photo
            
SpotLight: 
            Data: status
            
ParkingLotSystem:
           Data: VehicleEnterTime         
           Behavior:
           CalculateParkingFee(){
                  Ticket(enterTime,currentTime);
           {
           Record PayTicketTime(){
           }      
Creditcard
          Data: type, bankName, cardNumber, address, expireDate, securityCode
          Behavior:
                  cardAvailable(){
                       currentDate = new date();
                       return currenDate.compareTo(expireDate); 
          }

Flow---
Vehicle=0; 
Counter=ParkingLotMaxCapacity;
AllSpotlight ->on
if(EntranceCamera recognize a vehicle plate&&Count>0){
           EntranceGateOPEN;
           Counter=Counter-1;
}
While (vehicle park on spot){
           SpotLight -> off;
}

While (vehicle leave spot){
           SpotLight -> on;
}
if(ExitCamera recognize a vehicle plate&&plateHasBeenPaidInFifteenMinuntes){
         EixtGateOPEN;
         Counter=Counter+1;
}
if(ExitCamera recognize a vehicle plate&&plateHasBeenPaidMoreThanFifteenMinuntes){
         EixtGateClosed;
         Remind.Service
if(Count=0);
          EntranceGate->Closed;
          ElectronicSign->FULL



5.Design a Traffic Controller System for a Junction.

Objects, data and Behaviors:

TrafficLights
        Data: color
        Behaviors: change color
PedestrainLights
        Data: color
        Behaviors: change color
PedestrainButton
        Data: status
        Behaviors: 
Pedestrain
        Data：
        Behaviors: press button      
Electronic sign
        Data: status
        Behaviors: showNoTurnOnRed

FourStatesofLights：
Traffic.Vertical.Straight move, with Pedestrain.Vertical move
Traffic.Horizontal.LeftTurn
TrafficLight.Horizontal.Straight move, with Pedestrain.Horizontal move
TrafficLight.Vertical.LeftTurn

TrafficLight.VerticalStraight=TL.VS
PedestrainLight.Vertical=PL.V
TrafficLight.HorizontalLeftTurn=TL.HLT
TrafficLight.HorizontalStraight=TL.HS
Pedestrainlight. Horizontal=PL.H
TrafficLight.VerticalLeftTurn=TL.VLT

MovementPhaseTime.VerticalStraight=MPT.VS
MovementPhaseTime. HorizontalLeftTurn=MPT.HLT
HorizontalStraight.MovementPhaseTime=MPT.HS
VerticalLeftTurn.MovementPhaseTime=MPT.VLT

TimeofYellowLight=T.YL
Time.cycle=1+MPT.VS+T.YL+1+MPT.HLT+T.YL+1+MPT.HS+T.YL+1+ MPT.VLT+T.YL

Sequence of Flow--
Timer=t;
int t;
for (t=0, t<=Time.cycle, t++){
        while(t=0) 
                   all trafficLights -> red;
         
        while(t=1) {
                   TL.VS -> green;
                   PL.V-> white.walk;
                   if(pedestrian press the button){
                          Horizontal.ElectronicSign->NoTurnOnRed
                   }
        }
        while(t=1+MPT.VS) {
                   TL.VS -> yellow;
                   PL.V-> red;
                       
       while(t=1+MPT.VS+T.YL) 
                   TL.VS -> red;
                   
       while(t=1+MPT.VS+T.YL+1) 
                   TL.HLT -> green;
       while(t=1+MPT.VS+T.YL+1+MPT.HLT) 
                   TL.HLT -> yellow;
       while(t=1+MPT.VS+T.YL+1+MPT.HLT+T.YL) 
                   TL.HLT -> red;
      
       while(t=1+MPT.VS+T.YL+1+MPT.HLT+T.YL+1) {
                   TL.HS -> green;
                   PL.H-> white.walk;
                   if(pedestrian press the button){
                                Vertical.ElectronicSign->NoTurnOnRed
                   }
       }

       while(t=1+MPT.VS+T.YL+1+MPT.HLT+T.YL+1+MPT.HS) 
                   TL.HS -> yellow;
                   PL.H-> red;
       while(t=1+MPT.VS+T.YL+1+MPT.HLT+T.YL+1+MPT.HS+T.YL) 
                   TL.HS -> red;
                   
       while(t=1+MPT.VS+T.YL+1+MPT.HLT+T.YL+1+MPT.HS+T.YL+1) 
                   TL. VLT -> green;
       while(t=1+MPT.VS+T.YL+1+MPT.HLT+T.YL+1+MPT.HS+T.YL+1+ MPT.VLT) 
                   TL. VLT -> yellow;
       while(t=1+MPT.VS+T.YL+1+MPT.HLT+T.YL+1+MPT.HS+T.YL+1+ MPT.VLT+T.YL) 
                   TL. VLT -> red;
          
}
t=t+1;
if(t>time.cycle){
         t=0; 
         Return;
}
(loop)

