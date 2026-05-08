package defpackage;

import com.facebook.react.bridge.Promise;
import defpackage.p3c;
import expo.modules.kotlin.exception.CodedException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pf8 implements p3c {
    public final Promise a;

    public pf8(Promise promise) {
        promise.getClass();
        this.a = promise;
    }

    @Override // defpackage.p3c
    public final void a(boolean z) {
        resolve(Boolean.valueOf(z));
    }

    @Override // defpackage.p3c
    public final void b(int i) {
        resolve(Integer.valueOf(i));
    }

    @Override // defpackage.p3c
    public final void c(double d) {
        resolve(Double.valueOf(d));
    }

    @Override // defpackage.p3c
    public final void d(float f) {
        resolve(Float.valueOf(f));
    }

    @Override // defpackage.p3c
    public final void e() {
        resolve((Object) null);
    }

    @Override // defpackage.p3c
    public final void f(Map<String, ? extends Object> map) {
        resolve(map);
    }

    @Override // defpackage.p3c
    public final void g(CodedException codedException) {
        p3c.a.a(this, codedException);
    }

    @Override // defpackage.p3c
    public final void reject(String str, String str2, Throwable th) {
        str.getClass();
        this.a.reject(str, str2, th);
    }

    @Override // defpackage.p3c
    public final void resolve(Object obj) {
        this.a.resolve(pt7.a(6, obj));
    }

    @Override // defpackage.p3c
    public final void resolve(String str) {
        str.getClass();
        resolve((Object) str);
    }
}
