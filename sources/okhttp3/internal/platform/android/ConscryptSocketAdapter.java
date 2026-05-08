package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConscryptSocketAdapter implements SocketAdapter {
    public static final Companion a = new Companion(0);
    public static final ConscryptSocketAdapter$Companion$factory$1 b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final boolean b(SSLSocket sSLSocket) {
            ConscryptPlatform.e.getClass();
            return ConscryptPlatform.f && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final SocketAdapter c(SSLSocket sSLSocket) {
            return new ConscryptSocketAdapter();
        }
    };

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        ConscryptPlatform.e.getClass();
        return ConscryptPlatform.f;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform.a.getClass();
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.Companion.a(list).toArray(new String[0]));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
