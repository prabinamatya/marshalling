package com.prabin.marshal.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="link")
public class Link {
	private String href;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}
