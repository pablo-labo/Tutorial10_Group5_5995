package defpackage;

import com.apollographql.apollo.exception.CacheMissException;
import defpackage.g15;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b95 implements wt1 {
    public static final b95 a = new b95();

    @Override // defpackage.wt1
    public final Object a(pd2 pd2Var, g15.b bVar, Map<String, Object> map, String str) {
        map.getClass();
        str.getClass();
        Collection<Object> collectionValues = pd2Var.a(bVar, new nf(12)).values();
        ArrayList arrayList = new ArrayList(t92.r0(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        if (!arrayList.isEmpty()) {
            return new qt1(pd2Var.b.M0().d, arrayList);
        }
        String strB = pd2Var.b(bVar);
        if (map.containsKey(strB)) {
            return map.get(strB);
        }
        throw new CacheMissException(str, strB);
    }
}
