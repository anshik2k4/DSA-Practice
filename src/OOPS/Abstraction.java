package OOPS;


 abstract class Animal{

     // we can create constructor also to jb bulldog ka object bnaayenge to sb constructor khudh call ho jaayega
     Animal(){
         System.out.println("Animal Constructor called");
     }
     void eat(){
         System.out.println("Animal eats");

     }

     abstract  void food(); // yaha hum bnaa rhe abstract function
 }


   abstract class dog extends Animal {

     dog(){
         System.out.println("Dog Constructor called");
     }

       void food() { // yaha hum define kr rhee
           System.out.println("Dog eats pet food");
       }
   }

     class Bulldog extends dog{

     Bulldog(){
         System.out.println("Bulldog constructor called");
     }
         void food(){  // ayah bhi define kr rhe
             System.out.println("Bulldog eats non veg");
         }
     }




       class cat extends Animal{
     void food(){
         System.out.println("Cats drink milk");
     }
 }


public class Abstraction {
    public static void main(String[] args) {

        Bulldog d1=new Bulldog();
        d1.eat();
        d1.food();

        cat c1=new cat();
        c1.eat();
        c1.food();
    }
}
