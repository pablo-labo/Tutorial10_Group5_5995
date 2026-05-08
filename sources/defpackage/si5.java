package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class si5 {
    public static final void a(final gu5 gu5Var, e eVar, dce dceVar, long j, long j2, pn3 pn3Var, b bVar, final int i) {
        final e eVar2;
        final dce dceVar2;
        final long jE;
        final long jB;
        final pn3 pn3VarR;
        dce dceVarB;
        int i2;
        e eVar3;
        ah2 ah2Var = xj2.a;
        c cVarH = bVar.h(-1506973027);
        int i3 = i | (cVarH.x(gu5Var) ? 32 : 16) | 38366592;
        if (cVarH.o(i3 & 1, (38347923 & i3) != 38347922)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                p03 p03Var = ((ede) cVarH.M(gde.a)).a;
                y7b y7bVar = new y7b(50.0f);
                dceVarB = p03Var.b(y7bVar, y7bVar, y7bVar, y7bVar);
                jE = ((kb2) cVarH.M(lb2.a)).e();
                jB = lb2.b(jE, cVarH);
                pn3VarR = pg8.r(cVarH);
                i2 = i3 & (-268369921);
                eVar3 = e.a.b;
            } else {
                cVarH.D();
                i2 = i3 & (-268369921);
                eVar3 = eVar;
                dceVarB = dceVar;
                jE = j;
                jB = j2;
                pn3VarR = pn3Var;
            }
            cVarH.V();
            e eVar4 = eVar3;
            dceVar2 = dceVarB;
            b(gu5Var, g.q(eVar4, 48.0f, 48.0f, 0.0f, 0.0f, 12), dceVar2, jE, jB, pn3VarR, bh2.c(-555697957, new oi5(), cVarH), cVarH, 12583296 | ((i2 >> 3) & 14));
            eVar2 = eVar4;
        } else {
            cVarH.D();
            eVar2 = eVar;
            dceVar2 = dceVar;
            jE = j;
            jB = j2;
            pn3VarR = pn3Var;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var, eVar2, dceVar2, jE, jB, pn3VarR, i) { // from class: mi5
                public final /* synthetic */ gu5 a;
                public final /* synthetic */ e b;
                public final /* synthetic */ dce c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ pn3 f;

                {
                    ah2 ah2Var2 = xj2.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ah2 ah2Var2 = xj2.a;
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(7);
                    si5.a(this.a, this.b, this.c, this.d, this.e, this.f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final gu5 gu5Var, final e eVar, final dce dceVar, final long j, final long j2, final pn3 pn3Var, final ah2 ah2Var, b bVar, final int i) {
        int i2;
        c cVarH = bVar.h(-482679837);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(null) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.K(dceVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.e(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.e(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(pn3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= cVarH.x(ah2Var) ? 8388608 : 4194304;
        }
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            cVarH.L(36083320);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV;
            cVarH.U(false);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new tr(6);
                cVarH.p(objV2);
            }
            e eVarB = b5e.b(eVar, false, (Function1) objV2);
            int i3 = (i2 >> 15) & 112;
            pn3Var.getClass();
            cVarH.L(-478475335);
            int i4 = (i3 & 14) ^ 6;
            boolean z = (i4 > 4 && cVarH.K(d3aVar)) || (i3 & 6) == 4;
            Object objV3 = cVarH.v();
            if (z || objV3 == c0020a) {
                objV3 = new ki5();
                cVarH.p(objV3);
            }
            ki5 ki5Var = (ki5) objV3;
            boolean zX = cVarH.x(ki5Var) | ((((i3 & 112) ^ 48) > 32 && cVarH.K(pn3Var)) || (i3 & 48) == 32);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a) {
                objV4 = new mn3(ki5Var, pn3Var, null);
                cVarH.p(objV4);
            }
            to4.d(cVarH, pn3Var, (Function2) objV4);
            boolean zX2 = cVarH.x(ki5Var) | ((i4 > 4 && cVarH.K(d3aVar)) || (i3 & 6) == 4);
            Object objV5 = cVarH.v();
            if (zX2 || objV5 == c0020a) {
                objV5 = new on3(d3aVar, ki5Var, null);
                cVarH.p(objV5);
            }
            to4.d(cVarH, d3aVar, (Function2) objV5);
            ese eseVar = ki5Var.a.c;
            cVarH.F();
            m0f.b(((j94) eseVar.getValue()).a, (i2 & 458752) | 805306368 | (i2 & 14) | (i2 & 7168) | (57344 & i2), 68, j, j2, null, bh2.c(-1823447062, new ri5(j2, ah2Var), cVarH), gu5Var, d3aVar, dceVar, cVarH, eVarB, false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ni5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    si5.b(gu5Var, eVar, dceVar, j, j2, pn3Var, ah2Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
