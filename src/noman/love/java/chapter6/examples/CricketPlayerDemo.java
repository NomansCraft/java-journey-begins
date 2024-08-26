package noman.love.java.chapter6.examples;

public class CricketPlayerDemo {

    public static void main(String[] args) {
        CricketPlayer sayeem = new CricketPlayer("Sayeem");
        sayeem.addScore(1);
        sayeem.addScore(4);
        sayeem.addScore(6);
        sayeem.addScore(18);

        CricketPlayer rifat = new CricketPlayer("Rifat");
        rifat.addScore(4);
        rifat.addScore(9);
        rifat.addScore(94);
        rifat.addScore(87);

        CricketPlayer sakib = new CricketPlayer("Sakib");
        sakib.addScore(5);
        sakib.addScore(56);
        sakib.addScore(59);
        sakib.addScore(99);

        System.out.println("sayeem = " + sayeem.getScore());
        System.out.println("rifat = " + rifat.getScore());
        System.out.println("sakib = " + sakib.getScore());
        System.out.println("total score = " + CricketPlayer.getTotalScore());
    }
}
