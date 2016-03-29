package nfjs.io

println 'Please enter some numbers to sum'
int total = System.in.withReader { br ->
    br.readLine().tokenize()*.toInteger().sum()
}
println "The total is $total"