package tema_lab_4;

public class UserAccount {
    private String username;
    private String password;
    private String email;

    public UserAccount(String username, String password, String email) {
        // Verifies if username is alphanumeric and between 5 and 20 characters then adds it to the instance variable or throws an exception
        if (username.matches("^[a-zA-Z0-9]{5,20}$")) {
            this.username = username;
        } else {
            throw new IllegalArgumentException(username +"Is an invalid username");
        }

        // Verifies if email has correct format then adds it to the instance variable or throws an exception
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException(email + "Is an invalid email");
        }

        // Verifies if password has at least 8 characters, contains at least one uppercase letter, at least one number and at least one special character then adds it
        // to the instance variable or throws an exception
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            this.password = password;
        } else {
            throw new IllegalArgumentException(password + "Is an invalid password");
            // While not necessarily ok to print the password, i have only done it for testing purposes
        }

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String toString() {
        String printpass = "*";
        int lenpass = password.length();
        printpass = printpass.repeat(lenpass);

        return printpass;
    }


}
