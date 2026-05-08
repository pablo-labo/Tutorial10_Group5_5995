package defpackage;

import android.graphics.Bitmap;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import java.util.Date;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal.http.DatesKt;

/* JADX INFO: loaded from: classes.dex */
public final class bu1 {
    public final Request a;
    public final zt1 b;

    public static final class a {
        public static Headers a(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String strB = headers.b(i);
                String strG = headers.g(i);
                if ((!"Warning".equalsIgnoreCase(strB) || !wve.K(strG, "1", false)) && ("Content-Length".equalsIgnoreCase(strB) || "Content-Encoding".equalsIgnoreCase(strB) || TracingInterceptor.HEADER_CT.equalsIgnoreCase(strB) || !b(strB) || headers2.a(strB) == null)) {
                    builder.a(strB, strG);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strB2 = headers2.b(i2);
                if (!"Content-Length".equalsIgnoreCase(strB2) && !"Content-Encoding".equalsIgnoreCase(strB2) && !TracingInterceptor.HEADER_CT.equalsIgnoreCase(strB2) && b(strB2)) {
                    builder.a(strB2, headers2.g(i2));
                }
            }
            return builder.e();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    public static final class b {
        public final Request a;
        public final zt1 b;
        public final Date c;
        public final String d;
        public final Date e;
        public final String f;
        public final Date g;
        public final long h;
        public final long i;
        public final String j;
        public final int k;

        public b(Request request, zt1 zt1Var) {
            int i;
            this.a = request;
            this.b = zt1Var;
            this.k = -1;
            if (zt1Var != null) {
                this.h = zt1Var.c;
                this.i = zt1Var.d;
                Headers headers = zt1Var.f;
                int size = headers.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strB = headers.b(i2);
                    if (wve.E(strB, "Date", true)) {
                        String strA = headers.a("Date");
                        this.c = strA != null ? DatesKt.a(strA) : null;
                        this.d = headers.g(i2);
                    } else if (wve.E(strB, "Expires", true)) {
                        String strA2 = headers.a("Expires");
                        this.g = strA2 != null ? DatesKt.a(strA2) : null;
                    } else if (wve.E(strB, "Last-Modified", true)) {
                        String strA3 = headers.a("Last-Modified");
                        this.e = strA3 != null ? DatesKt.a(strA3) : null;
                        this.f = headers.g(i2);
                    } else if (wve.E(strB, "ETag", true)) {
                        this.j = headers.g(i2);
                    } else if (wve.E(strB, "Age", true)) {
                        String strG = headers.g(i2);
                        Bitmap.Config[] configArr = m.a;
                        Long lC = vve.C(strG);
                        if (lC != null) {
                            long jLongValue = lC.longValue();
                            i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                        } else {
                            i = -1;
                        }
                        this.k = i;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.bu1 a() {
            /*
                Method dump skipped, instruction units count: 380
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: bu1.b.a():bu1");
        }
    }

    public bu1(Request request, zt1 zt1Var) {
        this.a = request;
        this.b = zt1Var;
    }
}
