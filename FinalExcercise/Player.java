package FinalExcercise;

public class Player {
    private String name;
    private String guess;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Player(String name){
        setName(name);
    }
    public void setGuess(String guess) {
        this.guess = guess;
    }
    public String getGuess() {
        return guess;
    }

}
