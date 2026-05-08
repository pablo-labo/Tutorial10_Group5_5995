package okhttp3;

import defpackage.akb;
import defpackage.ia;
import defpackage.ja;
import defpackage.l5;
import defpackage.wl7;
import defpackage.wve;
import defpackage.zve;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cookie {
    public static final Companion j = new Companion(0);
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public String a;
        public String b;
        public String d;
        public boolean f;
        public long c = 253402300799999L;
        public String e = "/";

        public final Cookie a() {
            String str = this.a;
            if (str == null) {
                ja.k("builder.name == null");
                return null;
            }
            String str2 = this.b;
            if (str2 == null) {
                ja.k("builder.value == null");
                return null;
            }
            long j = this.c;
            String str3 = this.d;
            if (str3 != null) {
                return new Cookie(str, str2, j, str3, this.e, false, false, this.f, false);
            }
            ja.k("builder.domain == null");
            return null;
        }

        public final void b(String str) {
            str.getClass();
            String strB = HostnamesKt.b(str);
            if (strB != null) {
                this.d = strB;
            } else {
                l5.q("unexpected domain: ".concat(str));
            }
        }

        public final void c(String str) {
            if (wl7.b(zve.s0(str).toString(), str)) {
                this.a = str;
            } else {
                l5.q("name is not trimmed");
            }
        }

        public final void d(String str) {
            if (wl7.b(zve.s0(str).toString(), str)) {
                this.b = str;
            } else {
                l5.q("value is not trimmed");
            }
        }
    }

    public Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = DatesKt.a.get().format(new Date(j2));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return wl7.b(cookie.a, this.a) && wl7.b(cookie.b, this.b) && cookie.c == this.c && wl7.b(cookie.d, this.d) && cookie.e.equals(this.e) && cookie.f == this.f && cookie.g == this.g && cookie.h == this.h && cookie.i == this.i;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.i) + ia.f(ia.f(ia.f(akb.d(akb.d(ia.d(akb.d(akb.d(527, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return a(false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static int a(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        public static boolean b(String str, String str2) {
            return wl7.b(str, str2) || (wve.D(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.f.d(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x0168, code lost:
        
            if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.h.a(r15) == null) goto L81;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okhttp3.Cookie c(okhttp3.HttpUrl r33, java.lang.String r34) {
            /*
                Method dump skipped, instruction units count: 411
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.c(okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static long d(int r13, java.lang.String r14) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.d(int, java.lang.String):long");
        }

        private Companion() {
        }
    }
}
