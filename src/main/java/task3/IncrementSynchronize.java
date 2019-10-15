package task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@AllArgsConstructor
@Getter
public class IncrementSynchronize {
    private volatile int numberForAtomic;
    private volatile int numberForSynchronizedMethod;
    private volatile int numberForLocks;


    public int getNextNumberWithAtomic() {
        AtomicInteger atomicInteger = new AtomicInteger(numberForAtomic);
        return atomicInteger.incrementAndGet();
    }

    public synchronized int getNextNumberWithSynchronizedMethod() {
        return ++numberForSynchronizedMethod;
    }

    public int getNextNumberWithLocks() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try {
            return ++numberForLocks;
        } finally {
            lock.unlock();
        }
    }

}
