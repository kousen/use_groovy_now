package nfjs.trivial

// Spaceship!
int x = 2
int y = 5
int z = 7

assert x <=> y == -1
assert y <=> y == 0
assert z <=> y == 1

// Safe navigation
class Department {
    Manager boss
}
class Manager {
    String name
}
Department d = new Department(boss: new Manager(name: 'Mr Burns'))
assert d.boss.name == 'Mr Burns'

d = new Department()  // NPE coming?
assert d?.boss?.name == null  // nope

// Elvis
String name
String n = (name != null && name.size() > 0) ? name : 'World'
assert "Hello, $n!" == 'Hello, World!'

n = name ? name : 'World'  // Groovy Truth
assert "Hello, $n!" == 'Hello, World!'

n = name ?: 'World'  // Elvis
assert "Hello, $n!" == 'Hello, World!'
