package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x3e implements wu5<e, b, Integer, e> {
    public final /* synthetic */ gu5<ooa> a;
    public final /* synthetic */ Function1<gu5<ooa>, e> b;

    public x3e(Function1 function1, gu5 gu5Var) {
        this.a = gu5Var;
        this.b = function1;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(759876635);
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = r.c(this.a);
            bVar2.p(objV);
        }
        ese eseVar = (ese) objV;
        Object objV2 = bVar2.v();
        if (objV2 == c0020a) {
            objV2 = new zb0(new ooa(((ooa) eseVar.getValue()).a), a4e.b, new ooa(a4e.c), 8);
            bVar2.p(objV2);
        }
        zb0 zb0Var = (zb0) objV2;
        j6g j6gVar = j6g.a;
        boolean zX = bVar2.x(zb0Var);
        Object objV3 = bVar2.v();
        if (zX || objV3 == c0020a) {
            objV3 = new z3e(eseVar, zb0Var, null);
            bVar2.p(objV3);
        }
        to4.d(bVar2, j6gVar, (Function2) objV3);
        Object obj = zb0Var.c;
        boolean zK = bVar2.K(obj);
        Object objV4 = bVar2.v();
        if (zK || objV4 == c0020a) {
            objV4 = new o91(obj, 23);
            bVar2.p(objV4);
        }
        e eVarInvoke = this.b.invoke((gu5) objV4);
        bVar2.F();
        return eVarInvoke;
    }
}
