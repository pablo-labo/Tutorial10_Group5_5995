package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class sad extends vva<Comparable<?>> implements Serializable {
    public static final sad a = new sad();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.vva
    public final <S extends Comparable<?>> vva<S> a() {
        return kaa.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
