package behavioralPatterns.command.example1;

public class Waiter {
    private Order order;

    public Waiter(Order ord) {
        this.order = ord;
    }

    public void execute() {
        this.order.execute();
    }
}
