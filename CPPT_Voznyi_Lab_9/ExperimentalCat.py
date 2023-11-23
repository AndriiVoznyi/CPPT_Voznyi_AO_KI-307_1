from Cat import Cat
class ExperimentalCat(Cat):
    def __init__(self, name, age, experiment):
        """
        Конструктор класу ExperimentalCat.
        """
        super().__init__(name, age)
        self.experiment = experiment

    def conduct_experiment(self):
        """
        Метод, який виводить результати експерименту.
        """
        print(f"Experiment: {self.experiment} - Successful!")

    def info(self):
        """
        Перевизначений метод, який виводить інформацію про експериментального кота.
        """
        print(f"Name: {self.name}, Age: {self.age}, Experiment: {self.experiment}")