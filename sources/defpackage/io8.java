package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class io8 {
    public final int a;
    public final ho8[] b;
    public final gg1 c;
    public final List<ld6> d;
    public final int e;
    public final int f;
    public final int g;

    public io8(int i, ho8[] ho8VarArr, gg1 gg1Var, List list, int i2) {
        this.a = i;
        this.b = ho8VarArr;
        this.c = gg1Var;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (ho8 ho8Var : ho8VarArr) {
            iMax = Math.max(iMax, ho8Var.o);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final ho8[] a(int i, int i2, int i3) {
        ho8[] ho8VarArr = this.b;
        int length = ho8VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            ho8 ho8Var = ho8VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) this.d.get(i5).a;
            int i9 = i;
            ho8Var.p(i9, ((int[]) this.c.b)[i6], i2, i3, this.a, i6);
            j6g j6gVar = j6g.a;
            i6 += i8;
            i4++;
            i = i9;
            i5 = i7;
        }
        return ho8VarArr;
    }
}
