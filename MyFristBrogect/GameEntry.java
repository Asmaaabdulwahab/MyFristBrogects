public class GameEntry {
  private int  score;

    public GameEntry(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        GameEntry [] a =new GameEntry[5];
        GameEntry[] b =a.clone();

        a[4].setScore (55);
        int scoreValueOfB4=b [4].getScore();
        System.out.println("The Score Value Of the GameEntry Referenced By b [4] Is : " + scoreValueOfB4);
    }
}
