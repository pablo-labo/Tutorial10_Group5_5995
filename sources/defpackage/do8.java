package defpackage;

import androidx.compose.foundation.f;
import androidx.compose.foundation.lazy.layout.a;
import androidx.compose.foundation.lazy.layout.h;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.vs0;
import defpackage.vte;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class do8 {
    public static final void a(final e eVar, so8 so8Var, final mo8 mo8Var, final gza gzaVar, final nh5 nh5Var, final boolean z, final nxa nxaVar, final vs0.l lVar, final vs0.e eVar2, final Function1 function1, b bVar, final int i, final int i2) {
        int i3;
        int i4;
        final so8 so8Var2;
        c cVar;
        int i5;
        boolean z2;
        boolean z3;
        so8 so8Var3;
        rf8 rf8Var;
        boolean z4;
        e eVarA;
        c cVarH = bVar.h(708740370);
        if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.K(so8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? cVarH.K(mo8Var) : cVarH.x(mo8Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i3 |= cVarH.K(gzaVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i3 |= cVarH.a(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= cVarH.a(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= cVarH.K(nh5Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= cVarH.a(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= cVarH.K(nxaVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= cVarH.K(lVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (cVarH.K(eVar2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cVarH.x(function1) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            int i6 = i3 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | (i4 & 112);
            g4a g4aVarG = r.g(function1, cVarH);
            boolean z5 = (((i8 & 14) ^ 6) > 4 && cVarH.K(so8Var)) || (i8 & 6) == 4;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z5 || objV == c0020a) {
                wg2 wg2Var = wg2.Z;
                i5 = i3;
                objV = new vn8(0, r.d(new x9(9, r.d(new gd1(4, g4aVarG), wg2Var), so8Var), wg2Var), ese.class, "value", "getValue()Ljava/lang/Object;", 0);
                cVarH.p(objV);
            } else {
                i5 = i3;
            }
            rf8 rf8Var2 = (rf8) objV;
            int i9 = i7 | ((i5 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && cVarH.K(so8Var)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && cVarH.a(false)) || (i9 & 48) == 32);
            Object objV2 = cVarH.v();
            if (z6 || objV2 == c0020a) {
                objV2 = new jt8(so8Var);
                cVarH.p(objV2);
            }
            jt8 jt8Var = (jt8) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                m74 m74Var = to4.a;
                objV3 = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV3;
            wc6 wc6Var = (wc6) cVarH.M(um2.g);
            vte.a.C0462a c0462a = !((Boolean) cVarH.M(um2.v)).booleanValue() ? vte.a.a : null;
            int i10 = (i5 & 524272) | ((i4 << 18) & 3670016) | ((i5 >> 6) & 29360128);
            boolean zK = ((((458752 & i10) ^ 196608) > 131072 && cVarH.a(true)) || (i10 & 196608) == 131072) | ((((i10 & 112) ^ 48) > 32 && cVarH.K(so8Var)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && cVarH.K(mo8Var)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && cVarH.K(gzaVar)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && cVarH.a(false)) || (i10 & 24576) == 16384) | ((((i10 & 3670016) ^ 1572864) > 1048576 && cVarH.K(eVar2)) || (i10 & 1572864) == 1048576) | ((((i10 & 29360128) ^ 12582912) > 8388608 && cVarH.K(lVar)) || (i10 & 12582912) == 8388608) | cVarH.K(wc6Var);
            Object objV4 = cVarH.v();
            if (zK || objV4 == c0020a) {
                z2 = false;
                z3 = true;
                objV4 = new co8(so8Var, gzaVar, rf8Var2, mo8Var, lVar, eVar2, e13Var, wc6Var, c0462a);
                so8Var3 = so8Var;
                rf8Var = rf8Var2;
                cVarH.p(objV4);
            } else {
                so8Var3 = so8Var;
                rf8Var = rf8Var2;
                z2 = false;
                z3 = true;
            }
            zq8 zq8Var = (zq8) objV4;
            dwa dwaVar = dwa.a;
            if (z) {
                cVarH.L(27343139);
                boolean z7 = (((i7 ^ 6) <= 4 || !cVarH.K(so8Var3)) && (i6 & 6) != 4) ? z2 : z3;
                Object objV5 = cVarH.v();
                if (z7 || objV5 == c0020a) {
                    objV5 = new ln8(so8Var3);
                    cVarH.p(objV5);
                }
                z4 = false;
                eVarA = a.a((ln8) objV5, so8Var3.n, false, dwaVar);
                cVarH.U(z2);
            } else {
                z4 = false;
                cVarH.L(27639344);
                cVarH.U(z2);
                eVarA = e.a.b;
            }
            boolean z8 = z4;
            rf8 rf8Var3 = rf8Var;
            e eVarO = h.a(eVar.o(so8Var3.k).o(so8Var3.l), rf8Var, jt8Var, dwaVar, z, z8).o(eVarA).o(so8Var3.m.k);
            so8 so8Var4 = so8Var3;
            e eVarA2 = f.a(eVarO, so8Var4, dwaVar, z, z8, nh5Var, so8Var4.f, false, nxaVar, null);
            so8Var2 = so8Var4;
            cVar = cVarH;
            yq8.a(rf8Var3, eVarA2, so8Var2.o, zq8Var, cVar, 0);
        } else {
            so8Var2 = so8Var;
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: zn8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    do8.a(eVar, so8Var2, mo8Var, gzaVar, nh5Var, z, nxaVar, lVar, eVar2, function1, (b) obj, ka2.L(i | 1), ka2.L(i2));
                    return j6g.a;
                }
            };
        }
    }
}
