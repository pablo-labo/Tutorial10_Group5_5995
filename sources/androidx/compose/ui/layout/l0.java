package androidx.compose.ui.layout;

import androidx.compose.ui.layout.j0;
import defpackage.a3a;
import defpackage.khd;
import defpackage.pg8;
import defpackage.utc;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final a3a a;
    public static final j0[] b;
    public static final a3a<j0> c;

    static {
        a3a a3aVar = new a3a(8);
        j0.a.getClass();
        k0 k0Var = j0.a.g;
        a3aVar.h(1, k0Var);
        k0 k0Var2 = j0.a.f;
        a3aVar.h(2, k0Var2);
        k0 k0Var3 = j0.a.b;
        a3aVar.h(4, k0Var3);
        k0 k0Var4 = j0.a.d;
        a3aVar.h(8, k0Var4);
        k0 k0Var5 = j0.a.h;
        a3aVar.h(16, k0Var5);
        k0 k0Var6 = j0.a.e;
        a3aVar.h(32, k0Var6);
        k0 k0Var7 = j0.a.i;
        a3aVar.h(64, k0Var7);
        a = a3aVar;
        b = new j0[]{k0Var, k0Var2, k0Var3, k0Var7, k0Var5, k0Var6, k0Var4, j0.a.j, j0.a.c};
        a3a<j0> a3aVar2 = new a3a<>(7);
        a3aVar2.h(1, k0Var);
        a3aVar2.h(2, k0Var2);
        a3aVar2.h(4, k0Var3);
        a3aVar2.h(16, k0Var5);
        a3aVar2.h(64, k0Var7);
        a3aVar2.h(32, k0Var6);
        a3aVar2.h(8, k0Var4);
        c = a3aVar2;
    }

    public static final void a(khd khdVar, utc utcVar, long j, int i, int i2) {
        if (pg8.s(j, -1L)) {
            return;
        }
        khdVar.D0(utcVar.a(), (int) ((j >>> 48) & 65535));
        khdVar.D0(utcVar.b(), (int) ((j >>> 32) & 65535));
        khdVar.D0(utcVar.d(), i - ((int) ((j >>> 16) & 65535)));
        khdVar.D0(utcVar.c(), i2 - ((int) (j & 65535)));
    }

    public static final androidx.compose.ui.e b(f fVar) {
        return new RulerProviderModifierElement(fVar);
    }
}
