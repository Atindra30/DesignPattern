package test;

public class AuthService {

    private BaseHandler handler;

    public AuthService(BaseHandler handler) {
        this.handler = handler;
    }

    public Boolean logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("AuthN & AuthZ successful");
            return true;
        }
        System.out.println("AuthN & AuthZ failed");
        return false;
    }
}
