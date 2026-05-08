package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import defpackage.ut0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Android10Platform extends Platform {
    public static final Companion e;
    public static final boolean f;
    public final ArrayList d;

    static {
        boolean z = false;
        z = false;
        e = new Companion(z ? 1 : 0);
        Platform.a.getClass();
        if ("Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        f = z;
    }

    public Android10Platform() {
        Android10SocketAdapter.a.getClass();
        Platform.a.getClass();
        Android10SocketAdapter android10SocketAdapter = (!"Dalvik".equals(System.getProperty("java.vm.name")) || Build.VERSION.SDK_INT < 29) ? null : new Android10SocketAdapter();
        AndroidSocketAdapter.f.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.g);
        ConscryptSocketAdapter.a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.b);
        BouncyCastleSocketAdapter.a.getClass();
        ArrayList arrayListI0 = ut0.i0(new SocketAdapter[]{android10SocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.b)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListI0) {
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        x509TrustManager.getClass();
        AndroidCertificateChainCleaner.d.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : super.b(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object next;
        list.getClass();
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SocketAdapter) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SocketAdapter) next).b(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
