package newSuit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	@Test(groups = {"run"})
	@Parameters("name1")
	public void testcase1(String name1) {
		System.out.println("print for testcase 1 :"+name1);
	}
	@Test
	@Parameters("name2")
	public void testcase2(String name2) {
		System.out.println("print for testcase 2 :"+name2);
	}
	@Test
	@Parameters("name3")
	public void testcase3(String name3) {
		System.out.println("print for testcase 3 :"+name3);
	}
	@Test
	@Parameters("name4")
	public void testcase4(String name4) {
		System.out.println("print for testcase 4 :"+name4);
	}

}
