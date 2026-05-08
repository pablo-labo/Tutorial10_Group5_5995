package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gjc {
    public static final void a(final String str, final String str2, final String str3, final gu5 gu5Var, String str4, gu5 gu5Var2, final b20 b20Var, b bVar, final int i) {
        final String str5;
        final gu5 gu5Var3;
        str.getClass();
        str2.getClass();
        str3.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(751896013);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.K(str2) ? 32 : 16) | (cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | 221184;
        if (cVarH.o(i2 & 1, (4269203 & i2) != 4269202)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new wy2(17);
                cVarH.p(objV);
            }
            gu5Var3 = (gu5) objV;
            int i3 = i2 << 15;
            tr6.a(b20Var, gu5Var3, "", null, null, str, str2, bh2.c(2131795868, new fq4(2, (o97) cVarH.M(p97.a), str3, gu5Var), cVarH), cVarH, (458752 & i3) | 12583350 | (i3 & 3670016), 24);
            str5 = "";
        } else {
            cVarH.D();
            str5 = str4;
            gu5Var3 = gu5Var2;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, str2, str3, gu5Var, str5, gu5Var3, b20Var, i) { // from class: fjc
                public final /* synthetic */ b20 V;
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ String e;
                public final /* synthetic */ gu5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(12582913);
                    gjc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
