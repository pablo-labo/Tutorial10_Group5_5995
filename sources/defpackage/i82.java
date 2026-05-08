package defpackage;

import defpackage.p37;

/* JADX INFO: loaded from: classes.dex */
public final class i82 {
    public static p37 a;

    public static final p37 a() {
        p37 p37Var = a;
        if (p37Var != null) {
            return p37Var;
        }
        p37.a aVar = new p37.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = gmg.a;
        kne kneVar = new kne(da2.b);
        y5b y5bVar = new y5b();
        y5bVar.f(19.0f, 6.41f);
        y5bVar.d(17.59f, 5.0f);
        y5bVar.d(12.0f, 10.59f);
        y5bVar.d(6.41f, 5.0f);
        y5bVar.d(5.0f, 6.41f);
        y5bVar.d(10.59f, 12.0f);
        y5bVar.d(5.0f, 17.59f);
        y5bVar.d(6.41f, 19.0f);
        y5bVar.d(12.0f, 13.41f);
        y5bVar.d(17.59f, 19.0f);
        y5bVar.d(19.0f, 17.59f);
        y5bVar.d(13.41f, 12.0f);
        y5bVar.a();
        p37.a.a(aVar, y5bVar.a, kneVar);
        p37 p37VarB = aVar.b();
        a = p37VarB;
        return p37VarB;
    }
}
