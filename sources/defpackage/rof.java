package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rof {
    public static final void a(gu5 gu5Var, b bVar, int i) {
        gu5Var.getClass();
        c cVarH = bVar.h(-99516850);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            b((i2 & 14) | 3072, gu5Var, cVarH, ak2.I(R.string.desc_back_arrow, cVarH));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new g82(i, 1, gu5Var);
        }
    }

    public static final void b(int i, gu5 gu5Var, b bVar, String str) {
        gu5 gu5Var2;
        str.getClass();
        c cVarH = bVar.h(1689151344);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i | (cVarH.d(R.drawable.ic_idl_native_android_arrow_back_24) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if ((i & 3072) == 0) {
            i2 |= cVarH.K("EditSheetBackArrow") ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            gu5Var2 = gu5Var;
            sq6.a(gu5Var2, f.a(e.a.b, "EditSheetBackArrow"), false, bh2.c(1350781012, new pr(str, 7), cVarH), cVarH, (i2 & 14) | 24576, 12);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new bu2(gu5Var2, i, 1, str);
        }
    }
}
