package Models;

// Интерфейс для отображения пользователей
// Cоответствует принципу разделения интерфейса, служит конкретной цели.

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}