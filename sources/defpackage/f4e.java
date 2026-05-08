package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class f4e<T> implements Comparator {
    public final /* synthetic */ i3a a;

    public f4e(i3a i3aVar) {
        this.a = i3aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        long jLongValue = ((Number) t).longValue();
        i3a i3aVar = this.a;
        return ak2.i(Integer.valueOf(i3aVar.c(jLongValue)), Integer.valueOf(i3aVar.c(((Number) t2).longValue())));
    }
}
