package behavioral.designpattern.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
    CreditCard amexCard = new CreditCard(new AmexStrategy());
    CreditCard visaCard = new CreditCard(new VisaStrategy());
    
    
    amexCard.setNumber("379185883464283");
    amexCard.setDate("04/2020");
    amexCard.setCvv("123");
    
    System.out.println("Is Amex valid: "+ amexCard.isValid());
    
    amexCard.setNumber("379185883464288");
    amexCard.setDate("04/2020");
    amexCard.setCvv("345");
    
    System.out.println("Is Amex valid: "+ amexCard.isValid());
    
    visaCard.setNumber("4539589763663402");
    visaCard.setDate("05/2018");
    visaCard.setCvv("324");
    
    System.out.println("Is visa valid: "+ visaCard.isValid());
    
	}

}
