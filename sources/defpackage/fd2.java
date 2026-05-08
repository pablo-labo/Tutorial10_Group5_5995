package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class fd2 {
    public static final List<da2> a = u63.a0(new da2(pnb.g(4288245292L)), new da2(pnb.g(4290011179L)), new da2(pnb.g(4291248777L)), new da2(pnb.g(4285817319L)), new da2(pnb.g(4282348499L)), new da2(pnb.g(4280516259L)), new da2(pnb.g(4281696881L)));

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r16, final java.lang.String r17, float r18, androidx.compose.runtime.b r19, final int r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd2.a(java.lang.String, java.lang.String, float, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(final String str, final float f, b bVar, final int i) {
        int i2;
        float f2;
        c cVarH = bVar.h(-106443764);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.c(f) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            zq6 zq6Var = f < 40.0f ? zq6.Xs : zq6.Md;
            e eVarN = g.n(f.a(e.a.b, "CompanyLogoPlaceholder"), f);
            List<da2> list = a;
            int size = list.size();
            long j = list.get(((str.hashCode() % size) + size) % size).a;
            if (Float.compare(f, 20.0f) > 0) {
                o97.g gVar = o97Var.i;
                f2 = 8.0f;
            } else {
                o97.g gVar2 = o97Var.i;
                f2 = 4.0f;
            }
            e eVarB = a.b(eVarN, j, ggd.a(f2));
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
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
            ev6.b(fv6.g2, null, null, zq6Var, o97Var.c.b.a, null, cVarH, 6, 38);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ed2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    fd2.b(str, f, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
