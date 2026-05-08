package defpackage;

import defpackage.fsf;

/* JADX INFO: loaded from: classes.dex */
public final class nka implements fsf {
    public final ssf a;
    public final c37 b;

    public static final class a implements fsf.a {
        @Override // fsf.a
        public final fsf a(ssf ssfVar, c37 c37Var) {
            return new nka(ssfVar, c37Var);
        }
    }

    public nka(ssf ssfVar, c37 c37Var) {
        this.a = ssfVar;
        this.b = c37Var;
    }

    @Override // defpackage.fsf
    public final void a() {
        c37 c37Var = this.b;
        boolean z = c37Var instanceof mye;
        ssf ssfVar = this.a;
        if (z) {
            ssfVar.c(((mye) c37Var).a);
        } else if (c37Var instanceof uw4) {
            ssfVar.getClass();
        } else {
            l.g();
        }
    }
}
