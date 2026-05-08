package defpackage;

import defpackage.jd6;
import defpackage.vs0;

/* JADX INFO: loaded from: classes.dex */
public final class md6 implements mo8 {
    public final nn8 a;
    public long b = mq2.b(0, 0, 15);
    public float c;
    public gg1 d;

    public md6(nn8 nn8Var) {
        this.a = nn8Var;
    }

    @Override // defpackage.mo8
    public final gg1 a(ar8 ar8Var, long j) {
        bxe bxeVar = ar8Var.b;
        if (this.d != null && iq2.b(this.b, j) && this.c == bxeVar.getDensity()) {
            gg1 gg1Var = this.d;
            gg1Var.getClass();
            return gg1Var;
        }
        this.b = j;
        this.c = bxeVar.getDensity();
        nn8 nn8Var = this.a;
        jd6.a aVar = (jd6.a) nn8Var.b;
        vs0.e eVar = (vs0.e) nn8Var.c;
        if (iq2.h(j) == Integer.MAX_VALUE) {
            de7.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int iH = iq2.h(j);
        int[] iArrY1 = z92.y1(aVar.a(iH, ar8Var.x0(eVar.a())));
        int[] iArr = new int[iArrY1.length];
        eVar.b(ar8Var, iH, iArrY1, vl8.a, iArr);
        gg1 gg1Var2 = new gg1(iArrY1, iArr);
        this.d = gg1Var2;
        return gg1Var2;
    }
}
