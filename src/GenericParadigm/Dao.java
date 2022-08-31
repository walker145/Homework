package GenericParadigm;

import java.util.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Dao<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }
//    public List<T> list(){
//        ArrayList<T> objects = new ArrayList<>();
//        Set<String> strings = map.keySet();
//    }
}
