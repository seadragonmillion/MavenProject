package javaLearning;



public class Demo{
    static int  a=30; //instance variable 
    static  int  b=50;
   
    
    Demo() { 
    	a = 20 ; 
    	b = 10 ;
    	
    }

   public void display(){
      System.out.println("Value1 === "+a);
      System.out.println("Value2 === "+b);
  }

 public static void main(String args[]){
     Demo d1 = new Demo();
     
    // System.out.println(a);
    d1.display(); // it will call the display method
}
}
