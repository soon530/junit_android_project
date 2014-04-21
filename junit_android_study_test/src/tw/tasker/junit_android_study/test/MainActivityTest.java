/**
 * 
 */
package tw.tasker.junit_android_study.test;

import tw.tasker.junit_android_study.MainActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * @author soon530
 * 
 */
public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;
	private TextView helloWorld;

	/**
	 * 這個必寫，我不知道為啥？ android developer doc也是這樣介紹=.=凸
	 */
	public MainActivityTest() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
		helloWorld = (TextView) activity
				.findViewById(tw.tasker.junit_android_study.R.id.helloWorld);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * 要用junit4的寫法，記得要去 java build path/order and export裡打個勾
	 * 不然，會有ClassNotFound的Exception出現。
	 */
	public void testHelloWorld() {
		final String expected = "Hello world!";
		final String actual = helloWorld.getText().toString();

		assertEquals(expected, actual);
	}
}
