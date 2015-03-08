package nfjs.io

println 'Please enter some numbers to sum'
int total = 0
System.in.withReader { br ->
    total = br.readLine().tokenize()*.toInteger().sum()
}
println "The total is $total"