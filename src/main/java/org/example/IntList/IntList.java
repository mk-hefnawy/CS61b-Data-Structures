package org.example.IntList;

public class IntList {

    private class IntNode{
        int item;
        IntNode next;

        public IntNode(int item, IntNode next){
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;
    private int size;

    public IntList(){
        size = 0;
    }
    public IntList(int first){
        this.first = new IntNode(first, null);
        size = 1;
    }

    public void addFirst(int item){
        size++;
        if (first == null){
            first = new IntNode(item, null);
            return;
        }

        
        first = new IntNode(item, first);
    }
    
    public void addLast(int item){
        size++;
        if (first == null){
            first = new IntNode(item, null);
            return;
        }
        helperAddLast(first, item);

    }

    private void helperAddLast(IntNode temp, int item){
        if (temp.next == null) {
            temp.next = new IntNode(item, null);
            return;
        }

        helperAddLast(temp.next, item);
    }
    public int size(){
        return helperSize(first);
    }

    public int fastSizeUsingCaching(){
        return size;
    }

    private int helperSize(IntNode temp){
        if (temp == null) return 0;

        return 1 + helperSize(temp.next);
    }

    public String toString(){

        String res = helperToString(first);
        if (res.isEmpty()) return "";

        if (res.charAt(res.length() - 1) == ','){
            res = res.substring(0, res.length() - 1);
        }

        return res;
    }

    private String helperToString(IntNode temp){
        if (temp == null) return "";
        return temp.item + "," + helperToString(temp.next);
    }
}
