package tutorial;

public interface List {
    public int size() throws ListException; // Devuelve el número de elementos en la lista
    public void clear(); //Remueve todos los elementos de la lista
    public boolean isEmpty(); // true si la lista está vacía
    public void add (Object element); // inserta un elemento al final de la lista
    public Object removeFirst() throws ListException; //suprime y retorna el primer elemento de la lista
    public Object removeLast() throws ListException; //suprime y retorna el ultimo elemento de la lista
    public Object getFirst() throws ListException; //Devuelve el primer elemento de la lista
    public Object getLast() throws ListException; //Devuelve el último elemento de la lista
    public Node getNode(int index) throws ListException; //Devuelve el nodo de la posicion indicada
}
