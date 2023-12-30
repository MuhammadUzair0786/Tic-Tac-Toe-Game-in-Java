		import java.util.Scanner;
		public class TicTacToe{

		public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		// declear variable
		int hole1, hole2, hole3, hole4, hole5, hole6, hole7, hole8, hole9;
		// enter value user

	System.out.println("******Enter value 0 and 1 only user press 0 mean cross and 1 press oval******");

		System.out.println("player1 Enter the value hole");
		hole1=input.nextInt();

		System.out.println("player2 Enter the value hole");
		hole2=input.nextInt();

		System.out.println("player1 Enter the value hole");
		hole3=input.nextInt();

		System.out.println("player2 Enter the value hole");
		hole4=input.nextInt();

		System.out.println("player1 Enter the value hole");
		hole5=input.nextInt();

		System.out.println("player2 Enter the value hole");
		hole6=input.nextInt();

		System.out.println("player1 Enter the value hole");
		hole7=input.nextInt();

		System.out.println("player2 Enter the value hole");
		hole8=input.nextInt();

		System.out.println("player1 Enter the value hole");
		hole9=input.nextInt();


		System.out.println("\t" +hole4+   "|"    +"\t"+hole8+  "|"    +"\t"+hole9+ "|");

		System.out.println("\t" +hole1+   "|"    +"\t"+hole5+  "|"    +"\t"+hole6+ "|");

		System.out.println("\t" +hole7+   "|"    +"\t"+hole2+  "|"    +"\t"+hole3+ "|");


		//condition user enter any other value this codition run

		if(hole1>1 || hole2>1 || hole3>1 || hole4>1 || hole5>1 || hole6>1 || hole7>1 || hole8>1 || hole9>1){
		System.out.println("invalid value");
		}
		//condition row

		if((hole1==0 && hole2==0 && hole3==0) || (hole4==0 && hole5==0 && hole6==0) || (hole7==0 && hole8==0 && hole9==0)){
		System.out.println("Player1 Win the Game");

		//condition coloum

		}else if((hole1==0 && hole4==0 && hole7==0) || (hole2==0 && hole5==0 && hole8==0) || (hole3==0 && hole6==0 && hole9==0)){
		System.out.println("Player1 Win the Game");

		//condition cross

		}else if((hole1==0 && hole5==0 && hole9==0) || (hole3==0 && hole5==0 && hole7==0)){
		System.out.println("Player1 Win the Game");

		//player 2
		//condition row
		}else if((hole1==1 && hole2==1 && hole3==1) || (hole4==1 && hole5==1 && hole6==1) || (hole7==1 && hole8==1 && hole9==1)){
		System.out.println("Player2 Win the Game");

		//condition coloum

		}else if((hole1==1 && hole4==1 && hole7==1) || (hole2==1 && hole5==1 && hole8==1) || (hole3==1 && hole6==1 && hole9==1)){
		System.out.println("Player2 Win the Game");

		//condition cross

		}else if((hole1==1 && hole5==1 && hole9==1) || (hole3==1 && hole5==1 && hole7==1)){
		System.out.println("Player2 Win the Game");

		}else  {

		System.out.println("Match Draw");
		}
		System.out.println("*****Game End*****");
		}
		}