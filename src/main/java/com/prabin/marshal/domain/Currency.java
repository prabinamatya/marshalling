package com.prabin.marshal.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "currency")
public class Currency {
	private String iso;
	private String name;
	private String symbol;
	private SubUnit subunit;
	private List<String> links;
	public String getIso() {
		return iso;
	}
	public void setIso(String iso) {
		this.iso = iso;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public SubUnit getSubunit() {
		return subunit;
	}
	public void setSubunit(SubUnit subunit) {
		this.subunit = subunit;
	}
	public List<String> getLinks() {
		return links;
	}
	public void setLinks(List<String> links) {
		this.links = links;
	}
	
	
}
