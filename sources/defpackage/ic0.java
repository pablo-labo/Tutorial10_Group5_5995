package defpackage;

import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 {
    public static final a.C0108a a = a.C0108a.a("k", "x", "y");

    public static hc0 a(c cVar, s69 s69Var) {
        ArrayList arrayList = new ArrayList();
        if (cVar.v() == a.b.a) {
            cVar.a();
            while (cVar.hasNext()) {
                c cVar2 = cVar;
                s69 s69Var2 = s69Var;
                arrayList.add(new e6b(s69Var2, nh8.b(cVar2, s69Var2, ckg.c(), mh2.a0, cVar.v() == a.b.c, false)));
                cVar = cVar2;
                s69Var = s69Var2;
            }
            cVar.p();
            oh8.b(arrayList);
        } else {
            arrayList.add(new lh8(ec8.b(cVar, ckg.c())));
        }
        return new hc0(arrayList);
    }

    public static tc0 b(c cVar, s69 s69Var) {
        cVar.h();
        hc0 hc0VarA = null;
        dc0 dc0VarQ = null;
        boolean z = false;
        dc0 dc0VarQ2 = null;
        while (cVar.v() != a.b.d) {
            int iN = cVar.N(a);
            if (iN != 0) {
                a.b bVar = a.b.f;
                if (iN != 1) {
                    if (iN != 2) {
                        cVar.P();
                        cVar.I();
                    } else if (cVar.v() == bVar) {
                        cVar.I();
                        z = true;
                    } else {
                        dc0VarQ = wg2.Q(cVar, s69Var, true);
                    }
                } else if (cVar.v() == bVar) {
                    cVar.I();
                    z = true;
                } else {
                    dc0VarQ2 = wg2.Q(cVar, s69Var, true);
                }
            } else {
                hc0VarA = a(cVar, s69Var);
            }
        }
        cVar.s();
        if (z) {
            s69Var.a("Lottie doesn't support expressions.");
        }
        return hc0VarA != null ? hc0VarA : new mc0(dc0VarQ2, dc0VarQ);
    }
}
