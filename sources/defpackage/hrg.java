package defpackage;

import defpackage.grg;

/* JADX INFO: loaded from: classes.dex */
public final class hrg {
    public final irg a;
    public final grg.c b;
    public final p63 c;
    public final dmc d;

    public hrg(irg irgVar, grg.c cVar, p63 p63Var) {
        irgVar.getClass();
        cVar.getClass();
        p63Var.getClass();
        this.a = irgVar;
        this.b = cVar;
        this.c = p63Var;
        this.d = new dmc();
    }

    public final <T extends brg> T a(yd8<T> yd8Var, String str) {
        T t;
        brg brgVarC;
        yd8Var.getClass();
        str.getClass();
        synchronized (this.d) {
            try {
                irg irgVar = this.a;
                irgVar.getClass();
                t = (T) irgVar.a.get(str);
                if (yd8Var.n(t)) {
                    Object obj = this.b;
                    if (obj instanceof grg.e) {
                        t.getClass();
                        ((grg.e) obj).d(t);
                    }
                    t.getClass();
                } else {
                    u2a u2aVar = new u2a(this.c);
                    u2aVar.a.put(grg.b, str);
                    grg.c cVar = this.b;
                    cVar.getClass();
                    try {
                        try {
                            brgVarC = cVar.b(yd8Var, u2aVar);
                        } catch (AbstractMethodError unused) {
                            brgVarC = cVar.c(jh2.p(yd8Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        brgVarC = cVar.a(jh2.p(yd8Var), u2aVar);
                    }
                    t = (T) brgVarC;
                    irg irgVar2 = this.a;
                    irgVar2.getClass();
                    t.getClass();
                    brg brgVar = (brg) irgVar2.a.put(str, t);
                    if (brgVar != null) {
                        brgVar.c();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
