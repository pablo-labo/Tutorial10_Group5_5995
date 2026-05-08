package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import defpackage.kv8;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class dj5 {
    public static final g4a a(fse fseVar, b bVar) {
        zv8 zv8Var = (zv8) bVar.M(r09.a);
        Object value = fseVar.getValue();
        kv8 lifecycle = zv8Var.getLifecycle();
        kv8.b bVar2 = kv8.b.d;
        vr4 vr4Var = vr4.a;
        Object[] objArr = {fseVar, lifecycle, bVar2, vr4Var};
        boolean zX = bVar.x(lifecycle) | bVar.d(bVar2.ordinal()) | bVar.x(vr4Var) | bVar.x(fseVar);
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (zX || objV == obj) {
            Object zi5Var = new zi5(lifecycle, bVar2, vr4Var, fseVar, null);
            bVar.p(zi5Var);
            objV = zi5Var;
        }
        Function2 function2 = (Function2) objV;
        Object objV2 = bVar.v();
        if (objV2 == obj) {
            objV2 = r.f(value);
            bVar.p(objV2);
        }
        g4a g4aVar = (g4a) objV2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zX2 = bVar.x(function2);
        Object objV3 = bVar.v();
        if (zX2 || objV3 == obj) {
            objV3 = new mme(function2, g4aVar, null);
            bVar.p(objV3);
        }
        to4.g(objArrCopyOf, (Function2) objV3, bVar);
        return g4aVar;
    }
}
