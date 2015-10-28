package com.prabin.marshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prabin.marshal.domain.Currency;
import com.prabin.marshal.domain.SubUnit;

@SpringBootApplication
public class MarshallingApplication {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(MarshallingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MarshallingApplication.class, args);
		XMLToJava();
	}

	private static void XMLToJava() {
		try {
			File file = new File("currency.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Currency.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Currency currency = (Currency) jaxbUnmarshaller.unmarshal(file);
			System.out.println(currency.getIso());
			System.out.println(currency.getName());
			System.out.println(currency.getSymbol().toString());
//			SubUnit subunit = currency.getSubunit();
//			System.out.println(subunit.getName());
			System.out.println(currency.getLinks().get(0));

		} catch (JAXBException e) {
			LOGGER.info("Exception", e);
		}

	}
}
