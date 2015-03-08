package nfjs.geocoder

import spock.lang.Specification

class GeocoderSpec extends Specification {
    Geocoder geocoder = new Geocoder()

    def "check lat,lng of Google"() {
        given:
        def google_lat = 37.42249
        def google_lng = -122.08422
        Stadium s = new Stadium(street: '1600 Ampitheatre Parkway',
            city: 'Mountain View', state: 'CA')

        when:
        geocoder.fillInLatLng(s)

        then:
        (google_lat - s.latitude).abs() < 0.01
        (google_lng - s.longitude).abs() < 0.01
    }
}
