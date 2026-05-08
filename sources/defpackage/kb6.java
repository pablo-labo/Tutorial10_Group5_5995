package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kb6 extends mh8<ib6> {
    public final ib6 h;

    public kb6(List<lh8<ib6>> list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            ib6 ib6Var = list.get(i).b;
            if (ib6Var != null) {
                iMax = Math.max(iMax, ib6Var.b.length);
            }
        }
        this.h = new ib6(new float[iMax], new int[iMax]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z91
    public final Object f(lh8 lh8Var, float f) {
        ib6 ib6Var = (ib6) lh8Var.b;
        ib6 ib6Var2 = (ib6) lh8Var.c;
        ib6 ib6Var3 = this.h;
        int[] iArr = ib6Var3.b;
        float[] fArr = ib6Var3.a;
        boolean zEquals = ib6Var.equals(ib6Var2);
        int[] iArr2 = ib6Var.b;
        if (zEquals) {
            ib6Var3.a(ib6Var);
            return ib6Var3;
        }
        if (f <= 0.0f) {
            ib6Var3.a(ib6Var);
            return ib6Var3;
        }
        if (f >= 1.0f) {
            ib6Var3.a(ib6Var2);
            return ib6Var3;
        }
        int length = iArr2.length;
        int[] iArr3 = ib6Var2.b;
        if (length != iArr3.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr2.length);
            sb.append(" vs ");
            l5.q(w20.k(sb, iArr3.length, ")"));
            return null;
        }
        for (int i = 0; i < iArr2.length; i++) {
            fArr[i] = du9.e(ib6Var.a[i], ib6Var2.a[i], f);
            iArr[i] = hh1.v(iArr2[i], f, iArr3[i]);
        }
        for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
            fArr[length2] = fArr[iArr2.length - 1];
            iArr[length2] = iArr[iArr2.length - 1];
        }
        return ib6Var3;
    }
}
