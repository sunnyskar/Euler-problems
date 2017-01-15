
public class Problem2 {

	public static void main(String[] args) {
	  int sum = 0;
	  int num = 1;
	  int oldnum = 1;
		 for(num = 1;num < 4000000;num += oldnum) {
			 oldnum += num;
			 if (num % 2== 0){
			 sum += num; 
			
			 }
			 System.out.println(num+"...");
		 }
	System.out.println(sum);
	}

}
