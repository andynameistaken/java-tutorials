package com.journaldev.string_memory_pool;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringPool {

    private static Set<String> pool = null;
    public static synchronized void store(String string)
    {
        try
        {
            if (pool == null)
            {
                pool = new LinkedHashSet<String>();
            }
            pool.add(string);
        }
        catch (Exception e)
        {
            // Ignore
        }
    }

    public static synchronized Set<String> getPool()
    {
        return new LinkedHashSet<String>(pool);
    }

}