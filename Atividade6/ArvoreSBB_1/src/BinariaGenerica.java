public class BinariaGenerica {
	
	class BTNode<T> {
		private T value;			// Valor guardado no nó
		private BTNode<T> left;		// Filho esquerdo
		private BTNode<T> right;	// Filho direito
		
		// Construtor
		BTNode(T v, BTNode<T> l, BTNode<T> r) {
			value = v; left = l; right = r;
	}
		
		// Getters e Setters
		public T getValue() {return value;}
		public BTNode<T> getLeft() {return left;}
		public BTNode<T> getRight() {return right;}
		public void setValue(T v) {value = v;}
		public void setLeft(BTNode<T> l) {left = l;}
		public void setright(BTNode<T> r) {right = r;}
	}
	
	public class BTree<T> {
		private BTNode<T> root;
		
		// Construtor
		BTree() {
			root = null;
		}
		
		// Getter e Setter para a raíz
		public BTNode<T> getRoot() {return root;}
			public void setRoot(BTNode<T> r) {root = r;}
		
		// Verificar se árvore está vazia
		public boolean isEmpty() {
			return root == null;
		}
		
		// Método principal (público)
		public int numberNodes() {
			return numberNodes(root);
		}
				
		// Método auxiliar (privado)
		private int numberNodes(BTNode<T> n) {
			if (n == null) return 0;
			return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight());
		}
			
		public int depth() {
			return depth(root);
		}
		
		private int depth(BTNode<T> n) {
			if (n == null) return -1;
			return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
		}
		
		public boolean contains(T value) {
			return contains(root, value);
		}
		
		private boolean contains(BTNode<T> n,T value) {
			if (n==null) return false;
			if (n.getValue().equals(value)) return true;
			return contains(n.getLeft(), value) || contains(n.getRight(), value);
		}
		
		public void printPreOder() {
			System.out.print("Pré-Ordem: ");
			printPreOrder(root);
			System.out.println();
		}
		
		private void printPreOrder(BTNode<T> n) {
			if (n == null) return;
			System.out.print(" " + n.getValue());
			printPreOrder(n.getLeft());
			printPreOrder(n.getRight());
		}
		
		public void printInOder() {
			System.out.print("In-Ordem: ");
			printInOrder(root);
			System.out.println();
		}
		
		private void printInOrder(BTNode<T> n) {
			if (n == null) return;
			printInOrder(n.getLeft());
			System.out.print(" " + n.getValue());
			printInOrder(n.getRight());
		}
		
		public void printPostOder() {
			System.out.print("Pós-Ordem: ");
			printPostOrder(root);
			System.out.println();
		}
		
		private void printPostOrder(BTNode<T> n) {
			if (n == null) return;
			printInOrder(n.getLeft());
			printInOrder(n.getRight());
			System.out.print(" " + n.getValue());
		}
	}
}
