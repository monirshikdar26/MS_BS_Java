import java.util.Scanner;
import java.util.Arrays;

public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);
MergeSort ms = new MergeSort();
BinarySearch bs = new BinarySearch();
System.out.print("Enter the length of array: ");
int length = input.nextInt();

int []A = new int[length];
System.out.print("Enter the element of array: ");
for(int i=0;i<length;i++)
A[i] = input.nextInt();

int l=0;
int r=A.length-1;
ms.sort(A,l,r);
System.out.println(Arrays.toString(A));

bs.binarySearch(A,l,r);
}
}
