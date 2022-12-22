import java.util.Scanner;  // Import the Scanner class


class Area{
    public static void main(String args[]){
        System.out.print(" The area of triangle: ");

        // the Height and Base

         int Height = 40;
         int Base = 65;
         // calculate the area

         double TheAreaOfTriangle = (Height*Base)/2;

         System.out.println(TheAreaOfTriangle);
 
         System.out.println("The perimeter of triangle");

         int Side1 = 65;
         int Side2 = 25;
         int Side3 = 30;

        double ThePerimeterOfTriangle = Side1+Side2+Side3;

        System.out.println(ThePerimeterOfTriangle);

        // calculate the Volume of the cube with Scanner

        double HeightCube,BaseCube,WidthCube;
        

        System.out.print("Enter height of the cube: ");
         
        Scanner FirstSide = new Scanner (System.in);

        HeightCube = FirstSide.nextInt();

        System.out.print("Enter the base of the cube: ");

        Scanner  SecondSide =  new Scanner (System.in);

        BaseCube = SecondSide.nextInt();

        System.out.print("Enter the width: ");

        Scanner ThirdSide = new Scanner (System.in);

        WidthCube = ThirdSide.nextInt();

        System.out.println("The volume of cube" );

        double Volume = HeightCube*BaseCube*WidthCube;

        System.out.print(Volume);






        }
}