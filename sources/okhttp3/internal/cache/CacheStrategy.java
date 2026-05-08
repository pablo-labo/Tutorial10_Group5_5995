package okhttp3.internal.cache;

import java.util.Date;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheStrategy {
    public static final Companion c = new Companion(0);
    public final Request a;
    public final Response b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory {
        public Date a;
        public String b;
        public Date c;
        public String d;
        public Date e;
        public long f;
        public long g;
        public String h;
        public int i;
    }

    public CacheStrategy(Request request, Response response) {
        this.a = request;
        this.b = response;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(okhttp3.Request r2, okhttp3.Response r3) {
            /*
                r3.getClass()
                r2.getClass()
                int r0 = r3.d
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 == r1) goto L5b
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L5b
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L5b
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L5b
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L5b
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L5b
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L34
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L5b
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L5b
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L5b
                switch(r0) {
                    case 300: goto L5b;
                    case 301: goto L5b;
                    case 302: goto L34;
                    default: goto L33;
                }
            L33:
                goto L6d
            L34:
                java.lang.String r0 = "Expires"
                okhttp3.Headers r1 = r3.f
                java.lang.String r0 = r1.a(r0)
                if (r0 != 0) goto L3f
                r0 = 0
            L3f:
                if (r0 != 0) goto L5b
                okhttp3.CacheControl r0 = r3.a()
                int r0 = r0.c
                r1 = -1
                if (r0 != r1) goto L5b
                okhttp3.CacheControl r0 = r3.a()
                boolean r0 = r0.f
                if (r0 != 0) goto L5b
                okhttp3.CacheControl r0 = r3.a()
                boolean r0 = r0.e
                if (r0 != 0) goto L5b
                goto L6d
            L5b:
                okhttp3.CacheControl r3 = r3.a()
                boolean r3 = r3.b
                if (r3 != 0) goto L6d
                okhttp3.CacheControl r2 = r2.a()
                boolean r2 = r2.b
                if (r2 != 0) goto L6d
                r2 = 1
                return r2
            L6d:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Companion.a(okhttp3.Request, okhttp3.Response):boolean");
        }

        private Companion() {
        }
    }
}
