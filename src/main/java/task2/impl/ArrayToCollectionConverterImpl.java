package task2.impl;

import task2.ArrayToCollectionConverter;

import java.util.Arrays;
import java.util.Collection;

public class ArrayToCollectionConverterImpl implements ArrayToCollectionConverter {

    //It was too easy , because that task from Java Dock, so I do another variable with Stream API.

    public <T> Collection<T> fromArrayToCollection(final T[] a, final Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
        return c;
    }

    public <T> Collection<T>  fromArrayToCollectionWithStreamApi(T[] a, Collection<T> c) {
        c.addAll(Arrays.asList(a));
        return c;
    }
}
