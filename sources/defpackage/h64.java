package defpackage;

import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class h64 implements gze<f64> {
    public final q64 a;
    public final vfb b;
    public final s15 c;
    public final jia d;
    public final int e;
    public final a64 f;
    public final a64 g;
    public final Map<String, a64> h;
    public final Lazy i;

    public h64(q64 q64Var, n27 n27Var) {
        vfb vfbVar = n27Var.o;
        gn3 gn3Var = n27Var.i;
        jia jiaVar = n27Var.j;
        a64 a64Var = n27Var.l;
        a64 a64Var2 = n27Var.u;
        vfbVar.getClass();
        gn3Var.getClass();
        jiaVar.getClass();
        a64Var.getClass();
        a64Var2.getClass();
        this.a = q64Var;
        this.b = vfbVar;
        this.c = gn3Var;
        this.d = jiaVar;
        this.e = 0;
        this.f = a64Var;
        this.g = a64Var2;
        this.h = null;
        this.i = boa.E(qt8.a, new o91(this, 3));
    }

    @Override // defpackage.gze
    public final f64 get() {
        return (f64) this.i.getValue();
    }
}
