package defpackage;

import defpackage.no8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jo8 {
    public final gg1 a;
    public final int b;
    public final int c;
    public final ao8 d;
    public final no8 e;

    public jo8(gg1 gg1Var, int i, int i2, ao8 ao8Var, no8 no8Var) {
        this.a = gg1Var;
        this.b = i;
        this.c = i2;
        this.d = ao8Var;
        this.e = no8Var;
    }

    public final long a(int i, int i2) {
        int i3;
        gg1 gg1Var = this.a;
        int[] iArr = (int[]) gg1Var.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) gg1Var.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            ce7.a("width must be >= 0");
        }
        return mq2.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public abstract io8 b(int i, ho8[] ho8VarArr, List<ld6> list, int i2);

    public final io8 c(int i) {
        no8.c cVarB = this.e.b(i);
        int i2 = cVarB.a;
        List<ld6> list = cVarB.b;
        int size = list.size();
        int i3 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        ho8[] ho8VarArr = new ho8[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) list.get(i5).a;
            ho8 ho8VarL = this.d.l(i2 + i5, a(i4, i6), i4, i6, i3);
            i4 += i6;
            j6g j6gVar = j6g.a;
            ho8VarArr[i5] = ho8VarL;
        }
        return b(i, ho8VarArr, list, i3);
    }
}
