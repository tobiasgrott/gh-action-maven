import redis.clients.jedis.Jedis;

public class RedisJava {
    Jedis jedis;
    DeepThought superComputer;
    
    public RedisJava(){
        this.jedis = new Jedis("localhost", 6379);
    }

    public void cacheValue(String key, String value){
        this.jedis.set(key, value);
    }

    public String getCachedValue(String key){
        this.jedis.get(key);
    }
}
