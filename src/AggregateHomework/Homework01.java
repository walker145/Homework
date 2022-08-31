package AggregateHomework;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new New("新冠病例超千万，印度数百万人在母亲河沐浴"));
        arrayList.add(new New("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶紧放生"));


        for (int i = arrayList.size() - 1; i >= 0 ; i--) {
            //System.out.println(arrayList.get(i));
            //New news = (New)arrayList.get(i);
            System.out.println(New.processTitle(((New)arrayList.get(i)).getTitle()));
        }

    }
}
