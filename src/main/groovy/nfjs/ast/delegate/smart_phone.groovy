package nfjs.ast.delegate

class Phone {
    String from

    String dial(String num) {
        "Dialing $num..."
    }
}

class Camera {
    String from

    String takePicture() {
        'Taking picture...'
    }
}

class SmartPhone {
    @Delegate Phone phone = new Phone(from: 'Samsung')
    @Delegate Camera camera = new Camera(from: 'Nikon')

    String getFrom() {
        "Phone: ${phone.from}, Camera: ${camera.from}"
    }
}

SmartPhone sp = new SmartPhone()
assert sp.dial('555-1234') == 'Dialing 555-1234...'
assert sp.takePicture() == 'Taking picture...'

println sp.getFrom()