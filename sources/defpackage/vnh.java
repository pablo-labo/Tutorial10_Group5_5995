package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class vnh extends anh implements Serializable {
    public static final vnh a = new vnh();

    @Override // defpackage.anh
    public final anh a() {
        return umh.a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
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
