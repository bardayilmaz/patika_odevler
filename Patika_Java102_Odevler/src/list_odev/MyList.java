package list_odev;

public class MyList<T> implements IList<T>{
    private int size;
    private int capacity;
    private T[] arr;

    public MyList() {
        initializeArray(10);
        size = 0;
        capacity = 10;
    }

    public MyList(int capacity) {
        initializeArray(capacity);
        size = 0;
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    /** Bu method verilen data'yı listenin 'sonuna' ekler. Gerek varsa listenin kapasitesini ikiye katlar.*/
    @Override
    public void add(T data) {
        if(checkCapacity()) {
            arr[size] = data;
            size++;
        }
        else {
            doubleArray();
            arr[size] = data;
            size++;
        }
    }

    @Override
    public T get(int index) {
        if(index >= 0 && index < size) return arr[index];
        return null;
    }

    @Override
    public T remove(int index) {
        if(index >= 0 && index < size) {
            T removed = arr[index];
            for(int i = index; i < size-1; i++) {
                arr[i] = arr[i+1];
            }
            if(arr[size-1] != null) arr[size-1] = null;
            size--;
            return removed;
        }
        return null;
    }

    @Override
    public T set(int index, T data) {
        if(index >= 0 && index < size) {
            T removed = arr[index];
            arr[index] = data;
            return removed;
        }
        return null;
    }

    @Override
    public int indexOf(T data) {
        int result = -1;
        for(int i = 0; i < size; i ++) {
            if(arr[i].equals(data)) {
                result = i;
                return result;
            }
        }
        // -1
        return result;
    }

    @Override
    public int lasIndexOf(T data) {
        int result = -1;
        for(int i = size-1; i >= 0; i--) {
            if(arr[i].equals(data)) {
                result = i;
                return result;
            }
        }
        // -1
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T[] toArray() {
        // Privacy Leak'i önlemek amacıyla array'ın bir kopyasını döndürür.
        T[] returned = (T[])new Object[size];
        for(int i = 0; i < size; i++) {
            returned[i] = arr[i];
        }
        return returned;
    }

    @Override
    public void clear() {
        arr = (T[])new Object[capacity];
    }

    @Override
    public IList<T> subList(int start, int finish) {
        if(start >= 0 && finish >= 0 && start < size-1 && finish < size && finish > start) {
            IList<T> returned = new MyList<T>((finish - start) +1);
            for(int i = start; i <= finish; i++) {
                returned.add(arr[i]);
            }
            return returned;
        }
        return null;
    }

    @Override
    public boolean contains(T data) {
        if(indexOf(data) != -1) return true;
        return false;
    }

    public String toString() {
        String result = "";
        for(int i = 0; i < size; i++) {
            if(i == size-1) {
                result = result.concat(arr[i].toString());
                break;
            }
            result = result.concat(arr[i].toString()+", ");

        }
        return result;
    }

    /** Verilen kapasiteye sahip bir T array'ı oluşturur*/
    private void initializeArray(int capacity) {
        arr = (T[])new Object[capacity];
    }

    /** Bu method eleman eklemen önce eleman sayısının kapasiteye eşit olup olmadığını kontrol eder.*/
    private boolean checkCapacity() {
        if(size == capacity) return false;
        else return true;
    }

    /** Bu method listenin kapasitesini içindaki verileri kopyalarak iki katına çıkarır.
     * Direkt olarak Arrays.copyof() methodu da kullanılabilir, fakat basit bir işlem olduğu için tekrar yazmayı tercih ettim.
     */
    private void doubleArray() {
        T[] newArr = (T[])new Object[capacity*2];
        for(int i=0; i < capacity; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity *= 2;
    }
}
