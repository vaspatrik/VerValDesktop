package ro.ubbcluj.analyzer.test;

import ro.ubbcluj.analyzer.LogAnalyzer;
import ro.ubbcluj.analyzer.utils.FileExtMgr;

public class TestableLogAnalyzer extends LogAnalyzer {
	private FileExtMgr fileExtMgr;
	
	public TestableLogAnalyzer(FileExtMgr fileExtMgr) {
		this.fileExtMgr = fileExtMgr;
	}
	
	@Override
	public FileExtMgr getFileExtMgr() {	
		return fileExtMgr;
	}
}
