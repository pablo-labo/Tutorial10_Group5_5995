package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class nx7 {
    public static final void a(vnd vndVar, Function1<? super String, j6g> function1, b bVar, int i) {
        Function1<? super String, j6g> function12;
        int i2;
        gl2.a.C0251a c0251a;
        Function1<? super String, j6g> function13;
        vndVar.getClass();
        function1.getClass();
        c cVarH = bVar.h(1391406382);
        int i3 = i | (cVarH.x(vndVar) ? 4 : 2) | (cVarH.x(function1) ? 32 : 16);
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            vs0.k kVar = vs0.c;
            ob2 ob2VarA = mb2.a(kVar, c20.a.n, cVarH, 48);
            int iG = cVarH.G();
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
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a2 = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a2);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            nx6.c(vndVar.c, null, false, false, false, null, null, null, null, null, cVarH, 0, 1022);
            o97.g gVar = o97Var.i;
            o97.a.e eVar2 = o97Var.c.a;
            e eVarF2 = g.f(f.g(aVar, 16.0f, 8.0f), 1.0f);
            ob2 ob2VarA2 = mb2.a(kVar, c20.a.m, cVarH, 48);
            int iG2 = cVarH.G();
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA2, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG2))) {
                c0251a = c0251a2;
                ja.h(iG2, cVarH, iG2, c0251a);
            } else {
                c0251a = c0251a2;
            }
            ygg.y(cVarH, eVarC2, eVar);
            e eVarF3 = g.f(aVar, 1.0f);
            boolean zX = ((i3 & 112) == 32) | cVarH.x(vndVar);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                function13 = function1;
                objV = new pa0(8, function13, vndVar);
                cVarH.p(objV);
            } else {
                function13 = function1;
            }
            e eVarH = f.h(androidx.compose.ui.c.a(eVarF3, tf7.a, new i72((gu5) objV)), 0.0f, 12.0f, 1);
            ehd ehdVarA = chd.a(vs0.a, c20.a.k, cVarH, 48);
            int iG3 = cVarH.G();
            t8b t8bVarP3 = cVarH.P();
            e eVarC3 = androidx.compose.ui.c.c(cVarH, eVarH);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ehdVarA, dVar);
            ygg.y(cVarH, t8bVarP3, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG3))) {
                ja.h(iG3, cVarH, iG3, c0251a);
            }
            ygg.y(cVarH, eVarC3, eVar);
            function12 = function13;
            i2 = 1;
            ev6.b(fv6.N9, null, null, null, eVar2.h.c.a, null, cVarH, 6, 46);
            jh2.f(cVarH, g.r(aVar, 12.0f));
            cif.b("Delete application", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, eVar2.h.c.a, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), cVarH, 6, 0, 65534);
            cVarH = cVarH;
            o6.j(cVarH, true, true, true);
        } else {
            function12 = function1;
            i2 = 1;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gs0(vndVar, i, i2, function12);
        }
    }
}
