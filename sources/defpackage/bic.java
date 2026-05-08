package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.selection.a;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import defpackage.c20;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bic {
    public static final float a = 20.0f / 2.0f;

    public static final void a(final boolean z, final gu5 gu5Var, e eVar, boolean z2, up3 up3Var, b bVar, final int i) {
        final e eVar2;
        final boolean z3;
        final up3 up3Var2;
        e eVar3;
        up3 up3Var3;
        boolean z4;
        Object objG;
        e eVarA;
        c cVarH = bVar.h(1314435585);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | 93568;
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            cVarH.v0();
            int i3 = i & 1;
            e eVar4 = e.a.b;
            b.a.C0020a c0020a = b.a.a;
            if (i3 == 0 || cVarH.c0()) {
                jte jteVar = lb2.a;
                long jE = ((kb2) cVarH.M(jteVar)).e();
                long jB = da2.b(((kb2) cVarH.M(jteVar)).c(), 0.6f);
                long jC = ((kb2) cVarH.M(jteVar)).c();
                long j = ((da2) cVarH.M(ps2.a)).a;
                if (((kb2) cVarH.M(jteVar)).g()) {
                    pnb.J(j);
                } else {
                    pnb.J(j);
                }
                long jB2 = da2.b(jC, 0.38f);
                boolean zE = cVarH.e(jE) | cVarH.e(jB) | cVarH.e(jB2);
                Object objV = cVarH.v();
                if (zE || objV == c0020a) {
                    up3 up3Var4 = new up3(jE, jB, jB2);
                    cVarH.p(up3Var4);
                    objV = up3Var4;
                }
                eVar3 = eVar4;
                up3Var3 = (up3) objV;
                z4 = true;
            } else {
                cVarH.D();
                eVar3 = eVar;
                z4 = z2;
                up3Var3 = up3Var;
            }
            cVarH.V();
            ese eseVarA = vc0.a(z ? 6.0f : 0.0f, zd0.d(100, 0, null, 6), cVarH, 48);
            up3Var3.getClass();
            cVarH.L(1243421834);
            long j2 = !z4 ? up3Var3.c : !z ? up3Var3.b : up3Var3.a;
            if (z4) {
                cVarH.L(-1312642667);
                objG = vhe.a(j2, zd0.d(100, 0, null, 6), null, cVarH, 48, 12);
                cVarH.F();
            } else {
                cVarH.L(-1312539964);
                objG = r.g(new da2(j2), cVarH);
                cVarH.F();
            }
            Object obj = objG;
            cVarH.F();
            if (gu5Var != null) {
                z3 = z4;
                eVarA = a.a(eVar4, z, null, sdd.a(0L, 4, 24.0f), z3, new qed(3), gu5Var);
            } else {
                z3 = z4;
                eVarA = eVar4;
            }
            if (gu5Var != null) {
                jte jteVar2 = gi7.a;
                eVar4 = MinimumInteractiveModifier.b;
            }
            e eVarL = g.l(f.f(g.v(eVar3.o(eVar4).o(eVarA), c20.a.e, 2), 2.0f), 20.0f);
            boolean zK = cVarH.K(obj) | cVarH.K(eseVarA);
            Object objV2 = cVarH.v();
            if (zK || objV2 == c0020a) {
                objV2 = new mz4(5, obj, eseVarA);
                cVarH.p(objV2);
            }
            w74.a(eVarL, (Function1) objV2, cVarH, 0);
            eVar2 = eVar3;
            up3Var2 = up3Var3;
        } else {
            cVarH.D();
            eVar2 = eVar;
            z3 = z2;
            up3Var2 = up3Var;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, gu5Var, eVar2, z3, up3Var2, i) { // from class: zhc
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ e c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ up3 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = ka2.L(1);
                    bic.a(this.a, this.b, this.c, this.d, this.e, (b) obj2, iL);
                    return j6g.a;
                }
            };
        }
    }
}
