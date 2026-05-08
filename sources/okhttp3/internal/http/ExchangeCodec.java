package okhttp3.internal.http;

import defpackage.fie;
import defpackage.pne;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ExchangeCodec {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    void a();

    pne b(Response response);

    /* JADX INFO: renamed from: c */
    RealConnection getA();

    void cancel();

    long d(Response response);

    fie e(Request request, long j);

    void f(Request request);

    Response.Builder g(boolean z);

    void h();
}
