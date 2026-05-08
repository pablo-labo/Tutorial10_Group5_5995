package defpackage;

import android.os.Trace;
import androidx.compose.runtime.b;
import defpackage.ft2;
import defpackage.kv0;
import defpackage.w27;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mv0 {
    public static final kv0 a(Object obj, m17 m17Var, Function1 function1, Function1 function12, ft2 ft2Var, b bVar, int i, int i2) {
        pv0 pv0Var;
        if ((i2 & 4) != 0) {
            function1 = kv0.j0;
        }
        if ((i2 & 8) != 0) {
            function12 = null;
        }
        if ((i2 & 16) != 0) {
            ft2Var = ft2.a.b;
        }
        qv0 qv0VarA = mkg.a(obj, m17Var, bVar);
        bVar.L(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            w27 w27VarC = mkg.c(qv0VarA.a, bVar);
            c(w27VarC);
            kv0.a aVar = new kv0.a(qv0VarA.c, w27VarC, qv0VarA.b);
            Object objV = bVar.v();
            if (objV == b.a.a) {
                objV = new kv0(aVar);
                bVar.p(objV);
            }
            kv0 kv0Var = (kv0) objV;
            kv0Var.a0 = mkg.b(bVar);
            kv0Var.b0 = function1;
            kv0Var.c0 = function12;
            kv0Var.d0 = ft2Var;
            kv0Var.e0 = 1;
            if (((Boolean) bVar.M(uf7.a)).booleanValue()) {
                bVar.L(-924922939);
                pv0Var = (pv0) bVar.M(j09.a);
                bVar.F();
            } else {
                bVar.L(-924865434);
                bVar.F();
                pv0Var = null;
            }
            kv0Var.f0 = pv0Var;
            gse gseVar = kv0Var.g0;
            gseVar.getClass();
            gseVar.m(null, aVar);
            bVar.F();
            return kv0Var;
        } finally {
            Trace.endSection();
        }
    }

    public static void b(String str) {
        throw new IllegalArgumentException(t40.l("Unsupported type: ", str, ". ", l5.m("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void c(w27 w27Var) {
        Object obj = w27Var.b;
        if (obj instanceof w27.a) {
            l5.q("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof m07) {
            b("ImageBitmap");
            throw null;
        }
        if (obj instanceof p37) {
            b("ImageVector");
            throw null;
        }
        if (obj instanceof x2b) {
            b("Painter");
            throw null;
        }
        if (w27Var.c != null) {
            l5.q("request.target must be null.");
        } else {
            if (((kv8) r55.a(w27Var, z27.f)) == null) {
                return;
            }
            l5.q("request.lifecycle must be null.");
        }
    }
}
