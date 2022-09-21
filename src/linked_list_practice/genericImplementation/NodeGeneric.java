package linked_list_practice.genericImplementation;

public class NodeGeneric <E>{

    E item;

    NodeGeneric<E> next;

    public NodeGeneric(E item) {
        this.item = item;
    }
}
