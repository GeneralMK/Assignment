package org.example;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }
        String e = email.trim().toLowerCase();

        if (!e.matches("^[a-z0-9._%+-]+@yahoo\\.[a-z]{2,}$")) {
            throw new IllegalArgumentException("Only Yahoo emails are allowed (e.g., name@yahoo.com).");
        }
        this.email = email.trim();
    }

    public void setUserName(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (userName.trim().length() <= 6) {
            throw new IllegalArgumentException("Username length must be greater than 6.");
        }
        this.userName = userName.trim();
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        String p = password.trim();
        if (p.length() <= 6) {
            throw new IllegalArgumentException("Password length must be greater than 6.");
        }
        if (this.userName != null) {
            String unameLower = this.userName.toLowerCase();
            if (p.toLowerCase().contains(unameLower)) {
                throw new IllegalArgumentException("Password cannot contain the username.");
            }
        }
        this.password = p;
    }

    public String getEmail() { return email; }
    public String getUserName() { return userName; }

    public static void main(String[] args) {
        Registration r = new Registration();

        r.setEmail("kmaxkondile@yahoo.com");
        r.setUserName("MasixoleK");
        r.setPassword("StrongPass123");

        System.out.println("Registered: " + r.getUserName() + " / " + r.getEmail());
    }
}
