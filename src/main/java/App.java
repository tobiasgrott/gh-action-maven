public class App {
 public static void main(String[] args){
     System.out.println("I am your awesome Java application!");

     DeepThought ourSuperComputer = new DeepThought();
     int ans = ourSuperComputer.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything();

     RedisJava cache = new RedisJava();
     cache.cacheValue("answerToTheUltimateQuestionOfLife", String.valueOf(ans));
     System.out.println(String.format("Cached Value: %s",cache.getCachedValue("answerToTheUltimateQuestionOfLife")));
     System.out.println(ans);

    }   
}