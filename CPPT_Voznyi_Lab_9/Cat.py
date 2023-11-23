class Cat:
    def __init__(self, name, age):
        """
        Конструктор класу Cat.
        """
        self.name = name
        self.age = age

    def make_sound(self):
        """
        Метод, який виводить звук, що видає кіт.
        """
        print("Meow!")

    def info(self):
        """
        Метод, який виводить інформацію про кота.
        """
        print(f"Name: {self.name}, Age: {self.age}")