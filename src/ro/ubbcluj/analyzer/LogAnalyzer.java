package ro.ubbcluj.analyzer;

import ro.ubbcluj.analyzer.factory.FileExtMgrFactory;
import ro.ubbcluj.analyzer.utils.FileExtMgr;

public class LogAnalyzer {
	
	static final String SUFFIX = ".str";
	
//	private FileExtMgr fileExtMgr;
	
	public LogAnalyzer() {}
	
//	public LogAnalyzer(FileExtMgr fileExtMgr) {
//		this.fileExtMgr = fileExtMgr;
//	}
//	
//	public void setFileExtMgr(FileExtMgr fileExtMgr) {
//		this.fileExtMgr = fileExtMgr;
//	}


	public boolean IsValidLogFileName(String name){
//		if (name.length() < SUFFIX.length()) {
//			throw new IllegalArgumentException("Name is to short");
//		}
//		return name.endsWith(SUFFIX);
//		if (fileExtMgr != null)
//		return fileExtMgr.isValid(name);
		return FileExtMgrFactory.getInstance().getFileExtMgr().isValid(name);
	}
}
