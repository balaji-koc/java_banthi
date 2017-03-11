/**
 * 
 */
package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Balaji
 *
 */
public class TestApplication {

	/**
	 * Test method for {@link com.testing.Application#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		assertTrue("test" , 2==new Application().add(1, 1));
		System.out.println("First commit");
	}

}
