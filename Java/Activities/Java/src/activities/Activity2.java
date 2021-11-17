package activities;

public class Activity2 {

	public static void main(String[] args) {
		int sum =0;
		int actualValue=30;
		int[] num =  {10, 77, 10, 54, -11, 10};
		for(Integer x:num) {
			if(x==10) {
				sum=sum+x;
				
			}
		}
		System.out.println(sum);
		
		if (sum == actualValue)
		System.out.println("Sum value is equal to 30");

	}

}
