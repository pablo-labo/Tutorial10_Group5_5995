package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kz9 {
    public static final ArrayList b;
    public final List<Object> a;

    public static final class a {
        public final ArrayList a = new ArrayList();
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        b = arrayList;
        arrayList.add(cre.a);
        arrayList.add(m92.d);
        arrayList.add(sb9.d);
        arrayList.add(dt0.d);
        arrayList.add(b62.d);
    }

    public kz9(a aVar) {
        new ThreadLocal();
        new LinkedHashMap();
        ArrayList arrayList = aVar.a;
        int size = arrayList.size();
        ArrayList arrayList2 = b;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
    }
}
