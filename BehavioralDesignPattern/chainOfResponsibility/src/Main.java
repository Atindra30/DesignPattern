import test.*;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        BaseHandler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);
        authService.logIn("admin", "password");
    }
}
