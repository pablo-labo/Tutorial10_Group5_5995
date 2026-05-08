package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class nw1 extends v1 {
    public final Typeface b;
    public final i62 c;
    public boolean d;

    public nw1(i62 i62Var, Typeface typeface) {
        this.b = typeface;
        this.c = i62Var;
    }

    @Override // defpackage.v1
    public final void k0(int i) {
        if (this.d) {
            return;
        }
        h92 h92Var = (h92) this.c.a;
        nw1 nw1Var = h92Var.v;
        if (nw1Var != null) {
            nw1Var.d = true;
        }
        Typeface typeface = h92Var.s;
        Typeface typeface2 = this.b;
        if (typeface != typeface2) {
            h92Var.s = typeface2;
            h92Var.h();
        }
    }

    @Override // defpackage.v1
    public final void l0(Typeface typeface, boolean z) {
        if (this.d) {
            return;
        }
        h92 h92Var = (h92) this.c.a;
        nw1 nw1Var = h92Var.v;
        if (nw1Var != null) {
            nw1Var.d = true;
        }
        if (h92Var.s != typeface) {
            h92Var.s = typeface;
            h92Var.h();
        }
    }
}
