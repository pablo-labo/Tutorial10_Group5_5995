package defpackage;

import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class m54<T> {
    public final Pools$SimplePool a = new Pools$SimplePool(10);
    public final jfe<T, ArrayList<T>> b = new jfe<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public final void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            b0.o("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
