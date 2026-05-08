package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zt6 {
    @sy3
    public static final void a(final String str, final boolean z, final e eVar, final au6 au6Var, final boolean z2, final boolean z3, final Function1 function1, final d3a d3aVar, b bVar, final int i) {
        int i2;
        c cVar;
        str.getClass();
        function1.getClass();
        c cVarH = bVar.h(-1910988414);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.d(au6Var == null ? -1 : au6Var.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.a(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.a(z3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= cVarH.x(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.K(d3aVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && cVarH.i()) {
            cVarH.D();
            cVar = cVarH;
        } else {
            int i3 = 1572864 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2);
            int i4 = i2 << 3;
            cVar = cVarH;
            b(str, z, eVar, au6Var, z2, z3, true, function1, d3aVar, cVar, i3 | (29360128 & i4) | (i4 & 234881024));
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: wt6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zt6.a(str, z, eVar, au6Var, z2, z3, function1, d3aVar, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r37, final boolean r38, final androidx.compose.ui.e r39, final defpackage.au6 r40, final boolean r41, final boolean r42, final boolean r43, final kotlin.jvm.functions.Function1 r44, final defpackage.d3a r45, androidx.compose.runtime.b r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt6.b(java.lang.String, boolean, androidx.compose.ui.e, au6, boolean, boolean, boolean, kotlin.jvm.functions.Function1, d3a, androidx.compose.runtime.b, int):void");
    }
}
