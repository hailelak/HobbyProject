package structure.designpattern.proxy;

public class TwitterServiceStub implements TwitterService{

	@Override
	public String getTimeLine(String screenName) {
		return "My teto timeline";
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		
	}

}
