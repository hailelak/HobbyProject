package behavioral.designpattern.iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEverydayDemo {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();
		//List<String> names = new ArrayList<String>();
		
		names.add("Hailelul");
		names.add("Lakew");
		names.add("Teshome");
		
		Iterator<String> namesItr = names.iterator();
		
	//	Note if we were using the traditional for loop we can easily change from Set to List. Becuause we do not
		//have get method in the set
		
//		for(int i=0; i<names.size();i++){
//			System.out.println("name is "+names.get(i));//it doesn't work for set
//		}
		
//		for (String name : names) {
//			System.out.println(name);			
//			}
		
		while(namesItr.hasNext()){
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
			
		}
		
		System.out.println("Name size: "+ names.size());
		
	}

}
