package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dd9;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f5f {
    public static final void a(tg2 tg2Var, dd9.c cVar, String str, dd9.d dVar, String str2, b bVar, int i) {
        int i2;
        dd9.d dVar2;
        String str3;
        dd9.c cVar2;
        tg2Var.getClass();
        cVar.getClass();
        str.getClass();
        c cVarH = bVar.h(-1136648847);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(tg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.d(cVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(str2) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            ie7.e(str2, null, null, cVarH, (i2 >> 12) & 14);
            dVar2 = dVar;
            b(cVar, str, dVar2, !tg2Var.a(), cVarH, (i2 >> 3) & 1022);
            cVar2 = cVar;
            str3 = str;
        } else {
            dVar2 = dVar;
            str3 = str;
            cVar2 = cVar;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new f74(tg2Var, cVar2, str3, dVar2, str2, i);
        }
    }

    public static final void b(final dd9.c cVar, final String str, final dd9.d dVar, final boolean z, b bVar, final int i) {
        int i2;
        boolean z2;
        tjf tjfVar;
        cVar.getClass();
        str.getClass();
        c cVarH = bVar.h(47467869);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(cVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(dVar == null ? -1 : dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            long jC = dVar != null ? c(dVar, o97Var) : c(dd9.d.b, o97Var);
            if (zve.U(str)) {
                z2 = false;
                cVarH.L(1068513413);
            } else {
                cVarH.L(1071442510);
                String strE = new pxc(" +\n").e(str, " \n");
                long j = da2.g;
                long j2 = da2.h;
                wo3 wo3Var = new wo3(jC, jC, jC, j, j2, j2, jC);
                tjf tjfVar2 = tjf.d;
                tjf tjfVarA = tjf.a(tjfVar2, 0L, 0L, null, null, pn5.d, 0L, 0, 0L, null, null, 0, 16777183);
                switch (cVar.ordinal()) {
                    case 0:
                        tjfVar = o97Var.j.h;
                        break;
                    case 1:
                        tjfVar = o97Var.j.g;
                        break;
                    case 2:
                        tjfVar = o97Var.j.f;
                        break;
                    case 3:
                        tjfVar = o97Var.j.e;
                        break;
                    case 4:
                        tjfVar = o97Var.j.d;
                        break;
                    case 5:
                        tjfVar = o97Var.j.c;
                        break;
                    case 6:
                        tjfVar = o97Var.j.b;
                        break;
                    case 7:
                        tjfVar = o97Var.j.a;
                        break;
                    default:
                        l.g();
                        return;
                }
                bp3 bp3Var = new bp3(tjfVar2, tjfVar2, tjfVar2, tjfVar2, tjfVar2, tjfVar2, tjfVar2, tjfVarA, tjfVar2, tjf.a(tjfVar, 0L, 0L, null, null, o97Var.d.a, 0L, 0, 0L, null, null, 0, 16777183), tjfVar2, tjfVar2, tjfVar2);
                e eVarJ = f.j(e.a.b, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                if (z) {
                    eVarJ = f.j(eVarJ, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                }
                z2 = false;
                rd9.a(strE, wo3Var, bp3Var, eVarJ, null, null, null, null, null, null, null, cVarH, 0, 0, 2032);
            }
            cVarH.U(z2);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: e5f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f5f.b(cVar, str, dVar, z, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final long c(dd9.d dVar, o97 o97Var) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            return o97Var.c.a.c;
        }
        if (iOrdinal == 1) {
            return o97Var.c.a.a;
        }
        if (iOrdinal == 2) {
            return o97Var.c.a.b;
        }
        if (iOrdinal == 3) {
            return o97Var.c.a.h.c.a;
        }
        if (iOrdinal == 4) {
            return o97Var.c.a.h.d.a;
        }
        l.g();
        return 0L;
    }
}
