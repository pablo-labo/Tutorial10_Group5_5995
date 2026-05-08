package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class aba {
    public static final Pattern q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern r = Pattern.compile("\\{(.+?)\\}");
    public static final String s = "http[s]?://";
    public static final String t = ".*";
    public static final String u = l5.m("\\E", ".*", "\\Q");
    public static final String v = "([^/]*?|)";
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final d2f f;
    public final d2f g;
    public final Lazy h;
    public boolean i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final d2f m;
    public final String n;
    public final d2f o;
    public final boolean p;

    public static final class a {
        public String a;
        public final ArrayList b = new ArrayList();
    }

    public static final class b extends mj8 implements gu5<List<String>> {
        public b() {
            super(0);
        }

        @Override // defpackage.gu5
        public final List<String> invoke() {
            List<String> list;
            Pair pair = (Pair) aba.this.j.getValue();
            return (pair == null || (list = (List) pair.d()) == null) ? new ArrayList() : list;
        }
    }

    public static final class c extends mj8 implements gu5<Pair<? extends List<String>, ? extends String>> {
        public c() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Pair<? extends List<String>, ? extends String> invoke() {
            String str = aba.this.a;
            if (str == null || Uri.parse(str).getFragment() == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String fragment = Uri.parse(str).getFragment();
            StringBuilder sb = new StringBuilder();
            fragment.getClass();
            aba.a(fragment, arrayList, sb);
            return new Pair<>(arrayList, sb.toString());
        }
    }

    public static final class d extends mj8 implements gu5<Pattern> {
        public d() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Pattern invoke() {
            String str = (String) aba.this.l.getValue();
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public static final class e extends mj8 implements gu5<String> {
        public e() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            Pair pair = (Pair) aba.this.j.getValue();
            if (pair != null) {
                return (String) pair.e();
            }
            return null;
        }
    }

    public static final class f extends mj8 implements gu5<Boolean> {
        public f() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            String str = aba.this.a;
            return Boolean.valueOf((str == null || Uri.parse(str).getQuery() == null) ? false : true);
        }
    }

    public static final class g extends mj8 implements gu5<Pattern> {
        public g() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Pattern invoke() {
            String str = aba.this.n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    public static final class h extends mj8 implements gu5<Pattern> {
        public h() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Pattern invoke() {
            String str = aba.this.e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public static final class i extends mj8 implements gu5<Map<String, a>> {
        public i() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Map<String, a> invoke() {
            aba abaVar = aba.this;
            String str = abaVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (((Boolean) abaVar.g.getValue()).booleanValue()) {
                Uri uri = Uri.parse(str);
                for (String str2 : uri.getQueryParameterNames()) {
                    StringBuilder sb = new StringBuilder();
                    List<String> queryParameters = uri.getQueryParameters(str2);
                    if (queryParameters.size() > 1) {
                        h5.k(akb.k("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                        return null;
                    }
                    String str3 = (String) z92.Q0(queryParameters);
                    if (str3 == null) {
                        abaVar.i = true;
                        str3 = str2;
                    }
                    Matcher matcher = aba.r.matcher(str3);
                    a aVar = new a();
                    int iEnd = 0;
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        aVar.b.add(strGroup);
                        str3.getClass();
                        sb.append(Pattern.quote(str3.substring(iEnd, matcher.start())));
                        sb.append("(.+?)?");
                        iEnd = matcher.end();
                    }
                    if (iEnd < str3.length()) {
                        sb.append(Pattern.quote(str3.substring(iEnd)));
                    }
                    aVar.a = wve.I(sb.toString(), aba.t, aba.u);
                    str2.getClass();
                    linkedHashMap.put(str2, aVar);
                }
            }
            return linkedHashMap;
        }
    }

    public aba(String str, String str2, String str3) {
        List listQ1;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = new d2f(new h());
        this.g = new d2f(new f());
        i iVar = new i();
        qt8 qt8Var = qt8.c;
        this.h = boa.E(qt8Var, iVar);
        this.j = boa.E(qt8Var, new c());
        this.k = boa.E(qt8Var, new b());
        this.l = boa.E(qt8Var, new e());
        this.m = new d2f(new d());
        this.o = new d2f(new g());
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.matcher(str).find()) {
                sb.append(s);
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            a(str.substring(0, matcher.start()), arrayList, sb);
            String str4 = t;
            this.p = (zve.L(sb, str4, false) || zve.L(sb, v, false)) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            this.e = wve.I(sb.toString(), str4, u);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            h5.k(l5.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        List<String> listG = new pxc("/").g(str3, 0);
        if (listG.isEmpty()) {
            listQ1 = zr4.a;
        } else {
            ListIterator<String> listIterator = listG.listIterator(listG.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listQ1 = z92.q1(listG, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listQ1 = zr4.a;
        }
        this.n = wve.I(akb.k("^(", (String) listQ1.get(0), "|[*]+)/(", (String) listQ1.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            }
            sb.append(v);
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
    }

    public static void g(Bundle bundle, String str, String str2, androidx.navigation.b bVar) {
        if (bVar == null) {
            bundle.putString(str, str2);
            return;
        }
        r<Object> rVar = bVar.a;
        str.getClass();
        rVar.e(bundle, str, rVar.h(str2));
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        return z92.T0(pathSegments, pathSegments2).size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            w92.w0(arrayList, ((a) it.next()).b);
        }
        return z92.h1(z92.h1(this.d, arrayList), (List) this.k.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        uri.getClass();
        linkedHashMap.getClass();
        Pattern pattern = (Pattern) this.f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (e(matcher, bundle, linkedHashMap) && (!((Boolean) this.g.getValue()).booleanValue() || f(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.m.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.k.getValue();
                    ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                    int i2 = 0;
                    for (Object obj : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            u63.o0();
                            throw null;
                        }
                        String str = (String) obj;
                        String strDecode = Uri.decode(matcher2.group(i3));
                        androidx.navigation.b bVar = (androidx.navigation.b) linkedHashMap.get(str);
                        try {
                            strDecode.getClass();
                            g(bundle, str, strDecode, bVar);
                            arrayList.add(j6g.a);
                            i2 = i3;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (yid.h(linkedHashMap, new bba(bundle)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, Map<String, androidx.navigation.b> map) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u63.o0();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i3));
            androidx.navigation.b bVar = map.get(str);
            try {
                strDecode.getClass();
                g(bundle, str, strDecode, bVar);
                arrayList2.add(j6g.a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aba)) {
            aba abaVar = (aba) obj;
            if (wl7.b(this.a, abaVar.a) && wl7.b(this.b, abaVar.b) && wl7.b(this.c, abaVar.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(Uri uri, Bundle bundle, Map<String, androidx.navigation.b> map) {
        int i2;
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = u63.Z(query);
            }
            queryParameters.getClass();
            int i3 = 0;
            Bundle bundleA = aq1.a(new Pair[0]);
            Iterator it = aVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                androidx.navigation.b bVar = map.get(str2);
                r<Object> rVar = bVar != null ? bVar.a : null;
                if ((rVar instanceof o92) && !bVar.c) {
                    rVar.e(bundleA, str2, ((o92) rVar).h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = aVar.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i3;
                }
                ArrayList arrayList = aVar.b;
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                int i4 = i3;
                for (Object obj : arrayList) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        u63.o0();
                        throw null;
                    }
                    String str5 = (String) obj;
                    String strGroup = matcher.group(i5);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    androidx.navigation.b bVar2 = map.get(str5);
                    try {
                        if (bundleA.containsKey(str5)) {
                            if (bundleA.containsKey(str5)) {
                                if (bVar2 != null) {
                                    r<Object> rVar2 = bVar2.a;
                                    i2 = i3;
                                    Object objA = rVar2.a(str5, bundleA);
                                    if (!bundleA.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    rVar2.e(bundleA, str5, rVar2.c(objA, strGroup));
                                } else {
                                    i2 = i3;
                                }
                                z = i2;
                            } else {
                                i2 = i3;
                                z = 1;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = j6g.a;
                            }
                        } else {
                            g(bundleA, str5, strGroup, bVar2);
                            objValueOf = j6g.a;
                            i2 = i3;
                        }
                    } catch (IllegalArgumentException unused2) {
                        i2 = i3;
                    }
                    arrayList2.add(objValueOf);
                    i4 = i5;
                    i3 = i2;
                }
            }
            bundle.putAll(bundleA);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
