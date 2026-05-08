package okhttp3;

import defpackage.ct0;
import defpackage.h5;
import defpackage.l5;
import defpackage.ojh;
import defpackage.r6;
import defpackage.sy3;
import defpackage.w92;
import defpackage.wve;
import defpackage.ze8;
import defpackage.zr4;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, ze8 {
    public static final Companion b = new Companion(0);
    public final String[] a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public final ArrayList a = new ArrayList(20);

        public final void a(String str, String str2) {
            str.getClass();
            str2.getClass();
            Headers.b.getClass();
            Companion.b(str);
            Companion.c(str2, str);
            c(str, str2);
        }

        public final void b(String str) {
            int iR = zve.R(str, ':', 1, false, 4);
            if (iR != -1) {
                c(str.substring(0, iR), str.substring(iR + 1));
            } else if (str.charAt(0) == ':') {
                c("", str.substring(1));
            } else {
                c("", str);
            }
        }

        public final void c(String str, String str2) {
            str.getClass();
            str2.getClass();
            ArrayList arrayList = this.a;
            arrayList.add(str);
            arrayList.add(zve.s0(str2).toString());
        }

        public final void d(String str, String str2) {
            str.getClass();
            str2.getClass();
            Headers.b.getClass();
            Companion.b(str);
            c(str, str2);
        }

        public final Headers e() {
            return new Headers((String[]) this.a.toArray(new String[0]));
        }

        public final String f(String str) {
            str.getClass();
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 2;
            int iO = ojh.o(size, 0, -2);
            if (iO > size) {
                return null;
            }
            while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == iO) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void g(String str) {
            str.getClass();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    public Headers(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        str.getClass();
        b.getClass();
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int iO = ojh.o(length, 0, -2);
        if (iO > length) {
            return null;
        }
        while (!wve.E(str, strArr[length], true)) {
            if (length == iO) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.a[i * 2];
    }

    public final Builder d() {
        Builder builder = new Builder();
        w92.x0(builder.a, this.a);
        return builder;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.a, ((Headers) obj).a);
        }
        return false;
    }

    public final TreeMap f() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            Locale locale = Locale.US;
            String strF = r6.f(locale, strB, locale);
            List arrayList = (List) treeMap.get(strF);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strF, arrayList);
            }
            arrayList.add(g(i));
        }
        return treeMap;
    }

    public final String g(int i) {
        return this.a[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final List<String> i(String str) {
        str.getClass();
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(g(i));
            }
        }
        if (arrayList == null) {
            return zr4.a;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(b(i), g(i));
        }
        return new ct0(pairArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strG = g(i);
            sb.append(strB);
            sb.append(": ");
            if (Util.p(strB)) {
                strG = "██";
            }
            sb.append(strG);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        @sy3
        public static Headers a(Map map) {
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = zve.s0(str).toString();
                String string2 = zve.s0(str2).toString();
                b(string);
                c(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new Headers(strArr);
        }

        public static void b(String str) {
            if (str.length() <= 0) {
                l5.q("name is empty");
                return;
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    h5.k(Util.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                    return;
                }
            }
        }

        public static void c(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    h5.k(Util.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(Util.p(str2) ? "" : ": ".concat(str)));
                    return;
                }
            }
        }

        public static Headers d(String... strArr) {
            if (strArr.length % 2 != 0) {
                l5.q("Expected alternating header names and values");
                return null;
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr2[i2];
                if (str == null) {
                    l5.q("Headers cannot be null");
                    return null;
                }
                strArr2[i2] = zve.s0(str).toString();
            }
            int iO = ojh.o(0, strArr2.length - 1, 2);
            if (iO >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    b(str2);
                    c(str3, str2);
                    if (i == iO) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(strArr2);
        }

        private Companion() {
        }
    }
}
