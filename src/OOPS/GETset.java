package OOPS;

// Ye getter setter function hai jisie hum private variable ko access kr skte hai aur unko modify bhi kr skte hai
// Ye encapsulation ka bhi example hai -- Ek tir se do nisaane
class Pen{
    private  String name;
    private int cost;

    void Setname(String name){
        this.name=name;

    }

    String Getname(){
        return this.name;
    }

         void Setcost(int cost){
        this.cost=cost;

    }

   int Getcost(){
        return this.cost;
    }

}

public class GETset {
    public static void main(String[]args){
        Pen p1=new Pen();
        p1.Setname("LinkLyser");
        System.out.print("The name of the pen is: "+p1.Getname());
        p1.Setcost(5);
        System.out.print("\nThe  cost of this pen is:"+p1.Getcost());
    }

}




