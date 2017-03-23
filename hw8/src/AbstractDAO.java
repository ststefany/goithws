/*Create universal interface AbstractDAO (T) with following methods

List ---- out DB emulator

T save(T)
void delete(T)
void deleteAll(List T)
void saveAll(List T)
List T getList()*/


import java.util.List;

public interface AbstractDAO <T> {

    T save(T t);
    void delete(T t);
    void deleteAll(List <T> t);
    void saveAll(List <T> t);
    List<T> getList();


}
