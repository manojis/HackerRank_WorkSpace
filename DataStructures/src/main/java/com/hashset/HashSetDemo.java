/*
package com.hashset;

*/
/**
 * Created by Manoj.Mohanan Nair on 11/27/2016.
 */
package com.hashset;

//import com.hashset.HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 This program demonstrates the hash set class.

 somehow is not using the HashSet custom class
 */

public class HashSetDemo
{
    public static void main(String[] args)
    {
        Set names = new HashSet(101); // 101 is a prime

        names.add("Harry");
        names.add("Sue");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        names.remove("Romeo");
        names.remove("George");

        Iterator iter = names.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
