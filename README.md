# Collection_and_Map_in_Java
Collection + Map + Implementattion + Java + Example

* Reference: https://www.geeksforgeeks.org/collections-in-java-2/, https://www.youtube.com/watch?v=rI3VkItC0eA&list=PLd3UqWTnYXOkVR3OR9UZGyEt9RFUbaTMZ

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
  - So array comes into the picture {Array can represent many value using a single variable}

* When using Array {Problems}
  1. Fix in Size		: it is compulsory to know the size in advance, before using it.
  2. Only Homogeneous	: Holds only homogenious data type elements {but Can we resolved by using object array}
  3. No Under lying DS	: We are always responsible to make our own methods {Array is not based on some standard data structure, so readymade mathods support is not there}

* When using Collection {Benefits, to overcome above probles}
  - Growable in nature	: Not bound to fix the size at starting
  - Homogeneous + Hetrogeneoud {$HetrogeneousObjectsCollection}
  - Under lying DS		: can use Readymade methods from standard DS
```

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
- ArrayList<E>		: Resizable-array, capacity grows automatically[*2,*1.5-Java8], not synchronized, good for single thread App
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
				: Sorted according to key value(****), Thus must store valuse as keys in the map 
				: O(log N) lookup and insertion
* The "==" operator checks to see if the two strings are exactly the same object and the .equals() method will check if the two strings have the same value.
* if object is specified as key doesn’t contain any references- it is eligible for garbage collection even though it is associated with WeakHashMap.


# How to maintain Thread Safety
1. By using predefined thread safe classes
```java
	Hashtable, Vector
```
2. Using Collections.synchronizedSorted... methods
```java
	SortedSet<Integer> set = Collections.synchronizedSortedSet(new TreeSet<Integer>());
	SortedMap<Integer,String> map = Collections.synchronizedSortedMap(new TreeMap<Integer,String>());
```
3. Using java.util.concurrent... Interfaces, classes
```
	//Thread safe
	ConcurrentHashMap m = new ConcurrentHashMap();	
```

### Example {1 & 2}
* Thread safe for map classes
  - {1} Hashtable
  - {2} Inside java.util.Collections class; {SynchronizedMap<K,V>, SynchronizedSortedMap<K,V>, SynchronizedNavigableMap<K,V>}
  - {2} Inside java.util.concurrent package; {ConcurrentMap.class{I}, ConcurrentHashMap.class, ConcurrentNavigableMap.class}
    - All the classes inside java.util.concurrent package are thread safe

## ConcurrentHashMap
 * Implementation of ConcurrentMap interface (underlying DS is Hash table)
 * Provides Thread safety without locking or blocking resources [but segment locking]
 * Uses Final and Volatile variables
 * Faster than hash table, good for Multi Thread application
 * Read Operations: No locking mechanism, multiple threads are allowed
 * Write/Update Operations: Bucket/segment level locking instead of total map locking 
   - 16 threads in parallel can write/update by default
 * Default size: 16 buckets 
 * Default concurrency level: 16
 * Uses hash buckets {List of HashEntry elements}
 * 2 threads can update the ConcurrentHashMap unless they are not in the same segment
 * Segment size: no of buckets {depends on concurrency level, it may vary}
 * Segment is like a mini specialized version of hashtable that contains many buckets
 * Each segment holds a single lock, thus no two entries in the segment can be updated by more than one thread at a time.
 * No null value for key and value
 * Any map can be transfered as parameter and gets converted into CHM, by using new CHM(M)
 * Reference: https://www.youtube.com/watch?v=IUo1Ym-Uj_I
 
