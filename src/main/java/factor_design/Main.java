package factor_design;

public class Main {
    public static void main(String[] args){

//        Tata car1=new Tata();
//        car1.create();
//        Hyundai car2=new Hyundai();
//        car2.create();
//        Audi car3=new Audi();
//        car3.create();
//        Skoda car4=new Skoda();
//        car4.create();

        // parentclass obj=new Childclass
//        int a=5;
//        Car car1=new Tata();
//        car1.create();
//        //car1.evCreate();
//        Car car2=new Skoda();
//        car2.create();
//        Car car3=new Hyundai();
//        car3.create();
//        Car car4=new Audi();
//        car4.create();  // factory has all the details of cars and object to create
         // Easy to add or remove a new car using factory
        // carInterface(Car) reference is used because its common for all cars


        //step 1: food interface  has method=preparefood()
        //differnet type of food classes: dosa,idli,poori,vada
        // factory is menu card
        // Since all the concrete classes has the same functionality name so that i am
        // just inherting from base interface why because my reference datatype is same for all
        //in the main method u will call factory which is called menu to create type of food
        //class Factory  { public static Food getFood(String foodname){
//        if(foodname=="idli")   return new Idli();
//        elif(foodname=="vada") return new Vada();//


        Car car1=CarFactory.getCar("Audi");
        car1.create();
        Car car2=CarFactory.getCar("Tata");
        car2.create();
        Car car3=CarFactory.getCar("Hyundai");
        car3.create();
        Car car4=CarFactory.getCar("Skoda");
        car4.create();
        Car car5=CarFactory.getCar("BMW");
        car5.create();










    }
}
