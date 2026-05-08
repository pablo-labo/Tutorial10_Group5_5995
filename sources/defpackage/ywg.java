package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class ywg {

    public static class a {
        public static final hc0 a = new hc0(b.a.getWebkitToCompatConverter());
    }

    public static class b {
        public static final cxg a;

        static {
            cxg ka2Var;
            try {
                WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) al1.a(WebViewProviderFactoryBoundaryInterface.class, ywg.a());
                r7i r7iVar = new r7i();
                r7iVar.a = webViewProviderFactoryBoundaryInterface;
                ka2Var = r7iVar;
            } catch (ClassNotFoundException unused) {
                ka2Var = new ka2(8);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                l5.r(e);
                return;
            }
            a = ka2Var;
        }
    }

    public static InvocationHandler a() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = tg0.a();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                l5.r(e);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
