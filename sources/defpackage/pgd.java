package defpackage;

import com.linecorp.linesdk.auth.LineAuthenticationParams;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pgd {
    public final n0 a;

    public static final class a extends pgd {
        public static final a b = new a(n0.IndeedApply);
    }

    public static final class a0 extends pgd {
        public static final a0 b = new a0(n0.MyJobs);
    }

    public static final class b extends pgd {
        public static final b b = new b(n0.Assessments);
    }

    public static final class b0 extends pgd {
        public static final b0 b = new b0(n0.Notifications);
    }

    public static final class c extends pgd {
        public static final c b = new c(n0.ExternalApp);
    }

    public static final class c0 extends pgd {
        public static final c0 b = new c0(n0.Other);
    }

    public static final class d extends pgd {
        public static final d b = new d(n0.Passport);
    }

    public static final class d0 extends pgd {
        public static final d0 b = new d0(n0.Passport);
    }

    public static final class e extends pgd {
        public static final e b = new e(n0.Passport);
    }

    public static final class e0 extends pgd {
        public static final e0 b = new e0(n0.Pathfinder);
    }

    public static final class f extends pgd {
        public static final f b = new f(n0.Companies);
    }

    public static final class f0 extends pgd {
        public static final f0 b = new f0(n0.Profile);
    }

    public static final class g extends pgd {
        public static final g b = new g(n0.CompanyPage);
    }

    public static final class g0 extends pgd {
        public static final g0 b = new g0(n0.RecruitAgent);
    }

    public static final class h extends pgd {
        public static final h b = new h(n0.ZendeskContactSent);
    }

    public static final class h0 extends pgd {
        public static final h0 b = new h0(n0.RecruitNewGradPromo);
    }

    public static final class i extends pgd {
        public static final i b = new i(n0.Passport);
    }

    public static final class i0 extends pgd {
        public static final i0 b = new i0(n0.Salaries);
    }

    public static final class j extends pgd {
        public static final j b = new j(n0.GoogleSignIn);
    }

    public static final class j0 extends pgd {
        public static final j0 b = new j0(n0.Passport);
    }

    public static final class k extends pgd {
        public static final k b = new k(n0.GraphQl);
    }

    public static final class k0 extends pgd {
        public static final k0 b = new k0(n0.Passport);
    }

    public static final class l extends pgd {
        public static final l b = new l(n0.IanLoginRedirect);
    }

    public static final class l0 extends pgd {
        public static final l0 b = new l0(n0.UnknownThirdPartyDomain);
    }

    public static final class m extends pgd {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(n0.IndeedApply);
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && wl7.b(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("IndeedApply(url=", this.b, ")");
        }
    }

    public static final class m0 extends pgd {
        public static final m0 b = new m0(n0.VipHost);
    }

    public static final class n extends pgd {
        public final String b;
        public final String c;
        public final String d;

        public n(String str, String str2, String str3) {
            super(n0.ExternalWebView);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return wl7.b(this.b, nVar.b) && wl7.b(this.c, nVar.c) && wl7.b(this.d, nVar.d);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return l6.i(u40.f("IndeedExternal(externalUrl=", this.b, ", ua=", this.c, ", params="), this.d, ")");
        }
    }

    public enum n0 {
        Assessments("assessments"),
        CompanyPage("companyPage"),
        Companies("companies"),
        ExternalApp("externalApp"),
        ExternalJsUrl("externalJsUrl"),
        ExternalWebView("externalWebView"),
        GeoLookup("geoLookup"),
        GraphQl("graphQL"),
        GoogleSignIn("googleSignIn"),
        HomePage("homePage"),
        IndeedApply("indeedApply"),
        LineSignIn("lineSignIn"),
        Messaging("messaging"),
        MyJobs("myJobs"),
        Notifications("notifications"),
        Other("other"),
        UnknownThirdPartyDomain("unknownThirdPartyDomain"),
        Passport("passport"),
        IanLoginRedirect("accountSettingsFromFsdvInitial"),
        Profile("profile"),
        RecruitAgent("recruitAgent"),
        RecruitNewGradPromo("recruitNewGradPromo"),
        JpRelease("jpRelease"),
        Salaries("salaries"),
        Serp("serp"),
        SetHomeCcAndGo("setHomeCcAndGo"),
        /* JADX INFO: Fake field, exist only in values array */
        Onboarding("onboarding"),
        Pathfinder("pathfinder"),
        MockInterview("mockInterview"),
        InterviewPrepHistory("interviewPrepHistory"),
        ViewJob("viewJob"),
        VirtualEvaluation("virtualEvaluation"),
        VipHost("vipHost"),
        ZendeskContactSent("zendeskContactSent");

        private final String value;

        n0(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static final class o extends pgd {
        public static final o b = new o(n0.GeoLookup);
    }

    public static final class p extends pgd {
        public static final p b = new p(n0.HomePage);
    }

    public static final class q extends pgd {
        public static final q b = new q(n0.Serp);
    }

    public static final class r extends pgd {
        public static final r b = new r(n0.ExternalJsUrl);
    }

    public static final class s extends pgd {
        public final String b;
        public final String c;

        public s(String str, String str2) {
            super(n0.SetHomeCcAndGo);
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return wl7.b(this.b, sVar.b) && wl7.b(this.c, sVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return akb.k("IndeedSetHomeCcAndGo(cc=", this.b, ", hl=", this.c, ")");
        }
    }

    public static final class t extends pgd {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(n0.ViewJob);
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && wl7.b(this.b, ((t) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("IndeedViewJob(url=", this.b, ")");
        }
    }

    public static final class u extends pgd {
        public static final u b = new u(n0.VirtualEvaluation);
    }

    public static final class v extends pgd {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(n0.InterviewPrepHistory);
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && wl7.b(this.b, ((v) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("InterviewPrepHistory(url=", this.b, ")");
        }
    }

    public static final class w extends pgd {
        public static final w b = new w(n0.JpRelease);
    }

    public static final class x extends pgd {
        public final String b;
        public final List<tpd> c;
        public final String d;
        public final String e;
        public final LineAuthenticationParams.b f;
        public final Locale g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(String str, List<? extends tpd> list, String str2, String str3, LineAuthenticationParams.b bVar, Locale locale) {
            super(n0.LineSignIn);
            str.getClass();
            this.b = str;
            this.c = list;
            this.d = str2;
            this.e = str3;
            this.f = bVar;
            this.g = locale;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return wl7.b(this.b, xVar.b) && wl7.b(this.c, xVar.c) && wl7.b(this.d, xVar.d) && wl7.b(this.e, xVar.e) && this.f == xVar.f && wl7.b(this.g, xVar.g);
        }

        public final int hashCode() {
            int iG = ia.g(this.c, this.b.hashCode() * 31, 31);
            String str = this.d;
            int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            LineAuthenticationParams.b bVar = this.f;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Locale locale = this.g;
            return iHashCode3 + (locale != null ? locale.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineSignIn(channelId=");
            sb.append(this.b);
            sb.append(", scopes=");
            sb.append(this.c);
            sb.append(", state=");
            ia.r(sb, this.d, ", nonce=", this.e, ", botPrompt=");
            sb.append(this.f);
            sb.append(", uiLocale=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class y extends pgd {
        public static final y b = new y(n0.Messaging);
    }

    public static final class z extends pgd {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(n0.MockInterview);
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && wl7.b(this.b, ((z) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return l5.m("MockInterview(url=", this.b, ")");
        }
    }

    public pgd(n0 n0Var) {
        this.a = n0Var;
    }
}
