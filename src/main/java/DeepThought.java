import java.util.concurrent.TimeUnit;

public class DeepThought {
    public DeepThought(){

    }

    public int answerToTheUltimateQuestionOfLifeTheUniverseAndEverything(){
        System.out.println("You have asked the answer to the Ultimate Question of Life, the Universe, and Everything");
        System.out.println("I need to think a while about that one, come back again in 7.5 million years...");
        calculate(); // for 7.5 million years....
        return giveAnswer();
    }

    private void calculate(){
        for(int millionYears = 0; millionYears <8; millionYears++){
            System.out.println(String.format("%d million years have passed...",millionYears));
            think(1);
        }
        System.out.println("7.5 million years have now passed and I have an answer.");
    }

    private void think(int time){
        try{
            TimeUnit.SECONDS.sleep(time);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private int giveAnswer(){
        return 42;
    }
}
