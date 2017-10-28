package com.example.demo;

import org.junit.Before;
import org.junit.Test;

public class DemoApplicationTests {

	SerDeser testobj;

	@Before
	public void setUp() {
		testobj = new SerDeser();

//		abbreviations.put("en", "hello");
//		abbreviations.put("de", "hande hoh");
//		abbreviations.put("fr", "bonjur");


		testobj.getAbbreviations().add(new ImmutablePair<>("en", "hello"));
		testobj.getAbbreviations().add(new ImmutablePair<>("fr", "zzzzu"));

	}

	@Test
	public void contextLoads() {
		try {
			String json = new ObjectMapper().writeValueAsString(testobj);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
