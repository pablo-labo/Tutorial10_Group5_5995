package defpackage;

import androidx.media3.common.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class rhe implements m55 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public o55 f;
    public zpf g;

    public rhe(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            bg.h();
            return 0;
        }
        zpf zpfVar = this.g;
        zpfVar.getClass();
        int iC = zpfVar.c(n55Var, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        int i = this.b;
        int i2 = this.a;
        ka2.q((i2 == -1 || i == -1) ? false : true);
        g4b g4bVar = new g4b(i);
        ((hn3) n55Var).d(g4bVar.a, 0, i, false);
        return g4bVar.D() == i2;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.f = o55Var;
        zpf zpfVarO = o55Var.o(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 4);
        this.g = zpfVarO;
        a.C0036a c0036a = new a.C0036a();
        String str = this.c;
        c0036a.l = st9.p(str);
        c0036a.m = st9.p(str);
        t40.n(c0036a, zpfVarO);
        this.f.m();
        this.f.b(new the());
        this.e = 1;
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
