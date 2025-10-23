package instance;

public class Tv {
   String brand;
   boolean power;
   int channel;

   void power(){
       power=!power;
   }
   void channelUp(){
       ++channel;
   }
   void channelDown(){
       --channel;
   }
}
