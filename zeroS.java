package Array1;

public class zeroS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3,n=3;
		int brr[][]= {{0,1,0},
				      {1,1,1},
				      {1,1,1}};
		display(brr,m,n);
		System.out.println("-->");
		check(brr,m,n);
		
		
		

	}
   public static void display(int arr[][],int m,int n ) {
	   int i,j;
	  
	   for(i=0;i<m;i++) {
		   System.out.println();
		   for(j=0;j<n;j++) {
			   System.out.print(arr[i][j]+" ");
		   }
	   }
	   
   }
   
   
   
   public static void check(int arr[][],int m,int n) {
	   int i,j;
	   int k=0,l=0;
	   
	   for(i=0;i<m;i++)
		   for(j=0;j<n;j++) {
			   if(arr[i][j]==0) {
				   k=i;
				   l=j;
			   }
		   }
	    System.out.println("the value of row is "+k);
	    System.out.println("the value of the column "+l);
	    
	    for(i=0;i<m;i++) {
	    	System.out.println();
	    	if(i==k) {
	    		for(j=0;j<n;j++) {
	    	    	arr[k][j]=0;
	    	    	System.out.print(arr[k][j]);
	    	    }
	    	}else {
	    		for(j=0;j<n;j++) {
	    			if(j==l) {
	    				arr[i][l]=0;
	    				System.out.print(arr[i][l]);
	    			}else {
	    				 System.out.print(arr[i][j]);
	    			}
	 		   }
	    	}
	    }
	    
	    
   }
}
