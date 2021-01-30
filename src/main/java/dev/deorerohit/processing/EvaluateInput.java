package dev.deorerohit.processing;



import java.util.*;

public class EvaluateInput {
	private String[] inputString;
	private List<String> operatorList = Arrays.asList("*", "/", "+", "-");
	Operations operations = new Operations();


	public void setInputString(String[] inputString) {
		this.inputString = inputString;
	}


	public double infixToPostfix() {
		List<String> pfExpr = new ArrayList<>();
		Stack<String> exprStack = new Stack<>();


		for (int i = 0; i < inputString.length; i++) {

			if (operatorList.contains(inputString[i])) {
				while (!exprStack.isEmpty() && checkPrecedence(inputString[i]) <= checkPrecedence(exprStack.peek())) {
					pfExpr.add(exprStack.pop());
				}
				exprStack.push(inputString[i]);
			} else {
				pfExpr.add(inputString[i]);
			}
		}

		while (!exprStack.isEmpty())
			pfExpr.add(exprStack.pop());


		return evalPostfix(pfExpr);
	}


	public double evalPostfix(List<String> pfExpr) {
		Stack<Double> exprStack = new Stack<>();

		Iterator itr = pfExpr.iterator();
		while (itr.hasNext()) {
			String currStr = (String) itr.next();
			if (operatorList.contains(currStr)) {

				operations.setVar2(exprStack.pop());
				operations.setVar1(exprStack.pop());
				double result = operations.calculate(currStr);

				exprStack.push(result);
			} else {
				exprStack.push(Double.parseDouble(currStr));
			}
		}
		return exprStack.pop();
	}


	public int checkPrecedence(String s) {

		if (s.equals("+") || s.equals("-"))
			return 1;
		else if (s.equals("/") || s.equals("*"))
			return 2;
		else
			return -1;
	}
}
