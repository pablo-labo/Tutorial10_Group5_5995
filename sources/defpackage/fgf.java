package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.k;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fgf implements wu5<e, b, Integer, e> {
    public final /* synthetic */ Function1<ooa, j6g> a;
    public final /* synthetic */ d3a b;

    /* JADX WARN: Multi-variable type inference failed */
    public fgf(Function1<? super ooa, j6g> function1, d3a d3aVar) {
        this.a = function1;
        this.b = d3aVar;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-102778667);
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            m74 m74Var = to4.a;
            k kVar = new k(bVar2.l());
            bVar2.p(kVar);
            objV = kVar;
        }
        e13 e13Var = (e13) objV;
        Object objV2 = bVar2.v();
        if (objV2 == c0020a) {
            objV2 = r.f(null);
            bVar2.p(objV2);
        }
        g4a g4aVar = (g4a) objV2;
        g4a g4aVarG = r.g(this.a, bVar2);
        d3a d3aVar = this.b;
        boolean zK = bVar2.K(d3aVar);
        Object objV3 = bVar2.v();
        if (zK || objV3 == c0020a) {
            objV3 = new kb8(4, g4aVar, d3aVar);
            bVar2.p(objV3);
        }
        to4.b(d3aVar, (Function1) objV3, bVar2);
        boolean zX = bVar2.x(e13Var) | bVar2.K(d3aVar) | bVar2.K(g4aVarG);
        Object objV4 = bVar2.v();
        if (zX || objV4 == c0020a) {
            objV4 = new egf(e13Var, g4aVar, d3aVar, g4aVarG);
            bVar2.p(objV4);
        }
        e eVarB = f1f.b(e.a.b, d3aVar, (PointerInputEventHandler) objV4);
        bVar2.F();
        return eVarB;
    }
}
