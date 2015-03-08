package nfjs.trivial

// Default list is an ArrayList
def nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]
assert nums instanceof ArrayList

// Overloaded 'plus' method
println nums + [3, 5]
assert nums + [3, 5] == [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]

// Overloaded 'minus' method
println nums - 1
assert nums - 1 == [3, 4, 5, 9, 2, 6, 5]

// Can chain minus
println nums - 1 - 5
assert nums - 1 - 5 == [3, 4, 9, 2, 6]

// Can flatten nested structure
def numsNested = [3, [1, [4, [1, [5, 9]]]]]
println numsNested
println numsNested.flatten()
assert numsNested.flatten() == [3, 1, 4, 1, 5, 9]

// Can use LinkedList instead
def numsList = nums as LinkedList
println numsList
assert numsList instanceof LinkedList

// Set removed duplicates
def numsSet = nums as Set
println numsSet
assert numsSet instanceof Set

// Set in numerical order
def numsSorted = nums as SortedSet
println numsSorted
assert numsSorted instanceof TreeSet

// Map syntax
def map = [a:1, b:2, c:2]

// Overloaded dot operator is 'put'
map.d = 1

// Overloaded 'putAt' method
map['e'] = 3

// Java still works
map.put('f', 2)
println map
assert map instanceof LinkedHashMap

