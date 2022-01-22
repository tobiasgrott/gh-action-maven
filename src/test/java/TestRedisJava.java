import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestRedisJava {
    public TestRedisJava(){}

    @Test
    @DisplayName("Test Redis cache")
    void testRedisCache(){
        DeepThought ourSuperComputer = new DeepThought();
        int ans = ourSuperComputer.answerToTheUltimateQuestionOfLifeTheUniverseAndEverything();
        RedisJava cache = new RedisJava();
        cache.cacheValue("cacheKey",String.valueOf(ans));
        assertEquals("42", cache.getCachedValue("cacheKey"));
    }
}
