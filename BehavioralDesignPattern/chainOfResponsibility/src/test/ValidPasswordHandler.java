package test;

public class ValidPasswordHandler extends BaseHandler {
    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public Boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Wrong Password");
            return false;
        }
        System.out.println("Password matched");
        return handleNext(username, password);
    }
}
