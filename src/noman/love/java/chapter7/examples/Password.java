package noman.love.java.chapter7.examples;

public final class Password {
    private char[] hash;

    public Password(char[] hash) {
        this.hash = hash;
    }

    public boolean isValid() {
        return false;
    }

    public class SaltePassword extends Password {
        private String salt;
        public SaltePassword(char[] hash, String salt) {
            super(hash);
            this.salt = salt;
        }
    }
}
