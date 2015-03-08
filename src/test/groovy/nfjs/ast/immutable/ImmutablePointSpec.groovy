package nfjs.ast.immutable

import spock.lang.Specification

class ImmutablePointSpec extends Specification {
    ImmutablePoint p

    def 'can use map-based constructor'() {
        when:
        p = new ImmutablePoint(x:3, y:4)

        then:
        p.x == 3
        p.y == 4
    }

    def 'can use tuple constructor'() {
        when:
        p = new ImmutablePoint(3, 4)

        then:
        p.x == 3
        p.y == 4
    }

    def 'equals method works'() {
        when:
        p = new ImmutablePoint(3, 4)
        ImmutablePoint p1 = new ImmutablePoint(3, 4)
        ImmutablePoint p2 = new ImmutablePoint(x:3, y:5)

        then:
        p == p1
        p1 != p2
    }

    def 'equals and hashcode work in a set'() {
        when:
        p = new ImmutablePoint(3, 4)
        ImmutablePoint p1 = new ImmutablePoint(3, 4)
        ImmutablePoint p2 = new ImmutablePoint(x:3, y:4)
        Set points = [p, p1, p2]

        then:
        points.size() == 1
    }

    def "can't change x"() {
        given:
        p = new ImmutablePoint(x:3, y:4)

        when:
        p.x = 5

        then:
        ReadOnlyPropertyException e = thrown()
    }

    def "can't change y"() {
        given:
        p = new ImmutablePoint(x:3, y:4)

        when:
        p.y = 5

        then:
        ReadOnlyPropertyException e = thrown()
    }

    def 'can you change x using direct ref?'() {
        given:
        p = new ImmutablePoint(x:3, y:4)

        when:
        p.@y = 5

        then:
        GroovyRuntimeException e = thrown()
        e.message == 'Cannot set the property \'y\' because the backing field is final.'
    }
}
