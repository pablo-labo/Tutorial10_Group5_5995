package defpackage;

import android.net.Uri;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.cd4;
import defpackage.xh8;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zo6 implements xh8 {
    public static final zo6 a;
    public static final Set<String> b;
    public static List<fig> c;
    public static final Lazy d;
    public static final String e;
    public static final String f;

    public static final class a extends mj8 implements gu5<nig> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zo6 zo6Var) {
            super(0);
            this.$this_inject = zo6Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nig] */
        @Override // defpackage.gu5
        public final nig invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(nig.class), a9cVar);
        }
    }

    static {
        zo6 zo6Var = new zo6();
        a = zo6Var;
        b = ut0.I0(new String[]{"droid_load_reason", "from", "co", "hl", SessionEndedMetric.PROCESS_TYPE_VALUE, "filter", "bltk", "countrySelector", "onboardingData"});
        c = zr4.a;
        d = boa.E(qt8.a, new a(zo6Var));
        e = "reactnative://homepage";
        f = "reactnative://search";
    }

    public static String a(String str, String str2, Map map) {
        String strE = d93.e();
        String strA = d93.a();
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.path(str2);
        builderBuildUpon.appendQueryParameter("co", strA);
        if (!zve.L(str, "hl=", false)) {
            builderBuildUpon.appendQueryParameter("hl", strE);
        }
        gq6 gq6Var = gq6.HOME;
        builderBuildUpon.appendQueryParameter("droid_load_reason", gq6Var.a());
        if (!zve.L(str, "from=", false)) {
            builderBuildUpon.appendQueryParameter("from", gq6Var.a());
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    public static boolean e(String str, String str2) {
        Set<String> set;
        str.getClass();
        str2.getClass();
        Uri uri = Uri.parse(str2);
        Uri uri2 = Uri.parse(str);
        if (wl7.b(uri2.getHost(), uri.getHost())) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            String path2 = uri2.getPath();
            String strJ = path2 != null ? path2 : "";
            if (wve.D(strJ, "/", false)) {
                strJ = akb.j(1, 0, strJ);
            }
            if (wve.D(path, "/", false)) {
                path = akb.j(1, 0, path);
            }
            if (strJ.equals(path)) {
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                Iterator<String> it = uri.getQueryParameterNames().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    set = b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (!set.contains(next)) {
                        next.getClass();
                        linkedHashSet.add(next);
                    }
                }
                Iterator<String> it2 = uri2.getQueryParameterNames().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        for (String str3 : linkedHashSet) {
                            if (uri2.getQueryParameterNames().contains(str3) && wl7.b(uri2.getQueryParameter(str3), uri.getQueryParameter(str3))) {
                            }
                        }
                        return true;
                    }
                    String next2 = it2.next();
                    boolean zContains = linkedHashSet.contains(next2);
                    boolean zContains2 = set.contains(next2);
                    if (!zContains && !zContains2) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static void f() {
        String strH = t40.h();
        String strA = a(d93.c(), "m/", kc9.W(new Pair("bltk", strH)));
        iq6.b.put(xj1.b, new Pair(strH, strA));
    }

    public static String g(String str, gq6 gq6Var) {
        String queryParameter;
        str.getClass();
        Uri uri = Uri.parse(str);
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            str2.getClass();
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (!lowerCase.equals("droid_load_reason") && (queryParameter = uri.getQueryParameter(str2)) != null) {
                builderBuildUpon.appendQueryParameter(str2, queryParameter);
            }
        }
        builderBuildUpon.appendQueryParameter("droid_load_reason", gq6Var.a());
        if (uri.getQueryParameter("from") == null) {
            builderBuildUpon.appendQueryParameter("from", gq6Var.a());
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }

    public static xj1 h(String str) {
        str.getClass();
        dd4 dd4Var = dd4.a;
        if (dd4.f()) {
            r97.a.getClass();
            if (r97.o(str) && (r97.h(str) || r97.y(str) || r97.l(str))) {
                return xj1.X;
            }
            if (r97.n(str) && !dd4.g()) {
                return xj1.Y;
            }
            if (r97.p(str)) {
                return xj1.Z;
            }
            if (r97.q(str)) {
                return xj1.a0;
            }
            if (r97.u(str) && dd4.g()) {
                return xj1.b0;
            }
            return null;
        }
        r97.a.getClass();
        if (r97.h(str) || r97.y(str)) {
            return xj1.b;
        }
        boolean zJ = i6a.j();
        xj1 xj1Var = xj1.c;
        if (zJ && r97.f(str)) {
            return xj1Var;
        }
        boolean zI = dd4.i();
        xj1 xj1Var2 = xj1.d;
        if (zI && r97.u(str)) {
            if (r97.A(str)) {
                return null;
            }
            return xj1Var2;
        }
        if (!((h2g) cr8.p(h2g.class)).b()) {
            return null;
        }
        if (r97.f(str)) {
            return xj1Var;
        }
        if (r97.u(str)) {
            return xj1Var2;
        }
        if (r97.g(str)) {
            return xj1.e;
        }
        if (r97.v(str)) {
            return xj1.f;
        }
        return null;
    }

    public final String b() {
        String str;
        LinkedHashMap linkedHashMap = iq6.b;
        xj1 xj1Var = xj1.b;
        if (!linkedHashMap.containsKey(xj1Var)) {
            return c(xj1Var);
        }
        Pair pair = (Pair) linkedHashMap.get(xj1Var);
        return (pair == null || (str = (String) pair.e()) == null) ? c(xj1Var) : str;
    }

    public final String c(xj1 xj1Var) {
        Object next;
        String str;
        Object next2;
        String str2;
        String str3;
        Object next3;
        String str4;
        Object next4;
        String str5;
        Object next5;
        String str6;
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        Object obj = null;
        if (ad4Var.e(cd4.a.F0) != cd4.u2.a.getValue()) {
            switch (xj1Var.ordinal()) {
                case 0:
                    return a(d93.c(), "m/", null);
                case 1:
                    return a("https://myjobs.indeed.com/", "/", null);
                case 2:
                    return a("https://messages.indeed.com/", "conversations/", kc9.W(new Pair("filter", "Inbox")));
                case 3:
                    return a("https://profile.indeed.com/", "/", null);
                case 4:
                    return a(d93.c(), "notifications", null);
                case 5:
                    return "";
                case 6:
                    return a(d93.c(), "ace/availability/", null);
                case 7:
                    return a(d93.c(), "/m/", null);
                case 8:
                    return a("https://jp.indeed.com/", "/explore/discover", null);
                case DatadogLogGenerator.CRASH /* 9 */:
                    return a(d93.c(), "/m/savedjoblist", null);
                case 10:
                    return a("https://jp.indeed.com/", "/explore/setting", null);
                case 11:
                    return a("https://messages.indeed.com/", "conversations/", lc9.a0(new Pair("filter", "Inbox"), new Pair("hl", "ja"), new Pair("co", "jp")));
                default:
                    l.g();
                    return null;
            }
        }
        switch (xj1Var.ordinal()) {
            case 0:
                Iterator<T> it = c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (wve.E(((fig) next).a, sig.HOME.a(), true)) {
                        }
                    } else {
                        next = null;
                    }
                }
                fig figVar = (fig) next;
                return (figVar == null || (str = figVar.c) == null) ? a(d93.c(), "m/", null) : str;
            case 1:
                Iterator<T> it2 = c.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (wve.E(((fig) next2).a, sig.MY_JOBS.a(), true)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                fig figVar2 = (fig) next2;
                return (figVar2 == null || (str2 = figVar2.c) == null) ? a("https://myjobs.indeed.com/", "/", null) : str2;
            case 2:
                Iterator<T> it3 = c.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next6 = it3.next();
                        if (wve.E(((fig) next6).a, sig.MESSAGES.a(), true)) {
                            obj = next6;
                        }
                    }
                }
                fig figVar3 = (fig) obj;
                return (figVar3 == null || (str3 = figVar3.c) == null) ? a("https://messages.indeed.com/", "conversations/", kc9.W(new Pair("filter", "Inbox"))) : str3;
            case 3:
                Iterator<T> it4 = c.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next3 = it4.next();
                        if (wve.E(((fig) next3).a, sig.PROFILE.a(), true)) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                fig figVar4 = (fig) next3;
                return (figVar4 == null || (str4 = figVar4.c) == null) ? a("https://profile.indeed.com/", "/", null) : str4;
            case 4:
                Iterator<T> it5 = c.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next4 = it5.next();
                        if (wve.E(((fig) next4).a, sig.NOTIFICATIONS.a(), true)) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                fig figVar5 = (fig) next4;
                return (figVar5 == null || (str5 = figVar5.c) == null) ? a(d93.c(), "notifications", null) : str5;
            case 5:
                return "";
            case 6:
                Iterator<T> it6 = c.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next5 = it6.next();
                        if (wve.E(((fig) next5).a, sig.ACE.a(), true)) {
                        }
                    } else {
                        next5 = null;
                    }
                }
                fig figVar6 = (fig) next5;
                return (figVar6 == null || (str6 = figVar6.c) == null) ? a(d93.c(), "ace/availability/", null) : str6;
            case 7:
                return a(d93.c(), "/m/", null);
            case 8:
                return a("https://jp.indeed.com/", "/explore/discover", null);
            case DatadogLogGenerator.CRASH /* 9 */:
                return a(d93.c(), "/m/savedjoblist", null);
            case 10:
                return a("https://jp.indeed.com/", "/explore/setting", null);
            case 11:
                return a("https://messages.indeed.com/", "conversations/", lc9.a0(new Pair("filter", "Inbox"), new Pair("hl", "ja"), new Pair("co", "jp")));
            default:
                l.g();
                return null;
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
