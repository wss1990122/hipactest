package wss.test.hipac01;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import android.os.RemoteException;

public class Test01 extends UiAutomatorTestCase {
	public void testDemo() throws UiObjectNotFoundException {
		UiDevice device = getUiDevice();
		device.pressHome();
		device.swipe(100, 100,100,500,5);
		
	}
}
