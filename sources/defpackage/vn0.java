package defpackage;

import androidx.compose.foundation.a;
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
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vn0 {
    public static final void a(final x2b x2bVar, final String str, final long j, e eVar, b bVar, final int i) {
        final e eVar2;
        c cVarH = bVar.h(653872926);
        int i2 = i | (cVarH.x(x2bVar) ? 4 : 2) | (cVarH.K(str) ? 32 : 16) | (cVarH.e(j) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | 3072;
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            ehd ehdVarA = chd.a(vs0.a, c20.a.j, cVarH, 48);
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
            ygg.y(cVarH, ehdVarA, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            f17.a(x2bVar, null, g.r(aVar, 20.0f), null, null, 0.0f, new ih1(j, 5), cVarH, (i2 & 14) | 432, 56);
            o97.g gVar = o97Var.i;
            jh2.f(cVarH, g.r(aVar, 12.0f));
            cif.b(str, null, o97Var.c.a.g.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, cVarH, (i2 >> 3) & 14, 0, 65530);
            cVarH = cVarH;
            cVarH.U(true);
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, j, eVar2, i) { // from class: un0
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ e d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    vn0.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    public static final void b(wn0 wn0Var, e eVar, b bVar, int i) {
        ?? r13;
        c cVar;
        boolean z;
        c cVar2;
        String str = wn0Var.b;
        String str2 = wn0Var.a;
        c cVarH = bVar.h(-677152821);
        int i2 = (cVarH.K(wn0Var) ? 4 : 2) | i | (cVarH.K(eVar) ? 32 : 16);
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            if (str2 == null && str == null) {
                cVarH.L(400249591);
                cVarH.U(false);
                cVar = cVarH;
                r13 = 0;
            } else {
                cVarH.L(401957474);
                e eVarF = g.f(eVar, 1.0f);
                o97.f fVar = o97Var.h;
                o97.a aVar = o97Var.c;
                o97.a.e eVar2 = aVar.a;
                e eVarB = a.b(ygg.h(eVarF, ggd.a(fVar.a)), aVar.b.b, ytc.a);
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
                gl2.j.getClass();
                pm8.a aVar2 = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                gl2.a.d dVar = gl2.a.g;
                ygg.y(cVarH, ag9VarD, dVar);
                gl2.a.f fVar2 = gl2.a.f;
                ygg.y(cVarH, t8bVarP, fVar2);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVarH, iHashCode, c0251a);
                }
                gl2.a.e eVar3 = gl2.a.d;
                ygg.y(cVarH, eVarC, eVar3);
                e eVarF2 = f.f(g.f(e.a.b, 1.0f), 16.0f);
                ob2 ob2VarA = mb2.a(new vs0.i(8.0f, true, new us0(0)), c20.a.m, cVarH, 0);
                int iHashCode2 = Long.hashCode(cVarH.T);
                t8b t8bVarP2 = cVarH.P();
                e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF2);
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar2);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ob2VarA, dVar);
                ygg.y(cVarH, t8bVarP2, fVar2);
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                    ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
                }
                ygg.y(cVarH, eVarC2, eVar3);
                if (str2 == null) {
                    cVarH.L(-1853337326);
                    z = false;
                    cVarH.U(false);
                    cVar2 = cVarH;
                } else {
                    z = false;
                    cVarH.L(-1853337325);
                    c cVar3 = cVarH;
                    a(z2b.a(R.drawable.application_icon, 0, cVarH), str2, eVar2.e, null, cVar3, 0);
                    cVar3.U(false);
                    cVar2 = cVar3;
                }
                if (str == null) {
                    cVar2.L(-1852969697);
                } else {
                    cVar2.L(-1852969696);
                    a(z2b.a(R.drawable.responsive_icon, z ? 1 : 0, cVar2), str, eVar2.e, null, cVar2, 0);
                }
                cVar2.U(z);
                o6.j(cVar2, true, true, z);
                cVar = cVar2;
                r13 = z;
            }
        } else {
            c cVar4 = cVarH;
            r13 = 0;
            cVar4.D();
            cVar = cVar4;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new tn0(wn0Var, eVar, i, r13);
        }
    }
}
