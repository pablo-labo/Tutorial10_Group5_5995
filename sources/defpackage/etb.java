package defpackage;

import defpackage.cz2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class etb implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ etb(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ak2.i(((sjb) obj).b, ((sjb) obj2).b);
            default:
                return ak2.i(((cz2.a) obj).a, ((cz2.a) obj2).a);
        }
    }
}
