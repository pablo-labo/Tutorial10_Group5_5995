package defpackage;

import android.net.Uri;
import android.util.Log;
import android.webkit.CookieManager;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.cd4;
import defpackage.ke9;
import defpackage.xh8;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class b87 implements xh8 {
    public static final pxc a;
    public static final Map<String, String> b;
    public static final d2f c;
    public static final Lazy d;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b87 b87Var) {
            super(0);
            this.$this_inject = b87Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    static {
        b87 b87Var = new b87();
        a = new pxc(".*?\\.(indeed\\.(?:com|com?\\.[a-z]{2}|net)|qa\\.indeed\\.net)$");
        b = lc9.a0(new Pair("m", "m"), new Pair("m_jobs", "m/jobs"), new Pair("m_viewjob", "m/viewjob"));
        c = new d2f(new vm1(9));
        d = boa.E(qt8.a, new a(b87Var));
    }

    public static void a(final CookieManager cookieManager, final String str, String str2, final String str3, String str4) {
        final String strM = l5.m("https://", str2, "/");
        ((gz4) d.getValue()).a("remove_non_root_cookies", new Function1() { // from class: a87
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                String str5 = str3;
                y3bVar.b("name", str5);
                for (Map.Entry<String, String> entry : b87.b.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    String strM2 = z3.m(strM, value, "/");
                    pxc pxcVar = b87.a;
                    CookieManager cookieManager2 = cookieManager;
                    boolean zF = b87.f(cookieManager2.getCookie(strM2), str5, null);
                    if (zF) {
                        b87.c(cookieManager2, strM2, str5, l5.l("/", value), str);
                    }
                    y3bVar.b(key, !zF ? "none" : b87.f(cookieManager2.getCookie(strM2), str5, null) ? "stayed" : "deleted");
                }
                return j6g.a;
            }
        });
        if (f(cookieManager.getCookie(strM), str3, str4)) {
            return;
        }
        Date date = new Date(System.currentTimeMillis() + 7776000000L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String str5 = simpleDateFormat.format(date);
        str5.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append("=");
        sb.append(str4);
        sb.append("; Domain=");
        sb.append(str);
        cookieManager.setCookie(strM, m6.h(sb, "; Expires=", str5, "; Path=/; SameSite=None; Secure"));
        cookieManager.flush();
    }

    public static void b(String str) {
        String strE;
        Object next;
        str.getClass();
        r97.a.getClass();
        if (r97.j(str) && (strE = e(str)) != null) {
            String host = Uri.parse(str).getHost();
            if (host == null) {
                host = "";
            }
            JobSearchApplication jobSearchApplication = JobSearchApplication.X;
            String strA = JobSearchApplication.a.a();
            d2f d2fVar = c;
            if (strA != null) {
                CookieManager cookieManager = (CookieManager) d2fVar.getValue();
                cookieManager.getClass();
                a(cookieManager, strE, host, "Device-ID", strA);
            }
            CookieManager cookieManager2 = (CookieManager) d2fVar.getValue();
            cookieManager2.getClass();
            c(cookieManager2, "https://" + host + "/", "Indeed-App-Proctor-Groups", "/", strE);
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            if (ad4Var.e(cd4.a.n0) == cd4.w0.a.getValue()) {
                return;
            }
            CookieManager cookieManager3 = (CookieManager) d2fVar.getValue();
            cookieManager3.getClass();
            Iterator it = zve.j0(dd4Var.a(), new char[]{','}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (zve.L((String) next, "droid_native_messaging", false)) {
                        break;
                    }
                }
            }
            String str2 = (String) next;
            a(cookieManager3, strE, host, "Indeed-App-Proctor-Groups", str2 != null ? str2 : "");
            ArrayList arrayList = lz2.a;
            String cookie = ((CookieManager) d2fVar.getValue()).getCookie("https://" + host + "/");
            StringBuilder sb = new StringBuilder("cookies: ");
            sb.append(cookie);
            Log.d("IndeedCookieHelper", sb.toString(), null);
        }
    }

    public static void c(CookieManager cookieManager, String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("=; Path=");
        sb.append(str3);
        cookieManager.setCookie(str, m6.h(sb, "; Domain=", str4, "; Expires=Fri, 5 Oct 2018 14:28:00 GMT"));
        cookieManager.setCookie(str, str2 + "=; Path=" + str3 + "; Expires=Fri, 5 Oct 2018 14:28:00 GMT");
    }

    @sy3
    public static String e(String str) {
        ke9 ke9VarC;
        str.getClass();
        String host = Uri.parse(str).getHost();
        if (host == null || (ke9VarC = a.c(host)) == null) {
            return null;
        }
        return (String) ((ke9.a) ke9VarC.a()).get(1);
    }

    public static boolean f(String str, String str2, String str3) {
        if (str == null) {
            return false;
        }
        ArrayList<Pair> arrayListA = gz2.a(str);
        if (arrayListA.isEmpty()) {
            return false;
        }
        for (Pair pair : arrayListA) {
            String str4 = (String) pair.a();
            String str5 = (String) pair.b();
            if (wl7.b(str4, str2) && (str3 == null || wl7.b(str5, str3))) {
                return true;
            }
        }
        return false;
    }

    @sy3
    public static void g(CookieManager cookieManager, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        String strE = e(str);
        if (strE == null) {
            ArrayList arrayList = lz2.a;
            lz2.c("IndeedCookieHelper", "url is not an Indeed URL: ".concat(str), false, new Exception(), 4);
            return;
        }
        cookieManager.setCookie(str, str2 + "=" + str3 + "; Path=/; Domain=" + strE + "; Max-Age=157680000");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
