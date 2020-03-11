public class VectorCode {

    private Elem head;
    private int length;

    public VectorCode(int [] ar) {
        int [] arr = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            arr[i] = ar[ar.length - i - 1];
            if (arr[i] != 0) {
                Elem p = new Elem();
                p.setValue(arr[i]);
                p.setPos(ar.length - 1 - i);
                p.setNext(head);
                this.head = p;
            }
            this.length++;
        }
    }

    public void print() {
        Elem p1 = new Elem();
        p1 = this.head;
        while (p1 != null) {
            System.out.println("(" + p1.getPos() + ", " + p1.getValue() + ")");
            p1 = p1.getNext();
        }
    }

    public int[] decode() {
        int [] arr = new int[this.length];
        Elem p = new Elem();
        p = this.head;
        for (int i = 0; i < arr.length; i++) {
            if (p.getPos() == i && p.getNext() != null) {
                arr[i] = p.getValue();
                p = p.getNext();
            }
            else arr[i] = 0;
        }
        arr[p.getPos()] = p.getValue();
        return arr;
    }

    public void delete(int pos) {
        Elem p = new Elem();
        p = this.head;
        while (p != null) {
            if (p.getPos() == pos) {
                if (p == head) {
                    head = p.getNext();
                    p = null;
                }
            }
            if (p.getNext() != null) {
                if (p.getNext().getPos() == pos) {
                    p.setNext(p.getNext().getNext());
                }
            }
            if (p.getPos() == pos && p.getNext() == null) {
                p = null;
            }
            p = p.getNext();
        }
    }

    public void insert(int k, int pos) {
        Elem p = new Elem();
        p = this.head;
        while (p != null) {
            if (p.getPos() == pos) {
                p.setValue(k);
                break;
            }
            if (p.getNext() != null) {
                if (pos < p.getNext().getPos()) {
                    Elem p1 = new Elem();
                    p1.setNext(p.getNext());
                    p.setNext(p1);
                    p1.setPos(pos);
                    p1.setValue(k);
                    break;
                }
            }
            if (p.getNext() == null) {
                if (pos > p.getPos()) {
                    Elem p2 = new Elem();
                    p.setNext(p2);
                    p2.setValue(k);
                    p2.setPos(pos);
                    break;
                }
            }
            p = p.getNext();
        }
    }

    public int scalarProduct(VectorCode v) {
        int sum = 0;
        Elem p1, p2 = new Elem();
        p1 = this.head;
        p2 = v.head;
        while (p2 != null) {
            while (p1 != null) {
                if (p1.getPos() == p2.getPos()) {
                    sum += (p1.getValue() * p2.getValue());
                }
                p1 = p1.getNext();
            }
            p2 = p2.getNext();
            p1 = this.head;
        }
        return sum;
    }

    void mult(int a, int c) {
        Elem next2 = new Elem();
        next2 = head;
        while (next2 != null) {
            if (next2.getValue() == a) {
                next2.setValue(a * c);
            }
            next2 = next2.getNext();
        }
    }
}
