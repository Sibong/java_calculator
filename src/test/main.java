package test;

public class main {
	  public static void execute(Calculator cal){
	      System.out.println("실행결과");
	      cal.run();
	  }

	public static void main(String[] args) {
	      Calculator c1 = new CalculatorDecoPlus();
	      c1.setOprands(10, 20);

	      Calculator c2 = new CalculatorDecoMinus();
	      c2.setOprands(10, 20);

	      execute(c1);
	      execute(c2);
	}

}
