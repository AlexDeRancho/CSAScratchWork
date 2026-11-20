public class SoccerCampWorkout {
   private String name; 
   private String catagory;
   private int numberOfPlayers;
   private double monthlyPaymentFree;
   private boolean paymentAvailable;
   private double meetingCost;
   //constructors
   public SoccerCampWorkout();
   catagory = "training";
   numberOfStudents = 50;
   monthlyPaymentfree = 0.0;
   paymentAvailable = 300.00;
   meetingCost = 300.00;
   }
   public soccerCampWorkout (String name, String catagory, int numberOfPlayers, double monthlyPaymentFree; boolean paymentAvailable, double meetingCost) {
   this.name = name;
   this.catagory = catagory;
   this.numberOfPlayers = numberOfPlayers;
   this.monthlyPaymentfree = monthlyPaymentfree;
   this.paymentAvailable = paymentAvailable;
   this.meetingCost = meetingCost;
   }
   //methods
   public void meet(); {
   paymentAvailable -= meetingCost;
   system.out.printlln("Subtracted" + meetingCost + "from paymentAvailable. payment Avialable: " + paymentAvailable);
      
   
}