package tema_lab_4;

public class UserAccountsRegistry {
    private UserAccount[] userAccounts = new UserAccount[10];

    public void AddAccount(UserAccount userAccount) {
        if (!checkDifUsername(userAccount.getUsername())) {
            System.out.println("\n-----------------------------------\n");
            System.out.println("Username already exists!");
            System.out.println("\n-----------------------------------\n");
            return;
        }

        boolean checkForSpace = false;
        for (int i = 0; i < userAccounts.length; i++) {
            if (userAccounts[i] == null) {
                userAccounts[i] = userAccount;
                checkForSpace = true;
                break;
            }
        }

        if (!checkForSpace) {
            System.out.println("\n-----------------------------------\n");
            System.out.println("No more space for new accounts!");
            System.out.println("\n-----------------------------------\n");
        }
    }

    public boolean checkDifUsername(String username) {
        for (UserAccount userAccount : userAccounts) {
            if (userAccount != null && userAccount.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public void printDataOfUsers() {
        System.out.println("\n-----------------------------------\n");
        for (UserAccount userAccount : userAccounts) {
            if (userAccount != null) {
                System.out.println("\n --- User " + userAccount.getUsername() + " ---");
                System.out.println("Password: " + userAccount.toString());
                System.out.println("Email: " + userAccount.getEmail());
                System.out.println("\n");
            }else{
                break;
            }
        }
        System.out.println("\n-----------------------------------\n");
    }
}
