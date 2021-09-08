package demo.redis;

import lombok.extern.log4j.Log4j2;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by loc at 08/09/2021 19:43
 */
@Component
@Log4j2
public class RedisTest {
  @Autowired
  private RedissonClient redissonClient;

  public void test() {
    RBucket<String> bucket = redissonClient.getBucket("test");
    bucket.set("hello world");

    log.info("value={}", bucket.get());
  }
}
