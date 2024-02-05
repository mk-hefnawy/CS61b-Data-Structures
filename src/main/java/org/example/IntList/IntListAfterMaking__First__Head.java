package org.example.IntList;

public class IntListAfterMaking__First__Head {

    private class IntNode{
        int item;
        IntNode next;

        public IntNode(IntNode next){
            this.next = next;
        }
        public IntNode(int item, IntNode next){
            this.item = item;
            this.next = next;
        }
    }

    /** The first item (if any) is at head.next*/
    private final IntNode head = new IntNode(null);
    private int size;

    public IntListAfterMaking__First__Head(){
        size = 0;
    }
    public IntListAfterMaking__First__Head(int first){
        this.head.next = new IntNode(first, null);
        size = 1;
    }

    public void addFirst(int item){
        size++;
        if (head.next == null){
            head.next = new IntNode(item, null);
            return;
        }

        head.next = new IntNode(item, head.next);

    }
    public void addLast(int item){
        size++;
        helperAddLast(head, item);

    }

    private void helperAddLast(IntNode temp, int item){
        if (temp.next == null) {
            temp.next = new IntNode(item, null);
            return;
        }

        helperAddLast(temp.next, item);
    }
    public int size(){
        return helperSize(head);
    }

    public int fastSizeUsingCaching(){
        return size;
    }

    private int helperSize(IntNode temp){
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

    private String helperToString(IntNode temp){
        if (temp.next == null) return "";
        return temp.next.item + "," + helperToString(temp.next);
    }
}
