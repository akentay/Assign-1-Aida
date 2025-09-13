class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        print(f"HELLO {self.name}, YOU ARE {self.age} YEARS OLD!")


if __name__ == "__main__":
    name = input("Enter your name: ")
    age = int(input("Enter your age: "))

    person = Person(name, age)
    person.introduce()
