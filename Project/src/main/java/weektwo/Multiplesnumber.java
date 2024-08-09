package weektwo;

public class Multiplesnumber {

	public static void main(String[] args) {
		int sum = 0, i= 0;
		for(i=0;i<100;i++) {
			if(i%3==0 || i%5 ==0)
			{
				sum = sum+i;
			}
		
		}
			System.out.println(sum);
		}

	}


