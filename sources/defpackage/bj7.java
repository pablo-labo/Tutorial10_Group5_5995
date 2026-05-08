package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bj7 implements h4d, tpb {
    public final cq5 a;
    public final bq5 b;
    public final g4d c;
    public final h4d d;

    public bj7(cq5 cq5Var, bq5 bq5Var) {
        this.a = cq5Var;
        this.b = bq5Var;
        this.c = cq5Var;
        this.d = bq5Var;
    }

    @Override // defpackage.tpb
    public final void a(ppb ppbVar, String str, Map map) {
        ppbVar.getClass();
        cq5 cq5Var = this.a;
        if (cq5Var != null) {
            cq5Var.e(ppbVar.getId(), str, map);
        }
        bq5 bq5Var = this.b;
        if (bq5Var != null) {
            bq5Var.a(ppbVar, str, map);
        }
    }

    @Override // defpackage.tpb
    public final void b(ppb ppbVar) {
        ppbVar.getClass();
        cq5 cq5Var = this.a;
        if (cq5Var != null) {
            cq5Var.i(ppbVar.getId());
        }
        bq5 bq5Var = this.b;
        if (bq5Var != null) {
            bq5Var.b(ppbVar);
        }
    }

    @Override // defpackage.tpb
    public final void c(ppb ppbVar, String str, boolean z) {
        ppbVar.getClass();
        cq5 cq5Var = this.a;
        if (cq5Var != null) {
            cq5Var.h(ppbVar.getId(), str, z);
        }
        bq5 bq5Var = this.b;
        if (bq5Var != null) {
            bq5Var.c(ppbVar, str, z);
        }
    }

    @Override // defpackage.h4d
    public final void d(ppb ppbVar, Throwable th) {
        ppbVar.getClass();
        g4d g4dVar = this.c;
        if (g4dVar != null) {
            g4dVar.j(ppbVar.Q(), ppbVar.getId(), th, ppbVar.b0());
        }
        h4d h4dVar = this.d;
        if (h4dVar != null) {
            h4dVar.d(ppbVar, th);
        }
    }

    @Override // defpackage.h4d
    public final void e(ppb ppbVar) {
        ppbVar.getClass();
        g4d g4dVar = this.c;
        if (g4dVar != null) {
            g4dVar.c(ppbVar.Q(), ppbVar.getId(), ppbVar.b0());
        }
        h4d h4dVar = this.d;
        if (h4dVar != null) {
            h4dVar.e(ppbVar);
        }
    }

    @Override // defpackage.tpb
    public final void f(ppb ppbVar, String str) {
        ppbVar.getClass();
        cq5 cq5Var = this.a;
        if (cq5Var != null) {
            cq5Var.g(ppbVar.getId(), str);
        }
        bq5 bq5Var = this.b;
        if (bq5Var != null) {
            bq5Var.f(ppbVar, str);
        }
    }

    @Override // defpackage.h4d
    public final void g(gbe gbeVar) {
        g4d g4dVar = this.c;
        if (g4dVar != null) {
            g4dVar.a(gbeVar.a, gbeVar.d, gbeVar.b, gbeVar.b0());
        }
        h4d h4dVar = this.d;
        if (h4dVar != null) {
            h4dVar.g(gbeVar);
        }
    }

    @Override // defpackage.tpb
    public final void h(ppb ppbVar, String str, Throwable th, Map map) {
        ppbVar.getClass();
        cq5 cq5Var = this.a;
        if (cq5Var != null) {
            cq5Var.f(ppbVar.getId(), str, th, map);
        }
        bq5 bq5Var = this.b;
        if (bq5Var != null) {
            bq5Var.h(ppbVar, str, th, map);
        }
    }

    @Override // defpackage.h4d
    public final void i(ppb ppbVar) {
        ppbVar.getClass();
        g4d g4dVar = this.c;
        if (g4dVar != null) {
            g4dVar.k(ppbVar.getId());
        }
        h4d h4dVar = this.d;
        if (h4dVar != null) {
            h4dVar.i(ppbVar);
        }
    }

    @Override // defpackage.tpb
    public final boolean j(ppb ppbVar, String str) {
        ppbVar.getClass();
        cq5 cq5Var = this.a;
        Boolean boolValueOf = cq5Var != null ? Boolean.valueOf(cq5Var.d(ppbVar.getId())) : null;
        if (!wl7.b(boolValueOf, Boolean.TRUE)) {
            bq5 bq5Var = this.b;
            boolValueOf = bq5Var != null ? Boolean.valueOf(bq5Var.j(ppbVar, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // defpackage.tpb
    public final void k(ppb ppbVar, String str) {
        ppbVar.getClass();
        cq5 cq5Var = this.a;
        if (cq5Var != null) {
            cq5Var.b(ppbVar.getId(), str);
        }
        bq5 bq5Var = this.b;
        if (bq5Var != null) {
            bq5Var.k(ppbVar, str);
        }
    }
}
