package defpackage;

import android.content.Context;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.wlappdebug.r;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class d93 implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new d93()));
    public static String b;
    public static String c;

    public static final class a extends mj8 implements gu5<r.b> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d93 d93Var) {
            super(0);
            this.$this_inject = d93Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public static String a() {
        String strE = bu8.a.e();
        if (strE != null) {
            return strE;
        }
        String str = b;
        if (str != null) {
            return str;
        }
        String country = Locale.getDefault().getCountry();
        country.getClass();
        return country;
    }

    public static String b() {
        Lazy lazy = e87.a;
        String str = e87.b(a(), e()).c;
        String lowerCase = "prod".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!lowerCase.equals("qa")) {
            return str;
        }
        List<String> list = w8c.a;
        xh3 xh3Var = xh3.b;
        xh3Var.getClass();
        return wl7.b((String) xh3.d.a(xh3.c[0], xh3Var), "e2eqa") ? wve.I(str, ".qa.indeed.net", ".qae2e.indeed.net") : str;
    }

    public static String c() {
        String andSet = w8c.f.getAndSet(null);
        if (andSet != null) {
            ArrayList arrayList = lz2.a;
            lz2.d("QaAutomationIntentHandler", "Got initial URL: ".concat(andSet), false, null);
        }
        if (andSet != null) {
            return andSet;
        }
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        String str = (String) bu8.q0.b(bu8.b[27], bu8Var);
        if (str != null) {
            return str;
        }
        nn0 nn0Var = nn0.a;
        String strA = nn0.a(g(), SessionEndedMetric.PROCESS_TYPE_VALUE, ee3.m((Context) nn0.b.getValue()).concat(",Android"));
        ((r.b) a.getValue()).b("sometimes", "homepage.countrySelector");
        Lazy lazy = e87.a;
        if (bu8Var.e() != null) {
            strA = nn0.a(strA, "countrySelector", "1");
        }
        String strF = bu8Var.f();
        return strF != null ? nn0.a(strA, "hl", strF) : strA;
    }

    public static String e() {
        String strF = bu8.a.f();
        if (strF != null) {
            return strF;
        }
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        return language;
    }

    public static Locale f() {
        return new Locale(e(), a());
    }

    public static String g() {
        return l5.m("https://", b(), "/m/");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
