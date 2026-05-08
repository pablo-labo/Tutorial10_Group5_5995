package defpackage;

import defpackage.fsf;

/* JADX INFO: loaded from: classes.dex */
public final class t73 implements fsf {
    public final ssf a;
    public final c37 b;
    public final int c;

    public static final class a implements fsf.a {
        public final int b;

        public a(int i) {
            this.b = i;
            if (i > 0) {
                return;
            }
            l5.q("durationMillis must be > 0.");
            throw null;
        }

        @Override // fsf.a
        public final fsf a(ssf ssfVar, c37 c37Var) {
            if ((c37Var instanceof mye) && ((mye) c37Var).c != we3.a) {
                return new t73(ssfVar, c37Var, this.b);
            }
            return new nka(ssfVar, c37Var);
        }
    }

    public t73(ssf ssfVar, c37 c37Var, int i) {
        this.a = ssfVar;
        this.b = c37Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        l5.q("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.fsf
    public final void a() {
        ssf ssfVar = this.a;
        ssfVar.getClass();
        c37 c37Var = this.b;
        if (c37Var.c() != null) {
            ssfVar.b();
            throw null;
        }
        boolean z = c37Var instanceof mye;
        m73 m73Var = new m73(null, null, c37Var.a().q, this.c, (z && ((mye) c37Var).g) ? false : true);
        if (z) {
            r37.b(m73Var);
        } else if (c37Var instanceof uw4) {
            r37.b(m73Var);
        } else {
            l.g();
        }
    }
}
