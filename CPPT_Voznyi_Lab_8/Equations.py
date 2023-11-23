import math
import pickle

class Equations:
    def __init__(self, x):
        self.x = x
        self.result = None

    def calculate_expression(self):
        """
        Обчислює вираз y = cos(x) / sin(x)

        :return: Результат виразу
        """
        try:
            self.result = math.cos(self.x) / math.sin(self.x)
        except ZeroDivisionError:
            print("Помилка: sin(x) не може бути рівним нулю.")
        except Exception as e:
            print(f"Помилка: {e}")

    def read_text_file(self, filename):
        """
         Зчитування даних з текстового файлу.
        """
        try:
            with open(filename, 'r') as file:
                data = file.read()
                return data
        except Exception as e:
            print(f"Помилка при зчитуванні з файлу {filename}: {e}")
            return None

    def write_text_file(self, filename, data):
        """
         Запис даних у текстовий файл.
        """
        try:
            with open(filename, 'w') as file:
                file.write(data)
            print("Дані у текстовий файл успішно записані!")
            return True
        except Exception as e:
            print(f"Помилка при записі у файл {filename}: {e}")
            return False

    def read_binary_file(self, filename):
        """
        Зчитування даних з двійкового файлу.
        """
        try:
            with open(filename, 'rb') as file:
                data = pickle.load(file)
                return data
        except Exception as e:
            print(f"Помилка при зчитуванні з файлу {filename}: {e}")
            return None

    def write_binary_file(self, filename, data):
        """
        Запис даних у двійковий файл.
        """
        try:
            with open(filename, 'wb') as file:
                pickle.dump(data, file)
            print("Дані у двійковий файл успішно записані!")
            return True
        except Exception as e:
            print(f"Помилка при записі у файл {filename}: {e}")
            return False