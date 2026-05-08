package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class nof {
    public static final void a(gu5 gu5Var, b bVar, int i) {
        gu5 gu5Var2;
        gu5Var.getClass();
        c cVarH = bVar.h(-1737099988);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            gu5Var2 = gu5Var;
            c(gu5Var2, R.drawable.ic_idl_native_android_arrow_back_24, fv6.o0, ak2.I(R.string.desc_back_arrow, cVarH), "DetailsBackButton", null, cVarH, (i2 & 14) | 24960, 96);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ed(gu5Var2, i, 12);
        }
    }

    public static final void b(final gu5 gu5Var, final fv6 fv6Var, final String str, final String str2, final int i, zq6 zq6Var, final ar6 ar6Var, b bVar, final int i2) {
        int i3;
        final zq6 zq6Var2;
        gu5Var.getClass();
        fv6Var.getClass();
        c cVarH = bVar.h(1789094889);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.x(gu5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.d(fv6Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.K(str2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cVarH.d(i) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            i4 |= cVarH.d(ar6Var == null ? -1 : ar6Var.ordinal()) ? 1048576 : 524288;
        }
        if (cVarH.o(i4 & 1, (599187 & i4) != 599186)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            final String str3 = str == null ? "TopNavBadgedButton" : str;
            o97.g gVar = o97Var.i;
            rq6.b(gu5Var, g.n(e.a.b, 48.0f), false, null, null, bh2.c(-1803977108, new Function2() { // from class: lof
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String str4 = str2;
                        boolean zK = bVar2.K(str4);
                        Object objV = bVar2.v();
                        if (zK || objV == b.a.a) {
                            objV = new yz4(str4, 2);
                            bVar2.p(objV);
                        }
                        cs6.b(b5e.b(e.a.b, false, (Function1) objV), i, 0L, str3, bh2.c(1595211922, new cl4(fv6Var, ar6Var), bVar2), bVar2, 24576, 4);
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, (i4 & 14) | 196608, 28);
            zq6Var2 = zq6.Md;
        } else {
            cVarH.D();
            zq6Var2 = zq6Var;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: mof
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nof.b(gu5Var, fv6Var, str, str2, i, zq6Var2, ar6Var, (b) obj, ka2.L(i2 | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final gu5 gu5Var, final int i, final fv6 fv6Var, final String str, final String str2, ar6 ar6Var, b bVar, final int i2, final int i3) {
        final ar6 ar6Var2;
        fv6Var.getClass();
        str.getClass();
        c cVarH = bVar.h(-362515010);
        int i4 = (cVarH.x(gu5Var) ? 4 : 2) | i2 | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if ((i2 & 24576) == 0) {
            i4 |= cVarH.K(str2) ? 16384 : 8192;
        }
        int i5 = 196608 | i4;
        int i6 = i3 & 64;
        if (i6 != 0) {
            i5 = 1769472 | i4;
        } else if ((1572864 & i2) == 0) {
            i5 |= cVarH.d(ar6Var == null ? -1 : ar6Var.ordinal()) ? 1048576 : 524288;
        }
        if (cVarH.o(i5 & 1, (599171 & i5) != 599170)) {
            ar6 ar6Var3 = i6 != 0 ? ar6.Filled : ar6Var;
            b(gu5Var, fv6Var, str2, str, 0, null, ar6Var3, cVarH, (i5 & 14) | 48 | ((i5 >> 6) & 896) | (i5 & 7168) | 24576 | (i5 & 3670016));
            ar6Var2 = ar6Var3;
        } else {
            cVarH.D();
            ar6Var2 = ar6Var;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: kof
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nof.c(gu5Var, i, fv6Var, str, str2, ar6Var2, (b) obj, ka2.L(i2 | 1), i3);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(String str, b bVar, int i) {
        c cVar;
        int i2;
        c cVarH = bVar.h(1883551495);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVar = cVarH;
            i2 = 1;
            cif.b(str, f.a(e.a.b, "TopNavTitle"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, o97Var.c.b.h.a, o97Var.e.f, new to5(700), null, o97Var.d.a, 0L, 0, o97Var.g.c, null, null, 0, 16646104), cVar, 54, 0, 65532);
        } else {
            cVar = cVarH;
            i2 = 1;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new uj7(str, i, i2);
        }
    }
}
