package lession11_task2;
/**
 * The Main class working random array filling
 * @author ARTUR
 * @since JDK 13.0.2
 *  Створити сутністності Авто, Кермо, Двигун. 
	Авто володіє полями : Кількість кінських сил, рік випуску.
	Кермо володіє полями : Діаметр колеса, матеріал з якого зроблено кермо (шкіра, алькантара). 
	Двигун володіє полями : кількість циліндрів.
	- Створити двовимірний масив, величина якого вираховується рандомно.
	- Заповнити даний масив обєктами авто, всі значення конструктора якого заповнюються рандомно.
	- Створити консольне меню, яке буде мати наступні елементи :
	 	а) Вивести toString() даних елементів масиву на консоль. ( deepToString() )
	 	б) Для всіх обєктів даного масиву засетити одинаковий  обєкт класу Авто (fill())
 * 
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Auto[][] auto = new Auto[1+rand.nextInt(5)][1+rand.nextInt(5)];
		
		String[] material = {"Nappa","Monza","Schweizer", "Catania"};
		
		Scanner scan = new Scanner (System.in);
		String s;
		
		while (true) {
			printMeny();
			s=scan.nextLine();
			switch (s) {
			case "1": {
				for (int i = 0; i < auto.length; i++) {
					for (int j = 0; j < auto[i].length; j++) {
						Engine engine = new Engine(3 + rand.nextInt(10) % 9);
						Helm helm = new Helm(20 + rand.nextInt(10), material[rand.nextInt(3)]);
						auto[i][j] = new Auto(100 + rand.nextInt(300), 1970 + rand.nextInt(50), helm, engine);
					}
				}
				System.out.println("Random element");
				System.out.println(Arrays.deepToString(auto));
				break;
			}
			case "2": {
				Auto defaultAuto = new Auto(100, 1970, new Helm(25, material[0]), new Engine(4));

				for (Auto[] row : auto)
					Arrays.fill(row, defaultAuto);
				System.out.println("Default element");
				System.out.println(Arrays.deepToString(auto));
				break;
			}
			case "3": {
				 System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + s);

			}
		}
	}

	private static void printMeny()
	{
		System.out.println("Press 1 to print all ellements of the array whith random component");
		System.out.println("Press 2 to print all ellements of the array whith default component");
		System.out.println("Press 3 to exit");
		
	}
}
