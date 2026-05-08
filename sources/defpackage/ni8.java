package defpackage;

import android.os.Trace;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import expo.modules.kotlin.jni.JSIContext;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ni8 {
    public final gk0 a;

    public ni8(hy9 hy9Var, ey9 ey9Var, WeakReference<ReactApplicationContext> weakReference) {
        ey9Var.getClass();
        this.a = new gk0(hy9Var, ey9Var, weakReference);
    }

    public final dy9 a() {
        return this.a.b.c;
    }

    public final void b() {
        JavaScriptContextHolder javaScriptContextHolder;
        ohd ohdVar = this.a.b;
        synchronized (ohdVar) {
            if (ohdVar.d != null) {
                d49.b(mz2.a, "⚠️ JSI interop was already installed");
                return;
            }
            Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(ohdVar + ".installJSIContext")));
            try {
                ohdVar.d = new JSIContext();
                ReactApplicationContext reactApplicationContext = ohdVar.a.get();
                if (reactApplicationContext != null && (javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder()) != null) {
                    long context = javaScriptContextHolder.getContext();
                    Long lValueOf = Long.valueOf(context);
                    if (context == 0) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        mz2.a.a(o39.Error, "❌ Cannot install JSI interop - JS runtime pointer is null", null);
                    } else {
                        long jLongValue = lValueOf.longValue();
                        if (reactApplicationContext.isBridgeless()) {
                            JSIContext jSIContextA = ohdVar.a();
                            RuntimeExecutor runtimeExecutor = reactApplicationContext.getCatalystInstance().getRuntimeExecutor();
                            runtimeExecutor.getClass();
                            jSIContextA.s(ohdVar, jLongValue, runtimeExecutor);
                        } else {
                            JSIContext jSIContextA2 = ohdVar.a();
                            CallInvokerHolder jSCallInvokerHolder = reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
                            jSCallInvokerHolder.getClass();
                            jSIContextA2.p(ohdVar, jLongValue, (CallInvokerHolderImpl) jSCallInvokerHolder);
                        }
                        mz2.a.a(o39.Info, "✅ JSI interop was installed", null);
                    }
                }
            } catch (Throwable th) {
                d49 d49Var = mz2.a;
                d49Var.getClass();
                d49Var.a(o39.Error, "❌ Cannot install JSI interop: " + th, th);
            } finally {
            }
            j6g j6gVar = j6g.a;
        }
    }
}
