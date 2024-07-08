import java.util.ArrayList;
import java.util.List;

public class StorageGenerique<T> {
    private List<T> elements;

    public StorageGenerique() {
        elements = new ArrayList<>();
    }

    public void addElement(T o) {
        elements.add(o);
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        throw new IndexOutOfBoundsException("Index hors limites: " + index);
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index hors limites: " + index);
        }
    }

    public int getSize() {
        return elements.size();
    }
}
