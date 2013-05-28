package com.alorma.utils;

/**
* Class to generate uris with rest form:
* type://host/param/param/param
*/
public class UriBuilder {

	private static StringBuffer sb;

	/**
	* Constructor of UriBuilder.
	*
	* @param String base: base path of uri with prefix: "http://www.google.es"
	*/
	public UriBuilder(String base) {
		sb = new StringBuffer(base);
	}

	/**
	* Method to add new param into uri.
	*
	* @param String param to add: "http://www.google.es/images/cats/brown"
	*/
	public UriBuilder addParam(String param) {
		sb.append("/");
		sb.append(param);
		return this;
	}

	/**
	* Methos that returns the full uri well-formed
	*/
	@Override
	public String toString() {
		return sb.toString();
	}

}
