package stractural.designpatter.bridge;

public class BrigeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("The Dommsday");
		movie.setRuntime("2:30");
		movie.setYear("2016");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		String printedMaterial = moviePrinter.print(printFormatter);
		
		System.out.println(printedMaterial);
		
		Formatter htlmFormatter = new HtmlFormatter();
		String htmlMaterial = moviePrinter.print(htlmFormatter);
		System.out.println(htmlMaterial);
		
	}

}
