package billpay.burndown.util;

public class BurndownDimension {

	private static BurndownDimension instanceMaximize = null;
	private static BurndownDimension instanceMinimize = null;
	private String width;
	private String height;
	
	private static final String FULL_SCREEN_WIDTH = "1800";
	private static final String FULL_SCREEN_HEIGHT = "900";
	private static final String MINIMIZE_SCREEN_HEIGHT = "600";
	private static final String MINIMIZE_SCREEN_WIDTH = "900";
	
	private BurndownDimension(String width, String height) {
		this.width = width;
		this.height = height;
	}

	public static BurndownDimension maximize(){
		if(instanceMaximize == null){
			instanceMaximize = new BurndownDimension(FULL_SCREEN_WIDTH, FULL_SCREEN_HEIGHT);
		}
		return instanceMaximize;
	}
	
	public static BurndownDimension minimize(){
		if(instanceMinimize == null){
			instanceMinimize = new BurndownDimension(MINIMIZE_SCREEN_WIDTH, MINIMIZE_SCREEN_HEIGHT);
		}
		return instanceMinimize;
	}
	
	public String getWidth() {
		return width;
	}

	public String getHeight() {
		return height;
	}

}
