package dev.deorerohit.activity;


import dev.deorerohit.processing.EvaluateInput;
import dev.deorerohit.processing.Operations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputOutput {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		EvaluateInput evaluateInput = new EvaluateInput();
		double result = 0;
		String operator = null;
		String choice = "carryOn";

		do {
			System.out.print("Input (eg. 23*2+9/5 | 'e' for exit) : ");
			String[] ipString = br.readLine().split("(?<=[-+*/.])|(?=[-+*/.])");

			if (ipString[0].equals("e"))
				return;

			evaluateInput.setInputString(ipString);
			System.out.println("Result : " + evaluateInput.infixToPostfix());


			/*for (String s : ipString)
				System.out.println(s);*/

			/*try {
				operator = ipString[1];
				if (operator.equals("."))
					return;
				operations.setVar1(Double.parseDouble(ipString[0]));
				operations.setVar2(Double.parseDouble(ipString[2]));

			} catch (Exception e) {
				System.out.println("Please enter the proper expression");
				return;
			}

			switch (operator) {
				case "*":
					result = operations.multiplicationOp();
					break;
				case "/":
					result = operations.divisionOp();
					break;
				case "-":
					result = operations.subtractionOp();
					break;
				case "+":
					result = operations.additionOp();
					break;

			}
			System.out.println("Result : " + result);*/
		} while (true);


	}
}
