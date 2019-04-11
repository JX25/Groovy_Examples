class Person {

    String name
    Integer age

    def increaseAge(Integer years) {
        this.age += years
    }
}

def osoba = new Person()
osoba.setName("Jan")
osoba.setAge(30)