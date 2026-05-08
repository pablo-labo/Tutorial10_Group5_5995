package okhttp3.internal.platform.android;

import defpackage.a32;
import defpackage.g7;
import defpackage.wl7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion f = new Companion(0);
    public static final AndroidSocketAdapter$Companion$factory$1 g = new AndroidSocketAdapter$Companion$factory$1();
    public final Class<? super SSLSocket> a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        AndroidPlatform.f.getClass();
        return AndroidPlatform.g;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, a32.b);
                }
            } catch (IllegalAccessException e) {
                g7.l(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !wl7.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    g7.l(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                Platform.a.getClass();
                method.invoke(sSLSocket, Platform.Companion.b(list));
            } catch (IllegalAccessException e) {
                g7.l(e);
            } catch (InvocationTargetException e2) {
                g7.l(e2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
