package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bhf implements wu5<e, b, Integer, e> {
    public final /* synthetic */ rgf a;

    public bhf(rgf rgfVar) {
        this.a = rgfVar;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        e eVar2 = eVar;
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(1980580247);
        iy3 iy3Var = (iy3) bVar2.M(um2.h);
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = r.f(new th7(0L));
            bVar2.p(objV);
        }
        g4a g4aVar = (g4a) objV;
        rgf rgfVar = this.a;
        boolean zX = bVar2.x(rgfVar);
        Object objV2 = bVar2.v();
        if (zX || objV2 == c0020a) {
            objV2 = new ej(10, rgfVar, g4aVar);
            bVar2.p(objV2);
        }
        gu5 gu5Var = (gu5) objV2;
        boolean zK = bVar2.K(iy3Var);
        Object objV3 = bVar2.v();
        if (zK || objV3 == c0020a) {
            objV3 = new m72(9, iy3Var, g4aVar, false);
            bVar2.p(objV3);
        }
        de0 de0Var = a4e.a;
        e eVarA = c.a(eVar2, tf7.a, new x3e((Function1) objV3, gu5Var));
        bVar2.F();
        return eVarA;
    }
}
