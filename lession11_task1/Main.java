package lession11_task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * The Main class working random array filling + sort array
 * @author ARTUR
 * @since JDK 13.0.2
 *  Створити масив Integer, заповнити його рандомними числовими значеннями. 
 *  Відсортувати його в порядку спадання та в порядку зростання значень.
 * 
 */
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		Integer [] array = new Integer [r.nextInt(20)];
		System.out.println("Оригінальний рандомний масив:");
		for(int i =0; i <array.length; i++)
		{
			array[i]=r.nextInt(100);
		}
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		Arrays.sort(array);
		System.out.println("Відсортований масив за зростанням:");
		System.out.println(Arrays.toString(array));

		System.out.println();
		Arrays.sort(array , Collections.reverseOrder());
		System.out.println("Відсортований масив за спаданням:");
		System.out.println(Arrays.toString(array));

	}

}
