public class Timer {
    private ClockHand second;
    private ClockHand hundredthSecond;
    
    public Timer() {
        this.second = new ClockHand(60);
        this.hundredthSecond = new ClockHand(100);
    }
    
    @Override
    public String toString() {
        return this.second.toString() + ":" + this.hundredthSecond.toString();
    }
    
    public void advance() {
        this.hundredthSecond.advance();
        if (this.hundredthSecond.value() == 0) {
            this.second.advance();
        }
    }
}
