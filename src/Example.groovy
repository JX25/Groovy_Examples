class Example {

    static void main(String [] args){

        // creating a pattern
        def obj = ~"hello"
        println(obj.getClass().name) // java.util.regex.Pattern

        def pattern = ~"(G|g)roovy"
        def text = 'Groovy is Hip'
        if (text =~ pattern) // partial match dopasowanie czesciowe
            println "match"
        else
            println "no match"
        if (text ==~ pattern) // exact match dopasowanie calkowite
            println "match"
        else
            println "no match"

        def matcher = 'Groovy is groovy' =~ /(G|g)roovy/
        print "Size of matcher is ${matcher.size()} "
        println "with elements ${matcher[0]} and ${matcher[1]}."
        //Size of matcher is 2 with elements [Groovy, G] and [groovy, g].

        def str = 'Groovy is groovy, really groovy'
        println str
        def result = (str =~ /groovy/).replaceAll('hip')
        println result

        'Obiekt String apostrofy'

        "Obiekt String cudzyslow"

        ''' Obiekt String
            z potrojnymi apostrofami
            w wielu linijkach  '''

        """ Obiekt String
            z potrojnym cudzyslowiem
            w wielu linijkach  """

        / Obiekt String z uzyciem ukosnikow /


        /\d\w*/
        "\\d*\\w*"

        println sum(3,4)

        def name = "Jan"
        showName(name)
        println("in main "+ name)

        def list = [1,3,6,11,51]
        //[1,3,6,11,51]
        list = doubleList(list)
        println(list)
        //[2, 6, 12, 22, 102]

        def sum = sumAll(5,35,12,51,62,4,11)
        println("Sum: " + sum)
        //Sum: 180

        def element = 31
        element = factorial(element)
        println(element)
        //738197504


        example(name: 'Jan', age: 30)

    }



    def static example(Map args) { "${args.name}: ${args.age}" }

    def firstMethod() { 'method called' }
    String secondMethod() { 'another method called' }
    def thirdMethod(param1) { "$param1 passed" }
    static String fourthMethod(String param1) { "$param1 passed" }

    def static factorial(element)
    {
        if(element <= 1) return 1
        else{
            return element*factorial(element-1)
        }
    }

    def static sumAll(int...elements)
    {
        def sum = 0
        elements.each {sum+=it}
        return sum
    }

    def static showName(name)
    {
        name ="Tomasz"
        println("in function showName "+ name)
    }

    def static sum(firstArgument,secondArgument)
    {
        return firstArgument+secondArgument
    }

    def static doubleList(list)
    {
        def newList = list.collect { it * 2}
        return newList
    }

}