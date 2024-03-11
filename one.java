
public class Users {

static int hi(int b[],int key)
{
	int l=0, h=b.length-1,mid=0;
	
	while(l<=h)
	{
		mid=(l+h)/2;
		
		if(key==b[mid])
		{
			return mid;
		}
		else if(key<b[mid])
		{
			h=mid-1;
//			l=l;
		}
		else
		{
			l=mid+1;
//			h=h;
		}
	}
	return -1;	
	
}	
public static void main(String[] args) {

	
	int[] a={3,5,6,8,12,16,21,19,15};
	
	
	int key=12;
	System.out.println(hi(a,key));
	
}
 
}

//low high mid
// 0   8    4
// 5   5    6
// 5   5    5
// 5   4
