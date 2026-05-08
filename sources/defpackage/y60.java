package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y60 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(final toa toaVar, final e eVar, long j, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(1776202187);
        int i3 = (cVarH.K(toaVar) ? 4 : 2) | i | (cVarH.K(eVar) ? 32 : 16) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                cVarH.D();
                i2 = i3 & (-897);
            }
            cVarH.V();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new a3(toaVar, 3);
                cVarH.p(objV);
            }
            y90.a(toaVar, c20.a.b, bh2.c(-1653527038, new u60(j, b5e.b(eVar, false, (Function1) objV)), cVarH), cVarH, i4 | 432);
        } else {
            cVarH.D();
        }
        final long j2 = j;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(eVar, j2, i) { // from class: s60
                public final /* synthetic */ e b;
                public final /* synthetic */ long c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    y60.a(this.a, this.b, this.c, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(e eVar, b bVar, int i, int i2) {
        int i3;
        c cVarH = bVar.h(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        }
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            jh2.f(cVarH, androidx.compose.ui.c.a(g.o(eVar, a, 25.0f), tf7.a, x60.a));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new t60(eVar, i, i2);
        }
    }
}
