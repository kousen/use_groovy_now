package nfjs.geocoder

import groovy.transform.Canonical

@Canonical
class Stadium {
    Integer id
    String name
    String team
    String street
    String city
    String state

    BigDecimal latitude
    BigDecimal longitude
}
