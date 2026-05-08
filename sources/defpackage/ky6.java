package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o97;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ky6 {
    public static final void a(final long j, final e eVar, float f, final String str, b bVar, final int i) {
        final float f2;
        c cVarH = bVar.h(544261697);
        if ((((cVarH.e(j) ? 4 : 2) | i | (cVarH.K(eVar) ? 32 : 16) | 384 | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)) & 1171) == 1170 && cVarH.i()) {
            cVarH.D();
            f2 = f;
        } else {
            hl1.a(f.a(a.b(g.h(androidx.compose.foundation.layout.f.h(eVar, 8.0f, 0.0f, 2), 2.0f), j, ggd.a(2.0f)), str == null ? "CustomIndicator" : str), cVarH, 0);
            f2 = 2.0f;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(j, eVar, f2, str, i) { // from class: gy6
                public final /* synthetic */ long a;
                public final /* synthetic */ e b;
                public final /* synthetic */ float c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    ky6.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(dy6 dy6Var, e eVar, boolean z, String str, gu5 gu5Var, b bVar, int i) {
        e eVar2;
        dy6Var.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(146812786);
        int i2 = i | (cVarH.K(dy6Var) ? 4 : 2) | 48 | (cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.K(str) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var) ? 16384 : 8192);
        if ((i2 & 9363) == 9362 && cVarH.i()) {
            cVarH.D();
            eVar2 = eVar;
        } else {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String str2 = str == null ? "IdlTab" : str;
            int i3 = o97Var.a;
            o97.a.e eVar3 = o97Var.c.a;
            long j = i3 >= 7 ? z ? eVar3.g.c : eVar3.g.d.a : z ? eVar3.d : eVar3.c;
            o97.c cVar = o97Var.f;
            to5 to5Var = z ? cVar.c : cVar.a;
            cVarH.L(1849434622);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = r.f(Boolean.TRUE);
                cVarH.p(objV);
            }
            cVarH.U(false);
            e.a aVar = e.a.b;
            f6f.a(z, gu5Var, f.a(androidx.compose.foundation.layout.f.j(g.t(aVar, 0.0f, 84.0f, 1), 0.0f, 8.0f, 0.0f, 10.0f, 5), str2), false, 0L, 0L, null, bh2.c(513031909, new hy6(o97Var, z, dy6Var, j, str2, to5Var, (g4a) objV), cVarH), cVarH, ((i2 >> 6) & 14) | 12582912 | ((i2 >> 9) & 112), 120);
            eVar2 = aVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fy6(dy6Var, eVar2, z, str, gu5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final java.util.List r21, final int r22, final kotlin.jvm.functions.Function1 r23, androidx.compose.ui.e r24, androidx.compose.runtime.b r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky6.c(java.util.List, int, kotlin.jvm.functions.Function1, androidx.compose.ui.e, androidx.compose.runtime.b, int, int):void");
    }
}
