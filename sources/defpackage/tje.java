package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class tje<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        yie yieVar = (yie) t;
        yie yieVar2 = (yie) t2;
        return ak2.i(Boolean.valueOf(wl7.b(yieVar != null ? yieVar.a : null, "DEFAULT_GROUP_ID")), Boolean.valueOf(wl7.b(yieVar2 != null ? yieVar2.a : null, "DEFAULT_GROUP_ID")));
    }
}
