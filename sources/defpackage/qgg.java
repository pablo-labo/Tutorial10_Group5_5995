package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qgg {
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final kotlin.jvm.functions.Function1 r18, final defpackage.ig3 r19, kotlin.jvm.functions.Function1 r20, androidx.compose.runtime.b r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgg.a(kotlin.jvm.functions.Function1, ig3, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final boolean z, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, final Function1 function1, final ig3 ig3Var, boolean z2, b bVar, final int i) {
        c cVar;
        final boolean z3;
        int i2;
        int i3;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        function1.getClass();
        c cVarH = bVar.h(-292297398);
        int i4 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var4) ? 16384 : 8192) | (cVarH.K(ig3Var) ? 1048576 : 524288) | 12582912;
        if (cVarH.o(i4 & 1, (4793491 & i4) != 4793490)) {
            if (z) {
                i2 = -1932638313;
                i3 = R.string.label_edit_work_exp;
            } else {
                i2 = -1932547080;
                i3 = R.string.label_add_work_exp;
            }
            String strK = z3.k(cVarH, i2, i3, cVarH, false);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            gu5 gu5Var5 = ((Boolean) g4aVar.getValue()).booleanValue() ? gu5Var3 : null;
            Float fValueOf = Float.valueOf(i3c.b(h2h.TimePeriod.c(), 6));
            boolean z4 = (i4 & 112) == 32;
            Object objV2 = cVarH.v();
            if (z4 || objV2 == c0020a) {
                objV2 = new ec(12, gu5Var);
                cVarH.p(objV2);
            }
            gu5 gu5Var6 = (gu5) objV2;
            boolean z5 = (i4 & 896) == 256;
            Object objV3 = cVarH.v();
            if (z5 || objV3 == c0020a) {
                objV3 = new zv(6, gu5Var2);
                cVarH.p(objV3);
            }
            cVar = cVarH;
            sb1.a(strK, gu5Var6, gu5Var5, 0, gu5Var4, 0, (gu5) objV3, fValueOf, null, false, false, false, false, null, 0, bh2.c(-1409566776, new lx(function1, ig3Var, g4aVar), cVarH), cVar, i4 & 57344, 196608, 32552);
            z3 = true;
        } else {
            cVar = cVarH;
            cVar.D();
            z3 = z2;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, gu5Var, gu5Var2, gu5Var3, gu5Var4, function1, ig3Var, z3, i) { // from class: pgg
                public final /* synthetic */ ig3 V;
                public final /* synthetic */ boolean W;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(196609);
                    qgg.b(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
