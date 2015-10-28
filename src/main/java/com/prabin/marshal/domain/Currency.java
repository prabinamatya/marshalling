package com.prabin.marshal.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "currency")
public class Currency {
	private String iso;
	private String name;
	private String symbol;
	private SubUnit subunit;
	private Links links;
	
}
