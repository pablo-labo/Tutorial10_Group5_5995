package okhttp3.internal.platform;

import defpackage.wl7;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "AlpnProvider", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion i = new Companion(0);
    public final Method d;
    public final Method e;
    public final Method f;
    public final Class<?> g;
    public final Class<?> h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AlpnProvider implements InvocationHandler {
        public final ArrayList a;
        public boolean b;
        public String c;

        public AlpnProvider(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            obj.getClass();
            method.getClass();
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (wl7.b(name, "supports") && wl7.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (wl7.b(name, "unsupported") && wl7.b(Void.TYPE, returnType)) {
                this.b = true;
                return null;
            }
            boolean zB = wl7.b(name, "protocols");
            ArrayList arrayList = this.a;
            if (zB && objArr.length == 0) {
                return arrayList;
            }
            if ((wl7.b(name, "selectProtocol") || wl7.b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            obj3.getClass();
                            String str = (String) obj3;
                            if (!arrayList.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!wl7.b(name, "protocolSelected") && !wl7.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            this.c = (String) obj4;
            return null;
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        list.getClass();
        Platform.a.getClass();
        try {
            this.d.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.g, this.h}, new AlpnProvider(Platform.Companion.a(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            invocationHandler.getClass();
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            boolean z = alpnProvider.b;
            if (!z && alpnProvider.c == null) {
                Platform.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z) {
                return null;
            }
            return alpnProvider.c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
