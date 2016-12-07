public class MergeSort
{
public void merge(int []A,int l,int m,int r)
{
int lengthL = m-l+1;
int lengthR = r-m;


//create temp arrays
int []L = new int[lengthL];
int []R = new int[lengthR];

//copy element to temp array L[]
for(int i=0;i<lengthL;i++)
L[i]= A[l+i];

//copy element to temp array R[]
for(int j=0;j<lengthR;j++)
R[j] = A[m+1+j];

//intitial index variable of first and second subarrays
int i=0;
int j=0;

//intitial index of merged array
int k=l;

while(i<lengthL && j<lengthR)
{
if(L[i]<=R[j])
{
A[k] = L[i];
i++;
}
else
{
A[k] = R[j];
j++;
}
k++;
}
while(i<lengthL)
{
A[k] = L[i];
i++;
k++;
}
while(j<lengthR)
{
A[k] = R[j];
j++;
k++;
}

}

public void sort(int []A,int l,int r)
{
if(l<r)
{
int m= (l+r)/2;

sort(A,l,m);
sort(A,m+1,r);
merge(A,l,m,r);

}
}

}
