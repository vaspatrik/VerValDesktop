package ro.ubbcluj.analyzer;

import ro.ubbcluj.analyzer.factory.FileExtMgrFactory;
import ro.ubbcluj.analyzer.utils.FileExtMgr;
import ro.ubbcluj.analyzer.utils.FileExtMgrImpl;
import ro.ubbcluj.analyzer.utils.WebService;

public class LogAnalyzer {

	private WebService webService;

	static final String SUFFIX = ".str";

	// private FileExtMgr fileExtMgr;

	public LogAnalyzer() {
	}

	// public LogAnalyzer(FileExtMgr fileExtMgr) {
	// this.fileExtMgr = fileExtMgr;
	// }
	//
	// public void setFileExtMgr(FileExtMgr fileExtMgr) {
	// this.fileExtMgr = fileExtMgr;
	// }

	public boolean IsValidLogFileName(String name) {
		// if (name.length() < SUFFIX.length()) {
		// throw new IllegalArgumentException("Name is to short");
		// }
		// return name.endsWith(SUFFIX);
		// if (fileExtMgr != null)
		// return fileExtMgr.isValid(name);
		// return FileExtMgrFactory.getInstance().getFileExtMgr().isValid(name);

		if (webService != null && name.length() < 3) {
			webService.logError(name + " too short");
			webService.logError(name + " too short");
		}

		return getFileExtMgr().isValid(name);
	}

	public void setWebService(WebService webService) {
		this.webService = webService;
	}

	public FileExtMgr getFileExtMgr() {
		return new FileExtMgrImpl();
	}
}
