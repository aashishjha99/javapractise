package Coding;

public class RverseLInked {

    int val;
    RverseLInked nxt;

    RverseLInked() {
    };

    RverseLInked(int val) {
        this.val = val;
    }

    RverseLInked(int val, RverseLInked nex) {
        this.val = val;
        this.nxt = nxt;
    };

    public static void main(String[] args) {

    }

    public RverseLInked reverseList(RverseLInked head) {
        RverseLInked newHead = null;
        while (head != null) {
            RverseLInked next = head.nxt;
            head.nxt = newHead;
            newHead = head;
            head = next;
        }
        return newHead;

    }

    static RverseLInked findMiddle(RverseLInked head) {

        RverseLInked temp = head;
        int count = 0;

        while (temp != null) {

            count++;
            temp = temp.nxt;
        }

        temp = head;

        for (int i = 0; i < count / 2; i++) {
            temp = temp.nxt;
        }

        return temp;

    }

    

    static RverseLInked tortoiseHare(RverseLInked head) {

        RverseLInked slow = head, fast = head;

        while (fast != null && fast.nxt != null) {
            slow = slow.nxt;
            fast = fast.nxt.nxt;
        }
        return slow;
    }
}
