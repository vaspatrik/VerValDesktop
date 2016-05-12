package ro.ubbcluj.analyzer.test;

import ro.ubbcluj.analyzer.utils.WebService;

public class ManualWebService implements WebService {
	private String lastError;

	public void logError(String error) {
		lastError = error;
	}

	public String getLastError() {
		return lastError;
	}
}