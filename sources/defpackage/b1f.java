package defpackage;

import defpackage.d04;
import defpackage.j29;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b1f {
    public static final q2a a;

    static {
        lx4 lx4Var = lx4.a;
        es4 es4Var = new es4(lx4.b, ere.f);
        n8a n8aVarF = ere.g.a.f();
        j29.a aVar = j29.e;
        q2a q2aVar = new q2a(es4Var, n8aVarF, aVar);
        q2aVar.W = ax9.e;
        d04.h hVar = d04.e;
        if (hVar == null) {
            q2a.D0(9);
            throw null;
        }
        q2aVar.X = hVar;
        List listZ = u63.Z(sxf.P0(q2aVar, ylg.IN_VARIANCE, n8a.h("T"), 0, aVar));
        if (q2aVar.Z != null) {
            o6.k(q2aVar.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listZ);
        q2aVar.Z = arrayList;
        q2aVar.Y = new k62(q2aVar, arrayList, q2aVar.a0, q2aVar.b0);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            q2a.D0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((n52) ((kv5) it.next())).U0(q2aVar.o());
        }
        a = q2aVar;
    }
}
