package stack;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	
	Stack s;
	@Before
	public void setUp(){
		s = new Stack();
	}

	@Test
	public void test() {
		assertTrue(s.isEmpty());
	}

	@Test
	public void pushTest() throws StackOverflowException { 
		s.push(45);
		assertTrue(s.size()==1);
		assertFalse(s.isFull());
		assertFalse(s.isEmpty());	
	}

	@Test(expected=StackUnderflowException.class)
	public void underFlowTest () throws StackOverflowException, StackUnderflowException{
		s.push(45);
		s.pop();
		s.pop();		
	}

	@Test
	public void newStack() throws StackOverflowException { 
		assertTrue(s.size()==0);
		assertFalse(s.isFull());
		assertTrue(s.isEmpty());	
	}

	@Test
	public void capacidad() throws StackOverflowException { 
		s.push(45);
		s.push(44);
		s.push(43);
		s.push(42);
		s.push(41);		
		assertTrue(s.isFull());
	}

	@Test
	public void lifo() throws StackOverflowException, StackUnderflowException { 
		s.push(45);
		s.push(44);
		s.push(43);
		assertTrue(s.pop()==43);
		assertTrue(s.pop()==44);
		assertTrue(s.pop()==45);
	}

	@Test(expected=StackOverflowException.class)
	public void overFlowTest () throws StackOverflowException, StackUnderflowException{
		s.push(40);
		s.push(41);
		s.push(42);
		s.push(43);
		s.push(44);
		s.push(45);  
	}

	@Test
	public void test1() throws StackOverflowException { 
		s.push(45);
		s.push(44);		
		assertTrue(s.size()==2);

	}

	@Test
	public void test2() throws StackOverflowException, StackUnderflowException { 
		s.push(40);
		s.push(41);
		s.push(42);
		s.push(43);
		s.push(44);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		assertTrue(s.top()==40);
	}

	@Test(expected=StackUnderflowException.class)
	public void test3 () throws StackOverflowException, StackUnderflowException{
		s.push(40);
		s.push(41);
		s.push(42);
		s.pop();
		s.push(43);
		s.push(44);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();		
	}
}


