package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.selection.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.ytc;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class vj8 {
    public static final void a(final int i, gu5 gu5Var, b bVar, String str, boolean z) {
        final boolean z2;
        final String str2;
        final gu5 gu5Var2 = gu5Var;
        c cVarF = q6.f(566248254, gu5Var2, bVar, str);
        int i2 = (cVarF.a(z) ? 4 : 2) | i | (cVarF.K(str) ? 32 : 16);
        if (cVarF.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarF.M(p97.a);
            long j = z ? o97Var.c.b.g.g.c : o97Var.c.b.g.c;
            fv6 fv6Var = z ? fv6.C1 : null;
            e eVarF = g.f(e.a.b, 1.0f);
            o97.g gVar = o97Var.i;
            e eVarB = a.b(ti1.a(g.j(f.j(eVarF, 24.0f, 0.0f, 24.0f, 8.0f, 2), 52.0f, 0.0f, 2), 1.0f, j, ggd.a(8.0f)), z, false, new qed(3), gu5Var2, 10);
            z2 = z;
            str2 = str;
            gu5Var2 = gu5Var;
            gt6.j(str2, gu5Var2, eVarB, null, false, false, fv6Var, null, "button".concat(str), cVarF, (i2 >> 3) & 126, 184);
        } else {
            z2 = z;
            str2 = str;
            cVarF.D();
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var2, str2, z2) { // from class: uj8
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ gu5 c;

                {
                    this.a = z2;
                    this.b = str2;
                    this.c = gu5Var2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vj8.a(ka2.L(385), this.c, (b) obj, this.b, this.a);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(String str, b bVar, int i) {
        str.getClass();
        c cVarH = bVar.h(445409518);
        int i2 = i | (cVarH.K(str) ? 4 : 2);
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = f.f(androidx.compose.foundation.a.b(g.d(aVar, 1.0f), o97Var.c.b.g.a, ytc.a), 24.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
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
            f17.a(z2b.a(R.drawable.language_selector_hero, 0, cVarH), null, androidx.compose.ui.platform.f.a(g.h(g.r(f.j(aVar, 0.0f, 20.0f, 0.0f, 20.0f, 5), 320.0f), 160.0f), "welcomeImage"), null, ft2.a.g, 0.0f, null, cVarH, 24624, 104);
            fif.b(str, null, 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.d, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, i2 & 14, 0, 65022);
            cVarH = cVarH;
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new w91(str, i, 5);
        }
    }

    public static final void c(int i, b bVar) {
        c cVar;
        c cVarH = bVar.h(-1727238353);
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            x2b x2bVarA = z2b.a(R.drawable.language_selector_alphabets, 0, cVarH);
            String strI = ak2.I(R.string.language_label, cVarH);
            o97.g gVar = o97Var.i;
            o97.a.e eVar = o97Var.c.a;
            tjf tjfVar = o97Var.j.f;
            e.a aVar = e.a.b;
            f17.a(x2bVarA, strI, androidx.compose.ui.platform.f.a(g.h(g.r(f.j(aVar, 0.0f, 24.0f, 0.0f, 24.0f, 5), 100.0f), 80.0f), "languageSelectorInfoImage"), null, ft2.a.g, 0.0f, null, cVarH, 24576, 104);
            fif.b(ak2.I(R.string.language_selector_title_english, cVarH), f.j(aVar, 0.0f, 0.0f, 0.0f, 4.0f, 7), eVar.c, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVar, cVarH, 0, 0, 65016);
            cVar = cVarH;
            fif.b(ak2.I(R.string.language_selector_title_hindi, cVarH), f.j(aVar, 0.0f, 0.0f, 0.0f, 24.0f, 7), eVar.c, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjfVar, cVar, 0, 0, 65016);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new rh2(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(int i, gu5 gu5Var, b bVar, Function1 function1) {
        c cVarH = bVar.h(1745519938);
        int i2 = (cVarH.x(gu5Var) ? 32 : 16) | i | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            String strI = ak2.I(R.string.welcome_to_indeed_english, cVarH);
            String strI2 = ak2.I(R.string.welcome_to_indeed_hindi, cVarH);
            String strI3 = ak2.I(R.string.language_selector_get_started_english, cVarH);
            String strI4 = ak2.I(R.string.language_selector_get_started_hindi, cVarH);
            Object objV = cVarH.v();
            nj8 nj8Var = nj8.b;
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(nj8Var);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            if (((nj8) g4aVar.getValue()) == nj8Var) {
                strI = strI2;
            }
            if (((nj8) g4aVar.getValue()) == nj8Var) {
                strI3 = strI4;
            }
            o97 o97Var = (o97) cVarH.M(p97.a);
            boolean z = (i2 & 112) == 32;
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                objV2 = new sd(8, gu5Var);
                cVarH.p(objV2);
            }
            g71.a(false, (gu5) objV2, cVarH, 0, 1);
            long j = o97Var.c.b.i.b.c;
            ytc.a aVar = ytc.a;
            e.a aVar2 = e.a.b;
            e eVarM = pnb.M(g.d(androidx.compose.foundation.a.b(aVar2, j, aVar), 1.0f), pnb.L(0, 1, cVarH), true);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, cVarH, 48);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarM);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            String str = strI3;
            if (cVarH.S) {
                cVarH.y(aVar3);
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
            b(strI, cVarH, 0);
            c(0, cVarH);
            boolean z2 = ((nj8) g4aVar.getValue()) == nj8Var;
            String strI5 = ak2.I(R.string.language_selector_hindi, cVarH);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new bw(3, g4aVar);
                cVarH.p(objV3);
            }
            a(384, (gu5) objV3, cVarH, strI5, z2);
            boolean z3 = ((nj8) g4aVar.getValue()) == nj8.a;
            String strI6 = ak2.I(R.string.language_selector_english, cVarH);
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new wa0(2, g4aVar);
                cVarH.p(objV4);
            }
            a(384, (gu5) objV4, cVarH, strI6, z3);
            jh2.f(cVarH, new LayoutWeightElement(1.0f, true));
            boolean z4 = (i2 & 896) == 256;
            Object objV5 = cVarH.v();
            if (z4 || objV5 == c0020a) {
                objV5 = new yp0(5, function1, g4aVar);
                cVarH.p(objV5);
            }
            gt6.h(str, (gu5) objV5, androidx.compose.ui.platform.f.a(g.f(g.j(f.f(aVar2, 24.0f), 52.0f, 0.0f, 2), 1.0f), "getStartedButton"), null, false, false, null, null, null, cVarH, 0, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gh(gu5Var, i, 5, function1);
        }
    }
}
