package ki307.voznyi.lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований клас "Конвеєр".
 *
 * @param <T> Тип елементів конвеєра, які реалізують інтерфейс Comparable.
 */
public class Conveyor<T extends Comparable<T>> {
    private List<T> elements = new ArrayList<>();

    /**
     * Додати елемент до конвеєра.
     *
     * @param item Елемент, який додається до конвеєра.
     */
    public void addItem(T item) {
        elements.add(item);
    }

    /**
     * Вийняти елемент з конвеєра.
     *
     * @return Перший елемент конвеєра, або null, якщо конвеєр порожній.
     */
    public T removeItem() {
        if (!elements.isEmpty()) {
            return elements.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Пошук мінімального елементу у конвеєрі.
     *
     * @return Мінімальний елемент у конвеєрі, або null, якщо конвеєр порожній.
     */
    public T processEven() {
        if (!elements.isEmpty()) {
            T minElement = elements.get(0);
            for (T element : elements) {
                if (element.compareTo(minElement) < 0) {
                    minElement = element;
                }
            }
            return minElement;
        } else {
            return null;
        }
    }

    /**
     * Отримати розмір конвеєра.
     *
     * @return Кількість елементів у конвеєрі.
     */
    public int getSize() {
        return elements.size();
    }

    /**
     * Отримати всі елементи конвеєра.
     *
     * @return Список усіх елементів конвеєра.
     */
    public List<T> getAllElements() {
        return elements;
    }
}
