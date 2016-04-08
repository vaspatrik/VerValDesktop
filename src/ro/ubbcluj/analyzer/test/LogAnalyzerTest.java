package ro.ubbcluj.analyzer.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import ro.ubbcluj.analyzer.LogAnalyzer;
import ro.ubbcluj.analyzer.factory.FileExtMgrFactory;
import ro.ubbcluj.analyzer.utils.FileExtMgr;

//@RunWith(Parameterized.class)
public class LogAnalyzerTest {
	
//	private LogAnalyzer logAnalyzer;
	private LogAnalyzer logAnalyzerTestable;
	private FileExtMgrFake fakeExtMgr;
	
	@Before
	public void setUp() {
		fakeExtMgr = new FileExtMgrFake();
//		logAnalyzer = new LogAnalyzer();
		logAnalyzerTestable = new TestableLogAnalyzer(fakeExtMgr);
		FileExtMgrFactory.getInstance().setFileExtMgr(fakeExtMgr);
	}
	
	@After
	public void tearDown() {
		//Noting to do ...
	}
	
//	@Parameters
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][] {     
//                 { "absc.str", true }, { "asdgf", false }, { "adsa.str", true }
//           });
//    }
//    
//    @Parameter
//    public String fInput;
//
//    @Parameter(value = 1)
//    public boolean fExpected;
	
//	@Test
//	public void testIsValidLogFileName() {
//		String validLogFileName = "something.str";
//		String isValidLogFileName = "something.strr";
//		
//		assertEquals(validLogFileName + " should be valid", logAnalyzer.IsValidLogFileName(validLogFileName), true);
//		assertEquals(isValidLogFileName + " should be invalid", logAnalyzer.IsValidLogFileName(isValidLogFileName), false);
//	}
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void testIsValidLogFileNameException() {
//		String shortName = "so";
//		logAnalyzer.IsValidLogFileName(shortName); 
//	}
//	@Test
//	public void IsValidLogFileName_NotValid_ReturnFalse() {
//		fakeExtMgr.setValid(false);
//		assertEquals("should be invalid", logAnalyzer.IsValidLogFileName(""), false);
//	}
//	
//	@Test
//	public void IsValidLogFileName_Valid_ReturnTrue() {
//		fakeExtMgr.setValid(true);
//		assertEquals("should be valid", logAnalyzer.IsValidLogFileName(""), true);
//	}
//	
	@Test
	public void IsValidLogFileNameTestable_NotValid_ReturnFalse() {
		fakeExtMgr.setValid(false);
		assertEquals("should be invalid", logAnalyzerTestable.IsValidLogFileName(""), false);
	}
	
	@Test
	public void IsValidLogFileNameTestable_Valid_ReturnTrue() {
		fakeExtMgr.setValid(true);
		assertEquals("should be valid", logAnalyzerTestable.IsValidLogFileName(""), true);
	}
}
