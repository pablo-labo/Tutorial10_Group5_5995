package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nff {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ihf ihfVar, final String str, final Function2 function2, final ftg ftgVar, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final boolean z, final ei7 ei7Var, final gza gzaVar, final dce dceVar, final ar3 ar3Var, final Function2 function26, b bVar, final int i, final int i2) {
        int i3;
        Function2 function27;
        int i4;
        Function2 function28;
        int i5;
        c cVar;
        boolean z2;
        long j;
        boolean z3;
        c cVarH = bVar.h(418608794);
        if ((i & 6) == 0) {
            i3 = (cVarH.d(ihfVar.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.K(str) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i6 == 0) {
            function27 = function2;
            i3 |= cVarH.x(function27) ? 256 : 128;
        } else {
            function27 = function2;
        }
        int i8 = i & 3072;
        int i9 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i8 == 0) {
            i3 |= cVarH.K(ftgVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cVarH.x(function22) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            function28 = function23;
            i3 |= cVarH.x(function28) ? 131072 : 65536;
        } else {
            i4 = 196608;
            function28 = function23;
        }
        if ((i & 1572864) == 0) {
            i3 |= cVarH.x(function24) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= cVarH.x(function25) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= cVarH.a(false) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= cVarH.a(z) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (cVarH.a(false) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cVarH.K(ei7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (cVarH.K(gzaVar)) {
                i7 = 256;
            }
            i5 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (cVarH.K(dceVar)) {
                i9 = 2048;
            }
            i5 |= i9;
        }
        if ((i2 & 24576) == 0) {
            i5 |= cVarH.K(ar3Var) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= cVarH.x(function26) ? 131072 : 65536;
        }
        if (cVarH.o(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objV = cVarH.v();
            if (z4 || objV == b.a.a) {
                objV = ftgVar.a(new le0(str));
                cVarH.p(objV);
            }
            String str2 = ((vrf) objV).a.b;
            ff7 ff7Var = ((Boolean) wg2.p(ei7Var, cVarH, (i5 >> 3) & 14).getValue()).booleanValue() ? ff7.a : str2.length() == 0 ? ff7.b : ff7.c;
            bff bffVar = new bff(ar3Var, z, ei7Var);
            jte jteVar = rzf.b;
            nzf nzfVar = (nzf) cVarH.M(jteVar);
            tjf tjfVar = nzfVar.g;
            tjf tjfVar2 = nzfVar.l;
            long jB = tjfVar.b();
            long j2 = da2.i;
            boolean z5 = (da2.c(jB, j2) && !da2.c(tjfVar2.b(), j2)) || (!da2.c(tjfVar.b(), j2) && da2.c(tjfVar2.b(), j2));
            cVarH.L(-1443811635);
            long jB2 = ((nzf) cVarH.M(jteVar)).l.b();
            if (z5) {
                j = 16;
                cVarH.L(-887928539);
                if (jB2 == 16) {
                    jB2 = ((da2) bffVar.q(ff7Var, cVarH, 0)).a;
                }
                z2 = false;
                cVarH.U(false);
            } else {
                z2 = false;
                j = 16;
                cVarH.L(1218284988);
                cVarH.U(false);
            }
            cVarH.U(z2);
            cVarH.L(-1443804369);
            long jB3 = ((nzf) cVarH.M(jteVar)).g.b();
            if (z5) {
                cVarH.L(-1026713946);
                if (jB3 == j) {
                    jB3 = ((da2) bffVar.q(ff7Var, cVarH, 0)).a;
                }
                z3 = false;
                cVarH.U(false);
            } else {
                z3 = false;
                cVarH.L(798166043);
                cVarH.U(false);
            }
            long j3 = jB3;
            cVarH.U(z3);
            if (function22 != null) {
                z3 = true;
            }
            ff7 ff7Var2 = ff7Var;
            cVar = cVarH;
            ghf.a.a(ff7Var2, jB2, j3, bffVar, z3, bh2.c(33336375, new aff(function22, function28, str2, ar3Var, z, ei7Var, function24, function25, dceVar, ihfVar, function27, gzaVar, z5, function26), cVar), cVar, 1769472);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: nef
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    int iL2 = ka2.L(i2);
                    nff.a(ihfVar, str, function2, ftgVar, function22, function23, function24, function25, z, ei7Var, gzaVar, dceVar, ar3Var, function26, (b) obj, iL, iL2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final long j, tjf tjfVar, final Function2 function2, b bVar, final int i, final int i2) {
        int i3;
        c cVarH = bVar.h(2064632657);
        int i4 = (cVarH.e(j) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (cVarH.K(tjfVar) ? 32 : 16);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.K(null) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        int i6 = i3 | (cVarH.x(function2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                tjfVar = null;
            }
            ah2 ah2VarC = bh2.c(-650790565, new eff(j, null, function2), cVarH);
            if (tjfVar != null) {
                cVarH.L(-162878945);
                fif.a(tjfVar, ah2VarC, cVarH, ((i6 >> 3) & 14) | 48);
            } else {
                cVarH.L(-162877309);
                ah2VarC.invoke(cVarH, 6);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        final tjf tjfVar2 = tjfVar;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: oef
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nff.b(j, tjfVar2, function2, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    public static final Object c(pl7 pl7Var) {
        Object objG = pl7Var.g();
        am8 am8Var = objG instanceof am8 ? (am8) objG : null;
        if (am8Var != null) {
            return am8Var.V0();
        }
        return null;
    }
}
