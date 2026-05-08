package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vw6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sl4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.vsb r26, final kotlin.jvm.functions.Function1<? super defpackage.zt9, defpackage.j6g> r27, final defpackage.gu5<defpackage.j6g> r28, final defpackage.gu5<defpackage.j6g> r29, final defpackage.gu5<defpackage.j6g> r30, final defpackage.b5g r31, androidx.compose.runtime.b r32, int r33) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl4.a(vsb, kotlin.jvm.functions.Function1, gu5, gu5, gu5, b5g, androidx.compose.runtime.b, int):void");
    }

    public static final void b(final double d, final vsb vsbVar, final f68 f68Var, final Function1<? super zt9, j6g> function1, b bVar, final int i) {
        boolean z;
        c cVarH = bVar.h(-213956719);
        Object objG0 = cVarH.g0();
        if ((objG0 instanceof Double) && d == ((Number) objG0).doubleValue()) {
            z = false;
        } else {
            cVarH.D0(Double.valueOf(d));
            z = true;
        }
        int i2 = i | (z ? 4 : 2) | (cVarH.x(vsbVar) ? 32 : 16) | (cVarH.d(f68Var.ordinal()) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(function1) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-preferences-tab-minimum-pay-preference", "error-toast", sp7.c.a.c, null, null, 24));
            boolean zX = ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | cVarH.x(vsbVar) | ((i2 & 896) == 256);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                gu5 gu5Var = new gu5() { // from class: ml4
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        String str;
                        ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-minimum-pay-preference", "refresh", null, null, 12));
                        zt9 zt9Var = vsbVar.p;
                        if (zt9Var == null || (str = zt9Var.d) == null) {
                            str = "";
                        }
                        function1.invoke(new zt9(f68Var, Boolean.TRUE, Double.valueOf(d), str));
                        return j6g.a;
                    }
                };
                cVarH.p(gu5Var);
                objV = gu5Var;
            }
            rg0.a((gu5) objV, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(d, vsbVar, f68Var, function1, i) { // from class: nl4
                public final /* synthetic */ double a;
                public final /* synthetic */ vsb b;
                public final /* synthetic */ f68 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    sl4.b(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(zt9 zt9Var, f68 f68Var, Function1<? super f68, j6g> function1, b bVar, int i) {
        vw6 bVar2;
        c cVarH = bVar.h(-215339248);
        int i2 = (cVarH.K(zt9Var) ? 4 : 2) | i | (cVarH.d(f68Var == null ? -1 : f68Var.ordinal()) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, e.a.b);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.TRUE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            if ((zt9Var != null ? zt9Var.b : null) == null) {
                cVarH.L(-1784036582);
                cVarH.U(false);
                bVar2 = new vw6.a("");
            } else {
                cVarH.L(-1783963732);
                bVar2 = new vw6.b(ak2.I(olb.c(f68Var), cVarH));
                cVarH.U(false);
            }
            String strI = ak2.I(R.string.pay_period, cVarH);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new pg0(4, g4aVar);
                cVarH.p(objV2);
            }
            yw6.a(bVar2, (gu5) objV2, null, strI, null, false, null, cVarH, 390, 0, 2024);
            boolean z = !((Boolean) g4aVar.getValue()).booleanValue();
            Object objV3 = cVarH.v();
            int i3 = 9;
            if (objV3 == c0020a) {
                objV3 = new kd(i3);
                cVarH.p(objV3);
            }
            mv4 mv4VarK = ku4.k((Function1) objV3, 1);
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new kd(i3);
                cVarH.p(objV4);
            }
            androidx.compose.animation.i.b(qb2.a, z, null, mv4VarK, ku4.m((Function1) objV4, 1), null, bh2.c(495760990, new ol4(0, f68Var, function1, g4aVar), cVarH), cVarH, 1600518, 18);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new cs2(zt9Var, f68Var, function1, i);
        }
    }
}
