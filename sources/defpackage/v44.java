package defpackage;

import defpackage.ry3;

/* JADX INFO: loaded from: classes.dex */
public class v44 extends ry3 {
    public int m;

    public v44(ezg ezgVar) {
        super(ezgVar);
        if (ezgVar instanceof bk6) {
            this.e = ry3.a.b;
        } else {
            this.e = ry3.a.c;
        }
    }

    @Override // defpackage.ry3
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (ny3 ny3Var : this.k) {
            ny3Var.a(ny3Var);
        }
    }
}
