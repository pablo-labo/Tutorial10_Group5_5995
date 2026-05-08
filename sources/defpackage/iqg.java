package defpackage;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class iqg {
    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void a(final jqg jqgVar, final gu5<j6g> gu5Var, final gu5<? extends WebView> gu5Var2, final gu5<j6g> gu5Var3, final gu5<j6g> gu5Var4, final gu5<j6g> gu5Var5, final gu5<j6g> gu5Var6, final boolean z, final gu5<j6g> gu5Var7, b bVar, final int i) {
        jqgVar.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        gu5Var5.getClass();
        gu5Var6.getClass();
        gu5Var7.getClass();
        c cVarH = bVar.h(-626672997);
        int i2 = (cVarH.K(jqgVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        int i3 = i2 | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if ((i & 3072) == 0) {
            i3 |= cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i3 |= cVarH.x(gu5Var4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cVarH.x(gu5Var5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= cVarH.x(gu5Var6) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= cVarH.a(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= cVarH.x(gu5Var7) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (cVarH.o(i4 & 1, (i4 & 38347923) != 38347922)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            dmd.a(androidx.compose.ui.c.a(e.a.b, tf7.a, new b0h()), bh2.c(1784147295, new oc7(o97Var, jqgVar, gu5Var, gu5Var6, gu5Var3), cVarH), null, null, null, 0, 0L, 0L, null, bh2.c(-536832342, new r02(o97Var, jqgVar, gu5Var5, gu5Var4, gu5Var2), cVarH), cVarH, 805306416, 508);
            if (z) {
                cVarH.L(1012697707);
                tz6.a(((i4 >> 3) & 29360128) | 390, 888, null, gu5Var7, fv6.q4, cVarH, null, ak2.I(R.string.failed_to_find_email_app, cVarH), null, null, null, true);
            } else {
                cVarH.L(1002424679);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: hqg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iqg.a(jqgVar, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, z, gu5Var7, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
