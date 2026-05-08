package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.d0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pmd {
    public static final jte a = new jte(new oz0(15));
    public static final float b = 16.0f;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r28, defpackage.smd r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function2 r31, defpackage.wu5 r32, kotlin.jvm.functions.Function2 r33, int r34, boolean r35, defpackage.dce r36, float r37, long r38, long r40, long r42, long r44, long r46, final defpackage.ah2 r48, androidx.compose.runtime.b r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmd.a(androidx.compose.ui.e, smd, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, wu5, kotlin.jvm.functions.Function2, int, boolean, dce, float, long, long, long, long, long, ah2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(final kg5 kg5Var, e eVar, final smd smdVar, final Function2 function2, final Function2 function22, final wu5 wu5Var, final Function2 function23, final int i, final boolean z, final dce dceVar, final float f, final long j, final long j2, final long j3, final long j4, final long j5, final ah2 ah2Var, b bVar, final int i2, final int i3) {
        int i4;
        Function2 function24;
        int i5;
        c cVar;
        final e eVar2;
        c cVarH = bVar.h(50073903);
        if ((i2 & 6) == 0) {
            i4 = (cVarH.K(kg5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= cVarH.K(smdVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 3072) == 0) {
            function24 = function2;
            i4 |= cVarH.x(function24) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            function24 = function2;
        }
        if ((i2 & 24576) == 0) {
            i4 |= cVarH.x(function22) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= cVarH.x(wu5Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= cVarH.x(function23) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= cVarH.d(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= cVarH.a(false) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= cVarH.x(null) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = (cVarH.a(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= cVarH.K(dceVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= cVarH.c(f) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i3 & 3072) == 0) {
            i5 |= cVarH.e(j) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i3 & 24576) == 0) {
            i5 |= cVarH.e(j2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= cVarH.e(j3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= cVarH.e(j4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= cVarH.e(j5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= cVarH.x(ah2Var) ? 67108864 : 33554432;
        }
        if (cVarH.o(i6 & 1, ((i6 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            cVarH.v0();
            if ((i2 & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            boolean z2 = (i6 & 14) == 4;
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                objV = new m4a(kg5Var);
                cVarH.p(objV);
            }
            cVar = cVarH;
            ah2 ah2VarC = bh2.c(-1236753028, new gmd((m4a) objV, kg5Var, j4, j5, i, function24, ah2Var, function23, function22, wu5Var, smdVar), cVar);
            cVar.L(1400751284);
            eVar2 = eVar;
            ah2VarC.q(eVar2, cVar, Integer.valueOf(((i6 >> 3) & 14) | 48));
            cVar.U(false);
        } else {
            cVar = cVarH;
            eVar2 = eVar;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: amd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i2 | 1);
                    int iL2 = ka2.L(i3);
                    pmd.b(kg5Var, eVar2, smdVar, function2, function22, wu5Var, function23, i, z, dceVar, f, j, j2, j3, j4, j5, ah2Var, (b) obj, iL, iL2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final int i, final Function2 function2, final ah2 ah2Var, final ah2 ah2Var2, final Function2 function22, final mzg mzgVar, final Function2 function23, b bVar, int i2) {
        c cVarH = bVar.h(675142332);
        int i3 = i2 | (cVarH.a(false) ? 4 : 2) | (cVarH.d(i) ? 32 : 16) | (cVarH.x(function2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(ah2Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(function22) ? 131072 : 65536) | (cVarH.K(mzgVar) ? 1048576 : 524288) | (cVarH.x(function23) ? 8388608 : 4194304);
        if (cVarH.o(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new omd();
                cVarH.p(objV);
            }
            final omd omdVar = (omd) objV;
            boolean z = ((i3 & 896) == 256) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                Function2 function24 = new Function2() { // from class: bmd
                    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
                        /*
                            Method dump skipped, instruction units count: 915
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmd.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                cVarH.p(function24);
                objV2 = function24;
            }
            d0.a(null, (Function2) objV2, cVarH, 0, 1);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new lq0(i, function2, ah2Var, ah2Var2, function22, mzgVar, function23, i2);
        }
    }
}
