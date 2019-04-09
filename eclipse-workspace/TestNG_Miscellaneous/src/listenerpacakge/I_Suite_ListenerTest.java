package listenerpacakge;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class I_Suite_ListenerTest implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		//This will exceute when <suite> tag start
		System.out.println("onStart : before Suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		//This will exceute when <suite> tag complete
		System.out.println("onFinish :after Suite starts");
	}

	

}
