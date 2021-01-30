package dev.deorerohit.processing;

public class Operations {

	private double var1;
	private double var2;


	public void setVar1(double var1) {
		this.var1 = var1;
	}

	public void setVar2(double var2) {
		this.var2 = var2;
	}


	public double calculate(String operator) {
		double result = 0;
		switch (operator) {
			case "*":
				result = multiplicationOp();
				break;
			case "/":
				result = divisionOp();
				break;
			case "-":
				result = subtractionOp();
				break;
			case "+":
				result = additionOp();
				break;
		}
		return result;
	}


	public double additionOp() {
		return var1 + var2;
	}


	public double subtractionOp() {
		return var1 - var2;
	}


	public double multiplicationOp() {
		return var1 * var2;
	}


	public double divisionOp() {
		Double result = null;
		try {
			result = var1 / var2;
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
