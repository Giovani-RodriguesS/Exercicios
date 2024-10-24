using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;

public class Program
{
    public static void Main()
    {
        const int NUM_ELEMENTS = 100000; // Número de elementos para testar
        Random random = new Random();
        
        // Hashtable
        Hashtable hashtable = new Hashtable();
        Stopwatch stopwatch = new Stopwatch();

        // Inserção no Hashtable
        stopwatch.Start();
        for (int i = 0; i < NUM_ELEMENTS; i++)
        {
            hashtable.Add(i, random.Next(1, 100000));
        }
        stopwatch.Stop();
        Console.WriteLine($"Hashtable - Tempo de Inserção: {stopwatch.ElapsedMilliseconds} ms");

        // Busca no Hashtable
        stopwatch.Restart();
        hashtable.ContainsKey(NUM_ELEMENTS / 2);
        stopwatch.Stop();
        Console.WriteLine($"Hashtable - Tempo de Busca: {stopwatch.ElapsedTicks} ticks");

        // Remoção no Hashtable
        stopwatch.Restart();
        hashtable.Remove(NUM_ELEMENTS / 2);
        stopwatch.Stop();
        Console.WriteLine($"Hashtable - Tempo de Remoção: {stopwatch.ElapsedTicks} ticks");

        Console.WriteLine();

        // SortedList
        SortedList sortedList = new SortedList();

        // Inserção no SortedList
        stopwatch.Restart();
        for (int i = 0; i < NUM_ELEMENTS; i++)
        {
            sortedList.Add(i, random.Next(1, 100000));
        }
        stopwatch.Stop();
        Console.WriteLine($"SortedList - Tempo de Inserção: {stopwatch.ElapsedMilliseconds} ms");

        // Busca no SortedList
        stopwatch.Restart();
        sortedList.ContainsKey(NUM_ELEMENTS / 2);
        stopwatch.Stop();
        Console.WriteLine($"SortedList - Tempo de Busca: {stopwatch.ElapsedTicks} ticks");

        // Remoção no SortedList
        stopwatch.Restart();
        sortedList.Remove(NUM_ELEMENTS / 2);
        stopwatch.Stop();
        Console.WriteLine($"SortedList - Tempo de Remoção: {stopwatch.ElapsedTicks} ticks");

        Console.WriteLine();

        // Dictionary
        Dictionary<int, int> dictionary = new Dictionary<int, int>();

        // Inserção no Dictionary
        stopwatch.Restart();
        for (int i = 0; i < NUM_ELEMENTS; i++)
        {
            dictionary.Add(i, random.Next(1, 100000));
        }
        stopwatch.Stop();
        Console.WriteLine($"Dictionary - Tempo de Inserção: {stopwatch.ElapsedMilliseconds} ms");

        // Busca no Dictionary
        stopwatch.Restart();
        dictionary.ContainsKey(NUM_ELEMENTS / 2);
        stopwatch.Stop();
        Console.WriteLine($"Dictionary - Tempo de Busca: {stopwatch.ElapsedTicks} ticks");

        // Remoção no Dictionary
        stopwatch.Restart();
        dictionary.Remove(NUM_ELEMENTS / 2);
        stopwatch.Stop();
        Console.WriteLine($"Dictionary - Tempo de Remoção: {stopwatch.ElapsedTicks} ticks");
    }
}
