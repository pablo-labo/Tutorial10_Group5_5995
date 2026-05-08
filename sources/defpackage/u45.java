package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class u45<T> implements Comparator {
    public final /* synthetic */ pq a;

    public u45(pq pqVar) {
        this.a = pqVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        pq pqVar = this.a;
        return ak2.i((Comparable) pqVar.invoke(t), (Comparable) pqVar.invoke(t2));
    }
}
