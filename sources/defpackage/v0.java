package defpackage;

import defpackage.gd8;
import defpackage.ln9;
import defpackage.od8;
import defpackage.rw5;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {
    public static final ln9 a(g5c g5cVar, o8a o8aVar, hyf hyfVar, boolean z, boolean z2, boolean z3) {
        g5cVar.getClass();
        o8aVar.getClass();
        rw5.e<g5c, od8.c> eVar = od8.d;
        eVar.getClass();
        od8.c cVar = (od8.c) r5c.a(g5cVar, eVar);
        if (cVar == null) {
            return null;
        }
        if (z) {
            s45 s45Var = pd8.a;
            gd8.a aVarB = pd8.b(g5cVar, o8aVar, hyfVar, z3);
            if (aVarB == null) {
                return null;
            }
            return ln9.a.a(aVarB);
        }
        if (!z2 || !cVar.y()) {
            return null;
        }
        od8.b bVarT = cVar.t();
        bVarT.getClass();
        return new ln9(o8aVar.getString(bVarT.n()).concat(o8aVar.getString(bVarT.m())));
    }
}
