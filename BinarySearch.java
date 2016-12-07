import java.util.Scanner;

public class BinarySearch
{
public void binarySearch(int []A,int l,int r)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter the searching the element: ");
int search = s.nextInt();
int mid = (l+r)/2;

while(l<=r)
{
if(A[mid]<search)
l = mid+1;
else if(A[mid]==search)
{
System.out.println("Searching element "+search+" is found at index "+mid);
break;
}
else
r = mid - 1;

mid=(l+r)/2;
}
if(l>r){
System.out.println("Searching element not found");
}

}

}
