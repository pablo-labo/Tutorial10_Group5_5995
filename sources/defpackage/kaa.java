package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class kaa extends vva<Comparable<?>> implements Serializable {
    public static final kaa a = new kaa();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.vva
    public final <S extends Comparable<?>> vva<S> a() {
        return sad.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
