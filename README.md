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
	<<	Zero fill left shift	Shifts left by pushing zeros in from the right and let the leftmost bits fall off
	>>	Signed right shift	Shifts right by pushing copies of the leftmost bit in from the left, and let the rightmost bits fall off
	>>>	Zero fill right shift	Shifts right by pushing zeros in from the left, and let the rightmost bits fall off
	
	Reference : https://code.tutsplus.com/articles/understanding-bitwise-operators--active-11301
  
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

	https://introcs.cs.princeton.edu/java/14array/
  
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
		
		
Ref Links
https://www.youtube.com/watch?v=il_t1WVLNxk
