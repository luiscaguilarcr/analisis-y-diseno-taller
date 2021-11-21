package tutorial;

public class LinkedList implements List {
    private Node first; //apuntador al inicio de la lista
    
    //Constructor
    public LinkedList(){
        this.first = null;
    }

    @Override
    public int size() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        Node aux = first;
        int count = 0;
        //me muevo por la lista hasta el ultimo nodo
        while(aux!=null){
            count++;
            aux = aux.next;
        }
        return count;
    }

    @Override
    public void clear() {
        this.first = null;
    }

    @Override
    public boolean isEmpty() {
        return this.first==null;
    }


    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        if(this.isEmpty()){
            this.first = newNode;
        }
        else{
            Node aux = first;
            //me muevo por la lista hasta el ultimo nodo
            while(aux.next!=null){
                aux = aux.next;
            }
            //se sale cuando estoy en el ult nodo de la lista
            aux.next = newNode;
        }
    }

    @Override
    public Object removeFirst() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        Object element = this.first.data;
        this.first = this.first.next; //muevo el apuntador al sgte nodo
        return element;
    }

    @Override
    public Object removeLast() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        Node aux = this.first;
        Node aux2 = first; //va a ser un apuntador al nodo anterior
        while(aux.next!=null){
            aux2 = aux; //dejo un rastro al nodo anterior
            aux = aux.next; //lo movemos al sgte nodo
        }
        //se sale del while cuando aux esta en el ult nodo
        Object element = aux.data;
        aux2.next = null; //elimino el ultimo nodo
        return element;
    }

    @Override
    public Object getFirst() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        return this.first.data;
    }

    @Override
    public Object getLast() throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        Node aux = first;
        while(aux.next !=null){
            aux = aux.next; //lo movemos al sgte nodo
        }
        //cuando se sale del while, estamos en el ultimo nodo
        return aux.data; //retorna el elemento almacenado en el ult nodo
    }

    @Override
    public Node getNode(int index) throws ListException {
        if(this.isEmpty()){
            throw new ListException("Singly Linked List is Empty");
        }
        Node aux = first;
        int i = 1; //posicion del primer nodo
        while(aux!=null){
            if(tutorial.Utility.equals(i, index)){
                return aux; //debera retornar todo el nodo
            }
            i++;
            aux = aux.next;
        }
        return null; //si llega aqui, quiere decir q no encontro el nodo
    }

    @Override
    public String toString() {
        String result="Singly Linked List: ";
        Node aux = first;
        while(aux!=null){
            result +=aux.data+", ";
            aux = aux.next;
        }
        return result;
    }
}
