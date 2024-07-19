package test;

public class UserExistsHandler extends BaseHandler {
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public Boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("This username is not registered");
            return false;
        }
        System.out.println("Username found");
        return handleNext(username, password);
    }
}
