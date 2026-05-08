package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gmd implements wu5<e, b, Integer, j6g> {
    public final /* synthetic */ ah2 V;
    public final /* synthetic */ Function2<b, Integer, j6g> W;
    public final /* synthetic */ Function2<b, Integer, j6g> X;
    public final /* synthetic */ wu5<ale, b, Integer, j6g> Y;
    public final /* synthetic */ smd Z;
    public final /* synthetic */ m4a a;
    public final /* synthetic */ kg5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function2<b, Integer, j6g> f;

    public gmd(m4a m4aVar, kg5 kg5Var, long j, long j2, int i, Function2 function2, ah2 ah2Var, Function2 function22, Function2 function23, wu5 wu5Var, smd smdVar) {
        this.a = m4aVar;
        this.b = kg5Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = function2;
        this.V = ah2Var;
        this.W = function22;
        this.X = function23;
        this.Y = wu5Var;
        this.Z = smdVar;
    }

    @Override // defpackage.wu5
    public final j6g q(e eVar, b bVar, Integer num) {
        e eVar2 = eVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= bVar2.K(eVar2) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            m4a m4aVar = this.a;
            boolean zK = bVar2.K(m4aVar);
            kg5 kg5Var = this.b;
            boolean zK2 = zK | bVar2.K(kg5Var);
            Object objV = bVar2.v();
            if (zK2 || objV == b.a.a) {
                objV = new kc(5, m4aVar, kg5Var);
                bVar2.p(objV);
            }
            m0f.a(c.a(eVar2, tf7.a, new yzg((Function1) objV)), null, this.c, this.d, null, 0.0f, bh2.c(-1761194824, new fmd(this.e, this.f, this.V, this.W, this.a, this.X, this.Y, this.Z), bVar2), bVar2, 1572864, 50);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
