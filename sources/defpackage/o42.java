package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.zxd;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class o42 {
    public final e61 a;
    public final zpf b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public o42(int i, e61 e61Var, zpf zpfVar) {
        int i2 = e61Var.d;
        this.a = e61Var;
        int iA = e61Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        ka2.l(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) e61Var.b) * 1000000;
        long j2 = e61Var.c;
        String str = vjg.a;
        this.e = vjg.X(i2, j, j2, RoundingMode.DOWN);
        this.b = zpfVar;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        this.n = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        this.f = i2;
    }

    public final byd a(int i) {
        return new byd((this.e / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final zxd.a b(long j) {
        if (this.k == 0) {
            byd bydVar = new byd(0L, this.l);
            return new zxd.a(bydVar, bydVar);
        }
        int i = (int) (j / (this.e / ((long) this.f)));
        int iD = vjg.d(this.n, i, true, true);
        if (this.n[iD] == i) {
            byd bydVarA = a(iD);
            return new zxd.a(bydVarA, bydVarA);
        }
        byd bydVarA2 = a(iD);
        int i2 = iD + 1;
        return i2 < this.m.length ? new zxd.a(bydVarA2, a(i2)) : new zxd.a(bydVarA2, bydVarA2);
    }
}
