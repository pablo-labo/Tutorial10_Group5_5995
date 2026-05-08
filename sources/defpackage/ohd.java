package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JSIContext;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ohd {
    public final WeakReference<ReactApplicationContext> a;
    public final WeakReference<gk0> b;
    public final dy9 c = new dy9(new WeakReference(this));
    public JSIContext d;
    public final zx9<nz2> e;
    public final JNIDeallocator f;
    public final b49 g;
    public final i62 h;

    public ohd(gk0 gk0Var, WeakReference<ReactApplicationContext> weakReference) {
        this.a = weakReference;
        this.b = new WeakReference<>(gk0Var);
        nz2 nz2Var = new nz2();
        nz2Var.a = this;
        this.e = new zx9<>(nz2Var);
        this.f = new JNIDeallocator(0);
        this.g = new b49(this);
        i62 i62Var = new i62();
        i62Var.a = new LinkedHashMap();
        this.h = i62Var;
    }

    public final JSIContext a() {
        JSIContext jSIContext = this.d;
        if (jSIContext != null) {
            return jSIContext;
        }
        wl7.g("jsiContext");
        throw null;
    }
}
