package com.lista.dupl.encad;

public class NodeList {

	private static class Node<T> {
		Node<T> previous;
		Node<T> next;
		T data;

		public Node(T data) {
			setData(data);
		}
		public Node<T> getPrevious() {
			return previous;
		}

		public void setPrevious(Node<T> previous) {
			this.previous = previous;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
	}

	
}
