package androidx.compose.runtime;

import androidx.compose.runtime.b;
import defpackage.az3;
import defpackage.cz3;
import defpackage.fse;
import defpackage.g4a;
import defpackage.gu5;
import defpackage.hme;
import defpackage.ime;
import defpackage.j4a;
import defpackage.kjd;
import defpackage.lme;
import defpackage.nme;
import defpackage.ome;
import defpackage.qh7;
import defpackage.sme;
import defpackage.to4;
import defpackage.vr4;
import defpackage.wab;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final g4a a(fse fseVar, b bVar) {
        Object value = fseVar.getValue();
        vr4 vr4Var = vr4.a;
        boolean zX = bVar.x(vr4Var) | bVar.x(fseVar);
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (zX || objV == obj) {
            objV = new nme(vr4Var, fseVar, null);
            bVar.p(objV);
        }
        Function2 function2 = (Function2) objV;
        Object objV2 = bVar.v();
        if (objV2 == obj) {
            objV2 = f(value);
            bVar.p(objV2);
        }
        g4a g4aVar = (g4a) objV2;
        boolean zX2 = bVar.x(function2);
        Object objV3 = bVar.v();
        if (zX2 || objV3 == obj) {
            objV3 = new lme(function2, g4aVar, null);
            bVar.p(objV3);
        }
        to4.f(fseVar, vr4Var, (Function2) objV3, bVar);
        return g4aVar;
    }

    public static final j4a<cz3> b() {
        sme<j4a<cz3>> smeVar = ime.b;
        j4a<cz3> j4aVarA = smeVar.a();
        if (j4aVarA != null) {
            return j4aVarA;
        }
        j4a<cz3> j4aVar = new j4a<>(new cz3[0]);
        smeVar.b(j4aVar);
        return j4aVar;
    }

    public static final az3 c(gu5 gu5Var) {
        sme<qh7> smeVar = ime.a;
        return new az3(gu5Var, null);
    }

    public static final az3 d(gu5 gu5Var, hme hmeVar) {
        sme<qh7> smeVar = ime.a;
        return new az3(gu5Var, hmeVar);
    }

    public static final <T> g4a<T> e(T t, hme<T> hmeVar) {
        return new ParcelableSnapshotMutableState(t, hmeVar);
    }

    public static g4a f(Object obj) {
        return new ParcelableSnapshotMutableState(obj, wab.a0);
    }

    public static final g4a g(Object obj, b bVar) {
        Object objV = bVar.v();
        if (objV == b.a.a) {
            objV = f(obj);
            bVar.p(objV);
        }
        g4a g4aVar = (g4a) objV;
        g4aVar.setValue(obj);
        return g4aVar;
    }

    public static final kjd h(gu5 gu5Var) {
        return new kjd(new ome(gu5Var, null));
    }
}
