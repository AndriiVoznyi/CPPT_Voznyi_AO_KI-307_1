from ExperimentalCat import *

def main():
    # Створення базового кота
    basic_cat = Cat(name="Whiskers", age=3)
    print("Basic Cat:")
    basic_cat.info()
    basic_cat.make_sound()

    print("\n-------------------------\n")

    # Створення експериментального кота
    experimental_cat = ExperimentalCat(name="Fluffy", age=2, experiment="Teleportation")
    print("Experimental Cat:")
    experimental_cat.info()
    experimental_cat.make_sound()
    experimental_cat.conduct_experiment()

if __name__ == "__main__":
    main()