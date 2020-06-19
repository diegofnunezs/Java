package stack;
public class Stack {
	private static final int CAPACIDAD=5;
	private int [] pila = new int [CAPACIDAD];
	private int size=0 ;



	public Stack(){
		
	}
	
	public boolean isEmpty (){
		if( size == 0){
			return true;						
		}
		return false;
	}

	public boolean isFull (){
		if( size == CAPACIDAD){
			return true;						
		}
		return false;
	}

	public int size(){
		return size;
	}

	public int capacity(){
		return CAPACIDAD;
	}

	public void push (int e) throws StackOverflowException{
		if(isFull()==true){
			throw new StackOverflowException("El stack esta lleno");			
		}
		else{
			pila[size]=e;		
			size++;			
		}

	}

	public int top() throws StackUnderflowException{
		if(isEmpty()== true){
			throw new StackUnderflowException("El Stack esta vacio");
		}
		return pila[size-1];

	}

	public int pop() throws StackUnderflowException{
		//System.out.println("POP t="+size);
		if(isEmpty()== true){
			throw new StackUnderflowException("El Stack esta vacio");
		}
		size--;	
		return pila[size];
	}
	
	public void display(){
		System.out.println("---");
		for(int i=size-1;i>=0;i--){
			System.out.println("["+pila[i]+"]");
		}
	}

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		Stack s = new Stack();
		s.push(45);
		s.push(44);
		s.push(43);
		s.push(42);
		s.push(41);
		s.display();
		//s.pop();
		System.out.println("pop "+s.pop() );
		s.display();		
		System.out.println("pop "+s.pop() );
		s.display();		
		System.out.println("pop "+s.pop() );
		s.display();		
		System.out.println("pop "+s.pop() );
		s.display();		
		System.out.println("pop "+s.pop() );
		s.display();		
	
	}
	
}
