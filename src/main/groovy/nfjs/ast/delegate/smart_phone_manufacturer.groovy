package nfjs.ast.delegate

class PhoneWithManufacturer {
    String from

    String dial(String num) {
        "Dialing $num..."
    }
}

class CameraWithManufacturer {
    String from

    String takePicture() {
        'Taking picture...'
    }
}

class SmartPhoneWithManufacturer {
    @Delegate PhoneWithManufacturer phone =
            new PhoneWithManufacturer(from: 'Samsung')
    @Delegate CameraWithManufacturer camera =
            new CameraWithManufacturer(from: 'Nikon')
}

SmartPhoneWithManufacturer sp = new SmartPhoneWithManufacturer()
assert sp.dial('555-1234') == 'Dialing 555-1234...'
assert sp.takePicture() == 'Taking picture...'

assert sp.from == sp.phone.from
