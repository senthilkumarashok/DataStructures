# DataStructures
	
	a brief introduction and explanation on interior architecture

# DataStructures and its interesting facts

	1. TreeMap is created using RedBlack Tree
	2. Autocomplete feature can be done through Trie
	3. Quick Select sort helps to find Kth smallest or largest element in array
	4. Improvements in Java 8 - For HashMap if hashcode collision count is more than 8 in a row , then its internal structure is  changed from linked list to tree

# Asymptotic analysis
  	
	big- \Theta Θ notation, big-O notation, and big- \Omega Ω notation.

# Functions 

  	Constant functions -  1
	Logarithmic functions - log n
	Linear functions  - n
	Linearithmic functions
	Polynomial functions - n~2, n~3
	Exponential functions 2~n

# BitWise Operators

	&	AND	Sets each bit to 1 if both bits are 1 (find number is odd or even
	|	OR	Sets each bit to 1 if one of two bits is 1
	^	XOR	Sets each bit to 1 if only one of two bits is 1
	~	NOT	Inverts all the bits
	<<	Zero fill left shift	(Multiply to the 2 power of n)
	>>	Signed right shift	(Divide to the 2 power of n)
	>>>	Zero fill right shift	Shifts right by pushing zeros in from the left, and let the rightmost bits fall off
	
Reference :
	https://code.tutsplus.com/articles/understanding-bitwise-operators--active-11301
  
# Heap

# Graph

	Lets say if app needs libraries to install and these libraries have dependency between each other . 
	How do you build the dependencies using specific data structure ? DAG (Directed Acyclic Graph) ???
	
# Map

	How is map internally stored in C++ and TreeMap in Java ( Red Black Tree which uses O(log n) for searching, inserting, deleting operations )

# MultiDimensional Arrays

	2D dimensional Arrays - Chess
	3D dimensional Arrays - Car Parking with levels
	Multi Dimensional Arrays - for Matrices

Reference :
	https://introcs.cs.princeton.edu/java/14array/"
  
# Lambda Expressions

	Functional Programming
	Pass behavior to OOP
	Functions as values
	Lambda as interface type
	Functional Interface - should have only one abstract method
		list of functional interfaces - Consumer, Supplier, Predicate

# OS related questions

	* Thread Vs Process
	* Programs stored in Memory
		Multiple frames ( Stack, Heap, Texted Segment, Initialized data, Uninitialized Data, Command & Env Variables )
	* Stack Frame in a memory
	* when two threads access the program segment at same time ? what happens ? How it is prevented ?
	* Mutex
	* Semaphore
	* Priority Inversion Vs Priority Inheritance

# Tree

	* Tree Definition
	* Tree traversals
	* Tree Operations
	* Tree Applications
	* Tree Approaches
	* Tricky problems
	* Complexity & Analysis
	
# Tree Classifications

	* Binary Tree
	* Threaded Tree
	* Binary Search Tree
	* AVL, RedBlack, Splay, B-Tree
	* XOR, Tournament Tree
	* Heap
	* Trie
	
# Binary Tree

	Tree with min = 0 or max = 2 children
	
	Binary Tree can be created using two ways
		* Arrays - Practice Needed
		* Node (LinkedList) - Practice Needed
		
	Traversals
		* DFS
			inorder, preorder, postorder - which order is preferred in which use cases ??
		* BFS
			levelorder
			
	Applications & Real usecase - Need to find ??
	Problems
	        * vertical sum of the tree
		* maximum width
		* maximum depth
		* create binary tree from array
		* create binary tree from linked list
		* 
		
		
Reference :
	https://www.youtube.com/watch?v=il_t1WVLNxk

# Lessons Learned

	*  use numbers instead of string conversion ? reverse a number or rotate a digit
	

 # Problems
 
 1. verify whether two strings are anagram to each other ?
 2. find the common elements in two sorted list ( can be both ascending , descending, or both can be different) ?
 3. In Big O Notation is logN base to 2 or 10 ?
 4. reverse a string
 5. product except self (leetcode)
 
 
# Design Problems

 1. Design Max Stack (leetcode) peek, peekMax, pop, popMax
 2. Design InMemory file system <b>Hint : using two hashMaps</b>
 3. Design an string iterator for compressed string .
 
 
 
 
 
