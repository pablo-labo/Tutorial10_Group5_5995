package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.o97;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class jr4 {
    public static final void a(final kr4 kr4Var, e eVar, b bVar, int i) {
        c cVarH = bVar.h(94680894);
        int i2 = (cVarH.K(kr4Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Configuration configuration = (Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a);
            final float f = (configuration.screenHeightDp * configuration.densityDpi) / 160.0f;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            e eVarF = g.f(eVar, 1.0f);
            o97.g gVar = o97Var.i;
            o97.a aVar = o97Var.c;
            e eVarI = f.i(eVarF, 24.0f, 8.0f, 24.0f, 4.0f);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                objV2 = new nj(kr4Var, 11);
                cVarH.p(objV2);
            }
            e eVarD = androidx.compose.foundation.b.d(eVarI, false, null, null, (gu5) objV2, 15);
            boolean zC = (i3 == 4) | cVarH.c(f);
            Object objV3 = cVarH.v();
            if (zC || objV3 == c0020a) {
                objV3 = new Function1() { // from class: gr4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        sl8 sl8Var = (sl8) obj;
                        sl8Var.getClass();
                        ra8 ra8Var = i6a.a;
                        if (((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_red_dot_tst").a >= 1) {
                            qtc qtcVarH = ojh.h(sl8Var);
                            if (qtcVarH.b >= 0.0f && qtcVarH.d <= f) {
                                g4a g4aVar2 = g4aVar;
                                if (!((Boolean) g4aVar2.getValue()).booleanValue()) {
                                    g4aVar2.setValue(Boolean.TRUE);
                                    kr4Var.s.invoke();
                                }
                            }
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV3);
            }
            ay1.b(s.a(eVarD, (Function1) objV3), ggd.a(24.0f), wx1.a(aVar.b.a, 0L, 0L, 0L, cVarH, 14), null, ee3.f(aVar.c.b, 1.0f), bh2.c(-2050721104, new hr4(0, o97Var, kr4Var), cVarH), cVarH, 196608, 8);
            cVarH = cVarH;
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new d30(kr4Var, i, 1, eVar);
        }
    }
}
