class PersonWOConstructor {
    String name
    Integer age

    def person4 = new PersonWOConstructor()
    def person5 = new PersonWOConstructor(name: 'Marie')
    def person6 = new PersonWOConstructor(age: 1)
    def person7 = new PersonWOConstructor(name: 'Marie', age: 2)
}