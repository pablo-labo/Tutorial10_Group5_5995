package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class v32 {
    public static final void a(final boolean z, final Function1 function1, final e eVar, boolean z2, gm3 gm3Var, b bVar, final int i) {
        final boolean z3;
        final gm3 gm3Var2;
        gm3 gm3VarI;
        int i2;
        boolean z4;
        c cVarH = bVar.h(-2118660998);
        int i3 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16) | 93184;
        if (cVarH.o(i3 & 1, (74899 & i3) != 74898)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                gm3VarI = jh2.i(cVarH);
                i2 = i3 & (-458753);
                z4 = true;
            } else {
                cVarH.D();
                i2 = i3 & (-458753);
                z4 = z2;
                gm3VarI = gm3Var;
            }
            cVarH.V();
            inf infVar = z ? inf.a : inf.b;
            cVarH.L(1809984331);
            boolean z5 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objV = cVarH.v();
            if (z5 || objV == b.a.a) {
                objV = new gu5() { // from class: p32
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        function1.invoke(Boolean.valueOf(!z));
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            cVarH.U(false);
            gm3 gm3Var3 = gm3VarI;
            c(infVar, (gu5) objV, eVar, z4, gm3Var3, cVarH, 28032);
            z3 = z4;
            gm3Var2 = gm3Var3;
        } else {
            cVarH.D();
            z3 = z2;
            gm3Var2 = gm3Var;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, function1, eVar, z3, gm3Var2, i) { // from class: q32
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ e c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gm3 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(385);
                    v32.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /* JADX WARN: Type inference failed for: r22v2, types: [ese] */
    /* JADX WARN: Type inference failed for: r23v0, types: [ese] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r33, final defpackage.inf r34, final androidx.compose.ui.e r35, final defpackage.gm3 r36, androidx.compose.runtime.b r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v32.b(boolean, inf, androidx.compose.ui.e, gm3, androidx.compose.runtime.b, int):void");
    }

    public static final void c(final inf infVar, final gu5 gu5Var, final e eVar, final boolean z, final gm3 gm3Var, b bVar, final int i) {
        int i2;
        boolean z2;
        c cVarH = bVar.h(2031255194);
        if ((i & 6) == 0) {
            i2 = (cVarH.d(infVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= cVarH.a(z2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.K(gm3Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (cVarH.o(i3 & 1, (74899 & i3) != 74898)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            e eVar2 = e.a.b;
            e eVarB = gu5Var != null ? androidx.compose.foundation.selection.c.b(infVar, null, sdd.a(0L, 4, 24.0f), z2, new qed(1), gu5Var) : eVar2;
            if (gu5Var != null) {
                jte jteVar = gi7.a;
                eVar2 = MinimumInteractiveModifier.b;
            }
            b(z, infVar, f.f(eVar.o(eVar2).o(eVarB), 2.0f), gm3Var, cVarH, ((i3 >> 9) & 14) | ((i3 << 3) & 112) | ((i3 >> 6) & 7168));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: r32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v32.c(infVar, gu5Var, eVar, z, gm3Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
