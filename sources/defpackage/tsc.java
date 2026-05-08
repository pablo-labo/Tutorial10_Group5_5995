package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tsc {
    public static final void a(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, gu5<j6g> gu5Var3, b bVar, int i) {
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(1847788037);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 21;
            ku6.a("", ak2.I(R.string.desc_close, cVarH), ak2.I(R.string.recommended_upgrade_title, cVarH), null, ak2.I(R.string.recommended_upgrade_update_now_button, cVarH), ak2.I(R.string.recommended_upgrade_maybe_later_button, cVarH), gu5Var, gu5Var2, gu5Var3, "RecommendUpgradeDialog", bh2.c(-1280311077, new t5((o97) cVarH.M(p97.a), 5), cVarH), cVarH, (29360128 & i3) | 6 | (234881024 & i3) | (i3 & 1879048192), 54, 20);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new od(gu5Var, gu5Var2, gu5Var3, i);
        }
    }
}
