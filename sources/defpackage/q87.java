package defpackage;

import com.wlappdebug.r;
import defpackage.xh8;
import java.util.Locale;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class q87 implements p87, jsa, xh8 {
    public final Lazy a;
    public final Lazy b;
    public String c;

    public static final class a extends mj8 implements gu5<r.b> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q87 q87Var) {
            super(0);
            this.$this_inject = q87Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<ep7> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q87 q87Var) {
            super(0);
            this.$this_inject = q87Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [ep7, java.lang.Object] */
        @Override // defpackage.gu5
        public final ep7 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ep7.class), a9cVar);
        }
    }

    public q87() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, aVar);
        this.b = boa.E(qt8Var, new b(this));
    }

    @Override // defpackage.p87
    public final String a() {
        String str = this.c;
        if (str == null) {
            d2f d2fVar = ajg.a;
            str = (String) ajg.a.getValue();
        }
        d2f d2fVar2 = ajg.a;
        return ajg.a(str);
    }

    @Override // defpackage.p87
    public final void b(String str) {
        this.c = str;
    }

    @Override // defpackage.p87
    public final String c() {
        int iOrdinal = ((ep7) this.b.getValue()).a().ordinal();
        if (iOrdinal == 0) {
            return "https://myjobs.indeed.com/";
        }
        if (iOrdinal == 1) {
            return "https://myjobs-qae2e.sandbox.qa.indeed.net/";
        }
        if (iOrdinal == 2) {
            return "https://myjobs.indeed.com/";
        }
        l.g();
        return null;
    }

    @Override // defpackage.p87
    public final String e() {
        ((r.b) this.a.getValue()).b("https://messages.indeed.com/", "indeedEndpointResolver.override (Qa, Prod, or Custom)");
        Locale locale = Locale.ROOT;
        String strF = r6.f(locale, "https://messages.indeed.com/", locale);
        if (strF.equals("qa")) {
            return "https://messages.sandbox.qa.indeed.net/";
        }
        strF.equals("prod");
        return "https://messages.indeed.com/";
    }

    @Override // defpackage.p87
    public final String f() {
        ((r.b) this.a.getValue()).b("https://secure.indeed.com/", "indeedEndpointResolver.override (Qa, Prod, or Custom)");
        Locale locale = Locale.ROOT;
        String strF = r6.f(locale, "https://secure.indeed.com/", locale);
        if (strF.equals("qa")) {
            return "https://secure.qa.indeed.net/";
        }
        strF.equals("prod");
        return "https://secure.indeed.com/";
    }

    @Override // defpackage.p87
    public final String g() {
        ((r.b) this.a.getValue()).b("https://www.indeed.com/", "indeedEndpointResolver.override (Qa, Prod, or Custom)");
        Locale locale = Locale.ROOT;
        String strF = r6.f(locale, "https://www.indeed.com/", locale);
        if (strF.equals("qa")) {
            return "https://www.qa.indeed.net/";
        }
        strF.equals("prod");
        return "https://www.indeed.com/";
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.p87
    public final String h() {
        bu8 bu8Var = bu8.a;
        String strE = bu8Var.e();
        if (strE == null) {
            strE = Locale.getDefault().getCountry();
            strE.getClass();
        }
        String strF = bu8Var.f();
        if (strF == null) {
            strF = Locale.getDefault().getLanguage();
            strF.getClass();
        }
        String strI = e87.b(strE, strF).c;
        if (((ep7) this.b.getValue()).a() == rp7.b) {
            strI = wve.I(strI, ".qa.indeed.net", ".qae2e.indeed.net");
        }
        return l5.m("https://", strI, "/m/");
    }
}
