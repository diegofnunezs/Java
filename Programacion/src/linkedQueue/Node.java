package linkedQueue;

public class Node {
	
	//Atributos
	
	private double dato;
	private Node siguiente;
	//Constructor
	
	Node(double e){
		this.dato = e;
		this.siguiente = null;
	}
	
	//Getters & Setters 

	public void setSiguiente (Node e){
		this.siguiente = e;
	}
	
	public Node getSiguiente(){
		return siguiente;		
	}
	
	public double getDato(){
		return dato;
	}
}
