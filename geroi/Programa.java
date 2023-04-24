package geroi;
import java.util.Scanner;
public class Programa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Geroi g1 = new Geroi("Гошо", "българин", "мъж", "кафяв", "бял", 1.98, 17);
		String question = new String (scan.nextLine());
		
		
		
		if (question.equals("тема")) {
			System.out.println("Баскетболист");
		} //else if (question.equals("пол")) {
			//System.out.println(g1.pol);
		//} 
		else if (question.equals("къде се намира сега?")) {
			System.out.println("В спортен салон");
		} else if (question.equals("какво прави?")) {
			System.out.println("Тренира");
		} else if (question.equals("какво ще се въвежда?")) {
			System.out.println("труден въпрос, все още работя по този въпрос");
		} else {
			System.out.println("Не разбирам въпроса / командата.");
			System.out.printf("Пробваѝте следните предложения:\nтема;\nпол;\nкъде се намира сега?;\nкакво прави?\n");
		}
		question = new String(scan.nextLine());
//		System.out.println(question);
		
//		System.out.println(g1.ime + " " + g1.godini);
		scan.close();
	}
}
