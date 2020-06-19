package linkedQueue;

public class LinkedQueue {
	//Atributos 
	public Node head;
	public int size;
	
	public LinkedQueue(){
		head = null;
	} 
	
	public void enqueue (double e) throws QueueOverflowException{
		//Se crea un nuevo nodo flotante 
		Node n = new Node(e);
		//Cuando la lista esta vacia
		if (head==null){
			head = n;
		//Cuando la lista esta llena
		}else if(isFull()){
			throw new QueueOverflowException("La cola esta llena");
		//Cuando la lista tiene almenos 1 elemento
		}else{
			//Se crea un Nodo auxiliar 
			Node nodoAct = head;
			while(nodoAct.getSiguiente()!=null){
				nodoAct = nodoAct.getSiguiente();
			}
			nodoAct.setSiguiente(n);		
		}
		size++;
		
	}
	
	public double dequeue() throws QueueUnderflowException{
		
		if (isEmpty()){
			throw new QueueUnderflowException("La cola esta vacia ");			
		}else{
			size--;
			Double n= head.getDato();
			head = head.getSiguiente();
			return n;			
		}
		
		
		
	} 

	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		int max = 5;
		if(size == max){
			return true;
		}else {
		return false;	
		}
		
	}
	
	public int size (){
		Node n = head;
		int i=0;
		while(n!=null){
			n=n.getSiguiente();
			i++;
		}
		return i;

	}

	public String toString() {
		Node n = head;
		boolean pv = true;
		String mensaje="";
		while(n!=null){
			if(pv==true){
				pv=false;
				mensaje  += ""+n.getDato();
			}else{
				mensaje  += ", "+n.getDato();					
			}	
			n=n.getSiguiente();		
		}
		return mensaje;
	}
	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		LinkedQueue l = new LinkedQueue();
		l.enqueue(10.1);
		l.enqueue(11.2);
		l.enqueue(12.3);
		l.enqueue(13.4);
		l.enqueue(14.5);
		System.out.println("*********");
		System.out.println(""+l.toString());
		System.out.println("*********");
		System.out.println(""+l.size());
		System.out.println("*********");
		System.out.println(""+l.dequeue());
		System.out.println("*********");
		System.out.println(""+l.toString());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.dequeue());
		System.out.println("*********");
		System.out.println(""+l.toString());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.size());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.dequeue());
		System.out.println("*********");
		System.out.println(""+l.toString());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.size());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.dequeue());
		System.out.println("*********");
		System.out.println(""+l.toString());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.size());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.dequeue());
		System.out.println("*********");
		System.out.println(""+l.toString());
		System.out.println("*********");
		System.out.println("*********");
		System.out.println(""+l.size());
		System.out.println("*********");
		System.out.println(""+l.isEmpty());
		System.out.println("*********");
		System.out.println(""+l.isFull());
	
		

	}

}

