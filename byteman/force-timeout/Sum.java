import java.util.*;
import java.util.concurrent.*;
import static java.util.concurrent.Executors.*;

public class Sum {
  
  static class SumTask implements Callable<Long> {
    private final long from;
    private final long to;
    
    SumTask(long from, long to) {
      this.from = from;
      this.to   = to;
    }
    
    public Long call() {
      long acc = 0L;
      for (long i = from; i < to; i++) { acc = acc + i; }
      return acc;
    }
  }
  
  public static void main(String... args) throws Throwable {
    ExecutorService executor = newSingleThreadExecutor();
    List<Future<Long>> futures = new LinkedList<>();
    
    for (int i = 0; i < 10; i++) {
      futures.add(executor.submit(new SumTask(1L, 1_000_000L)));
    }
    
    try {
      for (Future<Long> future : futures) {
        System.out.println(future.get(1, TimeUnit.SECONDS));
      }
    } finally {
      executor.shutdown();
    }
  }
}