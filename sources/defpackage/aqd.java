package defpackage;

import defpackage.in9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class aqd {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final lke b(ArrayList arrayList) {
        lke lkeVar = new lke();
        for (Object obj : arrayList) {
            in9 in9Var = (in9) obj;
            if (in9Var != null && in9Var != in9.b.b) {
                lkeVar.add(obj);
            }
        }
        return lkeVar;
    }
}
