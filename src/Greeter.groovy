class SystemGreeter implements Greeter {
    void greet(String name) {
        println "Hello $name"
    }

    interface Greeter {
        void greet(String name)
    }
}
def greeter = new SystemGreeter()
assert greeter instanceof Greeter