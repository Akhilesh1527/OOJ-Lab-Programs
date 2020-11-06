import java.util.Scanner;
class transpose_main
{
  public static void main(String args[])
  {
    int a,b,i,j;

    Scanner ss = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of matrix");
    i = ss.nextInt();
    j = ss.nextInt();

    int matrix[][] = new int[i][j];

    System.out.println("Enter elements of the matrix");

    for (a = 0; a < i; a++)
      for (b = 0; b < j; b++)
        matrix[a][b] = ss.nextInt();

    int transpose[][] = new int[j][i];

    for (a = 0; a < i; a++)
      for (b = 0; b < j; b++)
        transpose[b][a] = matrix[a][b];

    System.out.println("Transpose of the matrix:");

    for (a = 0; a < j; a++)
    {
      for (b = 0; b < i; b++)
        System.out.print(transpose[a][b]+"\t");

      System.out.print("\n");
    }
  }
}
