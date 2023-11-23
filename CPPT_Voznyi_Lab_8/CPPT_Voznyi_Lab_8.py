from Equations import Equations

x = float(input("Enter x: "))

# Створюємо об'єкт класу Equations
equation_solver = Equations(x)

# Обчислюємо вираз
equation_solver.calculate_expression()

if equation_solver.result is not None:
    # Записуємо результат у текстовий файл
    equation_solver.write_text_file('result.txt', str(equation_solver.result))

    # Записуємо результат у двійковий файл
    equation_solver.write_binary_file('result.bin', equation_solver.result)

    # Зчитуємо дані з текстового файлу
    text_data = equation_solver.read_text_file('result.txt')
    print(f"Зчитані дані з текстового файлу: {text_data}")

    # Зчитуємо дані з двійкового файлу
    binary_data = equation_solver.read_binary_file('result.bin')
    print(f"Зчитані дані з двійкового файлу: {binary_data}")