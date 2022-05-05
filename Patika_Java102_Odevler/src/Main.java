import list_odev.*;

public class Main {

    public static void main(String[] args) {
        IList<Integer> l = new MyList<>(3);
        System.out.println(l.size()+"\n"+l.getCapacity());
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l.toString());
        l.remove(0);
        System.out.println(l.toString());
        l.add(4);
        l.add(5);
        l.add(6);
        System.out.println(l.toString());
        l.remove(0);
        System.out.println(l.toString());
        System.out.println(l.get(l.size()-1));
        System.out.println();
        IList<Integer> l2 = l.subList(1, 3);
        l2.add(6);
        System.out.println(l2.lasIndexOf(6));


    }
}
