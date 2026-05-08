package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.le0;
import defpackage.pm8;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class vg2 {
    public static final long a;

    static {
        int i = eu6.u0;
        a = eu6.l0;
    }

    public static final void a(e eVar, b bVar, int i) {
        e eVar2;
        c cVarH = bVar.h(576746291);
        int i2 = i | 6;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
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
            ev6.b(fv6.g8, null, null, zq6.Xs, a, null, cVarH, 27654, 38);
            cif.b(ak2.I(R.string.responsive_awaiting_response, cVarH), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, e(cVarH), cVarH, 0, 0, 65534);
            cVarH = cVarH;
            cVarH.U(true);
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xd(eVar2, i, 5);
        }
    }

    public static final void b(String str, b bVar, int i) {
        c cVar;
        str.getClass();
        c cVarH = bVar.h(-790032477);
        int i2 = (cVarH.K(str) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            ArrayList<Pair> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= str.length()) {
                    break;
                }
                int iS = zve.S(str, "<b>", i3, false, 4);
                if (iS != -1) {
                    if (i4 < iS) {
                        arrayList.add(new Pair(str.substring(i4, iS), Boolean.FALSE));
                    }
                    int i5 = iS + 3;
                    int iS2 = zve.S(str, "</b>", i5, false, 4);
                    if (iS2 == -1) {
                        arrayList.add(new Pair(str.substring(iS), Boolean.FALSE));
                        break;
                    } else {
                        arrayList.add(new Pair(str.substring(i5, iS2), Boolean.TRUE));
                        i4 = iS2 + 4;
                        i3 = i4;
                    }
                } else if (i4 < str.length()) {
                    arrayList.add(new Pair(str.substring(i4), Boolean.FALSE));
                }
            }
            cVarH.L(988047147);
            le0.b bVar2 = new le0.b();
            cVarH.L(988048408);
            for (Pair pair : arrayList) {
                String str2 = (String) pair.a();
                if (((Boolean) pair.b()).booleanValue()) {
                    cVarH.L(944783216);
                    int iK = bVar2.k(e(cVarH).a);
                    try {
                        ne7.a(bVar2, "awaitingStatus", "[status]");
                        bVar2.g(" " + wve.H(str2, ' ', (char) 160) + " ");
                        j6g j6gVar = j6g.a;
                        bVar2.i(iK);
                        cVarH.U(false);
                    } catch (Throwable th) {
                        bVar2.i(iK);
                        throw th;
                    }
                } else {
                    cVarH.L(945272241);
                    cVarH.U(false);
                    bVar2.g(str2);
                }
            }
            cVarH.U(false);
            le0 le0VarL = bVar2.l();
            cVarH.U(false);
            cVar = cVarH;
            cif.c(le0VarL, null, o97Var.c.a.c, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, kc9.W(new Pair("awaitingStatus", new me7(new sab(hh2.t(16), 4, hh2.t(16)), pi3.b))), null, o97Var.j.f, cVar, 0, 0, 97786);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ug2(str, i);
        }
    }

    public static final void c(int i, b bVar) {
        c cVarH = bVar.h(-1027669718);
        int i2 = 1;
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarA = a.a(g.h(g.f(aVar, 1.0f), 108.0f), new kx8(9187343241974906880L, 0L, u63.a0(new da2(o97Var.c.b.i.d.c), new da2(o97Var.c.b.i.b.c))), ytc.a, 4);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            f17.a(z2b.a(R.drawable.responsive_earned_image, 0, cVarH), null, g.n(aVar, 90.0f), null, ft2.a.b, 0.0f, null, cVarH, 25008, 104);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new zh1(i, i2);
        }
    }

    public static final void d(int i, b bVar) {
        c cVarH = bVar.h(2076079285);
        int i2 = 1;
        if (cVarH.o(i & 1, i != 0)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarA = a.a(g.h(g.f(aVar, 1.0f), 108.0f), new kx8(9187343241974906880L, 0L, u63.a0(new da2(pnb.g(4293058813L)), new da2(o97Var.c.c.g.b))), ytc.a, 4);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            f17.a(z2b.a(R.drawable.responsive_not_earned_image, 0, cVarH), null, g.n(aVar, 70.0f), null, ft2.a.b, 0.0f, null, cVarH, 25008, 104);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new vb2(i, i2);
        }
    }

    public static final tjf e(b bVar) {
        o97 o97Var = (o97) bVar.M(p97.a);
        return tjf.e((tjf) bVar.M(cif.a), a, o97Var.j.g.a.b, o97Var.f.c, null, null, 0L, null, 0, 0L, 16777208);
    }
}
