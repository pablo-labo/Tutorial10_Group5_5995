package defpackage;

import defpackage.i6b;
import defpackage.p37;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f32 {
    public static p37 a;

    public static final p37 a() {
        p37 p37Var = a;
        if (p37Var != null) {
            return p37Var;
        }
        p37.a aVar = new p37.a("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = gmg.a;
        kne kneVar = new kne(da2.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new i6b.f(9.0f, 16.17f));
        arrayList.add(new i6b.e(4.83f, 12.0f));
        arrayList.add(new i6b.m(-1.42f, 1.41f));
        arrayList.add(new i6b.e(9.0f, 19.0f));
        arrayList.add(new i6b.e(21.0f, 7.0f));
        arrayList.add(new i6b.m(-1.41f, -1.41f));
        arrayList.add(i6b.b.c);
        p37.a.a(aVar, arrayList, kneVar);
        p37 p37VarB = aVar.b();
        a = p37VarB;
        return p37VarB;
    }
}
