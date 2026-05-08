package defpackage;

import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ab0 {
    public static final void a(final e eVar, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(2064964257);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ah2Var) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            b(eVar, ah2Var, cVarH, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: va0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    ab0.a(eVar, ah2Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(e eVar, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(771959668);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.e(null, zkd.f);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new wa0(0, g4aVar);
                cVarH.p(objV2);
            }
            rm2.a(idf.b.a(c((gu5) objV2, cVarH, 0)), bh2.c(-291176396, new ya0(eVar, g4aVar, ah2Var), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xa0(eVar, ah2Var, i);
        }
    }

    public static final sa0 c(gu5 gu5Var, b bVar, int i) {
        View view = (View) bVar.M(AndroidCompositionLocals_androidKt.f);
        boolean zK = bVar.K(view);
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (zK || objV == obj) {
            objV = new sa0(view, null, gu5Var);
            bVar.p(objV);
        }
        sa0 sa0Var = (sa0) objV;
        boolean zX = bVar.x(sa0Var);
        Object objV2 = bVar.v();
        if (zX || objV2 == obj) {
            objV2 = new wi(sa0Var, 1);
            bVar.p(objV2);
        }
        to4.b(sa0Var, (Function1) objV2, bVar);
        return sa0Var;
    }
}
