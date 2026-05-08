package okhttp3;

import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/CookieJar;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CookieJar {
    public static final CookieJar a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/CookieJar$Companion;", "", "()V", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ int a = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final List<Cookie> b(HttpUrl httpUrl) {
                httpUrl.getClass();
                return zr4.a;
            }

            @Override // okhttp3.CookieJar
            public final void d(HttpUrl httpUrl, List<Cookie> list) {
                httpUrl.getClass();
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i = Companion.a;
        a = new Companion.NoCookies();
    }

    List<Cookie> b(HttpUrl httpUrl);

    void d(HttpUrl httpUrl, List<Cookie> list);
}
