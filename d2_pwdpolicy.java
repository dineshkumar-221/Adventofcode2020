import java.util.*; 
public class test 
{ 
public static void main(String args[]) { 
		Scanner sc=new Scanner(System.in);
		int n=1000,total=0;
		int[] min=new int[n];
		int[] max=new int[n];
		int[] k=new int[n];
		boolean[] b=new boolean[n];
		char[] ch=new char[n];
		String[] in=new String[n];
		String[] s=new String[n];
//spliting the input
		for (int i=0;i<n ;i++ ) {
			in[i]=sc.nextLine();
			String[] input = in[i].split("[-\\s:]");
			min[i]=Integer.parseInt(input[0]);
			max[i]=Integer.parseInt(input[1]);
			ch[i]=input[2].charAt(0);
			s[i]=input[4];
		}
//problem-1
		for (int i=0;i<n ;i++ ) {
			k[i]=occurences(ch[i],s[i]);
			b[i]=(k[i]>=min[i] && k[i]<=max[i])?true:false;
		}
//problem-2
		for (int i=0;i<n ;i++ ) {
			b[i]=(((s[i].charAt(min[i]-1)==ch[i])&&(s[i].charAt(max[i]-1)!=ch[i]))||((s[i].charAt(min[i]-1)!=ch[i])&&(s[i].charAt(max[i]-1)==ch[i])))?true:false;
    }	

//counting total number of valid password		
		for (int i=0;i<n ;i++ ) {
			if(b[i]==true){total++;}
		}
		System.out.println(total);
		
} 
static int occurences(char ch,String s){
	int count=0; 
	for (int i = 0; i <s.length(); i++) {
	  	if (s.charAt(i) == ch)  
				count++;                 
    }
    return count; 
}
} 
