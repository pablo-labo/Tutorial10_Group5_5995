package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z3f {
    public static final void a(tg2 tg2Var, String str, ah2 ah2Var, b bVar, int i) {
        int i2;
        tg2Var.getClass();
        c cVarH = bVar.h(-184381302);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            ie7.e(str, null, null, cVarH, (i2 >> 3) & 14);
            b(!(((tg2) z92.Q0(tg2Var.c)) != null ? cy1.class.isInstance(r0.a) : false), bh2.c(-1775563439, new rq(ah2Var, 12), cVarH), cVarH, 48);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xq3(tg2Var, str, ah2Var, i, 1);
        }
    }

    public static final void b(final boolean z, final ah2 ah2Var, b bVar, final int i) {
        c cVarH = bVar.h(-31192712);
        int i2 = (cVarH.a(z) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ay1.b(g.f(g.t(e.a.b, 0.0f, 307.0f, 1), 1.0f), ggd.a(12.0f), wx1.a(o97Var.c.b.a, 0L, 0L, 0L, cVarH, 14), new zx1(1.0f, 6.0f), ee3.f(o97Var.c.c.b, 1.0f), bh2.c(-1160618170, new wu5() { // from class: x3f
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z2 = z;
                        ah2 ah2Var2 = ah2Var;
                        if (z2) {
                            bVar2.L(-1489123354);
                            c4f.b(false, bh2.c(466548027, new b52(ah2Var2, 9), bVar2), bVar2, 54);
                            bVar2.F();
                        } else {
                            bVar2.L(-1488972229);
                            ah2Var2.invoke(bVar2, 0);
                            bVar2.F();
                        }
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, 196614, 0);
            cVarH = cVarH;
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, ah2Var, i) { // from class: y3f
                public final /* synthetic */ boolean a;
                public final /* synthetic */ ah2 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(49);
                    z3f.b(this.a, this.b, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
