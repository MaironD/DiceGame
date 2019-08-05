import java.util.Random;
import java.util.Scanner;


public class Fighting {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		System.out.println("Attack Points of Monster:");
		int monsterAttack = sc.nextInt();
		System.out.println("Defense Points of Monster:");
		int monsterDefense = sc.nextInt();
		System.out.println("Dammage of Monster:");
		int monsterDamage = sc.nextInt ();
		System.out.println("Life Points of Monster:");
		int monsterLife = sc.nextInt();
		
		System.out.println("Your Attack Points:");
		int yourAttack = sc.nextInt ();
		System.out.println("Your Defense Points:");
		int yourDefense = sc.nextInt ();
		System.out.println("Your Damage:");
		int yourDamage = sc.nextInt();
		System.out.println("Your Life Points:");
		int yourLife = sc.nextInt();
				
		Random generator = new Random();
		boolean attacker = generator.nextBoolean();
		if (attacker) {
			System.out.println("You attack");
			int dice = generator.nextInt(6)+1 + generator.nextInt(6) +1;
			int attackValue = yourAttack + dice;
			System.out.println("Rolled values:"+ dice);
			System.out.println("Your Attack value:"+ attackValue);
			if (attackValue > monsterDefense) {
				System.out.println("Your attack was succesful.");
				monsterLife = monsterLife - yourDamage;
				System.out.println("Monster's remaining Life Points: " + monsterLife);
				}else {
					System.out.println("Your attack was not sucessful.");
					}
			
		} else {
			System.out.println("Monster Attacks.");
			int dice = generator.nextInt(6)+1 + generator.nextInt(6) +1;
			int attackValue = monsterAttack + dice;
			System.out.println("Rolled values: "+dice);
			System.out.println("Monster's attack value: "+ attackValue);
			if (attackValue > yourDefense){
				System.out.println("Monster's attack was successful.");
				yourLife = yourLife - monsterDamage;
				System.out.println("Your remaining life: " +yourLife);
			}else {
				System.out.println("Monster's Attack was not sucessful.");
			}
		}
		
	}

}
