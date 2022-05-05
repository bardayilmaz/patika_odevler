package list_odev;

public interface IList <T>{
    public int size();
    public int getCapacity();
    public void add(T data);
    public T get(int index);
    public T remove(int index);
    public T set(int index, T data);
    public int indexOf(T data);
    public int lasIndexOf(T data);
    public boolean isEmpty();
    public T[] toArray();
    public void clear();
    public IList<T> subList(int start, int finish);
    public boolean contains(T data);
}
