package behavioral.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart{
	
	List<AtvPart> parts = new ArrayList<AtvPart>();
	
	
	public PartsOrder(){
		
	}
	
	public void addPart(AtvPart atvPart){
		parts.add(atvPart);
	}
	
	public List<AtvPart> getParts() {
		return parts;
	}


	@Override
	public void accept(AtvPartVisitor visitor) {
		for(AtvPart atvPart: parts)	{
			atvPart.accept(visitor);
		}
		
		visitor.visit(this);
	}

}
