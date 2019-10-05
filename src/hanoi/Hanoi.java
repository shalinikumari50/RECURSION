package hanoi;

public class Hanoi {
    private int numberOfDisks;
    private char helper;
    private char from;
    private char to;

    public int getNumberOfDisks() {
        return numberOfDisks;
    }

    public Hanoi(int numberOfDisks, char from, char helper, char to) {
        this.numberOfDisks = numberOfDisks;
        this.helper = helper;
        this.from = from;
        this.to = to;
    }

    public void setNumberOfDisks(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }

    public char getHelper() {
        return helper;
    }

    public void setHelper(char helper) {
        this.helper = helper;
    }

    public char getFrom() {
        return from;
    }

    public void setFrom(char from) {
        this.from = from;
    }

    public char getTo() {
        return to;
    }

    public void setTo(char to) {
        this.to = to;
    }

    public void move(char from, char to) {
        String a = String.format("Move disk from %c to %c!", from, to);
        System.out.println(a);
    }

    public void hanoi(int numberOfDisks, char from, char helper, char to) {
        if (numberOfDisks == 0) {
        } else {
            hanoi(numberOfDisks - 1, from, to, helper);
            move(from, to);
            hanoi(numberOfDisks - 1, helper, from, to);
        }
    }

}
