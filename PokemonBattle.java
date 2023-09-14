import java.util.Scanner;
import java.util.Random;
public class PokemonBattle{



public static void main(String[] Args){

	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	String nickname;
	String rivalNickname;
	double rivalHealth = (double) (rand.nextInt(20) + 20);
	System.out.println("Enter your Pokemon's nickname: ");
	nickname = scan.nextLine();
	nickname.trim();
	System.out.println("Enter your rival Pokemon's nickname: ");
	rivalNickname = scan.nextLine();
	rivalNickname.trim();
	System.out.printf("Your rival has chosen %S to fight, which has %D health.", rivalNickname, rivalHealth);







}







}