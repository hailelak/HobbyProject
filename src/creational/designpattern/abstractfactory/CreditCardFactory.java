package creational.designpattern.abstractfactory;

public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore){
		if(creditScore>600){
			return new AmexFactory();
		}
		else{
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);

}
