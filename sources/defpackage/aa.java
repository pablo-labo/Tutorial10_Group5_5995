package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o97;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class aa {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final s9 s9Var, e eVar, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, Function1 function1, b bVar, int i) {
        boolean z;
        c cVarH = bVar.h(1617982709);
        int i2 = i | (cVarH.x(s9Var) ? 4 : 2) | (cVarH.K(eVar) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var3) ? 16384 : 8192) | (cVarH.x(function1) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.TRUE);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            final Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            final o97 o97Var = (o97) cVarH.M(p97.a);
            if (((Boolean) g4aVar.getValue()).booleanValue()) {
                cVarH.L(-1094299413);
                e eVarO = eVar.o(g.u(e.a.b, 3));
                boolean z2 = (458752 & i2) == 131072;
                Object objV2 = cVarH.v();
                if (z2 || objV2 == c0020a) {
                    objV2 = new t9(function1, 0);
                    cVarH.p(objV2);
                }
                e eVarA = s.a(eVarO, (Function1) objV2);
                o97.f fVar = o97Var.h;
                o97.a aVar = o97Var.c;
                fgd fgdVarA = ggd.a(fVar.b);
                bj1 bj1VarF = ee3.f(aVar.c.b, 1.0f);
                o97.a.C0340a c0340a = aVar.b;
                long j = c0340a.a;
                o97.a.e eVar2 = aVar.a;
                z = false;
                ux1 ux1VarA = wx1.a(j, eVar2.c, c0340a.d, eVar2.a, cVarH, 0);
                cVarH = cVarH;
                boolean z3 = (i2 & 7168) == 2048;
                Object objV3 = cVarH.v();
                if (z3 || objV3 == c0020a) {
                    objV3 = new u9(0, gu5Var2);
                    cVarH.p(objV3);
                }
                ay1.a((gu5) objV3, eVarA, false, fgdVarA, ux1VarA, null, bj1VarF, null, bh2.c(-403531675, new wu5() { // from class: v9
                    /* JADX WARN: Removed duplicated region for block: B:202:0x09e0  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
                    @Override // defpackage.wu5
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object q(java.lang.Object r67, java.lang.Object r68, java.lang.Object r69) {
                        /*
                            Method dump skipped, instruction units count: 2542
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, cVarH), cVarH, 100663296, 164);
            } else {
                z = false;
                cVarH.L(-1097289363);
            }
            cVarH.U(z);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new w9(s9Var, eVar, gu5Var, gu5Var2, gu5Var3, function1, i);
        }
    }
}
