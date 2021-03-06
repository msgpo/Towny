package com.palmergames.bukkit.towny;

public class TownyException extends Exception {
	private static final long serialVersionUID = -6821768221748544277L;

	public TownyException() {
		super("unknown");
	}

	public TownyException(String message) {
		super(message);
	}
	
	@Deprecated
	public String getError() {
		return getMessage();
	}
}
