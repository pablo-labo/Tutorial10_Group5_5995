package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class o8g {
    public static final void a(final int i, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final gu5 gu5Var5, b bVar, final Locale locale, final boolean z, boolean z2) {
        c cVar;
        final boolean z3;
        int i2;
        int i3;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var4.getClass();
        c cVarH = bVar.h(-717109104);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var4) ? 16384 : 8192) | (cVarH.x(gu5Var5) ? 131072 : 65536) | 1572864 | (cVarH.x(locale) ? 8388608 : 4194304);
        if (cVarH.o(i4 & 1, (4793491 & i4) != 4793490)) {
            if (z) {
                i2 = -229399477;
                i3 = R.string.label_edit_education;
            } else {
                i2 = -229537427;
                i3 = R.string.label_add_education;
            }
            String strK = z3.k(cVarH, i2, i3, cVarH, false);
            gu5 gu5Var6 = v1c.h(locale != null ? locale.getCountry() : null) ? gu5Var2 : null;
            int i5 = 6;
            Float fValueOf = Float.valueOf(i3c.b(ho4.d.c(), 6));
            boolean z4 = (i4 & 112) == 32;
            Object objV = cVarH.v();
            if (z4 || objV == b.a.a) {
                objV = new ec(11, gu5Var);
                cVarH.p(objV);
            }
            cVar = cVarH;
            sb1.a(strK, (gu5) objV, gu5Var6, R.string.next_button_label, gu5Var3, 0, gu5Var5, fValueOf, null, false, false, false, false, null, 0, bh2.c(-1661099182, new ug(i5, locale, gu5Var4), cVarH), cVar, (i4 << 3) & 3727360, 196608, 32544);
            z3 = true;
        } else {
            cVar = cVarH;
            cVar.D();
            z3 = z2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, locale, z, z3) { // from class: n8g
                public final /* synthetic */ boolean V;
                public final /* synthetic */ Locale W;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ gu5 f;

                {
                    this.a = z;
                    this.b = gu5Var;
                    this.c = gu5Var2;
                    this.d = gu5Var3;
                    this.e = gu5Var4;
                    this.f = gu5Var5;
                    this.V = z3;
                    this.W = locale;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o8g.a(ka2.L(1), this.b, this.c, this.d, this.e, this.f, (b) obj, this.W, this.a, this.V);
                    return j6g.a;
                }
            };
        }
    }
}
