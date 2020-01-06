package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RhymersJUnitTest {

	private DefaultCountingOutRhymer rhymer;
	@Before
	public void setRhymer() {
		rhymer = new DefaultCountingOutRhymer();
	}
	private final int TEST_VALUE = 4;
	@Test
	public void testCountIn() {
		rhymer.countIn(TEST_VALUE);
		Assert.assertEquals(TEST_VALUE, rhymer.peekaboo());
	}

	@Test
	public void testCallCheck() {
		Assert.assertTrue(rhymer.callCheck());
		rhymer.countIn(888);
		Assert.assertFalse(rhymer.callCheck());
	}
	@Test
	public void testIsFull() {

		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}
		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		final int EMPTY_STACK_VALUE = -1;
		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int TEST_VALUE = 4;
		rhymer.countIn(TEST_VALUE);
		result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCountOut() {
		final int EMPTY_STACK_VALUE = -1;
		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		int TEST_VALUE = 4;
		rhymer.countIn(TEST_VALUE);
		result = rhymer.countOut();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
