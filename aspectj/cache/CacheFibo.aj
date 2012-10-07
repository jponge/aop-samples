import java.util.*;

aspect CacheFibo {
  
  private final Map<Long, Long> cache = new HashMap<Long, Long>();
  
  long around(long n): call(long fibo(long)) && args(n) {
    if (cache.containsKey(n)) {
      return cache.get(n);
    } else {
      long result = proceed(n);
      cache.put(n, result);
      return result;
    }
  }
}