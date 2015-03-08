package nfjs.ast.delegate

class Phone {
    String dial(String num) {
        "Dialing $num..."
    }
}

class Camera {
    String takePicture() {
        'Taking picture...'
    }
}

class SmartPhone {
    @Delegate Phone phone = new Phone()
    @Delegate Camera camera = new Camera()
}

SmartPhone sp = new SmartPhone()
assert sp.dial('555-1234') == 'Dialing 555-1234...'
assert sp.takePicture() == 'Taking picture...'