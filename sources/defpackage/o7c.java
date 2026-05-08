package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import defpackage.ax1;
import defpackage.c20;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o7c {
    public static final dvf<Float> a = zd0.d(300, 0, bf4.c, 2);

    public static final class a extends mj8 implements wu5<ml1, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ boolean $isRefreshing;
        final /* synthetic */ w7c $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w7c w7cVar, boolean z) {
            super(3);
            this.$state = w7cVar;
            this.$isRefreshing = z;
        }

        @Override // defpackage.wu5
        public final j6g q(ml1 ml1Var, androidx.compose.runtime.b bVar, Integer num) {
            ml1 ml1Var2 = ml1Var;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.K(ml1Var2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && bVar2.i()) {
                bVar2.D();
            } else {
                j7c.a.a(this.$state, this.$isRefreshing, ml1Var2.h(e.a.b, c20.a.b), 0L, 0L, 0.0f, bVar2, 1572864, 56);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<ml1, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ c20 $contentAlignment;
        final /* synthetic */ wu5<ml1, androidx.compose.runtime.b, Integer, j6g> $indicator;
        final /* synthetic */ boolean $isRefreshing;
        final /* synthetic */ e $modifier;
        final /* synthetic */ gu5<j6g> $onRefresh;
        final /* synthetic */ w7c $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, gu5<j6g> gu5Var, e eVar, w7c w7cVar, c20 c20Var, wu5<? super ml1, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, wu5<? super ml1, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var2, int i, int i2) {
            super(2);
            this.$isRefreshing = z;
            this.$onRefresh = gu5Var;
            this.$modifier = eVar;
            this.$state = w7cVar;
            this.$contentAlignment = c20Var;
            this.$indicator = wu5Var;
            this.$content = wu5Var2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            o7c.a(this.$isRefreshing, this.$onRefresh, this.$modifier, this.$state, this.$contentAlignment, this.$indicator, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r17, defpackage.gu5<defpackage.j6g> r18, androidx.compose.ui.e r19, defpackage.w7c r20, defpackage.c20 r21, defpackage.wu5<? super defpackage.ml1, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r22, defpackage.wu5<? super defpackage.ml1, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r23, androidx.compose.runtime.b r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7c.a(boolean, gu5, androidx.compose.ui.e, w7c, c20, wu5, wu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(gu5 gu5Var, long j, androidx.compose.runtime.b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-569718810);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.e(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            Object obj = objV;
            if (objV == c0020a) {
                m80 m80VarA = p80.a();
                m80VarA.e(1);
                cVarH.p(m80VarA);
                obj = m80VarA;
            }
            v5b v5bVar = (v5b) obj;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.c(new n7c(gu5Var));
                cVarH.p(objV2);
            }
            ese eseVarB = vc0.b(((Number) ((ese) objV2).getValue()).floatValue(), a, null, cVarH, 48, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objV3 = cVarH.v();
            if (z || objV3 == c0020a) {
                objV3 = new k7c(gu5Var);
                cVarH.p(objV3);
            }
            e eVarN = g.n(b5e.b(e.a.b, true, (Function1) objV3), 16.0f);
            boolean zK = (i3 == 4) | cVarH.K(eseVarB) | ((i2 & 112) == 32) | cVarH.x(v5bVar);
            Object objV4 = cVarH.v();
            if (zK || objV4 == c0020a) {
                l7c l7cVar = new l7c(gu5Var, eseVarB, j, v5bVar);
                cVarH.p(l7cVar);
                objV4 = l7cVar;
            }
            w74.a(eVarN, (Function1) objV4, cVarH, 0);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new m7c(j, i, gu5Var);
        }
    }

    public static final void c(gb4 gb4Var, v5b v5bVar, qtc qtcVar, long j, float f, wt0 wt0Var) {
        v5bVar.reset();
        v5bVar.j(0.0f, 0.0f);
        float fT1 = gb4Var.t1(10.0f);
        float f2 = wt0Var.b;
        v5bVar.n((fT1 * f2) / 2.0f, gb4Var.t1(5.0f) * f2);
        v5bVar.n(gb4Var.t1(10.0f) * f2, 0.0f);
        float fMin = Math.min(qtcVar.c - qtcVar.a, qtcVar.d - qtcVar.b) / 2.0f;
        v5bVar.g(wab.c((Float.intBitsToFloat((int) (qtcVar.b() >> 32)) + fMin) - ((gb4Var.t1(10.0f) * f2) / 2.0f), Float.intBitsToFloat((int) (qtcVar.b() & 4294967295L)) - gb4Var.t1(2.5f)));
        float fT12 = wt0Var.a - gb4Var.t1(2.5f);
        long jF1 = gb4Var.F1();
        ax1.b bVarW1 = gb4Var.w1();
        long jD = bVarW1.d();
        bVarW1.a().o();
        try {
            bVarW1.a.f(jF1, fT12);
            gb4.E0(gb4Var, v5bVar, j, f, new bwe(gb4Var.t1(2.5f), 0.0f, 0, 0, null, 30), 48);
        } finally {
            g7.k(bVarW1, jD);
        }
    }
}
