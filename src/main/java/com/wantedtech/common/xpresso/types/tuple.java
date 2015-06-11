package com.wantedtech.common.xpresso.types;

import com.wantedtech.common.xpresso.Lengthful;

public interface tuple extends Comparable<tuple>, Lengthful{
	
    public int size();
    
    public int len();
    
    public <E> E get(int index, Class<E> elementClass);
    public Object get(int index);
    public Object get(String fieldName);
    public <E> E get(String fieldName, Class<E> elementClass);
    
    public void name(String... fieldNames);
    
    public int compareTo(tuple o);
    boolean in(Iterable<tuple> iterable);
    
    tuple copy();

}
