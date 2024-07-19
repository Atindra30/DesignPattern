package test;

public abstract class BaseHandler {

    private BaseHandler next;

    public BaseHandler setNextHandler(BaseHandler next) {
        this.next = next;
        return next;
    }

    public abstract Boolean handle(String username, String password);

    public Boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }
}
