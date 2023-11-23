N = int(input("Введіть розмір матриці: "))
symbol = input("\nЗадайте символ заповнювач: ")

# Валідація розміру матриці
if N < 0:
    N *= -1
elif N == 0:
    print("Некоректне значення розміру матриці")
    exit()

# Валідація символу заповнювача
if len(symbol) > 1:
    print("Ви ввели забагато символів")
    exit()

matrix = []

# Ініціалізація лічильників для рядків та відступів
arr_cntr = 2 if N % 2 == 0 else 1
tabs_cntr = N // 2

# Запис матриці в файл
with open("Lab8Voznyi.txt", "w") as fout:
    for i in range(N):
        if i >= N // 2:
            # Вивід відступів
            print("\t" * tabs_cntr, end="")
            fout.write("\t" * tabs_cntr)

            # Заповнення матриці та запис у файл
            matrix.append([symbol] * arr_cntr)
            for j in range(arr_cntr):
                print(symbol + "\t", end="")
                fout.write(symbol + "\t")

            # Оновлення лічильників
            arr_cntr += 2
            tabs_cntr -= 1

        print()
        fout.write("\n")
