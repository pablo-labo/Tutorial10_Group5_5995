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
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b88 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.JobcardKt$JobsCard$4$1$1$1", f = "Jobcard.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(2, lu2Var);
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
            c05.a.invoke(tx5.e(c05.b, "shareHiredBadge", "myjobs_native_screen", null, 12));
            return j6g.a;
        }
    }

    public static final class b {
        public final String a;
        public final long b;
        public final long c;
        public final c8f d;

        public b(String str, long j, long j2, c8f c8fVar) {
            str.getClass();
            this.a = str;
            this.b = j;
            this.c = j2;
            this.d = c8fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && da2.c(this.b, bVar.b) && da2.c(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            int i = da2.j;
            return this.d.hashCode() + ia.d(ia.d(iHashCode, 31, this.b), 31, this.c);
        }

        public final String toString() {
            String strI = da2.i(this.b);
            String strI2 = da2.i(this.c);
            StringBuilder sbF = u40.f("StatusLabel(text=", this.a, ", color=", strI, ", backgroundColor=");
            sbF.append(strI2);
            sbF.append(", tagVariant=");
            sbF.append(this.d);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final void a(int i, androidx.compose.runtime.b bVar, e eVar, String str) {
        eVar.getClass();
        c cVarH = bVar.h(-1918764483);
        int i2 = (cVarH.K(str) ? 32 : 16) | i;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e eVarJ = f.j(eVar, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarJ);
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
            f17.a(z2b.a(R.drawable.people, 0, cVarH), null, null, null, null, 0.0f, null, cVarH, 48, 124);
            cif.b(ak2.J(R.string.applied_people, new Object[]{str}, cVarH), f.j(e.a.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), o97Var.c.a.g.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 48, 0, 65528);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uc(eVar, i, 4, str);
        }
    }

    public static final void b(c88 c88Var, androidx.compose.runtime.b bVar, int i) {
        int i2;
        boolean z;
        String str;
        boolean z2;
        c cVarH = bVar.h(550140557);
        int i3 = (cVarH.K(c88Var) ? 4 : 2) | i;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            boolean z3 = c88Var.O;
            yj7 yj7Var = c88Var.D;
            e.a aVar = e.a.b;
            if (z3) {
                cVarH.L(-357757401);
                i2 = 6;
                gt6.h(ak2.I(R.string.complete_ai_recruiter, cVarH), c88Var.Q, g.f(aVar, 1.0f), null, false, false, null, null, null, cVarH, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                cVarH.U(false);
            } else {
                ox7 ox7Var = c88Var.f;
                ox7 ox7Var2 = ox7.c;
                b.a.C0020a c0020a = b.a.a;
                if (ox7Var != ox7Var2 || c88Var.g) {
                    if (ox7Var != ox7.a || (!((str = c88Var.w) == null || str.length() == 0) || c88Var.B.a)) {
                        i2 = 6;
                        z = false;
                        cVarH.L(-377838891);
                    } else {
                        cVarH.L(-356694969);
                        if (yj7Var.a) {
                            cVarH.L(-356643788);
                            xj7.a(c88Var, cVarH, i3 & 14);
                        } else {
                            cVarH.L(-377838891);
                        }
                        cVarH.U(false);
                        String strI = ak2.I(R.string.update_status, cVarH);
                        boolean z4 = c88Var.r;
                        e eVarF = g.f(aVar, 1.0f);
                        z2 = (i3 & 14) == 4;
                        Object objV = cVarH.v();
                        if (z2 || objV == c0020a) {
                            objV = new wm1(c88Var, 9);
                            cVarH.p(objV);
                        }
                        i2 = 6;
                        gt6.j(strI, (gu5) objV, eVarF, null, false, z4, null, null, null, cVarH, 384, 472);
                        if (yj7Var.a) {
                            z = false;
                            cVarH.L(-377838891);
                        } else {
                            cVarH.L(-356296464);
                            ik7.a(c88Var, cVarH, ((i3 << 3) & 112) | 6);
                            z = false;
                        }
                        cVarH.U(z);
                    }
                    cVarH.U(z);
                } else {
                    cVarH.L(-357427096);
                    String strK = c88Var.v ? z3.k(cVarH, -357355269, R.string.continue_application, cVarH, false) : z3.k(cVarH, 404117466, R.string.apply_now, cVarH, false);
                    e eVarF2 = g.f(aVar, 1.0f);
                    int i4 = 14;
                    z2 = (i3 & 14) == 4;
                    Object objV2 = cVarH.v();
                    if (z2 || objV2 == c0020a) {
                        objV2 = new qa(c88Var, i4);
                        cVarH.p(objV2);
                    }
                    gu5 gu5Var = (gu5) objV2;
                    i2 = 6;
                    gt6.h(strK, gu5Var, eVarF2, null, false, false, null, null, null, cVarH, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                    cVarH.U(false);
                }
            }
        } else {
            i2 = 6;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new mh(c88Var, i, i2);
        }
    }

    public static final void c(final int i, final int i2, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(-1469795631);
        int i3 = (cVarH.d(i) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarJ = f.j(aVar, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 0);
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
            f17.a(z2b.a(R.drawable.app_count, 0, cVarH), null, null, null, null, 0.0f, null, cVarH, 48, 124);
            cif.b(ak2.x(R.plurals.response_time_in_days, i, new Object[]{Integer.valueOf(i)}, cVarH), f.j(aVar, 6.0f, 0.0f, 0.0f, 0.0f, 14), o97Var.c.a.g.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, 48, 0, 65528);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, i2) { // from class: z78
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    b88.c(this.a, iL, (b) obj);
                    return j6g.a;
                }
            };
        }
    }

    public static final void d(c88 c88Var, androidx.compose.runtime.b bVar, int i) {
        boolean z;
        c cVarH = bVar.h(1609765980);
        int i2 = (cVarH.K(c88Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            if (c88Var.g) {
                cVarH.L(-1066355444);
                boolean zO = i6a.o();
                e.a aVar = e.a.b;
                if (zO) {
                    cVarH.L(-1066306991);
                    z = false;
                    tr6.c(fv6.Y1, da2.c, f.j(aVar, 0.0f, 16.0f, 0.0f, 2.0f, 5), null, null, ak2.I(R.string.job_closed_or_expired_on_indeed, cVarH), null, null, cVarH, 54, 0, 4056);
                    cVarH.U(false);
                } else {
                    cVarH.L(-1066015436);
                    String strI = ak2.I(R.string.job_closed_or_expired_on_indeed, cVarH);
                    long j = o97Var.c.a.c;
                    tjf tjfVar = o97Var.j.g;
                    to5 to5Var = o97Var.f.c;
                    e eVarJ = f.j(aVar, 0.0f, bkf.c(o97Var.e.f), 0.0f, 2.0f, 5);
                    z = false;
                    cif.b(strI, eVarJ, j, 0L, null, to5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65496);
                    cVarH = cVarH;
                    cVarH.U(false);
                }
            } else {
                z = false;
                cVarH.L(-1085620890);
            }
            cVarH.U(z);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e45(c88Var, i, 3);
        }
    }

    public static final void e(c88 c88Var, androidx.compose.runtime.b bVar, int i) {
        c cVar;
        c cVarH = bVar.h(937418859);
        int i2 = (cVarH.K(c88Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.TRUE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            o97 o97Var = (o97) cVarH.M(p97.a);
            float fT1 = ((iy3) cVarH.M(um2.h)).t1(((Configuration) cVarH.M(AndroidCompositionLocals_androidKt.a)).screenHeightDp);
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            e eVarF = g.f(e.a.b, 1.0f);
            int i3 = i2 & 14;
            boolean zC = cVarH.c(fT1) | (i3 == 4);
            Object objV3 = cVarH.v();
            if (zC || objV3 == c0020a) {
                objV3 = new v60(fT1, c88Var, g4aVar2, 1);
                cVarH.p(objV3);
            }
            e eVarB = androidx.compose.foundation.a.b(s.a(eVarF, (Function1) objV3), da2.e, ytc.a);
            o97.b bVar2 = o97Var.e;
            o97.a aVar = o97Var.c;
            long j = bVar2.f;
            e eVarB2 = androidx.compose.foundation.c.b(f.e(eVarB, f.b(bkf.c(j), bkf.c(bVar2.f), bkf.c(j), 0.0f, 8)), true, 2);
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new wa(10);
                cVarH.p(objV4);
            }
            e eVarB3 = b5e.b(eVarB2, false, (Function1) objV4);
            boolean z = i3 == 4;
            Object objV5 = cVarH.v();
            if (z || objV5 == c0020a) {
                objV5 = new qq(c88Var, 15);
                cVarH.p(objV5);
            }
            ay1.b(androidx.compose.foundation.b.d(eVarB3, false, null, null, (gu5) objV5, 15), ggd.a(bkf.c(bVar2.h)), wx1.a(aVar.b.a, 0L, 0L, 0L, cVarH, 14), null, !c88Var.s ? ee3.f(aVar.c.b, 1.0f) : ee3.f(eu6.u, 1.0f), bh2.c(-2008508195, new fq4(c88Var, o97Var, g4aVar), cVarH), cVarH, 196608, 8);
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new fr2(c88Var, i, 3);
        }
    }

    public static final void f(String str, ox7 ox7Var, androidx.compose.runtime.b bVar, int i) {
        String strK;
        boolean z;
        str.getClass();
        ox7Var.getClass();
        c cVarH = bVar.h(-443343593);
        int i2 = i | (cVarH.K(str) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            String strI = ak2.I(R.string.applied, cVarH);
            long j = eu6.c;
            long j2 = eu6.i;
            c8f c8fVar = c8f.a;
            Pair pair = new Pair("APPLIED", new b(strI, j, j2, c8fVar));
            String strI2 = ak2.I(R.string.interviewing, cVarH);
            long jG = pnb.g(4280247852L);
            long jG2 = pnb.g(4293195750L);
            c8f c8fVar2 = c8f.b;
            Pair pair2 = new Pair("INTERVIEW", new b(strI2, jG, jG2, c8fVar2));
            Pair pair3 = new Pair("OFFER", new b(ak2.I(R.string.offer_received, cVarH), pnb.g(4280247852L), pnb.g(4293195750L), c8fVar2));
            Pair pair4 = new Pair("HIRED", new b(ak2.I(R.string.hired, cVarH), pnb.g(4280247852L), pnb.g(4293195750L), c8fVar2));
            String strI3 = ak2.I(R.string.not_selected_by_employer, cVarH);
            long jG3 = pnb.g(4289275179L);
            long jG4 = pnb.g(4294897391L);
            c8f c8fVar3 = c8f.d;
            Pair pair5 = new Pair("REJECTED", new b(strI3, jG3, jG4, c8fVar3));
            Pair pair6 = new Pair("NOT_INTERESTED", new b(ak2.I(R.string.no_longer_interested, cVarH), pnb.g(4289275179L), pnb.g(4294897391L), c8fVar3));
            Pair pair7 = new Pair("REVIEWED", new b(ak2.I(R.string.application_viewed, cVarH), pnb.g(4280247852L), pnb.g(4293195750L), c8fVar2));
            Pair pair8 = new Pair("VIEWED", new b(ak2.I(R.string.application_viewed, cVarH), pnb.g(4280247852L), pnb.g(4293195750L), c8fVar2));
            Pair pair9 = new Pair("CONTACTING", new b(ak2.I(R.string.application_viewed, cVarH), pnb.g(4280247852L), pnb.g(4293195750L), c8fVar2));
            Pair pair10 = new Pair(ak2.I(R.string.application_started, cVarH), new b(ak2.I(R.string.application_started, cVarH), j, pnb.g(4293849598L), c8fVar));
            Pair pair11 = new Pair(ak2.I(R.string.employer_review_application, cVarH), new b(ak2.I(R.string.employer_review_application, cVarH), j, pnb.g(4293849598L), c8fVar));
            String strI4 = ak2.I(R.string.employer_ghosted_label_text, cVarH);
            String strI5 = ak2.I(R.string.employer_ghosted_label_text, cVarH);
            o97.a aVar = o97Var.c;
            Pair pair12 = new Pair(strI4, new b(strI5, aVar.a.h.a.a, aVar.b.i.a.b, c8f.e));
            String strI6 = ak2.I(R.string.application_pending, cVarH);
            o97.a aVar2 = o97Var.c;
            Map mapA0 = lc9.a0(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, new Pair("NEXUS_PENDING", new b(strI6, aVar2.a.h.e.a, aVar2.b.i.e.b, c8f.c)));
            if (i6a.o()) {
                cVarH.L(-851260865);
                b bVar2 = (b) mapA0.get(str);
                strK = bVar2 != null ? bVar2.a : null;
                if (strK == null) {
                    strK = z3.k(cVarH, -851258244, R.string.applied, cVarH, false);
                } else {
                    cVarH.L(-851260476);
                    cVarH.U(false);
                }
                String str2 = strK;
                b bVar3 = (b) mapA0.get(str);
                ny6.a(str2, null, null, bVar3 != null ? bVar3.d : c8fVar, null, null, null, cVarH, 0, 246);
                cVarH.U(false);
            } else {
                cVarH.L(-620280245);
                vs0.i iVar = new vs0.i(8.0f, true, new xd(c20.a.n, 4));
                e eVarH = ygg.h(e.a.b, ggd.a(4.0f));
                b bVar4 = (b) mapA0.get(str);
                e eVarG = f.g(androidx.compose.foundation.a.b(eVarH, bVar4 != null ? bVar4.c : pnb.g(4293849598L), ytc.a), 8.0f, 8.0f);
                ehd ehdVarA = chd.a(iVar, c20.a.k, cVarH, 54);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarG);
                gl2.j.getClass();
                pm8.a aVar3 = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar3);
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
                b bVar5 = (b) mapA0.get(str);
                strK = bVar5 != null ? bVar5.a : null;
                if (strK == null) {
                    z = false;
                    strK = z3.k(cVarH, -1193203267, R.string.applied, cVarH, false);
                } else {
                    z = false;
                    cVarH.L(-1193205747);
                    cVarH.U(false);
                }
                String str3 = strK;
                b bVar6 = (b) mapA0.get(str);
                long j3 = bVar6 != null ? bVar6.b : j;
                cif.b(str3, null, j3, hh2.t(12), null, to5.d0, null, 0L, null, null, 0L, 0, false, 1, 0, null, hz6.b, cVarH, 199680, 3072, 57298);
                cVarH = cVarH;
                cVarH.U(true);
                cVarH.U(z);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new jh(str, i, 6, ox7Var);
        }
    }
}
