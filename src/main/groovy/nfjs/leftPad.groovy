package nfjs

String leftPad(s, len, ch=' ') {
    s.toString().padLeft(len, ch.toString())
}

assert '  foo'  == leftPad('foo', 5)
assert 'foobar' == leftPad('foobar', 6)
assert '01'     == leftPad(1, 2, 0)