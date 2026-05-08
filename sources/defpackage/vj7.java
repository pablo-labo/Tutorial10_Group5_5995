package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.rte;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vj7 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.InterviewJobcardKt$JobCard$1$1", f = "InterviewJobcard.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ wj7 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wj7 wj7Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$state = wj7Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$state, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            wj7 wj7Var = this.$state;
            gu5<j6g> gu5Var = wj7Var.x;
            if (gu5Var != null && wj7Var.w) {
                gu5Var.invoke();
            }
            return j6g.a;
        }
    }

    public static final void a(int i, b bVar, e eVar, String str) {
        c cVar;
        int i2;
        e eVar2;
        int i3;
        int i4;
        c cVarH = bVar.h(166037725);
        int i5 = i | 6 | (cVarH.K(str) ? 32 : 16);
        if (cVarH.o(i5 & 1, (i5 & 19) != 18)) {
            if (wl7.b(str, "JS_CANCEL")) {
                i3 = 648469162;
                i4 = R.string.canceled_by_you;
            } else {
                i3 = 648470821;
                i4 = R.string.canceled_by_employer;
            }
            String strK = z3.k(cVarH, i3, i4, cVarH, false);
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
            p03 p03Var = ((dde) cVarH.M(fde.a)).b;
            e.a aVar = e.a.b;
            e eVarG = f.g(androidx.compose.foundation.a.b(ygg.h(aVar, p03Var), pa2.a(R.color.cancelled_label_bg, cVarH), ytc.a), 8.0f, 4.0f);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
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
            i2 = 1;
            cif.b(strK, null, pa2.a(R.color.cancelled_label_text, cVarH), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.b, cVarH, 0, 0, 65530);
            cVar = cVarH;
            cVar.U(true);
            eVar2 = aVar;
        } else {
            cVar = cVarH;
            i2 = 1;
            cVar.D();
            eVar2 = eVar;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ol1(eVar2, i, i2, str);
        }
    }

    public static final void b(e eVar, rte rteVar, b bVar, int i) {
        e eVar2;
        long jA;
        long jA2;
        c cVarH = bVar.h(1887358745);
        int i2 = i | 6 | (cVarH.K(rteVar) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            boolean z = rteVar instanceof rte.c;
            if (z) {
                cVarH.L(1275561065);
                jA = pa2.a(R.color.interview_started_bg, cVarH);
                cVarH.U(false);
            } else if (rteVar instanceof rte.d) {
                cVarH.L(1275564042);
                jA = pa2.a(R.color.interview_startsin_bg, cVarH);
                cVarH.U(false);
            } else if (rteVar instanceof rte.a) {
                cVarH.L(1275567083);
                jA = pa2.a(R.color.interview_cancelled_bg, cVarH);
                cVarH.U(false);
            } else {
                cVarH.L(1275569225);
                jA = pa2.a(R.color.interview_started_bg, cVarH);
                cVarH.U(false);
            }
            o97 o97Var = (o97) cVarH.M(p97.a);
            if (z) {
                cVarH.L(1275576619);
                jA2 = pa2.a(R.color.interview_started_text, cVarH);
                cVarH.U(false);
            } else if (rteVar instanceof rte.d) {
                cVarH.L(1275579660);
                jA2 = pa2.a(R.color.interview_startsin_text, cVarH);
                cVarH.U(false);
            } else if (rteVar instanceof rte.a) {
                cVarH.L(1275582765);
                jA2 = pa2.a(R.color.interview_cancelled_text, cVarH);
                cVarH.U(false);
            } else {
                cVarH.L(1275584969);
                jA2 = pa2.a(R.color.interview_started_bg, cVarH);
                cVarH.U(false);
            }
            String str = z ? ((rte.c) rteVar).a : rteVar instanceof rte.a ? null : rteVar instanceof rte.d ? ((rte.d) rteVar).a : "";
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
            p03 p03Var = ((dde) cVarH.M(fde.a)).b;
            e.a aVar = e.a.b;
            e eVarG = f.g(androidx.compose.foundation.a.b(ygg.h(aVar, p03Var), jA, ytc.a), 8.0f, 2.0f);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
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
            f17.a(z2b.a(R.drawable.stopwatch, 0, cVarH), ak2.I(R.string.stopwatch_icon, cVarH), g.l(aVar, 18.0f), null, null, 0.0f, new ih1(jA2, 5), cVarH, 384, 56);
            cif.b(str, null, jA2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.h, cVarH, 0, 0, 65530);
            cVarH = cVarH;
            cVarH.U(true);
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gh(eVar2, i, 4, rteVar);
        }
    }

    public static final void c(wj7 wj7Var, b bVar, int i) {
        c cVarH = bVar.h(271244869);
        int i2 = (cVarH.K(wj7Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.m, 4));
            e.a aVar = e.a.b;
            e eVarJ = f.j(aVar, 0.0f, 4.0f, 0.0f, 2.0f, 5);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
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
            vq6.b(z2b.a(R.drawable.clockfilled, 0, cVarH), ak2.I(R.string.clock_filled_icon, cVarH), g.l(aVar, 20.0f), o97Var.c.a.c, cVarH, 384, 0);
            cif.b(wj7Var.l, null, o97Var.c.a.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, cVarH, 0, 0, 65530);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new he4(wj7Var, i);
        }
    }

    public static final void d(wj7 wj7Var, b bVar, int i) {
        c cVarH = bVar.h(913506654);
        int i2 = (cVarH.K(wj7Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = wj7Var.m.ordinal();
            if (iOrdinal == 0) {
                cVarH.L(1706578580);
                h(wj7Var, cVarH, i2 & 14);
                cVarH.U(false);
            } else if (iOrdinal == 1) {
                cVarH.L(1706576063);
                i(wj7Var.n, cVarH, 0);
                cVarH.U(false);
            } else if (iOrdinal == 2) {
                cVarH.L(1706570930);
                j(true, cVarH, 6);
                cVarH.U(false);
            } else if (iOrdinal == 3) {
                cVarH.L(1706573321);
                j(false, cVarH, 6);
                cVarH.U(false);
            } else if (iOrdinal != 4) {
                cVarH.L(1706569094);
                cVarH.U(false);
                l.g();
                return;
            } else {
                cVarH.L(1706581395);
                j(false, cVarH, 6);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yo0(wj7Var, i, 5);
        }
    }

    public static final void e(wj7 wj7Var, b bVar, int i) {
        c cVar;
        c cVarH = bVar.h(-1951644954);
        int i2 = (cVarH.K(wj7Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            j6g j6gVar = j6g.a;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new a(wj7Var, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, j6gVar, (Function2) objV);
            e eVarB = androidx.compose.foundation.a.b(g.f(e.a.b, 1.0f), da2.e, ytc.a);
            o97.b bVar2 = o97Var.e;
            o97.a aVar = o97Var.c;
            long j = bVar2.f;
            e eVarE = f.e(eVarB, f.b(bkf.c(j), bkf.c(bVar2.f), bkf.c(j), 0.0f, 8));
            boolean z2 = i3 == 4;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new oj(wj7Var, 11);
                cVarH.p(objV2);
            }
            ay1.b(androidx.compose.foundation.b.d(eVarE, false, null, null, (gu5) objV2, 15), ggd.a(10.0f), wx1.a(aVar.b.a, 0L, 0L, 0L, cVarH, 14), null, ee3.f(aVar.c.b, 1.0f), bh2.c(2076261556, new qb1(o97Var, wj7Var), cVarH), cVarH, 196608, 8);
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new mh(wj7Var, i, 3);
        }
    }

    public static final void f(wj7 wj7Var, b bVar, int i) {
        rte rteVar = wj7Var.p;
        c cVarH = bVar.h(-1305963801);
        int i2 = (cVarH.K(wj7Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            String str = wj7Var.t;
            if (rteVar == null || rteVar.equals(rte.b.a)) {
                if (wj7Var.q != lk7.c || str == null) {
                    cVarH.L(2125185531);
                } else {
                    cVarH.L(2141588096);
                    a(0, cVarH, null, str);
                }
                cVarH.U(false);
            } else {
                cVarH.L(2141305531);
                e eVarF = g.f(e.a.b, 1.0f);
                ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
                b(null, rteVar, cVarH, 0);
                cVarH.U(true);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new lb(wj7Var, i, 8);
        }
    }

    public static final void g(gu5 gu5Var, e eVar, b bVar, int i) {
        c cVar;
        e eVar2;
        gu5Var.getClass();
        c cVarH = bVar.h(-1071031701);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i | 48;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
            e.a aVar = e.a.b;
            e eVarG = f.g(androidx.compose.foundation.a.b(ygg.h(g.f(aVar, 1.0f), ggd.a(8.0f)), o97Var.c.b.f.a, ytc.a), bkf.c(o97Var.e.f), 10.0f);
            boolean z = (i2 & 14) == 4;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new eh(6, gu5Var);
                cVarH.p(objV);
            }
            e eVarD = androidx.compose.foundation.b.d(eVarG, false, null, null, (gu5) objV, 15);
            ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
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
            cif.b(ak2.I(R.string.join_interview, cVarH), null, o97Var.c.a.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.f, cVarH, 0, 0, 65530);
            cVar = cVarH;
            cVar.U(true);
            eVar2 = aVar;
        } else {
            cVar = cVarH;
            cVar.D();
            eVar2 = eVar;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new tn0(gu5Var, eVar2, i, 5);
        }
    }

    public static final void h(wj7 wj7Var, b bVar, int i) {
        c cVarH = bVar.h(200153895);
        int i2 = i | (cVarH.K(wj7Var) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.k kVar = vs0.c;
            af1.a aVar = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar2 = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            ehd ehdVarA = chd.a(new vs0.i(8.0f, true, new xd(aVar, 4)), c20.a.k, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            x2b x2bVarA = z2b.a(R.drawable.location, 0, cVarH);
            String strI = ak2.I(R.string.in_person_interview, cVarH);
            e eVarL = g.l(aVar2, 20.0f);
            o97.a aVar4 = o97Var.c;
            tjf tjfVar = o97Var.j.f;
            o97.a.e eVar2 = aVar4.a;
            vq6.b(x2bVarA, strI, eVarL, aVar4.a.c, cVarH, 384, 0);
            cif.b(ak2.I(R.string.in_person_interview, cVarH), null, eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65530);
            cVarH = cVarH;
            cVarH.U(true);
            String str = wj7Var.o;
            if (str == null) {
                cVarH.L(1355864082);
            } else {
                cVarH.L(1355864083);
                cif.b(str, f.j(aVar2, 30.0f, 0.0f, 0.0f, 0.0f, 14), eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 48, 0, 65528);
                cVarH = cVarH;
            }
            cVarH.U(false);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xd(wj7Var, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    public static final void i(String str, b bVar, int i) {
        ?? r14;
        c cVar;
        boolean z;
        c cVar2;
        String str2 = str;
        c cVarH = bVar.h(-1285495125);
        int i2 = i | (cVarH.K(str2) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            vs0.k kVar = vs0.c;
            af1.a aVar = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e.a aVar2 = e.a.b;
            e eVarC = androidx.compose.ui.c.c(cVarH, aVar2);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            ehd ehdVarA = chd.a(new vs0.i(8.0f, true, new xd(aVar, 4)), c20.a.k, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            x2b x2bVarA = z2b.a(R.drawable.ic_idl_phone_24, 0, cVarH);
            String strI = ak2.I(R.string.phone_interview, cVarH);
            e eVarK = g.k(f.j(aVar2, 0.0f, 2.0f, 0.0f, 0.0f, 13), 20.0f);
            o97.a aVar4 = o97Var.c;
            tjf tjfVar = o97Var.j.f;
            o97.a.e eVar2 = aVar4.a;
            vq6.b(x2bVarA, strI, eVarK, aVar4.a.c, cVarH, 384, 0);
            cif.b(ak2.I(R.string.phone_interview, cVarH), null, eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65530);
            c cVar3 = cVarH;
            cVar3.U(true);
            if (str != null) {
                cVar3.L(-1238915869);
                str2 = str;
                cif.b(str2, f.j(aVar2, 30.0f, 0.0f, 0.0f, 0.0f, 14), eVar2.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVar3, (i2 & 14) | 48, 0, 65528);
                cVar2 = cVar3;
                z = false;
            } else {
                z = false;
                str2 = str;
                cVar3.L(-1258016767);
                cVar2 = cVar3;
            }
            cVar2.U(z);
            cVar2.U(true);
            cVar = cVar2;
            r14 = z;
        } else {
            r14 = 0;
            cVarH.D();
            cVar = cVarH;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new uj7(str2, i, r14);
        }
    }

    public static final void j(final boolean z, b bVar, final int i) {
        c cVarH = bVar.h(1953564583);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ehd ehdVarA = chd.a(new vs0.i(8.0f, true, new xd(c20.a.m, 4)), c20.a.k, cVarH, 54);
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
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            vq6.b(z2b.a(R.drawable.homeinterview, 0, cVarH), ak2.I(R.string.third_party_interview, cVarH), g.l(aVar, 20.0f), o97Var.c.a.c, cVarH, 384, 0);
            cif.b(z ? z3.k(cVarH, 1959177941, R.string.video_interview_on_indeed, cVarH, false) : z3.k(cVarH, 1959179764, R.string.third_party_interview, cVarH, false), null, o97Var.c.a.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, cVarH, 0, 0, 65530);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, z) { // from class: tj7
                public final /* synthetic */ boolean a;

                {
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(7);
                    vj7.j(this.a, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
