package com.examclouds;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class GFG1 {
    public static void main(String[] argv) throws Exception
    {

        try {

            // creating object of Hashtable<String, String>
            Hashtable<String, String>
                    table = new Hashtable<String, String>();

            // populate the table
            table.put("key1", "1");
            table.put("key2", "2");
            table.put("key3", "3");

            // getting unmodifiable map
            // using unmodifiableMap() method
            Map<String, String> m = Collections
                    .unmodifiableMap(table);

            // printing the unmodifiableMap
            System.out.println("Initial collection: " + table);
        }

        catch (UnsupportedOperationException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
