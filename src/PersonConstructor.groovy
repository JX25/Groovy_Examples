class PersonConstructor {
    String name
    Integer age

    PersonConstructor(name, age) {
        this.name = name
        this.age = age
    }
    def person1 = new PersonConstructor('Marie', 1)
    def person2 = ['Marie', 2] as PersonConstructor
    PersonConstructor person3 = ['Marie', 3]
}





