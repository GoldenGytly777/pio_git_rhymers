package edu.kis.vh.nursery.list;

public final class IntLinkedList {

	Node last;
	int i;
	private static final int RETURN=-1;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RETURN;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return RETURN;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
