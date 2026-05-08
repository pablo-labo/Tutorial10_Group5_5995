package defpackage;

import defpackage.le0;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class ym9 implements Comparator {
    public static final ym9 b = new ym9(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ym9(int i) {
        this.a = i;
    }

    public static int a(aj3 aj3Var) {
        if (yz3.m(aj3Var)) {
            return 8;
        }
        if (aj3Var instanceof uq2) {
            return 7;
        }
        if (aj3Var instanceof d4c) {
            return ((d4c) aj3Var).O() == null ? 6 : 5;
        }
        if (aj3Var instanceof kv5) {
            return ((kv5) aj3Var).O() == null ? 4 : 3;
        }
        if (aj3Var instanceof t52) {
            return 2;
        }
        return aj3Var instanceof zvf ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.a) {
            case 0:
                aj3 aj3Var = (aj3) obj;
                aj3 aj3Var2 = (aj3) obj2;
                int iA = a(aj3Var2) - a(aj3Var);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (yz3.m(aj3Var) && yz3.m(aj3Var2)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = aj3Var.getName().a.compareTo(aj3Var2.getName().a);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            case 1:
                return ak2.i(Integer.valueOf(((le0.c) obj).b), Integer.valueOf(((le0.c) obj2).b));
            case 2:
                return ak2.i(((vn1) obj).a().name(), ((vn1) obj2).a().name());
            default:
                ((ek3) obj2).getClass();
                ((ek3) obj).getClass();
                return ak2.i(0, 0);
        }
    }
}
