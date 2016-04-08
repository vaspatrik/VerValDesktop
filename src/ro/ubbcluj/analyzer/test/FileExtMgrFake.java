package ro.ubbcluj.analyzer.test;

import ro.ubbcluj.analyzer.utils.FileExtMgr;

public class FileExtMgrFake implements FileExtMgr {
	
	private boolean valid;
	
	public boolean isValid(String s) {
		return valid;
	}
	
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
