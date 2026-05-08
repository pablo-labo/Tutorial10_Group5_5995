package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ngg {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function1 r19, defpackage.ig3 r20, defpackage.gza r21, kotlin.jvm.functions.Function1 r22, androidx.compose.runtime.b r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngg.a(kotlin.jvm.functions.Function1, ig3, gza, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, gu5 gu5Var4, Function1 function1, ig3 ig3Var, b bVar, int i) {
        c cVar;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        function1.getClass();
        c cVarH = bVar.h(-452169826);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.K(ig3Var) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (599187 & i2) != 599186)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            String strK = z3.k(cVarH, -743490032, R.string.add_military_service, cVarH, false);
            gu5 gu5Var5 = ((Boolean) g4aVar.getValue()).booleanValue() ? gu5Var3 : null;
            Float fValueOf = Float.valueOf(i3c.b(qt9.MilitaryTimePeriod.c(), 5));
            boolean z = (i2 & 14) == 4;
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                objV2 = new yw0(8, gu5Var);
                cVarH.p(objV2);
            }
            gu5 gu5Var6 = (gu5) objV2;
            boolean z2 = (i2 & 112) == 32;
            Object objV3 = cVarH.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new zb(8, gu5Var2);
                cVarH.p(objV3);
            }
            cVar = cVarH;
            sb1.a(strK, gu5Var6, gu5Var5, 0, gu5Var4, 0, (gu5) objV3, fValueOf, null, false, false, false, false, null, 0, bh2.c(757781276, new psb(function1, ig3Var, g4aVar), cVarH), cVar, (i2 << 3) & 57344, 196608, 32552);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new wm0(gu5Var, gu5Var2, gu5Var3, gu5Var4, function1, ig3Var, i, 1);
        }
    }
}
