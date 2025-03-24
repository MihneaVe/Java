package tema_lab_4;

public class UserAccountMain {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        UserAccountsRegistry userAccountsRegistry = new UserAccountsRegistry();
        // For Correct Input
        UserAccount userAccount1 = new UserAccount("JohnDoe", "JohnDoe123#", "JohnDoe@gmail.com");

        // For Incorrect Inputs and Exceptions
        // UserAccount userAccount2 = new UserAccount("no", "SomePa5$", "some@mail.com");
        // UserAccount userAccount3 = new UserAccount("SomeName", "no", "some@mail.com");
        // UserAccount userAccount4 = new UserAccount("AnotherName", "SomePa5$", "no");

        // For Checking if the username is unique
        UserAccount userAccount5 = new UserAccount("JohnDoe", "JohnDoe123#", "JohnDoe@gmail.com");

        // For filling the array
        UserAccount userAccount6 = new UserAccount("JohnDoe2", "JohnDoe123#", "JohnDoe@gmail.com");
        UserAccount userAccount7 = new UserAccount("JohnDoe3", "JohnDoe123#", "JohnDoe@gmail.com");
        UserAccount userAccount8 = new UserAccount("JohnDoe4", "JohnDoe123#", "JohnDoe@gmail.com");
        UserAccount userAccount9 = new UserAccount("JohnDoe5", "JohnDoe123#", "JohnDoe@gmail.com");

        // For checking if password is hidden correctly
        UserAccount userAccount10 = new UserAccount("JohnDoe6", "JohDe123#", "JohnDoe@gmail.com");

        // For checking if the array is full
        UserAccount userAccount11 = new UserAccount("JohnDoe7", "JohnDoe123#", "JohnDoe@gmail.com");
        UserAccount userAccount12 = new UserAccount("JohnDoe8", "JohnDoe123#", "JohnDoe@gmail.com");
        UserAccount userAccount13 = new UserAccount("JohnDoe9", "JohnDoe123#", "JohnDoe@gmail.com");
        UserAccount userAccount14 = new UserAccount("JohnDoe10", "JohnDoe123#", "JohnDoe@gmail.com");
        UserAccount userAccount15 = new UserAccount("JohnDoe11", "JohnDoe123#", "JohnDoe@gmail.com");

        // Adding to the registry
        userAccountsRegistry.AddAccount(userAccount1);
        userAccountsRegistry.AddAccount(userAccount5);
        userAccountsRegistry.AddAccount(userAccount6);
        userAccountsRegistry.AddAccount(userAccount7);
        userAccountsRegistry.AddAccount(userAccount8);
        userAccountsRegistry.AddAccount(userAccount9);
        userAccountsRegistry.AddAccount(userAccount10);
        userAccountsRegistry.AddAccount(userAccount11);
        userAccountsRegistry.AddAccount(userAccount12);
        userAccountsRegistry.AddAccount(userAccount13);
        userAccountsRegistry.AddAccount(userAccount14);
        userAccountsRegistry.AddAccount(userAccount15);


        // Printing the data of the users\
        userAccountsRegistry.printDataOfUsers();

    }
}
