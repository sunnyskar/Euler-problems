
public class Problem2 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int outside_num=0;
		int sum = 0;
		int[] start = {x,y};
		for (; start[1]<4000000;)	
		{
				outside_num = start[1];
				if (start[1]%2 == 0) sum += start[1];
			System.out.println("right now " + sum);
				start[1]+= start[0];
				start[0]= outside_num;
			
		}
		System.out.println(sum);
		
	}

}
