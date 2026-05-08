package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class f72 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ f72(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ak2.i(b04.g((t52) obj).a.a, b04.g((t52) obj2).a.a);
            case 1:
                return ak2.i((String) obj, (String) obj2);
            default:
                return ak2.i(Long.valueOf(((lsc) obj2).c), Long.valueOf(((lsc) obj).c));
        }
    }
}
