package Bigdata;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		while (true) {
			int number = scn.nextInt();

			if (number == 1) {
				System.out.println("일");

			} else {
				System.out.println("이\n종료");
				break;
			}
		}

	}

}
