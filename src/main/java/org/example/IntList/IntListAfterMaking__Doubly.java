package org.example.IntList;

public class IntListAfterMaking__Doubly {

    private static class IntNode__Doubly{
        int item;
        IntNode__Doubly next;
        IntNode__Doubly prev;

        public IntNode__Doubly(IntNode__Doubly next, IntNode__Doubly prev){
            this.next = next;
            this.prev = prev;
        }
        public IntNode__Doubly(int item, IntNode__Doubly next, IntNode__Doubly prev){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    /** The first item (if any) is at head.next*/
    private final IntNode__Doubly head = new IntNode__Doubly(null, null);
    private final IntNode__Doubly tail = new IntNode__Doubly(null, null);
    private int size;

    public IntListAfterMaking__Doubly(){
        size = 0;
    }
    public IntListAfterMaking__Doubly(int first){
        IntNode__Doubly newNode = new IntNode__Doubly(first, null, head);
        this.head.next = newNode;
        this.tail.prev = newNode;
        size = 1;
    }

    public void addFirst(int item){
        size++;
        if (head.next == null){
            head.next = new IntNode__Doubly(item, null, head);
            return;
        }

        head.next = new IntNode__Doubly(item, head.next, head);

    }
    public void addLast(int item){
        size++;

        if (tail.prev != null){
            IntNode__Doubly temp = tail.prev;
            IntNode__Doubly newNode = new IntNode__Doubly(item, null, temp);

            tail.prev = newNode;
            temp.next = newNode;
        }else{
            IntNode__Doubly newNode = new IntNode__Doubly(item, null, head);
            head.next = newNode;
            tail.prev = newNode;
        }

    }
    public int size(){
        return helperSize(head);
    }

    public int fastSizeUsingCaching(){
        return size;
    }

    private int helperSize(IntNode__Doubly temp){
        if (temp.next == null) return 0;

        return 1 + helperSize(temp.next);
    }

    public String toString(){

        String res = helperToString(head);
        if (res.isEmpty()) return "";

        if (res.charAt(res.length() - 1) == ','){
            res = res.substring(0, res.length() - 1);
        }

        return res;
    }

    private String helperToString(IntNode__Doubly temp){
        if (temp.next == null) return "";
        return temp.next.item + "," + helperToString(temp.next);
    }
}
