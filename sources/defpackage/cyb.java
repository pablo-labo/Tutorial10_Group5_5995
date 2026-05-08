package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class cyb {
    public static final void a(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(238170183);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            nof.c(gu5Var2, R.drawable.ic_idl_hamburger_24, fv6.W3, ak2.I(R.string.desc_hamburger_menu, cVarH), "HamburgerMenuButton", null, cVarH, (i2 & 14) | 24960, 96);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kh(gu5Var2, i, 11);
        }
    }

    public static final void b(gu5<j6g> gu5Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(1951664707);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            iv6.b(ak2.I(R.string.bottom_nav_top_bar_title_profile, cVarH), f.a(e.a.b, "DetailsTopBar"), false, null, false, null, bh2.c(-545775291, new grb(i3, gu5Var), cVarH), cVarH, 100663344, 252);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ek7(gu5Var, i, 1);
        }
    }

    public static final void c(final int i, final gu5 gu5Var, final gu5 gu5Var2, b bVar, final boolean z) {
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -1235028277);
        int i2 = (cVarC.a(z) ? 4 : 2) | i | (cVarC.x(gu5Var) ? 32 : 16) | (cVarC.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (!cVarC.o(i2 & 1, (i2 & 147) != 146)) {
            cVarC.D();
        } else if (z || ((h2g) cr8.p(h2g.class)).a()) {
            cVarC.L(-2037322128);
            d(gu5Var, gu5Var2, cVarC, (i2 >> 3) & 126);
            cVarC.U(false);
        } else {
            cVarC.L(-2037246240);
            b(gu5Var2, cVarC, (i2 >> 6) & 14);
            cVarC.U(false);
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, gu5Var2, z) { // from class: ayb
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;

                {
                    this.a = z;
                    this.b = gu5Var;
                    this.c = gu5Var2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cyb.c(ka2.L(1), this.b, this.c, (b) obj, this.a);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-834063396);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            iv6.a(wab.W, f.a(e.a.b, "DetailsTopBar"), false, null, false, null, bh2.c(-1164290087, new byb(i3, gu5Var), cVarH), bh2.c(1316884506, new ln4(1, gu5Var2), cVarH), cVarH, 113246262, 124);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yg2(i, 1, gu5Var, gu5Var2);
        }
    }
}
