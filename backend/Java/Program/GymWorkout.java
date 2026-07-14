import java.util.Scanner;
class  GymWorkout
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day :");
		
		String day = sc.next();
		
		switch (day){
			
			case "Monday" :
			{
				System.out.println("Chest and triceps");
			}
			break ;
			case "Tuesday":
			{
				System.out.println("Back and biceps");
			}
			break;
			case "Wednesday" :
			{
				System.out.println("Shoulders and legs") ;
			}
			break;
			case "Thursday":
			{
				System.out.println("abs") ;
			}
			case "friday":
			{
				System.out.println("Shoulders and abs") ;
			}
			case "Saturday":
			{
				System.out.println("Workout") ;
			}
			case "Sunday":
			{
				System.out.println("Rest") ;
			}
			default :
			{
				System.out.println("You Enter Wrong Input");
			}
	}
}

}