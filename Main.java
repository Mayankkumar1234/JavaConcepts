
// // Program to print the area of rectangle...
// // area of rectangle : length *breadth...
// // area of circle : pi*r*r..
// // area of triangle : 1/2*b*h

// import java.util.Scanner;

// // Let's learn break and continue in java

// // public class Main {

// //   public static void main(String[] args) {
// //     int n;
// //     System.out.println("Enter the value of n :");
// //     Scanner r = new Scanner(System.in);
// //     n = r.nextInt();
// //     for(int i=0 ;i<n;i++){
// //       if(i==5){
// //         break;
// //       } 
// //       System.out.println(i);
// //     }
// //   }
// // }

// class A{
//   int b=21;
// }

// class B extends A{
//   int b=20;

//   void show(){
//     System.out.println(b);
//     System.out.println(super.b);
//   }
// }
// public class Main {
//  public static void main(String[] args) {
//   B r = new B();
//   r.show();
//  }

// }

// Default Constructor :- 

// class A{
//   int a;
//   String b;
//   boolean c;

//     void show(){
//       System.out.println(a+"  "+b+" "+c);
//     }
// }

// Parametrised Constructor 

// class A {
//    int x,y;
//       A(int a , int b){
//         x = a; y=b;
//       }
//    void show(){
//       System.out.println(x+" "+y);
//    }
// }

// Copy Constructor : Whenever we pass object refrence to the constructor then it is called copy constructor .

// class A {

//   int a;
//   String b;

//   A() {
//     a= 21;
//     b="Hello World";
//      System.out.println("Inside Default Constructor :"+a+" "+b);
//   }

//   A(A ref) {
//     a=  ref.a;
//     b = ref.b;
//      System.out.println("Inside Copy Constructor :"+a+" "+b);
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     // A ref = new A();
//     // A ref = new A(100, 200);
//     A ref = new A();
//     A r2 = new A(ref);
//   }
// }