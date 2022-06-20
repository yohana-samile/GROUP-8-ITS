//java program for calculate area and perimeter of rectangle
import java.util.Scanner;
//the super class
public class Question1{
	//starting main method
	public static void main(String[] args){
		//Declare variable length and width
		
			float length=2, width=2;
			
			//scanner to obtain input
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter length ranging 10.00 to 40.00: ");//Allow user to inter the length
			length=in.nextFloat();
			
			System.out.println("Enter width ranging 10.00 to 40.00: ");//Allow user to inter the width
			width=in.nextFloat();
			
                                
                             //condition to check if the length and width is on the range given
			if(width>10.00 &&width<=40.00){
				if(length>10.00 &&length<=40.00){
					RectangleTest Object=new RectangleTest();
					Object.setArea(length,width);
					Object.setPerim(length,width);
					Object.getArea();
					Object.getPerim();
				}
			}
		else{
			System.out.println("length and width entered are not in range of 10.00 to 40.00");
			System.out.println("length and width should default to 2");
		//the defaults values
			length=2; width=2;
			RectangleTest Object=new RectangleTest();
		//passing variabes
			Object.setArea(length,width);
			Object.setPerim(length,width);
		//calling output	
			Object.getArea();
			Object.getPerim();
		}
	}
}

class RectangleTest{
	float area;
	float perimeter;
	//set and get methods 
	void setPerim(float length, float width){
		perimeter= (length+width)*2;
	}	
	void setArea(float length, float width){
		area=width*length;
	}
	void getPerim(){
		System.out.printf("\nTatal perimeter is %f\n", perimeter);
	}
	void getArea(){
		System.out.printf("\nTotal area is %f\n", area);
	}
}