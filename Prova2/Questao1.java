import java.util.EmptyStackException;

public static void main(String[] args) throws FileNotFoundException{
Scanner scanner;
Stack Nomes = new Stack();

scanner = new Scanner(new File("/nomes.txt"));
public class ArrayStack<E>  implements Stack<E> {
protected int capacity; 
public static final int CAPACITY = 1000; 
protected E S[]; 
protected int top=-1; 
public ArrayStack() {
this(CAPACITY); 
}
public ArrayStack(int cap) {
capacity = cap;
S = (E[]) new Object[capacity]; 
}
public int size() {
return (top + 1);
}
public boolean isEmpty() {
return (top <0);

}
public void push(E element) throws FullStackException {
if (size() == capacity)
throw new FullStackException("Stack is full.");
S[++ top] = element;
}
public E top()  throws EmptyStackException {
if (isEmpty())
throw new EmptyStackException();
return S[top];
}
public E pop() throws EmptyStackException {

E element;
if (isEmpty())
throw new EmptyStackException();
element=S[top];
S[top--] =null;
return element;
}
public String toString()
{
String s;
s = "[";
if (size() > 0) s+=S[0];
if (size() >1)
for (int i = 1; i < size()-1; i++) {
s += ", " + S[i];
}
return s + "]";
}

public void status(String op, Object element) {
System.out.print("------> " + op); // imprime esta operação
System.out.println(", retorno: " + element);
System.out.println("Resultado: tamanho = " + size() + ", é vazio = " + isEmpty());
System.out.println("Pilha: " + this); // conteúdo da pilha
}
E.status.push(Nomes);
E.status(pop());
System.out.println(Nomes);
}
