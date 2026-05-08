package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/android/BouncyCastleSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BouncyCastleSocketAdapter implements SocketAdapter {
    public static final Companion a = new Companion(0);
    public static final BouncyCastleSocketAdapter$Companion$factory$1 b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final boolean b(SSLSocket sSLSocket) {
            BouncyCastlePlatform.e.getClass();
            boolean z = BouncyCastlePlatform.f;
            return false;
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final SocketAdapter c(SSLSocket sSLSocket) {
            return new BouncyCastleSocketAdapter();
        }
    };

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        BouncyCastlePlatform.e.getClass();
        return BouncyCastlePlatform.f;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Platform.a.getClass();
            parameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/BouncyCastleSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
