package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ytc;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 {
    public static final e a;
    public static final e b;
    public static final kg5 c;

    static {
        e.a aVar = e.a.b;
        a = g.r(aVar, 12.0f);
        b = g.r(g.c(aVar, 1.0f), 68.0f);
        c = hwf.a(0.0f, 0.0f, 14);
    }

    public static final void a(final long j, final long j2, final float f, final gza gzaVar, final mzg mzgVar, final e eVar, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        e eVar2;
        c cVar;
        c cVarH = bVar.h(1222317265);
        if ((i & 6) == 0) {
            i2 = (cVarH.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.c(f) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(gzaVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i3 = i & 24576;
        ytc.a aVar = ytc.a;
        if (i3 == 0) {
            i2 |= cVarH.K(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.K(mzgVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            eVar2 = eVar;
            i2 |= cVarH.K(eVar2) ? 1048576 : 524288;
        } else {
            eVar2 = eVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.x(ah2Var) ? 8388608 : 4194304;
        }
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            int i4 = i2 << 6;
            cVar = cVarH;
            m0f.a(eVar2, aVar, j, j2, null, f, bh2.c(-1628734195, new bi0(mzgVar, gzaVar, ah2Var), cVarH), cVar, 1572864 | ((i2 >> 18) & 14) | ((i2 >> 9) & 112) | (i4 & 896) | (i4 & 7168) | ((i2 << 9) & 458752), 16);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: zh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ri0.a(j, j2, f, gzaVar, mzgVar, eVar, ah2Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final mzg mzgVar, final e eVar, final Function2 function2, final ah2 ah2Var, final long j, final long j2, final float f, b bVar, final int i) {
        int i2;
        mzg mzgVar2;
        e eVar2;
        c cVar;
        ah2 ah2Var2 = yid.a;
        c cVarH = bVar.h(138090236);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(ah2Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mzgVar2 = mzgVar;
            i2 |= cVarH.K(mzgVar2) ? 32 : 16;
        } else {
            mzgVar2 = mzgVar;
        }
        if ((i & 384) == 0) {
            eVar2 = eVar;
            i2 |= cVarH.K(eVar2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            eVar2 = eVar;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(ah2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.e(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.c(f) ? 8388608 : 4194304;
        }
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            int i3 = i2 >> 15;
            int i4 = i2 << 12;
            cVar = cVarH;
            a(j, j2, f, wh0.a, mzgVar2, eVar2, bh2.c(-2019867954, new li0(function2, ah2Var), cVarH), cVar, (i3 & 896) | (i3 & 14) | 12610560 | (i3 & 112) | (458752 & i4) | (i4 & 3670016));
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: yh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ri0.b(mzgVar, eVar, function2, ah2Var, j, j2, f, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final e eVar, final Function2 function2, final ah2 ah2Var, final long j, long j2, final float f, b bVar, final int i) {
        final long jB;
        int i2;
        c cVarH = bVar.h(-350082398);
        int i3 = i | (cVarH.K(eVar) ? 32 : 16) | (cVarH.e(j) ? 16384 : 8192) | 65536;
        if (cVarH.o(i3 & 1, (599187 & i3) != 599186)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                jB = lb2.b(j, cVarH);
                i2 = i3 & (-458753);
            } else {
                cVarH.D();
                i2 = i3 & (-458753);
                jB = j2;
            }
            cVarH.V();
            int i4 = i2 << 3;
            b(c, eVar, function2, ah2Var, j, jB, f, cVarH, (i4 & 458752) | (i4 & 896) | 27702 | 12582912);
        } else {
            cVarH.D();
            jB = j2;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(function2, ah2Var, j, jB, f, i) { // from class: xh0
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ ah2 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ float f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1576327);
                    ri0.c(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
