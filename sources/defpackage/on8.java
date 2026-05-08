package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.jd6;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class on8 {
    public static final void a(final jd6.a aVar, final e eVar, so8 so8Var, gza gzaVar, final vs0.l lVar, final vs0.e eVar2, nh5 nh5Var, boolean z, nxa nxaVar, final Function1 function1, b bVar, final int i) {
        final so8 so8Var2;
        final gza gzaVar2;
        final nh5 nh5Var2;
        final boolean z2;
        final nxa nxaVar2;
        so8 so8Var3;
        nh5 nh5Var3;
        int i2;
        nxa nxaVarA;
        gza gzaVar3;
        int i3;
        boolean z3;
        c cVarH = bVar.h(-2072102870);
        int i4 = i | (cVarH.K(aVar) ? 4 : 2) | (cVarH.K(eVar) ? 32 : 16) | 27776 | (cVarH.K(lVar) ? 131072 : 65536) | (cVarH.K(eVar2) ? 1048576 : 524288) | 373293056;
        int i5 = cVarH.x(function1) ? 4 : 2;
        if (cVarH.o(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            cVarH.v0();
            int i6 = i & 1;
            b.a.C0020a c0020a = b.a.a;
            if (i6 == 0 || cVarH.c0()) {
                go8 go8Var = uo8.a;
                Object[] objArr = new Object[0];
                ko2 ko2Var = so8.w;
                boolean zD = cVarH.d(0) | cVarH.d(0);
                Object objV = cVarH.v();
                if (zD || objV == c0020a) {
                    objV = new cn0(11);
                    cVarH.p(objV);
                }
                so8Var3 = (so8) ypd.N(objArr, ko2Var, (gu5) objV, cVarH, 0);
                hza hzaVar = new hza(0.0f, 0.0f, 0.0f, 0.0f);
                yi3 yi3VarA = ope.a(cVarH);
                boolean zK = cVarH.K(yi3VarA);
                Object objV2 = cVarH.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new ln3(yi3VarA);
                    cVarH.p(objV2);
                }
                nh5Var3 = (ln3) objV2;
                i2 = i5;
                nxaVarA = pxa.a(cVarH);
                gzaVar3 = hzaVar;
                i3 = i4 & (-1908409217);
                z3 = true;
            } else {
                cVarH.D();
                so8Var3 = so8Var;
                gzaVar3 = gzaVar;
                nh5Var3 = nh5Var;
                i3 = i4 & (-1908409217);
                i2 = i5;
                z3 = z;
                nxaVarA = nxaVar;
            }
            cVarH.V();
            int i7 = (i3 & 14) | ((i3 >> 15) & 112);
            boolean z4 = z3;
            boolean z5 = ((((i7 & 14) ^ 6) > 4 && cVarH.K(aVar)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && cVarH.K(eVar2)) || (i7 & 48) == 32);
            Object objV3 = cVarH.v();
            if (z5 || objV3 == c0020a) {
                objV3 = new md6(new nn8(0, aVar, eVar2));
                cVarH.p(objV3);
            }
            so8Var2 = so8Var3;
            nh5 nh5Var4 = nh5Var3;
            do8.a(eVar, so8Var2, (mo8) objV3, gzaVar3, nh5Var4, z4, nxaVarA, lVar, eVar2, function1, cVarH, ((i3 >> 3) & 14) | 12807168 | ((i3 << 12) & 1879048192), ((i3 >> 18) & 14) | ((i2 << 3) & 112));
            gzaVar2 = gzaVar3;
            nxaVar2 = nxaVarA;
            z2 = z4;
            nh5Var2 = nh5Var4;
        } else {
            cVarH.D();
            so8Var2 = so8Var;
            gzaVar2 = gzaVar;
            nh5Var2 = nh5Var;
            z2 = z;
            nxaVar2 = nxaVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(eVar, so8Var2, gzaVar2, lVar, eVar2, nh5Var2, z2, nxaVar2, function1, i) { // from class: mn8
                public final /* synthetic */ nh5 V;
                public final /* synthetic */ boolean W;
                public final /* synthetic */ nxa X;
                public final /* synthetic */ Function1 Y;
                public final /* synthetic */ e b;
                public final /* synthetic */ so8 c;
                public final /* synthetic */ gza d;
                public final /* synthetic */ vs0.l e;
                public final /* synthetic */ vs0.e f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    on8.a(this.a, this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
