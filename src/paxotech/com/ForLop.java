package paxotech.com;

public class ForLop {
/*
 * Inteview Question:
 * Iterate through number 1 to 40
If the number is divisible by 3 show an output "Divisible by 3
If number is divisible by 5 show an output "Divisible by 5"
If number is divisible by 15, show an output "Divisible by 15:.
 At this time it should not show "Divisible by 3" or "Divisible by 5"*/
	
	
	
	public static void main(String[] args) {
		int i=40;
		int j=3;
		int k=5;
		int l=15;
		
		for (i = 0; i < 40; i++) {
			if(i%3==0){
				 System.out.println("This "+i+"***********Divided by #####"+j);
				
			}
			else if (i%3!=0){
				System.out.println("This "+ i+ "********** is not Divided by #####"+j);
				
			}
			
			 if (i%5==0){
				System.out.println("This "+i+"***********Divided by#######"+k);
				
			}
		   
			
		else if(i%5!=0){
			 System.out.println("This "+i+"***********Is not Divided by #####"+k);
		
		}

		 if (i%15==0){
			System.out.println("This "+ i+ "**********Divided by #####"+l);
		 }
			else if (i%15!=0){
				System.out.println("This "+i+"********** Is not Divided by#######"+l);
				
			}
		
		
	   
	
		}
}
}