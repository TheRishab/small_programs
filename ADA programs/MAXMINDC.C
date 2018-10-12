#include<stdio.h>
#include<conio.h>
int a[50],max,min;
void find(int i, int n)
   {
   int mid,max1,min1;
   if(i==n)
      {
      a[i]=min;
      max=min;
      }
   else if(i==(n-1))
      {
      if(a[i]>=a[n])
	 {
	 max=a[n];
	 min=a[i];
	 }
      else
	 {
	 max=a[i];
	 min=a[n];
	 }

      }
   else
      {
      mid=(i+n)/2;
      find(i,mid);
      max1=max;
      min1=min;
      find(mid+1,n);
      if(max<max1)
	 max=max1;
      if(min>min1)
	 min=min1;
      }
   }
int main()
   {
   int i,n;
   clrscr();
   printf("Enter size of Array :\n");
   scanf("%d",&n);
   printf("Enter Elements in Array -->\n");
   for(i=0;i<n;i++)
      {
      scanf("%d",&a[i]);
      }
   min=a[0];
   max=min;
   find(1,(n-1));
   printf("Minimum : %d",min);
   printf("\nMaximum : %d",max);
   getch();
   return 0;
   }