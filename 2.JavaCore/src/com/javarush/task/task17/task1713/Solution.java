package com.javarush.task.task17.task1713;

/* 
Общий список
*/

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.*;

public class Solution implements List<Long>
{
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args)
    {

    }


    @Override
    public synchronized int size()
    {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty()
    {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o)
    {
        Object o1 = new Object();
        return original.contains(o1);
    }

    @Override
    public synchronized Iterator<Long> iterator()
    {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray()
    {
        return original.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a)
    {
        return original.toArray(a);
    }

    @Override
    public synchronized boolean add(Long aLong)
    {
        return original.add((long) 0);
    }

    @Override
    public synchronized boolean remove(Object o)
    {
        Object t = new Object();
        return original.remove(t);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c)
    {
        List<String> list = new ArrayList<>();
        return original.containsAll(list);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c)
    {
        List<Long> list = new ArrayList<>();
        return original.addAll(list);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c)
    {
        List<Long> list = new ArrayList<>();
        return original.addAll(0, list);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c)
    {
        List<String> list = new ArrayList<>();
        return original.removeAll(list);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c)
    {
        List<String> list = new ArrayList<>();
        return original.retainAll(list);
    }

    @Override
    public synchronized void clear()
    {
        original.clear();
    }

    @Override
    public synchronized Long get(int index)
    {
        return original.get(0);
    }

    @Override
    public synchronized Long set(int index, Long element)
    {
        return original.set(0, element);
    }

    @Override
    public synchronized void add(int index, Long element)
    {
        original.add(1,element);
    }

    @Override
    public synchronized Long remove(int index)
    {
        return original.remove(1);
    }

    @Override
    public synchronized int indexOf(Object o)
    {
        Object o1 = new Object();
        return original.indexOf(o1);
    }

    @Override
    public synchronized int lastIndexOf(Object o)
    {
        Object o1 = new Object();
        return original.lastIndexOf(o1);
    }

    @Override
    public synchronized ListIterator<Long> listIterator()
    {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index)
    {
        return original.listIterator(5);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex)
    {
        return original.subList(1,5);
    }
}
