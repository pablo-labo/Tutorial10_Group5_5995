package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d8d {
    public static final void a(final String str, final String str2, final String str3, final n9d n9dVar, final gu5 gu5Var, b bVar, final int i) {
        int i2;
        x2b x2bVarA;
        String strJ;
        n9dVar.getClass();
        String str4 = n9dVar.d;
        gu5Var.getClass();
        c cVarH = bVar.h(291099607);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.K(str3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? cVarH.K(n9dVar) : cVarH.x(n9dVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(gu5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.a(false) ? 131072 : 65536;
        }
        if (cVarH.o(i2 & 1, (74899 & i2) != 74898)) {
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("pdf")) {
                cVarH.L(573860003);
                x2bVarA = z2b.a(R.drawable.doctype_pdf, 0, cVarH);
                cVarH.U(false);
            } else {
                cVarH.L(573861736);
                x2bVarA = z2b.a(R.drawable.ic_idl_resume_24, 0, cVarH);
                cVarH.U(false);
            }
            m07 m07Var = (m07) z92.R0(0, n9dVar.c);
            ne4 ne4Var = p97.a;
            o97 o97Var = (o97) cVarH.M(ne4Var);
            o97 o97Var2 = (o97) cVarH.M(ne4Var);
            tjf tjfVarA = tjf.a(o97Var2.j.e, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211);
            tjf tjfVar = o97Var2.j.g;
            hza hzaVar = new hza(16.0f, 24.0f, 16.0f, 24.0f);
            final boolean z = m07Var != null || v1c.h(str4);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = cVarH.a(z);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zA || objV == c0020a) {
                objV = new Function1() { // from class: z7d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((m74) obj).getClass();
                        boolean z2 = z;
                        if (z2) {
                            dg3.g("Resume File Preview");
                        }
                        return new c8d(0, z2);
                    }
                };
                cVarH.p(objV);
            }
            to4.b(boolValueOf, (Function1) objV, cVarH);
            Boolean boolValueOf2 = Boolean.valueOf(n9dVar.f);
            Boolean bool = Boolean.FALSE;
            boolean z2 = (i2 & 7168) == 2048 || ((i2 & 4096) != 0 && cVarH.x(n9dVar));
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new b8d(n9dVar, null);
                cVarH.p(objV2);
            }
            to4.f(boolValueOf2, bool, (Function2) objV2, cVarH);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.a aVar2 = o97Var.c;
            o97.a.e eVar = aVar2.a;
            int i3 = i2;
            e eVarA = ti1.a(eVarF, 1.0f, aVar2.a.g.e.b, ggd.a(16.0f));
            vs0.k kVar = vs0.c;
            af1.a aVar3 = c20.a.m;
            ob2 ob2VarA = mb2.a(kVar, aVar3, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar4 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
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
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar2);
            e eVarE = f.e(g.f(aVar, 1.0f), hzaVar);
            vs0.g gVar = vs0.g;
            af1.b bVar2 = c20.a.k;
            ehd ehdVarA = chd.a(gVar, bVar2, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarE);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar2);
            e eVarO = f.f(aVar, 8.0f).o(new LayoutWeightElement(1.0f, true));
            ehd ehdVarA2 = chd.a(vs0.a, bVar2, cVarH, 48);
            int iHashCode3 = Long.hashCode(cVarH.T);
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarO);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA2, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarH, iHashCode3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar2);
            f17.a(x2bVarA, null, f.j(aVar, 0.0f, 0.0f, 8.0f, 0.0f, 11), null, null, 0.0f, null, cVarH, 48, 120);
            e eVarJ = f.j(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            ob2 ob2VarA2 = mb2.a(kVar, aVar3, cVarH, 0);
            int iHashCode4 = Long.hashCode(cVarH.T);
            t8b t8bVarP4 = cVarH.P();
            e eVarC4 = androidx.compose.ui.c.c(cVarH, eVarJ);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar4);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP4, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode4))) {
                ja.h(iHashCode4, cVarH, iHashCode4, c0251a);
            }
            ygg.y(cVarH, eVarC4, eVar2);
            cif.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tjfVarA, cVarH, i3 & 14, 3120, 55294);
            if (m07Var == null && str4 == null) {
                strJ = z3.k(cVarH, 2023492728, R.string.resume_preview_loading_preview, cVarH, false);
            } else {
                cVarH.L(2023378834);
                strJ = ak2.J(R.string.resume_preview_added_date, new Object[]{str2}, cVarH);
                cVarH.U(false);
            }
            cif.b(strJ, f.j(aVar, 0.0f, 2.0f, 0.0f, 0.0f, 13), eVar.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, cVarH, 48, 0, 65528);
            cVarH.L(2017379807);
            cVarH.U(false);
            cVarH.U(true);
            cVarH.U(true);
            rq6.b(gu5Var, androidx.compose.ui.platform.f.a(aVar, "ResumeOptionsButton"), false, null, null, bh2.c(-1201684736, new ph2(o97Var), cVarH), cVarH, ((i3 >> 12) & 14) | 196656, 28);
            cVarH = cVarH;
            cVarH.U(true);
            if (m07Var != null) {
                cVarH.L(1386096058);
                a84.a(1.0f, 48, 1, eVar.g.e.b, cVarH, null);
                cVarH = cVarH;
                f17.b(m07Var, "", androidx.compose.ui.platform.f.a(g.d(aVar, 1.0f), "ResumePdfThumbnail"), null, cVarH, 432, 248);
                cVarH.U(false);
            } else {
                if (v1c.h(str4)) {
                    cVarH.L(1386547387);
                    cif.b(String.valueOf(str4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 25, 0, null, null, cVarH, 0, 3120, 120830);
                    cVarH = cVarH;
                } else {
                    cVarH.L(1377926721);
                }
                cVarH.U(false);
            }
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: a8d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d8d.a(str, str2, str3, n9dVar, gu5Var, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }
}
