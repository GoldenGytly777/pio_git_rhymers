package edu.kis.vh.nursery.list;


public final class Node {
	/**
	 * Klasa ta jest pojedynczym elementem listy
	 * @param value jest to wartosc pojedynczego elementu wyrazona w liczbach całkowitych.
	 * @param prev jest to referencja do kolejnego obiektu tego samego typu
	 * @param next jest to referencja do poprzedniego obiektu tego samego typu
	 */
	int value;
	Node prev, next;

	/**
	 * Metoda ta jest konstruktorem classy Node
	 * @param i jest to zmienna ktorej wartość zostaje przypisana w tej motodzie do zmiennej value
	 */
	 Node(int i) {
		value = i;
	}
	/**
	 * Metoda ta jest getterem zmiennej value
	 * @return zwraca kopie wartości value wyrazona w int
	 */
	public int getValue() {
		return value;
	}
	/**
	 * Metoda ta jest getterem zmiennej prev
	 * @return zwraca referencje do obiektu prev
	 */
	public Node getPrev() {
		return prev;
	}
	/**
	 * Metoda ta jest setterem zmiennej prev
	 * @param prev jest to referencja do obiektu która zostaje przypisana do zmiennej klasowej prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	/**
	 * Metoda ta jest getterem zmiennej prev
	 * @return zwraca referencje do obiektu next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * Metoda ta jest setterem zmiennej prev
	 * @param next jest to referencja do obiektu która zostaje przypisana do zmiennej klasowej next
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
