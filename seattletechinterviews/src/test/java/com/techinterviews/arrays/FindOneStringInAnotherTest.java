package com.techinterviews.arrays;

import junit.framework.Assert;

import org.junit.Test;

public class FindOneStringInAnotherTest {

	@Test
	public void testNormalRatter() {
		String s = "rat";
		String t = "ratter";
		FindOneStringInAnother f = new FindOneStringInAnother();
		String value = f.algorithm(s, t);
		Assert.assertEquals("Yes", value);
	}

	@Test
	public void testVerdivivaVittorioEmanueleReDiItalia() {
		String s = "VERDI";
		String t = "vivaVittorioEmanueleReDiItalia";
		FindOneStringInAnother f = new FindOneStringInAnother();
		String value = f.algorithm(s, t);
		Assert.assertEquals("Yes", value);
	}

	// person compression

	@Test
	public void testPersoncompression() {
		String s = "person";
		String t = "compression";
		FindOneStringInAnother f = new FindOneStringInAnother();
		String value = f.algorithm(s, t);
		Assert.assertEquals("No", value);
	}

	// caseDoesMatter CaseDoesMatter
	@Test
	public void testCaseCaseDoesMatter() {
		String s = "caseDoesMatter";
		String t = "CaseDoesMatter";
		FindOneStringInAnother f = new FindOneStringInAnother();
		String value = f.algorithm(s, t);
		Assert.assertEquals("No", value);
	}
}
