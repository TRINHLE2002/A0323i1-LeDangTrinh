package SS10.BT1;

import java.util.Arrays;

public class MyList<E> {
    private int Size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int Capacity){
        if(Capacity < 0){
            System.out.println("Invalid capacity" + Capacity);
        }
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element){
        if(index < 0 || index > Size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + Size);
        }
        ensureCapacity(Size + 1);
        System.arraycopy(elements, index, elements, index + 1, Size - index);
        elements[index] = element;
        Size++;
    }

    public E remove(int index){
        if (index < 0 || index >= Size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + Size);
        }
        E removedElement = (E) elements[index];
        int numMoved = Size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--Size] = null;
        return removedElement;
    }

    public int Size(){
        return Size;
    }
    @SuppressWarnings("unchecked")
    public E clone(){
        try {
            MyList<E> clonedList = (MyList<E>) super.clone();
            clonedList.elements = Arrays.copyOf(elements, Size);
            return (E) clonedList;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public boolean contains(E o){
        return indexOf(o) >= 0;
    }

    public int indexOf(E o){
        if(o == null){
            for (int i = 0; i < Size; i++){
                if(elements[i] == null){
                    return  i;
                }
            }
        }
        else {
            for (int i = 0; i < Size; i++){
                if (o.equals(elements[i])) {
                    return  i;
                }
            }
        }
        return -1;
    }

    public boolean add(E e){
        ensureCapacity(Size + 1);
        elements[Size++] = e;
        return  true;
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity > elements.length){
            int newCapactity = elements.length * 2;
            if(newCapactity < minCapacity){
                newCapactity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapactity);
        }
    }

    public E get(int i){
        if(i < 0 || i < Size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size" + Size );
        }
        return (E) elements[i];
    }

    public void clear(){
        for (int i = 0; i < Size; i++){
            elements[i] = null;
        }
        Size = 0;
    }
}
