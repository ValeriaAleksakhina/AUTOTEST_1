package org.max.Composite;

import java.util.ArrayList;
import java.util.List;

// Базовый интерфейс для компонента
interface Component {
    void operation();
}

// Листовой узел (лист дерева)
class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}

// Композит, который содержит другие компоненты
class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite operation");
        for (Component component : children) {
            component.operation();
        }
    }
}

// Пример использования
public class CompositePatternExample {
    public static void main(String[] args) {
        // Создание компонентов
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();

        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        Composite composite2 = new Composite();
        composite2.add(composite);

        // Вызов операции для компонента
        composite2.operation();
    }
}
