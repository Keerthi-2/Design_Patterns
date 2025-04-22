package factor_design;

public class CarFactory {

    // TATA , SKODA, CRETA , AUDI, HYUNDAI
      public static Car getCar(String carName){
          if(carName=="Hyundai"){
              return new Hyundai();
          }
          else if(carName=="Audi"){
              return new Audi();
          }
          else if(carName=="Skoda"){
              return new Skoda();
          }
          else if(carName=="Tata"){
              return new Tata();
          }
          else{
              System.out.println("there is no such type of car");
              return null;
          }



      }
}
