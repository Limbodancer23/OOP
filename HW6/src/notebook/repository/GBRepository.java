package notebook.repository;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий, для выполнения CreateReadUpdateDelete (CRUD) операций
 * @param <E> тип модели данных
 * @param <I> тип ID модели данных E
 * @param <T> тип объекта для чтения/записи.
 */
public interface GBRepository<E, I, T> {
    List<E> findAll();
    E create(E e);
    Optional<E> findById(I id);
    Optional<E> update(I id, E e);
    void delete(List<E> data);

    List<T> readAll();

    void saveAll(List<T> data);
}
