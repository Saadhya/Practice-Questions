# diff between arraylist and linkedlist
ArrayList:
// ArrayList is a resizable array implementation of the List interface.
// ArrayLists are implemented as dynamic arrays.
// ArrayLists are best used when you need frequent access to elements.
// ArrayLists are not thread-safe.

// LinkedList:
// LinkedList is a doubly-linked list implementation of the List and Deque interfaces.
// LinkedLists are implemented as doubly-linked lists.
// LinkedLists are best used when you need frequent insertion and deletion of elements.
// LinkedLists are thread-safe.

# Diff between list and set
// List	Set
// 2. List allows duplicate elements	2. Set doesn't allow duplicate elements.
// 3. Elements by their position can be accessed.	3. Position access to elements is not allowed.
// 4. Multiple null elements can be stored.	4. Null element can store only once.

# ArrayList and array
In Java, an ArrayList is used to represent a dynamic list. While Java arrays are fixed in size (the size cannot be modified), an ArrayList allows flexibility by being able to both add and remove elements.

# thread safe
A piece of code or data structure is thread safe when the outcome of the code and underlying resources do not create undesirable results. 
For example, the factorial() method is a stateless deterministic function. Given a specific input, it always produces the same output. The method neither relies on external state nor maintains state at all. So, it's considered to be thread-safe and can be safely called by multiple threads at the same time