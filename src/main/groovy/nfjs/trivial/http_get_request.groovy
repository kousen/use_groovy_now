package nfjs.trivial

String page = 'http://nofluffjuststuff.com'.toURL().text

// print the whole page
println page

// read page into a list
println page.readLines()*.trim()

// get the lengths of each line
println page.readLines()*.size()
