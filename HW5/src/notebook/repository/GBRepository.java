package notebook.repository;

import java.util.List;
import java.util.Optional;

/**
 * �����������, ��� ���������� CreateReadUpdateDelete (CRUD) ��������
 * @param <E> ��� ������ ������
 * @param <I> ��� ID ������ ������ E
 * @param <T> ��� ������� ��� ������/������.
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
