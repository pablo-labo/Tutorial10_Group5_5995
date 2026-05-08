package defpackage;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class tbe extends sn1 {
    public hc0 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.sn1
    public final void a(float f, long j, u2b u2bVar) {
        hc0 hc0Var = this.a;
        if (hc0Var == null || !kie.a(this.b, j)) {
            if (kie.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                hc0Var = null;
            } else {
                hc0Var = this.a;
                if (hc0Var == null) {
                    hc0Var = new hc0();
                    this.a = hc0Var;
                }
                hc0Var.b = b(j);
                this.a = hc0Var;
                this.b = j;
            }
        }
        long jC = u2bVar.c();
        long j2 = da2.b;
        if (!da2.c(jC, j2)) {
            u2bVar.d(j2);
        }
        if (!wl7.b(u2bVar.g(), hc0Var != null ? (Shader) hc0Var.b : null)) {
            u2bVar.f(hc0Var != null ? (Shader) hc0Var.b : null);
        }
        if (u2bVar.a() == f) {
            return;
        }
        u2bVar.b(f);
    }

    public abstract Shader b(long j);
}
