package com.prabin.marshal.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="subUnit")
public class SubUnit {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
