package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gje;
import defpackage.ig3;
import defpackage.j2h;
import defpackage.mu0;
import defpackage.q5b;
import defpackage.r6c;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class jsb {
    public static final hz1 a(qr7 qr7Var, String str) {
        ig3.a aVar;
        rr7 rr7Var;
        rr7 rr7Var2;
        String str2 = qr7Var.a;
        sr7 sr7Var = qr7Var.b;
        ig3.b bVar = null;
        bVar = null;
        if (sr7Var == null || (rr7Var2 = sr7Var.a) == null) {
            aVar = null;
        } else {
            Integer num = rr7Var2.b;
            ds7 ds7Var = rr7Var2.a;
            aVar = new ig3.a(sr7Var.b, ds7Var != null ? c(ds7Var) : null, num);
        }
        Boolean bool = sr7Var != null ? sr7Var.b : null;
        if (sr7Var != null && (rr7Var = sr7Var.c) != null) {
            Integer num2 = rr7Var.b;
            ds7 ds7Var2 = rr7Var.a;
            bVar = new ig3.b(sr7Var.b, ds7Var2 != null ? c(ds7Var2) : null, num2);
        }
        return new hz1(str, str2, new ig3(aVar, bool, bVar), qr7Var.c, 4);
    }

    public static final ig3 b(sr7 sr7Var) {
        ig3.a aVar;
        sr7Var.getClass();
        Boolean bool = sr7Var.b;
        rr7 rr7Var = sr7Var.a;
        ig3.b bVar = null;
        if (rr7Var != null) {
            ds7 ds7Var = rr7Var.a;
            aVar = new ig3.a(bool, ds7Var != null ? c(ds7Var) : null, rr7Var.b);
        } else {
            aVar = null;
        }
        rr7 rr7Var2 = sr7Var.c;
        if (rr7Var2 != null) {
            ds7 ds7Var2 = rr7Var2.a;
            bVar = new ig3.b(bool, ds7Var2 != null ? c(ds7Var2) : null, rr7Var2.b);
        }
        return new ig3(aVar, bool, bVar);
    }

    public static final s38 c(ds7 ds7Var) {
        ds7Var.getClass();
        switch (ds7Var.ordinal()) {
            case 0:
                return s38.d;
            case 1:
                return s38.e;
            case 2:
                return s38.f;
            case 3:
                return s38.V;
            case 4:
                return s38.W;
            case 5:
                return s38.X;
            case 6:
                return s38.Y;
            case 7:
                return s38.Z;
            case 8:
                return s38.a0;
            case DatadogLogGenerator.CRASH /* 9 */:
                return s38.b0;
            case 10:
                return s38.c0;
            case 11:
                return s38.d0;
            default:
                l.g();
                return null;
        }
    }

    public static final sr7 d(ig3 ig3Var) {
        rr7 rr7Var;
        ig3Var.getClass();
        ig3.a aVar = ig3Var.a;
        rr7 rr7Var2 = null;
        if (aVar != null) {
            s38 s38Var = aVar.b;
            rr7Var = new rr7(s38Var != null ? g(s38Var) : null, aVar.c);
        } else {
            rr7Var = null;
        }
        Boolean bool = ig3Var.b;
        ig3.b bVar = ig3Var.c;
        if (bVar != null) {
            s38 s38Var2 = bVar.b;
            rr7Var2 = new rr7(s38Var2 != null ? g(s38Var2) : null, bVar.c);
        }
        return new sr7(rr7Var, bool, rr7Var2);
    }

    public static final yr7 e(wj8 wj8Var) {
        wj8Var.getClass();
        return new yr7(wj8Var.a, wj8Var.b, wj8Var.c, wj8Var.d, wj8Var.e);
    }

    public static final bs7 f(mt9 mt9Var) {
        mt9Var.getClass();
        String str = mt9Var.b;
        String str2 = mt9Var.c;
        String str3 = mt9Var.d;
        ig3 ig3Var = mt9Var.f;
        return new bs7(str, str2, str3, ig3Var != null ? d(ig3Var) : null, mt9Var.e);
    }

    public static final ds7 g(s38 s38Var) {
        s38Var.getClass();
        switch (s38Var.ordinal()) {
            case 1:
                return ds7.a;
            case 2:
                return ds7.b;
            case 3:
                return ds7.c;
            case 4:
                return ds7.d;
            case 5:
                return ds7.e;
            case 6:
                return ds7.f;
            case 7:
                return ds7.V;
            case 8:
                return ds7.W;
            case DatadogLogGenerator.CRASH /* 9 */:
                return ds7.X;
            case 10:
                return ds7.Y;
            case 11:
                return ds7.Z;
            case 12:
                return ds7.a0;
            default:
                return null;
        }
    }

    public static final es7 h(n5b n5bVar) {
        s38 s38Var;
        n5bVar.getClass();
        String str = n5bVar.d;
        String str2 = n5bVar.e;
        String str3 = n5bVar.f;
        tg3 tg3Var = n5bVar.b;
        return new es7(str, str3, str2, new rr7((tg3Var == null || (s38Var = tg3Var.b) == null) ? null : g(s38Var), tg3Var != null ? tg3Var.c : null), n5bVar.c);
    }

    public static final ks7 i(p6c p6cVar) {
        s38 s38Var;
        p6cVar.getClass();
        String str = p6cVar.d;
        String str2 = p6cVar.e;
        tg3 tg3Var = p6cVar.b;
        return new ks7(str, str2, new rr7((tg3Var == null || (s38Var = tg3Var.b) == null) ? null : g(s38Var), tg3Var != null ? tg3Var.c : null), p6cVar.c);
    }

    public static final qs7 j(zie zieVar) {
        zieVar.getClass();
        String str = zieVar.b;
        if (str == null) {
            str = "";
        }
        Integer num = zieVar.c;
        dbf dbfVar = zieVar.i;
        String str2 = dbfVar != null ? dbfVar.a : null;
        String str3 = str2 == null ? "" : str2;
        String str4 = dbfVar != null ? dbfVar.b : null;
        return new qs7(str, num, new ts7(null, null, str3, str4 == null ? "" : str4, null));
    }

    public static final vs7 k(g2h g2hVar) {
        g2hVar.getClass();
        String str = g2hVar.b;
        String str2 = g2hVar.c;
        Locale locale = g2hVar.d;
        String country = locale != null ? locale.getCountry() : null;
        String str3 = g2hVar.e;
        ig3 ig3Var = g2hVar.f;
        return new vs7(ig3Var != null ? d(ig3Var) : null, str, str2, country, str3, g2hVar.g);
    }

    public static final vs7 l(j2h j2hVar) {
        String str;
        sr7 sr7Var;
        rr7 rr7Var;
        String str2 = j2hVar.b;
        String str3 = j2hVar.c;
        j2h.b bVar = j2hVar.d;
        rr7 rr7Var2 = null;
        String str4 = bVar != null ? bVar.a : null;
        if (bVar == null || (str = bVar.b) == null) {
            str = bVar != null ? bVar.c : null;
        }
        j2h.a aVar = j2hVar.e;
        if (aVar != null) {
            ig3 ig3Var = aVar.b;
            ig3.a aVar2 = ig3Var.a;
            if (aVar2 != null) {
                s38 s38Var = aVar2.b;
                rr7Var = new rr7(s38Var != null ? g(s38Var) : null, aVar2.c);
            } else {
                rr7Var = null;
            }
            Boolean bool = ig3Var.b;
            ig3.b bVar2 = ig3Var.c;
            if (bVar2 != null) {
                s38 s38Var2 = bVar2.b;
                rr7Var2 = new rr7(s38Var2 != null ? g(s38Var2) : null, bVar2.c);
            }
            sr7Var = new sr7(rr7Var, bool, rr7Var2);
        } else {
            sr7Var = null;
        }
        return new vs7(sr7Var, str2, str3, str4, str, j2hVar.f);
    }

    public static final yie m(gje.b bVar) {
        return bVar == null ? new yie(2) : new yie(bVar.a, bVar.b);
    }

    public static final zie n(qs7 qs7Var, String str) {
        qs7Var.getClass();
        if (str == null) {
            str = t40.h();
        }
        String str2 = str;
        String str3 = qs7Var.a;
        Integer num = qs7Var.b;
        ts7 ts7Var = qs7Var.c;
        return new zie(str2, str3, num, null, false, null, null, null, ts7Var != null ? new dbf(ts7Var.a, ts7Var.b) : null, null, 760);
    }

    public static final mu0 o(xr7 xr7Var, String str) {
        ds7 ds7Var;
        ds7 ds7Var2;
        String str2 = xr7Var.a;
        String str3 = xr7Var.c;
        sr7 sr7Var = xr7Var.b;
        mu0.a aVar = null;
        if (sr7Var != null) {
            rr7 rr7Var = sr7Var.c;
            Boolean bool = sr7Var.b;
            rr7 rr7Var2 = sr7Var.a;
            aVar = new mu0.a("", new ig3(new ig3.a(bool, (rr7Var2 == null || (ds7Var2 = rr7Var2.a) == null) ? null : c(ds7Var2), rr7Var2 != null ? rr7Var2.b : null), bool, new ig3.b(bool, (rr7Var == null || (ds7Var = rr7Var.a) == null) ? null : c(ds7Var), rr7Var != null ? rr7Var.b : null)));
        }
        return new mu0(str2, str3, aVar, str);
    }

    public static final pr7 p(m61 m61Var) {
        m61Var.getClass();
        tg3 tg3Var = m61Var.b;
        rr7 rr7Var = null;
        if (tg3Var != null) {
            s38 s38Var = tg3Var.b;
            rr7Var = new rr7(s38Var != null ? g(s38Var) : null, tg3Var.c);
        }
        return new pr7(m61Var.d, rr7Var, m61Var.c);
    }

    public static final tr7 q(go4 go4Var) {
        go4Var.getClass();
        String str = go4Var.c;
        String str2 = go4Var.e;
        String str3 = go4Var.g;
        String str4 = go4Var.h;
        String str5 = go4Var.i;
        ig3 ig3Var = go4Var.j;
        return new tr7(ig3Var != null ? d(ig3Var) : null, str, str2, str3, str4, str5);
    }

    public static final xr7 r(lu0 lu0Var) {
        lu0Var.getClass();
        String str = lu0Var.b;
        ig3 ig3Var = lu0Var.c;
        return new xr7(str, ig3Var != null ? d(ig3Var) : null, lu0Var.d);
    }

    public static final q5b s(es7 es7Var, String str) {
        String str2 = es7Var.a;
        Boolean bool = Boolean.FALSE;
        rr7 rr7Var = es7Var.d;
        ds7 ds7Var = rr7Var.a;
        return new q5b(str, new q5b.a("", new tg3(bool, ds7Var != null ? c(ds7Var) : null, rr7Var.b)), es7Var.b, es7Var.e, str2, es7Var.c);
    }

    public static final r6c t(ks7 ks7Var, String str) {
        ds7 ds7Var;
        String str2 = ks7Var.a;
        Boolean bool = Boolean.FALSE;
        rr7 rr7Var = ks7Var.c;
        return new r6c(str, new r6c.a("", new tg3(bool, (rr7Var == null || (ds7Var = rr7Var.a) == null) ? null : c(ds7Var), rr7Var != null ? rr7Var.b : null)), ks7Var.d, str2, ks7Var.b);
    }

    public static final j2h u(vs7 vs7Var, String str) {
        rr7 rr7Var;
        ds7 ds7Var;
        rr7 rr7Var2;
        rr7 rr7Var3;
        ds7 ds7Var2;
        rr7 rr7Var4;
        String str2 = vs7Var.a;
        String str3 = vs7Var.b;
        String str4 = vs7Var.c;
        String str5 = vs7Var.d;
        j2h.b bVar = new j2h.b(str4, str5, str5);
        sr7 sr7Var = vs7Var.e;
        Integer num = (sr7Var == null || (rr7Var4 = sr7Var.a) == null) ? null : rr7Var4.b;
        ig3.a aVar = new ig3.a(sr7Var != null ? sr7Var.b : null, (sr7Var == null || (rr7Var3 = sr7Var.a) == null || (ds7Var2 = rr7Var3.a) == null) ? null : c(ds7Var2), num);
        Boolean bool = sr7Var != null ? sr7Var.b : null;
        Integer num2 = (sr7Var == null || (rr7Var2 = sr7Var.c) == null) ? null : rr7Var2.b;
        return new j2h(str, str2, str3, bVar, new j2h.a("", new ig3(aVar, bool, new ig3.b(sr7Var != null ? sr7Var.b : null, (sr7Var == null || (rr7Var = sr7Var.c) == null || (ds7Var = rr7Var.a) == null) ? null : c(ds7Var), num2))), vs7Var.f);
    }
}
