package okhttp3;

import defpackage.akb;
import defpackage.h5;
import defpackage.ja;
import defpackage.o6;
import defpackage.ojh;
import defpackage.r6;
import defpackage.wl7;
import defpackage.wve;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MediaType;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaType {
    public static final Companion e = new Companion(0);
    public static final Pattern f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public MediaType(String str, String str2, String str3, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int iO = ojh.o(0, strArr.length - 1, 2);
        if (iO < 0) {
            str = null;
            break;
        }
        while (!wve.E(strArr[i], "charset", true)) {
            if (i == iO) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && wl7.b(((MediaType) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001c\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static MediaType a(String str) {
            str.getClass();
            Matcher matcher = MediaType.f.matcher(str);
            if (!matcher.lookingAt()) {
                h5.k(ja.f('\"', "No subtype found for: \"", str));
                return null;
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            Locale locale = Locale.US;
            String strF = r6.f(locale, strGroup, locale);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            String lowerCase = strGroup2.toLowerCase(locale);
            lowerCase.getClass();
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    o6.o("Parameter is not formatted correctly: \"", str.substring(iEnd), "\" for: \"", str, 34);
                    return null;
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (wve.K(strGroup4, "'", false) && wve.D(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = akb.j(1, 1, strGroup4);
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, strF, lowerCase, (String[]) arrayList.toArray(new String[0]));
        }

        private Companion() {
        }
    }
}
