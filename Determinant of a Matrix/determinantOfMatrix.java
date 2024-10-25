//this is a recursion based apporach for finding the determinant of a matrix
import java.io.*;
import java.util.*;
public class solution {

    public static int determinant(int[][] matrix){
        int sum=0,s=0;
        if(matrix.length==1)        // when the matrix size is one ,return the value of the matrix
            return matrix[0][0];
        else{
            int[][] smaller =new int[matrix.length-1][matrix.length-1];     //to create a smaller matrix eg.- if 3x3 matrix is created we need a 2x2 matrix to multiply
            for(int i=0;i<matrix.length;i++){                                 // if you don't understand please do see the concept of finding the determinant
                for(int j=1;j< matrix.length;j++){
                    for(int k=0;k<matrix.length;k++){
                        if(k<i)
                            smaller[j-1][k]=matrix[j][k];
                        else if(k>i)
                            smaller[j-1][k-1] = matrix[j][k];
                    }
                }
                if(i%2==0)
                    s=1;
                else
                    s=-1;
            sum=sum+s*matrix[0][i]*(determinant(smaller));
            }
        }
        return sum;
    }


    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the size of matrix:");
      int n=scan.nextInt();
      System.out.println("Enter the value of "+n+"x"+n+"matrix");
      int[][] matrix=new int[n][n];
      for (int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              matrix[i][j]=scan.nextInt();
          }
      }
      System.out.println("the determinant of the matrix is:"+ determinant(matrix));
    }
}
