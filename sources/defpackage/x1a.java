package defpackage;

import defpackage.p2e;

/* JADX INFO: loaded from: classes.dex */
public final class x1a {
    public static final n54 a(n54 n54Var, n54 n54Var2, v3e v3eVar, long j, p2e.a aVar) {
        if (aVar == null) {
            return w3e.a(n54Var, n54Var2);
        }
        int iCompare = v3eVar.f.compare(Long.valueOf(aVar.c), Long.valueOf(j));
        return iCompare < 0 ? n54.a : iCompare > 0 ? n54.c : n54.b;
    }

    public static final int b(long j, mif mifVar) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        q1a q1aVar = mifVar.b;
        return fIntBitsToFloat >= q1aVar.e ? mifVar.a.a.b.length() : q1aVar.g(j);
    }
}
