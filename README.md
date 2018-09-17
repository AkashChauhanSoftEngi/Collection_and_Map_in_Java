# Collection_and_Map_in_Java
Collection + Map + Implementattion + Java + Example

## Questions: 
* Why we need, collection or the purpose of using collection interfaces?
* why this order, Indiviual{1st level}->Arrays{2nd level}->Collection{3rd level}, is important?
* What are the disadvantages of creating Individual Elements?
* What are the advantages of Array?
* What are the disadvantages of Array?
* What are the advantages of using collection interfaces?

## Answers:

```text
* When using Individual Element {Problems}
  - When creating 10000 variables, it is not good practice to creating 1000 different individual variables
  - So array comes into the picture {Array can represent many value using a sinle variable}

* When using Array {Problems}
  1. Fix in Size		: it is compulsory to know the size in advance, before using it.
  2. Only Homogeneous	: Holds only homogenious data type elements {but Can we resolved by using object array}
  3. No Under lying DS	: We are always responsible to make our own methods {Array is not based on some standard data structure, so readymade mathods support is not there}

* When using Collection {Benefits, to overcome above probles}
  - Growable in nature	: Not bound to fix the size at starting
  - Homogeneous + Hetrogeneoud, how?
  - Under lying DS		: can use Readymade methods from standard DS
```

* Reference	: https://www.geeksforgeeks.org/collections-in-java-2/, https://www.youtube.com/watch?v=rI3VkItC0eA&list=PLd3UqWTnYXOkVR3OR9UZGyEt9RFUbaTMZ
								 
## Important things to keep in mind
* Inside package java.util.*;
* Collection<E> : root and Generic Interface {sort, add, isEmpty, toArray method}
                : On objects not on primitive types
                : Some collections(Implementations) provide duplicates, no duplicates, ordered, unordered   
* Collections   : Static methods
                : implementation of "Collection" and "Map" interface,many more
			          : represent collection [group of individual objects]
* Those in the java.util.concurrent packages are thread-safe
* Java Concurrency: Blocking Queues. 
  - A blocking queue is a queue that blocks when you try to dequeue from it and the queue is empty, or if you try to enqueue items to it and the queue is already full.
  - A thread trying to dequeue from an empty queue is blocked until some other thread inserts an item into the queue.
* Where ever there is sorting, null values would not be allowed

## Main Interfaces that extend Collection<E> Interface.
- 1.) List<E>, 2.) Set<E>, 3.) Queue<E>
- List<E>	  	: Allows Dublicates, allows multiple null elements
- Set<E>		: Do not allow Dublicates, at most one null element
- Queue<E>		: FIFO, allow dublicates, allows multiple null elements

## Classes implement List<E> {Allows duplicates, Many null values, order preserved}
- ArrayList<E>		: Resizable-array, capacity grows automatically, not synchronized, good for single thread App
- LisnkedList<E>	: not synchronized, insertion/deletion is faster than ArrayList<E>
- Vector<E>		: growable array, Vector methods are all synchronized
- Stack<E>		: Lifo, implements Vectors<E>, methods are all synchronized

## Classes implement Set<E> {No duplicates, Max one null value}
- Hashset<E>			: No duplicates, Max one null value, no gaurantee of same insertion order
- LinkedHashSet<E>		: Hashset<E> + insertion order preserved
- TreeSet<E>			: No null value, ordered, order unpreserved

## Classes implement Queue<E> {FIFO, Allows duplicates, Allows multiple null values}
- LinkedList<E>	  		: Not thread safe, Allows duplicates, Allows multiple null values
- PriorityQueue<E>	      	: Soreted Ordered, allows dublicates, no null values
- PriorityBlockingQueue<E> 	: Thread Safety + PriorityQueue<E>
- LinkedBlockingQueue<E>	: Thread safe + allows dublicates, no null values, preserved order

## Classes implement Map<E> {Unique elements, default: order unpreserved}
- HashMap<K,V>			: Unique Elements + Insertion order unpreserved
        			: allows one null key[latest value] and multiple null values
				: Uses equals, Garbage Collection[No]
				: Not synchronized, O(1) lookup and insertion
- Hashtable<K,V>		: HashMap + Synchronized + no null value or key
- LinkedHashMap<K,V>		: HashMap<E> + Insertion order preserved, O(1) lookup and insertion
- IdentityHashMap<K,V>		: Uses "==", not equals(), faster than HashMap 
- Weaked HashMap<K,V>		: HashMap + GC[Yes]
- TreeMap<K,V>			: Ordered + Unique elements
				: O(log N) lookup and insertion
* The "==" operator checks to see if the two strings are exactly the same object and the .equals() method will check if the two strings have the same value.
* if object is specified as key doesn’t contain any references- it is eligible for garbage collection even though it is associated with WeakHashMap.
