package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class umh extends anh implements Serializable {
    public static final umh a = new umh();

    @Override // defpackage.anh
    public final anh a() {
        return vnh.a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
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
