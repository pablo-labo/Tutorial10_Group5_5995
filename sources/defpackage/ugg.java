package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.o97;
import defpackage.pm8;
import defpackage.rx8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ugg {
    public static final void a(final gu5<j6g> gu5Var, b bVar, int i) {
        c cVar;
        b.a.C0020a c0020a;
        c cVarH = bVar.h(1911465677);
        int i2 = i | (cVarH.x(gu5Var) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            cVarH.L(-1327479285);
            le0.b bVar2 = new le0.b();
            String strI = ak2.I(R.string.updated_terms_message, cVarH);
            String strI2 = ak2.I(R.string.terms_of_service, cVarH);
            String strI3 = ak2.I(R.string.updated_terms_message_bold, cVarH);
            bVar2.g(strI);
            int iS = zve.S(strI, strI2, 0, false, 6);
            odf odfVar = odf.c;
            b.a.C0020a c0020a2 = b.a.a;
            if (iS >= 0) {
                cVarH.L(-1700238233);
                int length = strI2.length() + iS;
                boolean z = (i2 & 14) == 4;
                Object objV = cVarH.v();
                if (z || objV == c0020a2) {
                    objV = new tx8() { // from class: sgg
                        @Override // defpackage.tx8
                        public final void a(rx8 rx8Var) {
                            rx8Var.getClass();
                            gu5Var.invoke();
                        }
                    };
                    cVarH.p(objV);
                }
                bVar2.c.add(new le0.b.a(iS, length, 8, new rx8.a((tx8) objV), null));
                c0020a = c0020a2;
                bVar2.b(new foe(o97Var.c.a.d, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odfVar, (vbe) null, 61438), iS, length);
            } else {
                c0020a = c0020a2;
                cVarH.L(-1704615557);
            }
            cVarH.U(false);
            int iS2 = zve.S(strI, strI3, 0, false, 6);
            if (iS2 >= 0) {
                bVar2.b(new foe(0L, 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531), iS2, strI3.length() + iS2);
            }
            le0 le0VarL = bVar2.l();
            cVarH.U(false);
            cVarH.L(-1327426077);
            le0.b bVar3 = new le0.b();
            String strI4 = ak2.I(R.string.updated_terms_message_accept_terms, cVarH);
            String strI5 = ak2.I(R.string.terms_of_service, cVarH);
            String strI6 = ak2.I(R.string.accept_terms, cVarH);
            bVar3.g(strI4);
            int iS3 = zve.S(strI4, strI6, 0, false, 6);
            if (iS3 >= 0) {
                bVar3.b(new foe(0L, 0L, to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65531), iS3, strI6.length() + iS3);
            }
            int iS4 = zve.S(strI4, strI5, 0, false, 6);
            if (iS4 >= 0) {
                cVarH.L(-1579029941);
                int length2 = strI5.length() + iS4;
                boolean z2 = (i2 & 14) == 4;
                Object objV2 = cVarH.v();
                if (z2 || objV2 == c0020a) {
                    objV2 = new tx8() { // from class: tgg
                        @Override // defpackage.tx8
                        public final void a(rx8 rx8Var) {
                            rx8Var.getClass();
                            gu5Var.invoke();
                        }
                    };
                    cVarH.p(objV2);
                }
                bVar3.c.add(new le0.b.a(iS4, length2, 8, new rx8.a((tx8) objV2), null));
                bVar3.b(new foe(o97Var.c.a.d, 0L, (to5) null, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, odfVar, (vbe) null, 61438), iS4, length2);
            } else {
                cVarH.L(-1585496417);
            }
            cVarH.U(false);
            le0 le0VarL2 = bVar3.l();
            cVarH.U(false);
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
            o97.h hVar = o97Var.j;
            o97.a.e eVar = o97Var.c.a;
            cif.c(le0VarL, f.j(aVar, 0.0f, 0.0f, 0.0f, 12.0f, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tjf.a(hVar.g, eVar.c, 0L, null, null, null, 0L, 1, 0L, null, null, 0, 16744446), cVarH, 0, 0, 131068);
            cif.c(le0VarL2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tjf.a(o97Var.j.g, eVar.c, 0L, null, null, null, 0L, 1, 0L, null, null, 0, 16744446), cVarH, 0, 0, 131070);
            cVar = cVarH;
            cVar.U(true);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new rw0(i, 2, gu5Var);
        }
    }

    public static final void b(final int i, final gu5 gu5Var, final gu5 gu5Var2, b bVar, final boolean z) {
        e.a aVar;
        boolean z2;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 818057660);
        int i2 = i | (cVarC.x(gu5Var) ? 4 : 2) | (cVarC.x(gu5Var2) ? 32 : 16) | (cVarC.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarC.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarC.M(p97.a);
            zrd zrdVarL = pnb.L(0, 1, cVarC);
            e.a aVar2 = e.a.b;
            e eVarM = pnb.M(aVar2, zrdVarL, true);
            o97.g gVar = o97Var.i;
            o97.a aVar3 = o97Var.c;
            e eVarD = g.d(a.b(androidx.compose.ui.platform.f.a(f.f(eVarM, 24.0f), "UpdatedTerms"), aVar3.b.a, ytc.a), 1.0f);
            ob2 ob2VarA = mb2.a(vs0.e, c20.a.m, cVarC, 6);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e eVarC = androidx.compose.ui.c.c(cVarC, eVarD);
            gl2.j.getClass();
            pm8.a aVar4 = gl2.a.b;
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar4);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ob2VarA, gl2.a.g);
            ygg.y(cVarC, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarC, iHashCode, c0251a);
            }
            ygg.y(cVarC, eVarC, gl2.a.d);
            f17.a(z2b.a(R.drawable.ic_megaphone, 0, cVarC), ak2.I(R.string.a11y_updated_terms, cVarC), g.a(aVar2, 200.0f, 170.0f).o(new HorizontalAlignElement(c20.a.n)), null, null, 0.0f, null, cVarC, 0, 120);
            cif.b(ak2.I(R.string.updated_terms_title, cVarC), f.h(aVar2, 0.0f, 12.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.e, aVar3.a.c, 0L, o97Var.f.c, null, null, 0L, 1, 0L, null, null, 0, 16744442), cVarC, 0, 0, 65532);
            boolean z3 = (i2 & 14) == 4;
            Object objV = cVarC.v();
            b.a.C0020a c0020a = b.a.a;
            if (z3 || objV == c0020a) {
                objV = new vr(11, gu5Var);
                cVarC.p(objV);
            }
            a((gu5) objV, cVarC, 0);
            if (z) {
                cVarC.L(-519147598);
                aVar = aVar2;
                tr6.b(b20.CRITICAL, androidx.compose.ui.platform.f.a(f.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), "RecordConsentError"), fv6.o3, null, ak2.I(R.string.record_consent_error_message, cVarC), null, cVarC, 390, 40);
                z2 = false;
            } else {
                aVar = aVar2;
                z2 = false;
                cVarC.L(-522220132);
            }
            cVarC.U(z2);
            String strI = ak2.I(R.string.accept_terms, cVarC);
            boolean z4 = (i2 & 112) == 32 ? true : z2;
            Object objV2 = cVarC.v();
            if (z4 || objV2 == c0020a) {
                objV2 = new ib1(8, gu5Var2);
                cVarC.p(objV2);
            }
            gt6.h(strI, (gu5) objV2, f.h(g.f(aVar, 1.0f), 0.0f, 12.0f, 1), null, false, false, null, null, "agreeButton", cVarC, 100663296, 248);
            cVarC = cVarC;
            cVarC.U(true);
        } else {
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, gu5Var2, z) { // from class: rgg
                public final /* synthetic */ gu5 a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ boolean c;

                {
                    this.a = gu5Var;
                    this.b = gu5Var2;
                    this.c = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ugg.b(ka2.L(1), this.a, this.b, (b) obj, this.c);
                    return j6g.a;
                }
            };
        }
    }
}
