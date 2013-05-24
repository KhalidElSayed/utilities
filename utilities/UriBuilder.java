package com.alorma.utils;

public class UriBuilder {

	private static StringBuffer sb;

	public UriBuilder(String base) {
		sb = new StringBuffer(base);
	}

	public UriBuilder addParam(String param) {
		sb.append("/");
		sb.append(param);
		return this;
	}

	@Override
	public String toString() {
		return sb.toString();
	}

}
