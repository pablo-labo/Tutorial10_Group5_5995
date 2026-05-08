package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import defpackage.ut0;
import defpackage.wl7;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "CustomTrustRootIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidPlatform extends Platform {
    public static final Companion f;
    public static final boolean g;
    public final ArrayList d;
    public final CloseGuard e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {
        public final X509TrustManager a;
        public final Method b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            x509TrustManager.getClass();
            this.a = x509TrustManager;
            this.b = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object objInvoke = this.b.invoke(this.a, x509Certificate);
                objInvoke.getClass();
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return wl7.b(this.a, customTrustRootIndex.a) && this.b.equals(customTrustRootIndex.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        boolean z = false;
        z = false;
        f = new Companion(z ? 1 : 0);
        Platform.a.getClass();
        if ("Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        g = z;
    }

    public AndroidPlatform() throws NoSuchMethodException {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        Method method;
        Method method2;
        StandardAndroidSocketAdapter.h.getClass();
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls);
        } catch (Exception e) {
            Platform.a.getClass();
            Platform.b.getClass();
            Platform.i(5, "unable to load android socket classes", e);
            standardAndroidSocketAdapter = null;
        }
        AndroidSocketAdapter.f.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.g);
        ConscryptSocketAdapter.a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.b);
        BouncyCastleSocketAdapter.a.getClass();
        ArrayList arrayListI0 = ut0.i0(new SocketAdapter[]{standardAndroidSocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.b)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListI0) {
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
        CloseGuard.d.getClass();
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.e = new CloseGuard(method3, method2, method);
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
    public final TrustRootIndex c(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
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
    public final Object g() {
        CloseGuard closeGuard = this.e;
        closeGuard.getClass();
        Method method = closeGuard.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = closeGuard.b;
                method2.getClass();
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void k(Object obj, String str) {
        CloseGuard closeGuard = this.e;
        closeGuard.getClass();
        if (obj != null) {
            try {
                Method method = closeGuard.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        Platform.j(this, str, 4);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
