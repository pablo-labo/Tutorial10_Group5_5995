package defpackage;

import androidx.compose.foundation.gestures.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hgf implements wu5<e, b, Integer, e> {
    public final /* synthetic */ igf a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d3a c;

    public hgf(igf igfVar, boolean z, d3a d3aVar) {
        this.a = igfVar;
        this.b = z;
        this.c = d3aVar;
    }

    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        igf igfVar = this.a;
        g4a g4aVar = igfVar.f;
        bVar2.L(805428266);
        boolean z = ((dwa) ((gme) g4aVar).getValue()) == dwa.a || !(bVar2.M(um2.n) == vl8.b);
        boolean zK = bVar2.K(igfVar);
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (zK || objV == c0020a) {
            objV = new ui(igfVar, 16);
            bVar2.p(objV);
        }
        g4a g4aVarG = r.g((Function1) objV, bVar2);
        Object objV2 = bVar2.v();
        if (objV2 == c0020a) {
            hq3 hq3Var = new hq3(new mb(7, g4aVarG));
            bVar2.p(hq3Var);
            objV2 = hq3Var;
        }
        nsd nsdVar = (nsd) objV2;
        boolean zK2 = bVar2.K(nsdVar) | bVar2.K(igfVar);
        Object objV3 = bVar2.v();
        if (zK2 || objV3 == c0020a) {
            objV3 = new ggf(nsdVar, igfVar);
            bVar2.p(objV3);
        }
        e eVarB = a.b((ggf) objV3, (dwa) ((gme) g4aVar).getValue(), this.b && ((cme) igfVar.b).g() != 0.0f, z, this.c);
        bVar2.F();
        return eVarB;
    }
}
