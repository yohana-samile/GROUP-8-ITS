import java.util.*;
public class Question2 {
public static void main(String[] args){
Scanner input=new Scanner(System.in);
//int [][] k =new int [3][4];
//Declaretion and  Innitialization of k;
int [][] k= {{1,2,3,4},{5,6,7,8},{9,6,3,2}};
int i,j, count=0;
for(i=0; i<3;i++){
	for(j=0;j<4;j++){
		//count++;
			System.out.printf("  "+k[i][j]);
		}
		System.out.printf("\n");
	}
	
//counting row and column
for(i=1;i<3;i++){
				}
		System.out.println("There are rows: "+i);
for(j=1;j<4;j++){
		}
		System.out.println("There are column: "+j);
		
//Counting element of k
count=i*j;
	System.out.println("There are element: "+count);
	
//Accessing expression of row 3 in array
System.out.printf("Element of row 3 are: %d %d %d %d \n",k[2][0], k[2][1], k[2][2], k[2][3]);

//seting the element of k in row 0 and column 1 to zero
System.out.println("element of k in row 0 and column 1 has been set to zero");
k [0][1]=0;
for(i=0; i<3;i++){
	for(j=0;j<4;j++){
			System.out.printf("  "+k[i][j]);
		}
		System.out.printf("\n");
	}

//individual statements to initialize each element of k to zero.
System.out.println("individual statements to initialize each element of k to zero");
k [0][0]=0;
k [0][1]=0;
k [0][2]=0;
k [0][3]=0;
k [1][0]=0;
k [1][1]=0;
k [1][2]=0;
k [1][3]=0;
k [2][0]=0;
k [2][1]=0;
k [2][2]=0;
k [2][3]=0;
for(i=0; i<3;i++){
	for(j=0;j<4;j++){
		count++;
			System.out.printf("  "+k[i][j]);
		}
		System.out.printf("\n");
	}
	
//nested for statement that inputs the values for the elements of k from the user.
System.out.println("enter the element of the matrix");
for(i=0;i<3;i++){
	for(j=0;j<4;j++){
	k [i][j] =input.nextInt();
	}
}	
for(i=0; i<3;i++){
	for(j=0;j<4;j++){
			System.out.printf("  "+k[i][j]);
		}
		System.out.printf("\n");
	}

//statements that determines and displays the smallest value in k
int min = k[0][0];	
	for ( i = 0; i <3; i++ ){
		for ( j = 0; j <4; j++ ){
			if ( k[i][j] < min ){
			min = k[ i ][ j ];
		}
	}
	}
	System.out.println("The smallest element in k is: "+min);
	
//statement that totals the elements of the third column of k
int sum = k[0][2]+k[1][2]+k[2][2];
	System.out.println("Total of element of the third column of k is: "+sum);
	
//statements that displays the contents of t in tabular format
System.out.println("contents of t in tabular format");
System.out.println("col col col col");
System.out.println("   0  1  2  3");
for(i=0; i<3;i++){
	System.out.print(i);
	for(j=0;j<4;j++){
			System.out.printf("  "+k[i][j]);
		}
		System.out.printf("\n");
	}
	
}
}