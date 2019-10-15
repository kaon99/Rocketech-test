package task2.impl;


import org.junit.Assert;
import org.junit.Test;
import task2.ArrayToCollectionConverter;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayToCollectionConverterImplTest {
    private final Integer[] arr = {10, 23, 12, 43};
    private final Collection<Integer> integerCollection = new ArrayList<Integer>();
    private final ArrayToCollectionConverter collectionConverter = new ArrayToCollectionConverterImpl();


    @Test
  public   void fromArrayToCollection() {

        final Collection<Integer> result = collectionConverter.fromArrayToCollection(arr, integerCollection);
        Assert.assertEquals(arr.length ,result.size());
    }

    @Test
   public void fromArrayToCollectionWithStreamApi() {
        final Collection<Integer> result = collectionConverter.fromArrayToCollection(arr, integerCollection);
        Assert.assertEquals(arr.length ,result.size());
    }
}