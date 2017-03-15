package stractural.designpatter.bridge;

public class Movie {
	
	private String title;
	private String year;
	private String runtime;
	private String classification;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
	public void setClassification(String classification) {
		// TODO Auto-generated method stub
		this.classification = classification;
	}
	public String getClassification() {
		// TODO Auto-generated method stub
		return classification;
	}

}
