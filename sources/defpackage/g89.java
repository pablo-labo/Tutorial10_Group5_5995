package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class g89 implements Comparator {
    public static final g89 b = new g89(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g89(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qtc qtcVarH = ((f5e) obj).h();
                qtc qtcVarH2 = ((f5e) obj2).h();
                int iCompare = Float.compare(qtcVarH.a, qtcVarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(qtcVarH.b, qtcVarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(qtcVarH.d, qtcVarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(qtcVarH.c, qtcVarH2.c);
            default:
                return ak2.i(((sjb) obj).b, ((sjb) obj2).b);
        }
    }
}
