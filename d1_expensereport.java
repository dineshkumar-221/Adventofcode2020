import java.util.*; 
public class test { 
public static void main(String args[]) { 
	int a[]=new int[200];int x=0,y=0,z=0;
	Scanner sc=new Scanner(System.in);
	for (int i=0;i<200 ;i++ ) {
		a[i]=sc.nextInt();
	}
//puzzle-1
	for(int i=0;i<200;i++){
		for (int j=i+1;j<200 ;j++ ) {
			if((a[i]+a[j])==2020){
				x=a[i];y=a[j];
				break;
			}
		}
	}
System.out.println(x*y);
//puzzle-2
	for(int i=0;i<200;i++){
		for (int j=i+1;j<200 ;j++ ) {
			for (int k=j+1;k<200 ;k++ ) {
				if((a[i]+a[j]+a[k])==2020){
					x=a[i];y=a[j];z=a[k];
					break;
			}
			}
    }
	}
	System.out.println(x*y*z);
} 
} 
