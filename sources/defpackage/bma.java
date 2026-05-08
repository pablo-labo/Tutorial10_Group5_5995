package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bma {
    public static final void a(int i, gu5 gu5Var, gu5 gu5Var2, b bVar, boolean z) {
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -826470540);
        int i2 = (cVarC.a(z) ? 4 : 2) | i | (cVarC.x(gu5Var) ? 32 : 16) | (cVarC.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (!cVarC.o(i2 & 1, (i2 & 147) != 146)) {
            cVarC.D();
        } else if (z) {
            cVarC.L(1663819656);
            qof.a(gu5Var, gu5Var2, false, cVarC, (i2 >> 3) & 126, 4);
            cVarC.U(false);
        } else {
            cVarC.L(1663894800);
            b(gu5Var, cVarC, (i2 >> 3) & 14);
            cVarC.U(false);
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new z7a(i, 1, gu5Var, gu5Var2, z);
        }
    }

    public static final void b(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(225478128);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            iv6.b(ak2.I(R.string.bottom_nav_top_bar_title_notifications, cVarH), f.a(e.a.b, "DetailsTopBar"), false, null, false, bh2.c(1849635987, new dl4(gu5Var, 4), cVarH), null, cVarH, 12582960, 380);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ns4(gu5Var, i, 1);
        }
    }
}
