package expo.modules.kotlin.jni;

import defpackage.p3c;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.PromiseAlreadySettledException;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/jni/PromiseImpl;", "Lp3c;", "Lexpo/modules/kotlin/jni/JavaCallback;", "callback", "<init>", "(Lexpo/modules/kotlin/jni/JavaCallback;)V", "Lexpo/modules/kotlin/jni/JavaCallback;", "h", "()Lexpo/modules/kotlin/jni/JavaCallback;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromiseImpl implements p3c {
    public boolean a;
    private final JavaCallback callback;

    public PromiseImpl(JavaCallback javaCallback) {
        javaCallback.getClass();
        this.callback = javaCallback;
    }

    @Override // defpackage.p3c
    public final void a(boolean z) throws PromiseAlreadySettledException {
        if (this.a) {
            throw new PromiseAlreadySettledException();
        }
        this.callback.j(z);
        this.a = true;
    }

    @Override // defpackage.p3c
    public final void b(int i) throws PromiseAlreadySettledException {
        if (this.a) {
            throw new PromiseAlreadySettledException();
        }
        this.callback.e(i);
        this.a = true;
    }

    @Override // defpackage.p3c
    public final void c(double d) throws PromiseAlreadySettledException {
        if (this.a) {
            throw new PromiseAlreadySettledException();
        }
        this.callback.c(d);
        this.a = true;
    }

    @Override // defpackage.p3c
    public final void d(float f) throws PromiseAlreadySettledException {
        if (this.a) {
            throw new PromiseAlreadySettledException();
        }
        this.callback.d(f);
        this.a = true;
    }

    @Override // defpackage.p3c
    public final void e() throws PromiseAlreadySettledException {
        if (this.a) {
            throw new PromiseAlreadySettledException();
        }
        this.callback.b();
        this.a = true;
    }

    @Override // defpackage.p3c
    public final void f(Map<String, ? extends Object> map) {
        this.callback.i(map);
    }

    @Override // defpackage.p3c
    public final void g(CodedException codedException) {
        p3c.a.a(this, codedException);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final JavaCallback getCallback() {
        return this.callback;
    }

    @Override // defpackage.p3c
    public final void reject(String str, String str2, Throwable th) throws PromiseAlreadySettledException {
        str.getClass();
        if (this.a) {
            throw new PromiseAlreadySettledException();
        }
        JavaCallback javaCallback = this.callback;
        if (str2 == null) {
            str2 = th != null ? th.getMessage() : null;
            if (str2 == null) {
                str2 = "unknown";
            }
        }
        javaCallback.h(str, str2);
        this.a = true;
    }

    @Override // defpackage.p3c
    public final void resolve(String str) throws PromiseAlreadySettledException {
        str.getClass();
        if (this.a) {
            throw new PromiseAlreadySettledException();
        }
        this.callback.g(str);
        this.a = true;
    }

    @Override // defpackage.p3c
    public final void resolve(Object obj) throws PromiseAlreadySettledException {
        if (!this.a) {
            this.callback.f(obj);
            this.a = true;
            return;
        }
        throw new PromiseAlreadySettledException();
    }
}
