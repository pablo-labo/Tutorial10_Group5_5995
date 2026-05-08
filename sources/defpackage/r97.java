package defpackage;

import android.net.Uri;
import defpackage.cd4;
import defpackage.xh8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class r97 implements xh8 {
    public static final pxc W;
    public static final pxc X;
    public static final pxc Y;
    public static final pxc Z;
    public static final Set<String> a0;
    public static final String b0;
    public static final String c0;
    public static final pxc d0;
    public static final pxc e0;
    public static final pxc f0;
    public static final Set<String> g0;
    public static final pxc h0;
    public static final pxc i0;
    public static final String j0;
    public static final pxc k0;
    public static final pxc l0;
    public static final pxc m0;
    public static final pxc n0;
    public static final pxc o0;
    public static final Set<String> p0;
    public static final Set<String> q0;
    public static final List<String> r0;
    public static final List<String> s0;
    public static final String t0;
    public static final List<String> u0;
    public static final String v0;
    public static final List<String> w0;
    public static final Set<String> x0;
    public static final Set<String> y0;
    public static final r97 a = new r97();
    public static final List<String> b = u63.a0("directapply", "tezjobs");
    public static final pxc c = new pxc("^(/m)?/settings((/(.+)?)|(/?))");
    public static final pxc d = new pxc("^(/m)?/resume((/(.+)?)|(/?))");
    public static final pxc e = new pxc("^(/m)?/viewjob$");
    public static final pxc f = new pxc("^/pagead/clk$");
    public static final pxc V = new pxc("^/rc/clk$");

    static {
        new pxc("^/rdp/\\w+/pdf$");
        new pxc("^/messaging/.+");
        W = new pxc(".*?\\b(?:indeedassessments)\\.(?:com|net)");
        X = new pxc("interviews\\..*?\\b(?:indeed)\\.(?:com|net)");
        Y = new pxc("(?:interview-rsvp-webapp|rsvp)\\..*?\\b(?:indeed)\\.(?:com|net)");
        Z = new pxc("(?:myjobs|myjobs-qa)\\..*?\\b(?:indeed)\\.(?:com|net)");
        a0 = ut0.I0(new String[]{"", "/conversations"});
        b0 = "/conversations/";
        c0 = "/conversations/new";
        d0 = new pxc("(?:messages|messages-qa)\\..*?\\b(?:indeed)\\.(?:com|net)");
        e0 = new pxc("^/notifications$");
        f0 = new pxc("^/career/.+");
        g0 = ut0.I0(new String[]{"/auth", "/account/login", "/account/register"});
        h0 = new pxc("^/cmp/.*$");
        i0 = new pxc("^/companies(/.*)?$");
        j0 = "is-ian-logout";
        k0 = new pxc("^/ace/availability$");
        l0 = new pxc("^/careerscout(/try|/mockinterview|/explorecareers)?$");
        m0 = new pxc("^/careerscout/mockinterview$");
        new pxc("^/careerscout/explorecareers$");
        n0 = new pxc("^/careerscout/interview-prep/history$");
        o0 = new pxc("^(?:[a-z]{2}\\.)?pathfinder(?:\\.sandbox\\.qa)?\\.indeed\\.(?:com|net)$");
        p0 = ut0.I0(new String[]{"to.indeed.com", "kimoyo.indeed.com", "kimoyo-qa.indeed.com", "kimoyolink.sandbox.qa.indeed.net", "kimoyoweb.sandbox.qa.indeed.net"});
        q0 = ut0.I0(new String[]{"indeedapply/applicationpreview/indeedresume", "indeedapply/applicationpreview/attachment"});
        r0 = u63.a0("jp.*\\.indeed\\.com$", "jp.*\\.indeed\\.net$");
        s0 = u63.a0("^.*\\.indeed\\.tech$", "^.*\\.indeed\\.com$", "^.*\\.indeed\\.net$", "^.*\\.indeed\\.co\\.uk$");
        t0 = "mypage.r-agent.com";
        u0 = u63.a0("hp", "jso", "serp", "postapply", "profile");
        v0 = "job.rikunabi.com";
        w0 = u63.a0("serp", "hp", "postapply", "profile");
        x0 = ut0.I0(new String[]{"/m/jobs", "/jobs"});
        y0 = ut0.I0(new String[]{"/indeedapply/success", "/indeedapply/s/success", "/indeedapply/form/post-apply", "/api/application/submit"});
    }

    public static boolean A(String str) {
        str.getClass();
        dd4 dd4Var = dd4.a;
        if (!dd4.i()) {
            return false;
        }
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        return ad4Var.e(cd4.a.p0) != cd4.x0.a.getValue() && t(str);
    }

    public static String a(Uri uri) {
        String path = uri.getPath();
        return path == null ? uri.getPath() : wve.D(path, "/", false) ? akb.j(1, 0, path) : path;
    }

    public static String b() {
        Lazy lazy = e87.a;
        return l5.m("https://", e87.b(d93.a(), d93.e()).c, "/support/contact");
    }

    public static String c(String str) {
        str.getClass();
        String queryParameter = Uri.parse(str).getQueryParameter("from");
        return (queryParameter == null || zve.U(queryParameter)) ? "deeplink" : queryParameter;
    }

    public static boolean e(String str) {
        String strA;
        str.getClass();
        Uri uri = Uri.parse(str);
        if (i(uri) && (strA = a(uri)) != null) {
            return k0.d(strA) || l0.d(strA);
        }
        return false;
    }

    public static boolean f(String str) {
        str.getClass();
        String host = Uri.parse(str).getHost();
        if (host == null) {
            return false;
        }
        return Z.d(host);
    }

    public static boolean g(String str) {
        String host;
        String strA;
        String host2;
        str.getClass();
        if (w(str)) {
            return true;
        }
        Uri uri = Uri.parse(str);
        if (j(str) && (host2 = uri.getHost()) != null) {
            List listK0 = zve.k0(host2, new String[]{"."});
            if (!(listK0 instanceof Collection) || !listK0.isEmpty()) {
                Iterator it = listK0.iterator();
                while (it.hasNext()) {
                    if (wl7.b((String) it.next(), "secure")) {
                        String path = uri.getPath();
                        if (path == null) {
                            path = "";
                        }
                        if (c.d(path)) {
                            return true;
                        }
                    }
                }
            }
        }
        Uri uri2 = Uri.parse(str);
        return j(str) && (host = uri2.getHost()) != null && (strA = a(uri2)) != null && zve.k0(host, new String[]{"."}).contains("profile") && d.d(strA);
    }

    public static boolean h(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host != null && ((Set) e87.c.getValue()).contains(host)) {
            return wl7.b(a(uri), "/m");
        }
        return false;
    }

    public static boolean i(Uri uri) {
        if (wl7.b(uri.getScheme(), "http") || wl7.b(uri.getScheme(), "https")) {
            List<String> list = s0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    String host = uri.getHost();
                    if (host != null ? new pxc(str).d(host) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean j(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        if (uri == null) {
            return false;
        }
        return i(uri);
    }

    public static boolean k(String str) {
        String strA;
        str.getClass();
        if (j(str) && (strA = a(Uri.parse(str))) != null) {
            return f.d(strA) || V.d(strA);
        }
        return false;
    }

    public static boolean l(String str) {
        String strA;
        str.getClass();
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host != null && ((Set) e87.c.getValue()).contains(host) && (strA = a(uri)) != null) {
            boolean zContains = x0.contains(strA);
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            boolean z = ad4Var.e(cd4.a.z0) == cd4.v2.a.getValue() && (wve.K(strA, "/q-", false) || wve.K(strA, "/l-", false)) && wve.D(strA, "html", false);
            if (zContains || z) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(String str) {
        str.getClass();
        if (!j(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        uri.getClass();
        String strA = a(uri);
        if (strA == null) {
            return false;
        }
        String strZ = z(uri, "jcsapply");
        if (strZ == null || strZ.length() == 0) {
            return e.d(strA);
        }
        return false;
    }

    public static boolean n(String str) {
        String strA;
        str.getClass();
        return o(str) && (strA = a(Uri.parse(str))) != null && !wve.K(strA, "/explore/setting", false) && wve.K(strA, "/explore", false);
    }

    public static boolean o(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        if (uri != null && (wl7.b(uri.getScheme(), "http") || wl7.b(uri.getScheme(), "https"))) {
            List<String> list = r0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str2 : list) {
                    String host = uri.getHost();
                    if (host != null ? new pxc(str2).d(host) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean p(String str) {
        String strA;
        str.getClass();
        return o(str) && (strA = a(Uri.parse(str))) != null && wve.K(strA, "/m/savedjoblist", false);
    }

    public static boolean q(String str) {
        String strA;
        str.getClass();
        return o(str) && (strA = a(Uri.parse(str))) != null && wve.K(strA, "/explore/setting", false);
    }

    public static boolean r(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        if (uri != null && wl7.b(uri.getScheme(), "https")) {
            return i(uri);
        }
        return false;
    }

    public static boolean s(String str) {
        String host;
        String strA;
        Uri uri = Uri.parse(str);
        if (uri == null || (host = uri.getHost()) == null || !d0.d(host) || (strA = a(uri)) == null) {
            return false;
        }
        return a0.contains(strA);
    }

    public static boolean t(String str) {
        String host;
        String strA;
        str.getClass();
        Uri uri = Uri.parse(str);
        if (uri == null || (host = uri.getHost()) == null || !d0.d(host) || (strA = a(uri)) == null) {
            return false;
        }
        return strA.equals(c0);
    }

    public static boolean u(String str) {
        String host;
        String strA;
        str.getClass();
        Uri uri = Uri.parse(str);
        return (uri == null || (host = uri.getHost()) == null || !d0.d(host) || (strA = a(uri)) == null || (!a0.contains(strA) && !wve.K(strA, b0, false))) ? false : true;
    }

    public static boolean v(String str) {
        String strA;
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        if (i(uri) && (strA = a(uri)) != null) {
            return e0.d(strA);
        }
        return false;
    }

    public static boolean w(String str) {
        String host;
        str.getClass();
        Uri uri = Uri.parse(str);
        if (j(str) && (host = uri.getHost()) != null) {
            return zve.k0(host, new String[]{"."}).contains("profile");
        }
        return false;
    }

    public static boolean x(String str) {
        String host;
        String strA;
        str.getClass();
        Uri uri = Uri.parse(str);
        if (j(str) && (host = uri.getHost()) != null && wl7.b(zve.k0(host, new String[]{"."}).get(0), "secure") && (strA = a(uri)) != null) {
            return g0.contains(strA);
        }
        return false;
    }

    public static boolean y(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host != null && ((Set) e87.c.getValue()).contains(host)) {
            return wl7.b(a(uri), "");
        }
        return false;
    }

    public static String z(Uri uri, String str) {
        if (uri != null) {
            try {
                return uri.getQueryParameter(str);
            } catch (UnsupportedOperationException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
