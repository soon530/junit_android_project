package tw.tasker.uiautomator_study;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import junit.framework.TestCase;

public class MyUiAutomatorTest extends UiAutomatorTestCase {

/*	public MyUiAutomatorTest(String name) {
		super(name);
	}
*/
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testDemo() {
		getUiDevice().pressHome();
	}

}
