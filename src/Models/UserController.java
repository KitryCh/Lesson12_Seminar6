package Models;
import java.util.List;
// Интерфейс для создания пользователей
// Cоответствует принципу разделения интерфейса, служит конкретной цели.
public interface UserController<T extends User> {
    void create(String firstName, String lastName, String middleName);
}