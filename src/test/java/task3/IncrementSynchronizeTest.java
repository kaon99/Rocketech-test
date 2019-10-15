package task3;

import org.junit.Assert;
import org.junit.Test;

public class IncrementSynchronizeTest {
   private final IncrementSynchronize incrementSynchronize = new IncrementSynchronize(0,0,0);
    @Test
   public void getNextNumber() {
        final int nextNumberWithAtomic = incrementSynchronize.getNextNumberWithAtomic();
        final int nextNumberWithSynchronizedMethod = incrementSynchronize.getNextNumberWithSynchronizedMethod();
        final int nextNumberWithLocks = incrementSynchronize.getNextNumberWithLocks();
        Assert.assertEquals(1 , nextNumberWithAtomic);
        Assert.assertEquals(1 , nextNumberWithSynchronizedMethod);
        Assert.assertEquals(1 , nextNumberWithLocks);
    }
}