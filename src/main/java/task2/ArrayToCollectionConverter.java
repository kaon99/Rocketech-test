package task2;

import java.util.Collection;

public interface ArrayToCollectionConverter {
    <T> Collection<T> fromArrayToCollection(final T[] a, final Collection<T> c);

    <T> Collection<T> fromArrayToCollectionWithStreamApi(T[] a, Collection<T> c);
}
