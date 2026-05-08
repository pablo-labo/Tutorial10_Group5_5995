package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ctf implements btf {
    public final Set<dt4> a;
    public final v31 b;
    public final etf c;

    public ctf(Set set, v31 v31Var, etf etfVar) {
        this.a = set;
        this.b = v31Var;
        this.c = etfVar;
    }

    @Override // defpackage.btf
    public final ysf a(String str, dt4 dt4Var, wrf wrfVar) {
        Set<dt4> set = this.a;
        if (set.contains(dt4Var)) {
            return new dtf(this.b, str, dt4Var, wrfVar, this.c);
        }
        t40.q("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{dt4Var, set});
        return null;
    }
}
