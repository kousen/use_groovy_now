package nfjs.sorting

String s = 'this is a list of strings'
List strings = s.split()
assert strings == ['this', 'is', 'a', 'list', 'of', 'strings']

// Java 7 natural sort
List stringsCopy = new String(s).split()
Collections.sort(stringsCopy)
println stringsCopy
stringsCopy.inject { prev, curr ->
    assert curr >= prev
    curr
}

// Java 7 length sort
stringsCopy = new String(s).split()
Collections.sort(stringsCopy, new Comparator<String>() {
    @Override
    int compare(String s1, String s2) {
        return s1.size() <=> s2.size()
    }
})
println stringsCopy
assert stringsCopy*.size() == [1, 2, 2, 4, 4, 7]

// Groovy closure coercion reverse length sort
stringsCopy = new String(s).split()
Collections.sort(stringsCopy, { s1, s2 ->
    s2.size() <=> s1.size()
} as Comparator<String>)  // Note: 'as' only to make IDE happy
println stringsCopy
assert stringsCopy*.size() == [7, 4, 4, 2, 2, 1]

// Groovy natural sort (non-destructive)
def sorted = strings.sort(false)
println sorted
sorted.inject { prev, curr ->
    assert curr >= prev
    prev
}

// Groovy length sort (2-arg closure)
sorted = strings.sort(false) { s1, s2 -> s1.size() <=> s2.size() }
println sorted
assert sorted*.size() == [1, 2, 2, 4, 4, 7]

// Groovy reverse length sort (1-arg closure)
sorted = strings.sort(false) { -it.size() }
println sorted
assert sorted*.size() == [7, 4, 4, 2, 2, 1]

// Groovy sort by length, then equal lengths alphabetically
sorted = strings.sort(false) { String s1, String s2 ->
    s1.size() <=> s2.size() ?: s1 <=> s2
}
println sorted
sorted.inject { prev, curr ->
    assert curr.size() >= prev.size()
    if (curr.size() == prev.size()) {
        assert curr >= prev
    }
    curr
}