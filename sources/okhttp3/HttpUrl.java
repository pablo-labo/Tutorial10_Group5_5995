package okhttp3;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.l5;
import defpackage.mh7;
import defpackage.nic;
import defpackage.pxc;
import defpackage.r6;
import defpackage.t92;
import defpackage.zn1;
import defpackage.zve;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/HttpUrl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpUrl {
    public static final Companion k = new Companion(0);
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List<String> g;
    public final String h;
    public final String i;
    public final boolean j;

    public HttpUrl(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(zve.R(str, ':', length, false, 4) + 1, zve.R(str, '@', 0, false, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iR = zve.R(str, '/', length, false, 4);
        return str.substring(iR, Util.f(str, iR, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iR = zve.R(str, '/', length, false, 4);
        int iF = Util.f(str, iR, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iR < iF) {
            int i = iR + 1;
            int iE = Util.e(str, '/', i, iF);
            arrayList.add(str.substring(i, iE));
            iR = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iR = zve.R(str, TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR, 0, false, 6) + 1;
        return str.substring(iR, Util.e(str, '#', iR, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, Util.f(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).i.equals(this.i);
    }

    public final Builder f() {
        Builder builder = new Builder();
        String str = this.a;
        builder.a = str;
        builder.b = e();
        builder.c = a();
        builder.d = this.d;
        Companion companion = k;
        companion.getClass();
        int iB = Companion.b(str);
        int i = this.e;
        if (i == iB) {
            i = -1;
        }
        builder.e = i;
        ArrayList arrayList = builder.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        builder.g = strD != null ? Companion.f(Companion.a(companion, strD, 0, 0, " \"'<>#", 211)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(zve.R(str2, '#', 0, false, 6) + 1);
        }
        builder.h = strSubstring;
        return builder;
    }

    public final String g() throws EOFException {
        Builder builder;
        try {
            builder = new Builder();
            builder.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        builder.getClass();
        Companion companion = k;
        builder.b = Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        builder.c = Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return builder.b().i;
    }

    public final HttpUrl h(String str) throws EOFException {
        Builder builder;
        str.getClass();
        try {
            builder = new Builder();
            builder.d(this, str);
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        if (builder != null) {
            return builder.b();
        }
        return null;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        Builder builderF = f();
        ArrayList arrayList = builderF.f;
        String str = builderF.d;
        builderF.d = str != null ? new pxc("[\"<>^`{|}]").e(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, Companion.a(k, (String) arrayList.get(i), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = builderF.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? Companion.a(k, str2, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str3 = builderF.h;
        builderF.h = str3 != null ? Companion.a(k, str3, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = builderF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new pxc("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").e(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                l5.r(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final Companion i = new Companion(0);
        public String a;
        public String d;
        public final ArrayList f;
        public ArrayList g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final void a(String str, String str2) {
            str.getClass();
            if (this.g == null) {
                this.g = new ArrayList();
            }
            ArrayList arrayList = this.g;
            arrayList.getClass();
            Companion companion = HttpUrl.k;
            arrayList.add(Companion.a(companion, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219));
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? Companion.a(companion, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219) : null);
        }

        public final HttpUrl b() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                r6.g("scheme == null");
                return null;
            }
            Companion companion = HttpUrl.k;
            String strE = Companion.e(companion, this.b, 0, 0, 7);
            String strE2 = Companion.e(companion, this.c, 0, 0, 7);
            String str2 = this.d;
            if (str2 == null) {
                r6.g("host == null");
                return null;
            }
            int iB = this.e;
            if (iB == -1) {
                String str3 = this.a;
                str3.getClass();
                companion.getClass();
                iB = Companion.b(str3);
            }
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Companion.e(HttpUrl.k, (String) it.next(), 0, 0, 7));
            }
            ArrayList<String> arrayList4 = this.g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(t92.r0(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 != null ? Companion.e(HttpUrl.k, str4, 0, 0, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.h;
            return new HttpUrl(str, strE, strE2, str2, iB, arrayList3, arrayList, str5 != null ? Companion.e(HttpUrl.k, str5, 0, 0, 7) : null, toString());
        }

        public final void c(String str) {
            str.getClass();
            String strB = HostnamesKt.b(Companion.e(HttpUrl.k, str, 0, 0, 7));
            if (strB != null) {
                this.d = strB;
            } else {
                l5.q("unexpected host: ".concat(str));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:136:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(okhttp3.HttpUrl r24, java.lang.String r25) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 882
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.d(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final void e(String str) {
            str.getClass();
            if (str.equalsIgnoreCase("http")) {
                this.a = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.a = "https";
            } else {
                l5.q("unexpected scheme: ".concat(str));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "<init>", "()V", "", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static String a(Companion companion, String str, int i, int i2, String str2, int i3) throws EOFException {
            int i4 = (i3 & 1) != 0 ? 0 : i;
            int length = (i3 & 2) != 0 ? str.length() : i2;
            boolean z = (i3 & 8) == 0;
            boolean z2 = (i3 & 16) == 0;
            boolean z3 = (i3 & 32) == 0;
            boolean z4 = (i3 & 64) == 0;
            companion.getClass();
            str.getClass();
            int iCharCount = i4;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i5 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                int i6 = 32;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || zve.M(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !d(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                    zn1 zn1Var = new zn1();
                    zn1Var.P0(i4, iCharCount, str);
                    zn1 zn1Var2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z3) {
                                zn1Var.Q0(z ? "+" : "%2B");
                            } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || zve.M(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !d(iCharCount, length, str)))))) {
                                if (zn1Var2 == null) {
                                    zn1Var2 = new zn1();
                                }
                                zn1Var2.d1(iCodePointAt2);
                                while (!zn1Var2.W0()) {
                                    byte b = zn1Var2.readByte();
                                    zn1Var.r0(37);
                                    char[] cArr = HttpUrl.l;
                                    zn1Var.r0(cArr[((b & 255) >> 4) & 15]);
                                    zn1Var.r0(cArr[b & 15]);
                                }
                            } else {
                                zn1Var.d1(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i5 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i6 = 32;
                    }
                    return zn1Var.z1();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            return str.substring(i4, length);
        }

        public static int b(String str) {
            str.getClass();
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        public static HttpUrl c(String str) throws EOFException {
            str.getClass();
            Builder builder = new Builder();
            builder.d(null, str);
            return builder.b();
        }

        public static boolean d(int i, int i2, String str) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.q(str.charAt(i + 1)) != -1 && Util.q(str.charAt(i3)) != -1;
        }

        public static String e(Companion companion, String str, int i, int i2, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            boolean z = (i3 & 4) == 0;
            companion.getClass();
            str.getClass();
            int iCharCount = i;
            while (iCharCount < i2) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    zn1 zn1Var = new zn1();
                    zn1Var.P0(i, iCharCount, str);
                    while (iCharCount < i2) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                            int iQ = Util.q(str.charAt(iCharCount + 1));
                            int iQ2 = Util.q(str.charAt(i4));
                            if (iQ == -1 || iQ2 == -1) {
                                zn1Var.d1(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                zn1Var.r0((iQ << 4) + iQ2);
                                iCharCount = Character.charCount(iCodePointAt) + i4;
                            }
                        } else if (iCodePointAt == 43 && z) {
                            zn1Var.r0(32);
                            iCharCount++;
                        } else {
                            zn1Var.d1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return zn1Var.z1();
                }
                iCharCount++;
            }
            return str.substring(i, i2);
        }

        public static ArrayList f(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iR = zve.R(str, '&', i, false, 4);
                if (iR == -1) {
                    iR = str.length();
                }
                int iR2 = zve.R(str, '=', i, false, 4);
                if (iR2 == -1 || iR2 > iR) {
                    arrayList.add(str.substring(i, iR));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, iR2));
                    arrayList.add(str.substring(iR2 + 1, iR));
                }
                i = iR + 1;
            }
            return arrayList;
        }

        public static void g(StringBuilder sb, List list) {
            list.getClass();
            mh7 mh7VarG = nic.G(2, nic.H(0, list.size()));
            int i = mh7VarG.a;
            int i2 = mh7VarG.b;
            int i3 = mh7VarG.c;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }

        private Companion() {
        }
    }
}
