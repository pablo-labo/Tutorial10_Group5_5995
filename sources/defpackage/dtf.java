package defpackage;

import defpackage.y21;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class dtf<T> implements ysf<T> {
    public final v31 a;
    public final String b;
    public final dt4 c;
    public final wrf<T, byte[]> d;
    public final etf e;

    public dtf(v31 v31Var, String str, dt4 dt4Var, wrf wrfVar, etf etfVar) {
        this.a = v31Var;
        this.b = str;
        this.c = dt4Var;
        this.d = wrfVar;
        this.e = etfVar;
    }

    @Override // defpackage.ysf
    public final void a(x21 x21Var) {
        b(x21Var, new s6());
    }

    @Override // defpackage.ysf
    public final void b(x21 x21Var, htf htfVar) {
        wrf<T, byte[]> wrfVar = this.d;
        if (wrfVar == null) {
            ja.k("Null transformer");
            return;
        }
        o31 o31Var = new o31(this.a, this.b, x21Var, wrfVar, this.c);
        etf etfVar = this.e;
        fod fodVar = etfVar.c;
        v31 v31Var = o31Var.a;
        x21 x21Var2 = o31Var.c;
        v31 v31VarD = v31Var.d(x21Var2.b);
        y21.a aVar = new y21.a();
        aVar.f = new HashMap();
        aVar.d = Long.valueOf(etfVar.a.getTime());
        aVar.e = Long.valueOf(etfVar.b.getTime());
        String str = o31Var.b;
        if (str == null) {
            ja.k("Null transportName");
            return;
        }
        aVar.a = str;
        aVar.c = new xs4(o31Var.e, o31Var.d.apply(x21Var2.a));
        x21Var2.getClass();
        aVar.b = null;
        fodVar.a(v31VarD, aVar.b(), htfVar);
    }
}
