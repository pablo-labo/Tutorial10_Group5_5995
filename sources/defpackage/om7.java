package defpackage;

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
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class om7 {
    public static final void a(final String str, final x2b x2bVar, final gu5 gu5Var, final gu5 gu5Var2, e eVar, b bVar, final int i) {
        final e eVar2;
        str.getClass();
        x2bVar.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(318505493);
        int i2 = i | (cVarH.K(str) ? 4 : 2) | (cVarH.x(x2bVar) ? 32 : 16) | (cVarH.x(gu5Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | 24576;
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            o97.b bVar2 = o97Var.e;
            o97.a.e eVar3 = o97Var.c.a;
            o97.h hVar = o97Var.j;
            float fC = bkf.c(bVar2.f);
            e.a aVar = e.a.b;
            e eVarH = f.h(aVar, fC, 0.0f, 2);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarH);
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
            gl2.a.e eVar4 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar4);
            e eVarH2 = f.h(g.f(aVar, 1.0f), 0.0f, bkf.c(o97Var.e.g), 1);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarH2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar4);
            fv6 fv6Var = fv6.W1;
            e eVarH3 = androidx.compose.foundation.layout.b.a.h(aVar, c20.a.c);
            boolean z = (i2 & 896) == 256;
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                objV = new u9(7, gu5Var);
                cVarH.p(objV);
            }
            ev6.b(fv6Var, androidx.compose.foundation.b.d(eVarH3, false, null, null, (gu5) objV, 15), null, null, 0L, null, cVarH, 6, 60);
            cVarH.U(true);
            jh2.f(cVarH, g.h(aVar, 12.0f));
            f17.a(x2bVar, null, g.h(g.r(aVar, 192.0f), 128.0f).o(new HorizontalAlignElement(c20.a.n)), null, null, 0.0f, null, cVarH, ((i2 >> 3) & 14) | 48, 120);
            jh2.f(cVarH, g.h(aVar, 24.0f));
            cif.b(ak2.J(R.string.invitation_accepted_headline, new Object[]{str}, cVarH), g.f(aVar, 1.0f), eVar3.c, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, tjf.a(hVar.e, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211), cVarH, 48, 0, 65016);
            jh2.f(cVarH, g.h(aVar, 12.0f));
            cif.b(ak2.I(R.string.invitation_accepted_subtitle, cVarH), g.f(aVar, 1.0f), eVar3.a, 0L, null, null, null, 0L, null, new dcf(5), 0L, 0, false, 0, 0, null, hVar.g, cVarH, 48, 0, 65016);
            jh2.f(cVarH, g.h(aVar, 24.0f));
            gt6.h(ak2.I(R.string.invitation_accepted_button_text, cVarH), gu5Var2, g.f(aVar, 1.0f), null, false, false, fv6.z1, null, null, cVarH, ((i2 >> 6) & 112) | 1573248, 440);
            cVarH = cVarH;
            jh2.f(cVarH, g.h(aVar, 32.0f));
            cVarH.U(true);
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, x2bVar, gu5Var, gu5Var2, eVar2, i) { // from class: nm7
                public final /* synthetic */ String a;
                public final /* synthetic */ x2b b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ e e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    om7.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
