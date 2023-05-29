package listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Case Success");
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Case Failure");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Case Skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Start");	
	}
	

}
