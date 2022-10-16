package newSuit;

import java.sql.Driver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropexample {
	
	@Test
	public void test1() {
		//web lemement 1
		//web elemet 2
		
		Actions actions=new Actions(Driver);
		actions.clickAndHold(ele1).movetoelemnet().release(we2).buld().perform();
		
	}

}
