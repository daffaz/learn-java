public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }
    
    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
    }
    
    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count > 0) {
            return this.sum / (this.count * 1.0);
        }
        return 0;
    }
}
