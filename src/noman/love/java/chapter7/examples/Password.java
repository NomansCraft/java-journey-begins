package noman.love.java.chapter7.examples;

public class Password {
    private char[] hash;

    public Password(char[] hash) {
        this.hash = hash;
    }

    // Some useful code
}

 class SaltedPassword extends Password {
    private String salt;

    public SaltedPassword(char[] hash, String salt) {
        super(hash);
        this.salt = salt;
    }
}
