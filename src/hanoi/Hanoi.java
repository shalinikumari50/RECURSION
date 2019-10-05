package hanoi;

public class Hanoi {
    private int numberOfDisks;
    private char helper;
    private char from;
    private char to;

    public int getNumberOfDisks() {
        return numberOfDisks;
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
}
