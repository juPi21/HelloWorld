package test1;
import java.util.Scanner;
import java.util.Random;

public class class1 {
	
	Random rnd = new Random();
	private static final Scanner scanner = new Scanner(System.in); 
	boolean pg = true;
	int min = 1;
	int max = 100;
	int guess;
	int number;
	int guesses;
	String response;
	
	public void guess (){
		
	
		while(pg) {
			guess = 0;
			guesses = 0;
			response = "";
			number = rnd.nextInt(min, max + 1);
			
			while(guess != number) {
				System.out.println("Угадай Число: " + min + " min " + max + "max: ");
				guess = scanner.nextInt();
				scanner.nextLine();
				
				if (guess > number) {
					System.out.println("Переборщил");
				}
				else if (guess < number) {
					System.out.println("Недосолил");
				}
				guesses++;
				
			}
			System.out.println("Число: " + number);
			System.out.println("Ай пабедитель");
			System.out.println("Дагадайка: " + guess);
			
			System.out.println("Хочешь еще раз ? Y/N: ");
			response = scanner.nextLine();
			response = response.toUpperCase();
			
			if (response == "Y") {
				pg = true;
			}
			if (response == "N") {
				pg = false;
				System.out.println("Спасибо за игру!");
			}
		}
	}
	
    public static void main(String[] arg) {
    	new class1().guess();
    }
}
