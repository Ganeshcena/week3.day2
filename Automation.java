package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		Automation an = new Automation();
		an.Selenium();
		an.java();
		an.ruby();
		an.python();
		

	}

	public void Selenium() {
		System.out.println("Using Selenium");
		
	}

	public void java() {
		System.out.println("Using java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Using ruby");
		
	}

}
