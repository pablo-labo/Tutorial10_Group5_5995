package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wo0 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.ApplicationWithdrawBottomSheetKt$KeepApplicationButton$1$1$1", f = "ApplicationWithdrawBottomSheet.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hw9 hw9Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$sheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final void a(hw9 hw9Var, final xo0 xo0Var, ah2 ah2Var, b bVar, int i) {
        int i2;
        final hw9 hw9Var2 = hw9Var;
        hw9Var2.getClass();
        c cVarH = bVar.h(2142269299);
        int i3 = i | (cVarH.x(hw9Var2) ? 4 : 2) | (cVarH.K(xo0Var) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            final e13 e13Var = (e13) objV;
            final Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            final o97 o97Var = (o97) cVarH.M(p97.a);
            androidx.compose.material.a.a(bh2.c(1865586593, new wu5(o97Var, context, e13Var, hw9Var2, xo0Var) { // from class: io0
                public final /* synthetic */ Context a;
                public final /* synthetic */ e13 b;
                public final /* synthetic */ hw9 c;
                public final /* synthetic */ xo0 d;

                {
                    this.a = context;
                    this.b = e13Var;
                    this.c = hw9Var2;
                    this.d = xo0Var;
                }

                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        e.a aVar = e.a.b;
                        e eVarM = pnb.M(f.h(aVar, 16.0f, 0.0f, 2), pnb.L(0, 1, bVar2), true);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarM);
                        gl2.j.getClass();
                        pm8.a aVar2 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar2);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        String string = this.a.getString(R.string.withdraw_app_header);
                        string.getClass();
                        e13 e13Var2 = this.b;
                        boolean zX = bVar2.x(e13Var2);
                        hw9 hw9Var3 = this.c;
                        boolean zX2 = zX | bVar2.x(hw9Var3);
                        Object objV2 = bVar2.v();
                        if (zX2 || objV2 == b.a.a) {
                            objV2 = new qe(3, e13Var2, hw9Var3);
                            bVar2.p(objV2);
                        }
                        wo0.c(0, (gu5) objV2, bVar2, string);
                        jh2.f(bVar2, g.h(aVar, 10.0f));
                        xo0 xo0Var2 = this.d;
                        wo0.d(xo0Var2, bVar2, 0);
                        jh2.f(bVar2, g.h(aVar, 10.0f));
                        if (xo0Var2.d) {
                            bVar2.L(186494241);
                            wo0.f(0, bVar2);
                            jh2.f(bVar2, g.h(aVar, 16.0f));
                            b84.a(1.0f, 384, 9, eu6.r, bVar2, null);
                            jh2.f(bVar2, g.h(aVar, 16.0f));
                            wo0.i(0, bVar2);
                        } else {
                            bVar2.L(182344395);
                        }
                        bVar2.F();
                        jh2.f(bVar2, g.h(aVar, 16.0f));
                        wo0.h(hw9Var3, xo0Var2.e, xo0Var2.f, bVar2, 8);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, hw9Var, false, ggd.b(20.0f, 20.0f, 0.0f, 0.0f), 0.0f, o97Var.c.b.a, 0L, 0L, bh2.c(-1780894950, new po0(ah2Var, 0), cVarH), cVarH, 805306886 | ((i3 << 6) & 896), 426);
            hw9Var2 = hw9Var;
            boolean zC = hw9Var2.c();
            boolean zX = cVarH.x(e13Var) | ((i3 & 14) == 4 || cVarH.x(hw9Var2));
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                i2 = 0;
                objV2 = new qo0(e13Var, hw9Var2, 0);
                cVarH.p(objV2);
            } else {
                i2 = 0;
            }
            g71.a(zC, (gu5) objV2, cVarH, i2, i2);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ic(hw9Var2, xo0Var, ah2Var, i, 1);
        }
    }

    public static final void b(String str, b bVar, int i) {
        c cVar;
        int i2;
        c cVarH = bVar.h(842803830);
        int i3 = (cVarH.K(str) ? 4 : 2) | i;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strConcat = "•  ".concat(str);
            o97.g gVar = o97Var.i;
            cVar = cVarH;
            i2 = 0;
            cif.b(strConcat, f.j(e.a.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), o97Var.c.a.g.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVar, 0, 0, 65528);
        } else {
            cVar = cVarH;
            i2 = 0;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new lo0(str, i, i2);
        }
    }

    public static final void c(int i, gu5 gu5Var, b bVar, String str) {
        gu5 gu5Var2;
        c cVar;
        int i2;
        String str2 = str;
        c cVarH = bVar.h(-1138521688);
        int i3 = (cVarH.K(str2) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16);
        if (!cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            gu5Var2 = gu5Var;
            cVar = cVarH;
            i2 = 0;
            cVar.D();
        } else if (i6a.o()) {
            gu5Var2 = gu5Var;
            i2 = 0;
            cVarH.L(-341773759);
            str2 = str;
            nx6.c(str2, null, false, false, false, null, null, bh2.c(1997884568, new jo0(0, gu5Var2), cVarH), null, null, cVarH, (i3 & 14) | 12583296, 890);
            cVar = cVarH;
            cVar.U(false);
        } else {
            cVarH.L(-342713772);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarF = f.f(g.f(aVar, 1.0f), 16.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            cif.b(str, g.w(new LayoutWeightElement(1.0f, true), c20.a.n, 2), eu6.k, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hz6.f, cVarH, i3 & 14, 0, 65016);
            cVar = cVarH;
            i2 = 0;
            gu5Var2 = gu5Var;
            f17.a(z2b.a(R.drawable.cross_icon, 0, cVar), ak2.I(R.string.close_icon, cVar), androidx.compose.foundation.b.d(aVar, false, null, null, gu5Var, 15), null, null, 0.0f, null, cVar, 0, 120);
            cVar.U(true);
            b84.a(1.0f, 384, 9, eu6.r, cVar, null);
            cVar.U(true);
            cVar.U(false);
            str2 = str;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ko0(str2, gu5Var2, i, i2);
        }
    }

    public static final void d(xo0 xo0Var, b bVar, int i) {
        c cVar;
        int i2;
        c cVarH = bVar.h(206948661);
        int i3 = i | (cVarH.K(xo0Var) ? 4 : 2);
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.g gVar = o97Var.i;
            o97.a aVar = o97Var.c;
            o97.a.e eVar = aVar.a;
            o97.a.b bVar2 = aVar.c;
            vs0.i iVar = new vs0.i(8.0f, true, new us0(0));
            e eVarF = f.f(androidx.compose.foundation.a.b(g.f(ti1.a(e.a.b, 1.0f, bVar2.b, ggd.a(8.0f)), 1.0f), bVar2.b, ytc.a), 8.0f);
            ob2 ob2VarA = mb2.a(iVar, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            cif.b(xo0Var.a, null, eVar.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.g, cVarH, 0, 0, 65530);
            cif.b(xo0Var.b, null, eVar.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 0, 0, 65530);
            cVar = cVarH;
            i2 = 1;
            cVar.U(true);
        } else {
            cVar = cVarH;
            i2 = 1;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new lb(xo0Var, i, i2);
        }
    }

    public static final void e(final hw9 hw9Var, b bVar, final int i) {
        int i2;
        c cVar;
        hw9Var.getClass();
        c cVarH = bVar.h(1503419318);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(hw9Var) : cVarH.x(hw9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
            e eVarF = g.f(e.a.b, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarB = androidx.compose.foundation.a.b(ygg.h(eVarF, ggd.a(8.0f)), da2.e, ytc.a);
            bj1 bj1VarF = ee3.f(pnb.g(4292137680L), 1.0f);
            e eVarG = f.g(ti1.b(eVarB, bj1VarF.a, bj1VarF.b, ggd.a(8.0f)), 16.0f, 10.0f);
            boolean zX = cVarH.x(e13Var);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && cVarH.x(hw9Var))) {
                z = true;
            }
            boolean z2 = zX | z;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new ky(1, e13Var, hw9Var);
                cVarH.p(objV2);
            }
            e eVarD = androidx.compose.foundation.b.d(eVarG, false, null, null, (gu5) objV2, 15);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            cif.b(ak2.I(R.string.withdraw_keep_this_application_btn, cVarH), null, pnb.g(4280637351L), 0L, null, null, null, 0L, null, null, hh2.r(9.38d), 0, false, 0, 0, null, hz6.g, cVarH, 384, 6, 64506);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: oo0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    wo0.e(hw9Var, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void f(int i, b bVar) {
        int i2;
        c cVarH = bVar.h(911626193);
        if (cVarH.o(i & 1, i != 0)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = u63.a0(context.getString(R.string.withdraw_review_detail_1), context.getString(R.string.withdraw_review_detail_2), context.getString(R.string.withdraw_review_detail_3));
                cVarH.p(objV);
            }
            List<String> list = (List) objV;
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            f17.a(z2b.a(R.drawable.warning, 0, cVarH), null, null, null, null, 0.0f, null, cVarH, 48, 124);
            String string = context.getString(R.string.review_before_proceeding);
            string.getClass();
            o97.g gVar = o97Var.i;
            cif.b(string, f.j(aVar, 4.0f, 0.0f, 0.0f, 0.0f, 14), o97Var.c.a.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.g, cVarH, 0, 0, 65528);
            cVarH = cVarH;
            cVarH.U(true);
            jh2.f(cVarH, g.h(aVar, 10.0f));
            cVarH.L(228854957);
            for (String str : list) {
                str.getClass();
                b(str, cVarH, 0);
            }
            cVarH.U(false);
            i2 = 1;
            cVarH.U(true);
        } else {
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fm0(i, i2);
        }
    }

    public static final void g(final int i, final gu5 gu5Var, b bVar, final boolean z) {
        int i2;
        boolean z2;
        c cVarH = bVar.h(-316692837);
        if ((i & 6) == 0) {
            i2 = i | (cVarH.x(gu5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.a(z) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97.g gVar = ((o97) cVarH.M(p97.a)).i;
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
            e.a aVar = e.a.b;
            e eVarG = f.g(androidx.compose.foundation.a.b(ygg.h(g.f(aVar, 1.0f), ggd.a(8.0f)), pa2.a(R.color.withdraw_btn_bg, cVarH), ytc.a), 16.0f, 10.0f);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objV = cVarH.v();
            if (z3 || objV == b.a.a) {
                objV = new gu5() { // from class: mo0
                    @Override // defpackage.gu5
                    public final Object invoke() {
                        if (!z) {
                            gu5Var.invoke();
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            e eVarD = androidx.compose.foundation.b.d(eVarG, false, null, null, (gu5) objV, 15);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            if (z) {
                cVarH.L(405273315);
                z2c.a(3.0f, 1, 384, 0, da2.b(eu6.k, 0.25f), eu6.u, cVarH, g.n(aVar, 24.0f));
                cVarH.U(false);
                z2 = true;
            } else {
                cVarH.L(405601977);
                z2 = true;
                cif.b(ak2.I(R.string.withdraw_button_text, cVarH), null, eu6.u, 0L, null, null, null, 0L, null, null, hh2.r(9.38d), 0, false, 0, 0, null, hz6.g, cVarH, 0, 6, 64506);
                cVarH = cVarH;
                cVarH.U(false);
            }
            cVarH.U(z2);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: no0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wo0.g(ka2.L(i | 1), gu5Var, (b) obj, z);
                    return j6g.a;
                }
            };
        }
    }

    public static final void h(hw9 hw9Var, gu5 gu5Var, boolean z, b bVar, int i) {
        hw9Var.getClass();
        c cVarH = bVar.h(25910082);
        int i2 = (cVarH.x(hw9Var) ? 4 : 2) | i | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
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
            g((i2 >> 3) & 126, gu5Var, cVarH, z);
            jh2.f(cVarH, g.h(aVar, 8.0f));
            e(hw9Var, cVarH, (i2 & 14) | 8);
            o97.g gVar = o97Var.i;
            jh2.f(cVarH, g.h(aVar, 16.0f));
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new to0(hw9Var, gu5Var, z, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(int i, b bVar) {
        int i2;
        g4a g4aVar;
        c cVarH = bVar.h(-2051799455);
        if (cVarH.o(i & 1, i != 0)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = u63.a0(context.getString(R.string.withdraw_reason_1), context.getString(R.string.withdraw_reason_2), context.getString(R.string.withdraw_reason_3), context.getString(R.string.withdraw_reason_4), context.getString(R.string.withdraw_reason_5), context.getString(R.string.withdraw_reason_6));
                cVarH.p(objV);
            }
            List<String> list = (List) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(null);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(null);
                cVarH.p(objV3);
            }
            g4a g4aVar3 = (g4a) objV3;
            if (i6a.o()) {
                i2 = 0;
                cVarH.L(818951907);
                String strI = ak2.I(R.string.withdraw_reason_question, cVarH);
                String strI2 = ak2.I(R.string.withdraw_improve_text, cVarH);
                List list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                int i3 = 0;
                for (Object obj : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u63.o0();
                        throw null;
                    }
                    String str = (String) obj;
                    str.getClass();
                    Integer num = (Integer) g4aVar3.getValue();
                    arrayList.add(new zv6(str, num != null && i3 == num.intValue()));
                    i3 = i4;
                }
                zv6[] zv6VarArr = (zv6[]) arrayList.toArray(new zv6[0]);
                Object objV4 = cVarH.v();
                if (objV4 == c0020a) {
                    objV4 = new ro0(0, g4aVar3);
                    cVarH.p(objV4);
                }
                fw6.c(strI, null, strI2, null, false, zv6VarArr, (Function2) objV4, null, cVarH, 12582912, 314);
                cVarH = cVarH;
                cVarH.U(false);
            } else {
                cVarH.L(817706761);
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e.a aVar = e.a.b;
                e eVarC = androidx.compose.ui.c.c(cVarH, aVar);
                gl2.j.getClass();
                pm8.a aVar2 = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
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
                g4a g4aVar4 = g4aVar2;
                b.a.C0020a c0020a2 = c0020a;
                cif.b(ak2.I(R.string.withdraw_reason_question, cVarH), null, eu6.k, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.g, cVarH, 0, 0, 65530);
                cif.b(ak2.I(R.string.withdraw_improve_text, cVarH), null, eu6.l, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.c, cVarH, 0, 0, 65530);
                cVarH = cVarH;
                jh2.f(cVarH, g.h(aVar, 12.0f));
                cVarH.L(1380710891);
                for (String str2 : list) {
                    ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
                    int iHashCode2 = Long.hashCode(cVarH.T);
                    t8b t8bVarP2 = cVarH.P();
                    e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    cVarH.B();
                    if (cVarH.S) {
                        cVarH.y(aVar3);
                    } else {
                        cVarH.n();
                    }
                    ygg.y(cVarH, ehdVarA, gl2.a.g);
                    ygg.y(cVarH, t8bVarP2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                        ja.h(iHashCode2, cVarH, iHashCode2, c0251a2);
                    }
                    ygg.y(cVarH, eVarC2, gl2.a.d);
                    e eVarN = g.n(aVar, 20.0f);
                    boolean zB = wl7.b(str2, (String) g4aVar4.getValue());
                    xhc xhcVarA = yhc.a(eu6.c, 0L, cVarH, 14);
                    boolean zK = cVarH.K(str2);
                    Object objV5 = cVarH.v();
                    b.a.C0020a c0020a3 = c0020a2;
                    if (zK || objV5 == c0020a3) {
                        g4aVar = g4aVar4;
                        objV5 = new ai(1, str2, g4aVar);
                        cVarH.p(objV5);
                    } else {
                        g4aVar = g4aVar4;
                    }
                    c cVar = cVarH;
                    aic.a(zB, (gu5) objV5, eVarN, false, xhcVarA, null, cVar, 384, 40);
                    jh2.f(cVar, g.r(aVar, 8.0f));
                    str2.getClass();
                    g4aVar4 = g4aVar;
                    cif.b(str2, null, eu6.l, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.c, cVar, 0, 0, 65530);
                    cVarH = cVar;
                    cVarH.U(true);
                    jh2.f(cVarH, g.h(aVar, 12.0f));
                    c0020a2 = c0020a3;
                }
                i2 = 0;
                o6.j(cVarH, false, true, false);
            }
        } else {
            i2 = 0;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new so0(i, i2);
        }
    }
}
