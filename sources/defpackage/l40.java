package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l40 {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.gu5 r28, final defpackage.ah2 r29, androidx.compose.ui.e r30, final kotlin.jvm.functions.Function2 r31, kotlin.jvm.functions.Function2 r32, final kotlin.jvm.functions.Function2 r33, defpackage.dce r34, long r35, long r37, defpackage.o44 r39, androidx.compose.runtime.b r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l40.a(gu5, ah2, androidx.compose.ui.e, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, dce, long, long, o44, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(final gu5 gu5Var, final ah2 ah2Var, final e eVar, final Function2 function2, final Function2 function22, dce dceVar, long j, long j2, final o44 o44Var, b bVar, final int i, final int i2) {
        int i3;
        ah2 ah2Var2;
        e eVar2;
        Function2 function23;
        Function2 function24;
        dce dceVar2;
        long jF;
        long jB;
        final dce dceVar3;
        final long j3;
        final long j4;
        int i4;
        int i5;
        c cVarH = bVar.h(1409209698);
        if ((i & 6) == 0) {
            i3 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ah2Var2 = ah2Var;
            i3 |= cVarH.x(ah2Var2) ? 32 : 16;
        } else {
            ah2Var2 = ah2Var;
        }
        if ((i & 384) == 0) {
            eVar2 = eVar;
            i3 |= cVarH.K(eVar2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            eVar2 = eVar;
        }
        if ((i & 3072) == 0) {
            function23 = function2;
            i3 |= cVarH.x(function23) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            function23 = function2;
        }
        if ((i & 24576) == 0) {
            function24 = function22;
            i3 |= cVarH.x(function24) ? 16384 : 8192;
        } else {
            function24 = function22;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                dceVar2 = dceVar;
                int i6 = cVarH.K(dceVar2) ? 131072 : 65536;
                i3 |= i6;
            } else {
                dceVar2 = dceVar;
            }
            i3 |= i6;
        } else {
            dceVar2 = dceVar;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                jF = j;
                int i7 = cVarH.e(jF) ? 1048576 : 524288;
                i3 |= i7;
            } else {
                jF = j;
            }
            i3 |= i7;
        } else {
            jF = j;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                jB = j2;
                int i8 = cVarH.e(jB) ? 8388608 : 4194304;
                i3 |= i8;
            } else {
                jB = j2;
            }
            i3 |= i8;
        } else {
            jB = j2;
        }
        if ((100663296 & i) == 0) {
            i3 |= cVarH.K(o44Var) ? 67108864 : 33554432;
        }
        int i9 = i3;
        if (cVarH.o(i9 & 1, (38347923 & i3) != 38347922)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                i4 = -29360129;
                if ((i2 & 32) != 0) {
                    dceVar2 = ((ede) cVarH.M(gde.a)).b;
                    i5 = i9 & (-458753);
                } else {
                    i5 = i9;
                }
                if ((i2 & 64) != 0) {
                    jF = ((kb2) cVarH.M(lb2.a)).f();
                    i5 &= -3670017;
                }
                if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                    jB = lb2.b(jF, cVarH);
                    i5 &= i4;
                }
                dce dceVar4 = dceVar2;
                long j5 = jF;
                long j6 = jB;
                cVarH.V();
                z60.a(gu5Var, o44Var, bh2.c(-488319269, new y10(ah2Var2, eVar2, function23, function24, dceVar4, j5, j6), cVarH), cVarH, (i5 & 14) | 384 | (((268435454 & i5) >> 21) & 112), 0);
                dceVar3 = dceVar4;
                j3 = j5;
                j4 = j6;
            } else {
                cVarH.D();
                i5 = (i2 & 32) != 0 ? i9 & (-458753) : i9;
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                }
                i4 = -29360129;
                if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                    i5 &= i4;
                }
                dce dceVar42 = dceVar2;
                long j52 = jF;
                long j62 = jB;
                cVarH.V();
                z60.a(gu5Var, o44Var, bh2.c(-488319269, new y10(ah2Var2, eVar2, function23, function24, dceVar42, j52, j62), cVarH), cVarH, (i5 & 14) | 384 | (((268435454 & i5) >> 21) & 112), 0);
                dceVar3 = dceVar42;
                j3 = j52;
                j4 = j62;
            }
        } else {
            cVarH.D();
            dceVar3 = dceVar2;
            j3 = jF;
            j4 = jB;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: k40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    l40.b(gu5Var, ah2Var, eVar, function2, function22, dceVar3, j3, j4, o44Var, (b) obj, iL, i2);
                    return j6g.a;
                }
            };
        }
    }
}
