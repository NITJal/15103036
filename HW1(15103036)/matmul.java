import java.util.*;

 

public class matmul

{

    public static void main(String args[])

    {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of squared matrices");

        n = sc.nextInt();

        int[][] mat1 = new int[n][n];

        int[][] mat2 = new int[n][n];

        int[][] res = new int[n][n];

        System.out.println("Enter the elements of 1st martix  \n");

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                mat1[i][j] = sc.nextInt();

            }

      
        System.out.println("Enter the elements of 2nd martix \n");

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                mat2[i][j] = sc.nextInt();

            }

        }

      

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                for (int k = 0; k < n; k++)

                {

                    res[i][j] = res[i][j] + a[i][k] * b[k][j];

                }

            }

        }

        System.out.println("The product is:");

        for (int i = 0; i < n; i++)

        {

            for (int j = 0; j < n; j++)

            {

                System.out.print(res[i][j] + " ");

            }

            System.out.println();

        }

      

    }

}
