package ro.ubbcluj.analyzer.factory;

import ro.ubbcluj.analyzer.test.FakeExtMgr;
import ro.ubbcluj.analyzer.utils.FileExtMgr;

public class FileExtMgrFactory {
	
	private static FileExtMgrFactory INSTANCE;
	private FileExtMgr fileMgr;
	
	private FileExtMgrFactory() {}
	
	public static FileExtMgrFactory getInstance() {
		if(INSTANCE == null) 
			INSTANCE= new FileExtMgrFactory();
		return INSTANCE;
	}
	
	public FileExtMgr getFileExtMgr() {
		if (fileMgr != null)
			return fileMgr;
		else
			return new FakeExtMgr();
	}
	
	public void setFileExtMgr(FileExtMgr fileMgr) {
		this.fileMgr = fileMgr;
	}
}
