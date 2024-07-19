package test;

public class RoleCheckHandler extends BaseHandler {
    @Override
    public Boolean handle(String username, String password) {
        if ("admin".equals(username)) {
            System.out.println("Loading admin content");
        } else {
            System.out.println("Loading user content");
        }
        // Continue the chain
        return handleNext(username, password);
    }
}
