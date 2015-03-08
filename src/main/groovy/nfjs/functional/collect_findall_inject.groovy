package nfjs.functional

List nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]

// double each element
List result = nums.collect { it * 2 }
assert result == [6, 2, 8, 2, 10, 18, 4, 12, 10]

// find all divisible by 3
result = nums.collect { it * 2 }
        .findAll { it % 3 == 0 }
assert result == [6, 18, 12]

// sum using collect
int total = nums.collect { it * 2 }.sum()
assert total == 72

// sum using sum with closure
total = nums.sum { it * 2 }
assert total == 72

// sum using inject
total = nums.inject(0) { acc, val ->
    acc + val * 2
}
assert total == 72