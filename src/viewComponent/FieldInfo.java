package viewComponent;

/*
 * Here is the drawing of the field ... 
 */
public class FieldInfo {
	
	private final String singleMode = "Single Mode";
	private final String twoMode = "Two Players Mode"; 
	
	public void modeDisplay(boolean isSingle){
		if(isSingle) System.out.print(singleMode);
		else System.out.print(twoMode);
	}
		
}
