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
public final class y90 {
    public static final void a(toa toaVar, c20 c20Var, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(toaVar) : cVarH.x(toaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(c20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        boolean z = true;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cVarH.K(toaVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                objV = new kf6(c20Var, toaVar);
                cVarH.p(objV);
            }
            x80.a((kf6) objV, null, new ahb(false, yxd.a, false), ah2Var, cVarH, ((i2 << 3) & 7168) | 384, 2);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new q90(i, 0, toaVar, c20Var, ah2Var);
        }
    }

    public static final void b(final toa toaVar, final boolean z, final b5d b5dVar, final boolean z2, long j, final float f, final e eVar, b bVar, final int i) {
        int i2;
        long j2;
        int i3;
        long j3;
        final boolean z3;
        c cVarH = bVar.h(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(toaVar) : cVarH.x(toaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.d(b5dVar.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= cVarH.K(eVar) ? 1048576 : 524288;
        }
        if (cVarH.o(i2 & 1, (533651 & i2) != 533650)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                cVarH.D();
                i3 = i2 & (-57345);
                j3 = j;
            }
            cVarH.V();
            b5d b5dVar2 = b5d.b;
            b5d b5dVar3 = b5d.a;
            if (z) {
                r5e<s3e> r5eVar = t3e.a;
                z3 = (b5dVar == b5dVar3 && !z2) || (b5dVar == b5dVar2 && z2);
            } else {
                r5e<s3e> r5eVar2 = t3e.a;
                z3 = !((b5dVar == b5dVar3 && !z2) || (b5dVar == b5dVar2 && z2));
            }
            ze1 ze1Var = z3 ? j0.b : j0.a;
            int i4 = i3 & 14;
            boolean zA = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && cVarH.x(toaVar))) | cVarH.a(z3);
            Object objV = cVarH.v();
            if (zA || objV == b.a.a) {
                objV = new Function1() { // from class: r90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        s5e s5eVar = (s5e) obj;
                        long jA = toaVar.a();
                        s5eVar.a(t3e.a, new s3e(z ? jf6.b : jf6.c, jA, z3 ? r3e.a : r3e.c, (9223372034707292159L & jA) != 9205357640488583168L));
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            long j4 = j3;
            ze1 ze1Var2 = ze1Var;
            j2 = j4;
            a(toaVar, ze1Var2, bh2.c(1365123137, new u90((opg) cVarH.M(um2.s), j2, z3, b5e.b(eVar, false, (Function1) objV), toaVar), cVarH), cVarH, i4 | 384);
        } else {
            cVarH.D();
            j2 = j;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final long j5 = j2;
            iVarW.d = new Function2() { // from class: s90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y90.b(toaVar, z, b5dVar, z2, j5, f, eVar, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final int i, final gu5 gu5Var, b bVar, final e eVar, final boolean z) {
        int i2;
        c cVarH = bVar.h(2111672474);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            r5e<s3e> r5eVar = t3e.a;
            jh2.f(cVarH, androidx.compose.ui.c.a(g.o(eVar, 25.0f, 25.0f), tf7.a, new x90(gu5Var, z)));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: p90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y90.c(ka2.L(i | 1), gu5Var, (b) obj, eVar, z);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.m07 d(defpackage.ft1 r28, float r29) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y90.d(ft1, float):m07");
    }
}
