package linkedQueue;
import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedQueueTest {

	@Test
	public void testNew() {
		LinkedQueue l = new LinkedQueue();
		assertTrue(l.size()==0);
		assertTrue(l.isEmpty());
		assertFalse(l.isFull());
		assertTrue(l.toString().equals(""));
	}

	@Test
	public void testAddOne() throws QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(45.4);
		assertTrue(l.size()==1);
		assertFalse(l.isEmpty());
		assertFalse(l.isFull());
		assertTrue(l.toString().equals("45.4"));
	}

	@Test
	public void testAddThree() throws QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(45.4);
		l.enqueue(4);
		l.enqueue(8.9);
		assertTrue(l.size()==3);
		assertFalse(l.isEmpty());
		assertFalse(l.isFull());
		assertTrue(l.toString().equals("45.4, 4.0, 8.9"));
	}
	
	@Test
	public void testFIFO() throws QueueOverflowException, QueueUnderflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(45.4);
		l.enqueue(4);
		l.enqueue(8.9);
		assertTrue(l.dequeue()==45.4);
		assertTrue(l.dequeue()==4);
		assertTrue(l.dequeue()==8.9);
		assertTrue(l.size()==0);
	}
	
	@Test(expected=QueueUnderflowException.class)
	public void testUnderflowException() throws QueueUnderflowException {
		LinkedQueue l = new LinkedQueue();
		l.dequeue();
	}
	
	@Test(expected=QueueUnderflowException.class)
	public void testUnderflowException2() throws QueueUnderflowException, QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(45);
		l.dequeue();
		l.dequeue();
	}

	@Test(expected=QueueOverflowException.class)
	public void testOverflowException() throws QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(1);
		l.enqueue(2);
		l.enqueue(3);
		l.enqueue(4);
		l.enqueue(5);
		l.enqueue(6);
	}
	
@Test(expected=QueueOverflowException.class)
	public void testOverflowException2() throws QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(1);
		l.enqueue(2);
		l.enqueue(3);
		l.enqueue(4);
		l.enqueue(5);
		l.enqueue(6);
	}

	@Test
	public void testDequeue() throws QueueUnderflowException, QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(45);
		l.enqueue(57);
		l.enqueue(63);
		assertTrue(l.dequeue()==45);
		assertTrue(l.size()==2);
		assertFalse(l.isFull());
		assertFalse(l.isEmpty());
	}
	
	@Test
	public void testDequeue2() throws QueueUnderflowException, QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(45);
		l.enqueue(57);
		l.enqueue(63);
		assertTrue(l.dequeue()==45);
		assertTrue(l.dequeue()==57);
		assertTrue(l.size()==1);
		assertFalse(l.isFull());
		assertFalse(l.isEmpty());
	}
	
	@Test
	public void testDequeue3() throws QueueUnderflowException, QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(45);
		l.enqueue(57);
		l.enqueue(63);
		assertTrue(l.dequeue()==45);
		assertTrue(l.dequeue()==57);
		assertTrue(l.dequeue()==63);
		assertTrue(l.size()==0);
		assertFalse(l.isFull());
		assertTrue(l.isEmpty());
	}
	
	@Test
	public void testDequeue4() throws QueueUnderflowException, QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(1);
		assertTrue(l.dequeue()==1);
		l.enqueue(2);
		l.enqueue(3);
		assertTrue(l.dequeue()==2);
		l.enqueue(4);
		l.enqueue(5);
		l.enqueue(6);
		assertTrue(l.dequeue()==3);
		l.enqueue(7);
		l.enqueue(8);
		assertTrue(l.size()==5);
		assertTrue(l.dequeue()==4);
		l.enqueue(9);
		assertTrue(l.size()==5);
		assertTrue(l.dequeue()==5);
		assertTrue(l.dequeue()==6);
		assertTrue(l.dequeue()==7);
		assertTrue(l.dequeue()==8);
		assertTrue(l.dequeue()==9);
		assertTrue(l.size()==0);
	}
	
	
	@Test
	public void testIsFull() throws QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		assertFalse(l.isFull());
		l.enqueue(1);
		assertFalse(l.isFull());
		l.enqueue(2);
		assertFalse(l.isFull());
		l.enqueue(3);
		assertFalse(l.isFull());
		l.enqueue(4);
		assertFalse(l.isFull());
		l.enqueue(5);
		assertTrue(l.isFull());
	}
	
	@Test
	public void testIsEmpty() throws QueueOverflowException {
		LinkedQueue l = new LinkedQueue();
		assertTrue(l.isEmpty());
		l.enqueue(1);
		assertFalse(l.isEmpty());
		l.enqueue(2);
		assertFalse(l.isEmpty());
		l.enqueue(3);
		assertFalse(l.isEmpty());
		l.enqueue(4);
		assertFalse(l.isEmpty());
		l.enqueue(5);
		assertFalse(l.isEmpty());
	}	
}


