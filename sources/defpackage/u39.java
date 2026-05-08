package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class u39 {
    public static final void a(gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, final int i) {
        int i2;
        final gu5<j6g> gu5Var3;
        int i3;
        gl2.a.d dVar;
        o97.c cVar;
        gl2.a.e eVar;
        af1.a aVar;
        int i4;
        gl2.a.f fVar;
        pm8.a aVar2;
        e.a aVar3;
        o97.d dVar2;
        int i5;
        int i6;
        final gu5<j6g> gu5Var4 = gu5Var;
        c cVarC = ja.c(gu5Var4, gu5Var2, bVar, 788299306);
        if ((i & 6) == 0) {
            i2 = i | (cVarC.x(gu5Var4) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarC.x(gu5Var2) ? 32 : 16;
        }
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarC.M(p97.a);
            ne4 ne4Var = fif.a;
            tjf tjfVar = (tjf) cVarC.M(ne4Var);
            o97.h hVar = o97Var.j;
            o97.c cVar2 = o97Var.f;
            o97.d dVar3 = o97Var.d;
            tjf tjfVarD = tjfVar.d(hVar.d);
            tjf tjfVarD2 = ((tjf) cVarC.M(ne4Var)).d(hVar.f);
            tjf tjfVarD3 = ((tjf) cVarC.M(ne4Var)).d(hVar.g);
            e.a aVar4 = e.a.b;
            e eVarM = pnb.M(a.b(g.d(aVar4, 1.0f), o97Var.c.b.a, ytc.a), pnb.L(0, 1, cVarC), true);
            vs0.i iVar = new vs0.i(16.0f, true, new us0(0));
            af1.a aVar5 = c20.a.n;
            ob2 ob2VarA = mb2.a(iVar, aVar5, cVarC, 48);
            int iHashCode = Long.hashCode(cVarC.T);
            t8b t8bVarP = cVarC.P();
            e eVarC = androidx.compose.ui.c.c(cVarC, eVarM);
            gl2.j.getClass();
            pm8.a aVar6 = gl2.a.b;
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar6);
            } else {
                cVarC.n();
            }
            gl2.a.d dVar4 = gl2.a.g;
            ygg.y(cVarC, ob2VarA, dVar4);
            gl2.a.f fVar2 = gl2.a.f;
            ygg.y(cVarC, t8bVarP, fVar2);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarC, iHashCode, c0251a);
            }
            gl2.a.e eVar2 = gl2.a.d;
            ygg.y(cVarC, eVarC, eVar2);
            if (((h2g) cr8.p(h2g.class)).a()) {
                cVarC.L(1849298714);
                ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarC, 0);
                int iHashCode2 = Long.hashCode(cVarC.T);
                t8b t8bVarP2 = cVarC.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarC, aVar4);
                cVarC.B();
                i3 = i2;
                if (cVarC.S) {
                    cVarC.y(aVar6);
                } else {
                    cVarC.n();
                }
                ygg.y(cVarC, ehdVarA, dVar4);
                ygg.y(cVarC, t8bVarP2, fVar2);
                if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode2))) {
                    ja.h(iHashCode2, cVarC, iHashCode2, c0251a);
                }
                ygg.y(cVarC, eVarC2, eVar2);
                fif.b(ak2.I(R.string.messaging_inbox_header_messages, cVarC), f.f(aVar4, 16.0f), 0L, 0L, cVar2.c, dVar3.a, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarC, 0, 0, 65436);
                jh2.f(cVarC, new LayoutWeightElement(1.0f, true));
                dVar = dVar4;
                cVar = cVar2;
                aVar = aVar5;
                eVar = eVar2;
                i4 = 0;
                rq6.b(gu5Var2, androidx.compose.ui.platform.f.a(f.j(aVar4, 0.0f, 8.0f, 0.0f, 0.0f, 13), "TopNavProfileButton"), false, null, null, wab.V, cVarC, ((i3 >> 3) & 14) | 196608, 28);
                cVarC = cVarC;
                cVarC.U(true);
                cVarC.U(false);
                aVar3 = aVar4;
                dVar2 = dVar3;
                i5 = 1;
                fVar = fVar2;
                aVar2 = aVar6;
            } else {
                i3 = i2;
                dVar = dVar4;
                cVar = cVar2;
                eVar = eVar2;
                aVar = aVar5;
                i4 = 0;
                cVarC.L(1850246601);
                String strI = ak2.I(R.string.messaging_inbox_header_messages, cVarC);
                pn5 pn5Var = dVar3.a;
                to5 to5Var = cVar.c;
                e eVarF = g.f(f.f(aVar4, 16.0f), 1.0f);
                fVar = fVar2;
                aVar2 = aVar6;
                aVar3 = aVar4;
                dVar2 = dVar3;
                i5 = 1;
                fif.b(strI, eVarF, 0L, 0L, to5Var, pn5Var, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD, cVarC, 0, 0, 65436);
                cVarC.U(false);
            }
            x2b x2bVarA = z2b.a(R.drawable.hero_working_9, i4, cVarC);
            e eVarH = f.h(aVar3, 0.0f, 16.0f, i5);
            e eVarH2 = g.h(aVar3, 0.0f);
            eVarH.getClass();
            eVarH2.getClass();
            int i7 = ((Configuration) cVarC.M(AndroidCompositionLocals_androidKt.a)).orientation;
            if (i7 != i5) {
                i6 = 2;
                if (i7 != 2) {
                    eVarH2 = aVar3;
                }
            } else {
                i6 = 2;
                eVarH2 = eVarH;
            }
            pm8.a aVar7 = aVar2;
            o97.d dVar5 = dVar2;
            gl2.a.f fVar3 = fVar;
            o97.c cVar3 = cVar;
            e.a aVar8 = aVar3;
            gl2.a.e eVar3 = eVar;
            gl2.a.d dVar6 = dVar;
            f17.a(x2bVarA, null, eVarH2, null, ft2.a.e, 0.0f, null, cVarC, 24624, 104);
            e eVarH3 = f.h(aVar8, 32.0f, 0.0f, i6);
            ob2 ob2VarA2 = mb2.a(new vs0.i(8.0f, true, new us0(0)), aVar, cVarC, 48);
            int iHashCode3 = Long.hashCode(cVarC.T);
            t8b t8bVarP3 = cVarC.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarC, eVarH3);
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar7);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ob2VarA2, dVar6);
            ygg.y(cVarC, t8bVarP3, fVar3);
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode3))) {
                ja.h(iHashCode3, cVarC, iHashCode3, c0251a);
            }
            ygg.y(cVarC, eVarC3, eVar3);
            c cVar4 = cVarC;
            fif.b(ak2.I(R.string.messaging_logged_out_screen_title, cVarC), null, 0L, 0L, cVar3.c, dVar5.a, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarD2, cVar4, 0, 0, 65438);
            fif.b(ak2.I(R.string.messaging_logged_out_screen_subtitle, cVarC), null, 0L, 0L, null, dVar5.a, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVarD3, cVar4, 0, 0, 64958);
            cVarC.U(true);
            jh2.f(cVarC, new LayoutWeightElement(1.0f, true));
            e eVarT = g.t(f.g(aVar8, 32.0f, 16.0f), 0.0f, 380.0f, 1);
            ob2 ob2VarA3 = mb2.a(new vs0.i(16.0f, true, new us0(0)), c20.a.m, cVarC, 0);
            int iHashCode4 = Long.hashCode(cVarC.T);
            t8b t8bVarP4 = cVarC.P();
            e eVarC4 = androidx.compose.ui.c.c(cVarC, eVarT);
            cVarC.B();
            if (cVarC.S) {
                cVarC.y(aVar7);
            } else {
                cVarC.n();
            }
            ygg.y(cVarC, ob2VarA3, dVar6);
            ygg.y(cVarC, t8bVarP4, fVar3);
            if (cVarC.S || !wl7.b(cVarC.v(), Integer.valueOf(iHashCode4))) {
                ja.h(iHashCode4, cVarC, iHashCode4, c0251a);
            }
            ygg.y(cVarC, eVarC4, eVar3);
            int i8 = ((i3 << 3) & 112) | 384;
            gu5Var3 = gu5Var2;
            gu5Var4 = gu5Var;
            gt6.j(ak2.I(R.string.messaging_create_account, cVarC), gu5Var4, g.f(aVar8, 1.0f), null, false, false, null, null, null, cVarC, i8, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            gt6.h(ak2.I(R.string.messaging_sign_in, cVarC), gu5Var4, g.f(aVar8, 1.0f), null, false, false, null, null, null, cVarC, i8, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarC.U(true);
            cVarC.U(true);
        } else {
            gu5Var3 = gu5Var2;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: s39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(i | 1);
                    u39.a(gu5Var4, gu5Var3, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
