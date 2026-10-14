package com.baba.Agile1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.*;


@SpringBootApplication
public class Agile1Application {

	public static String testNum(int num)
	{
		int original = num;
		int reverse = 0;

		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}

		if (original == reverse) {
			return "Palindrome";
		} else {
			return "Not a Palindrome";
		}

	}

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(Agile1Application.class, args);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println(testNum(num));



	}

}
