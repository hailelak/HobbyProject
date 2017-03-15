package structure.designpattern.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
       TwitterService twitterService = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
       System.out.println(twitterService.getTimeLine("zolame"));
	}

}
