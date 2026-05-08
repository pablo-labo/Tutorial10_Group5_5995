package defpackage;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class rxe implements e49 {
    public final boolean V;
    public final String a;
    public volatile e49 b;
    public Boolean c;
    public Method d;
    public n05 e;
    public final Queue<txe> f;

    public rxe(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.V = z;
    }

    @Override // defpackage.e49
    public final boolean a() {
        return k().a();
    }

    @Override // defpackage.e49
    public final void b(RuntimeException runtimeException) {
        k().b(runtimeException);
    }

    @Override // defpackage.e49
    public final boolean c() {
        return k().c();
    }

    @Override // defpackage.e49
    public final boolean d() {
        return k().d();
    }

    @Override // defpackage.e49
    public final boolean e() {
        return k().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rxe.class == obj.getClass() && this.a.equals(((rxe) obj).a);
    }

    @Override // defpackage.e49
    public final void f(String str, NumberFormatException numberFormatException) {
        k().f(str, numberFormatException);
    }

    @Override // defpackage.e49
    public final boolean g() {
        return k().g();
    }

    @Override // defpackage.e49
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.e49
    public final void h(Object... objArr) {
        k().h(objArr);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.e49
    public final void i(String str) {
        k().i(str);
    }

    @Override // defpackage.e49
    public final boolean j(su8 su8Var) {
        return k().j(su8Var);
    }

    public final e49 k() {
        if (this.b != null) {
            return this.b;
        }
        if (this.V) {
            return j8a.a;
        }
        if (this.e == null) {
            Queue<txe> queue = this.f;
            n05 n05Var = new n05();
            n05Var.logger = this;
            n05Var.name = this.a;
            n05Var.eventQueue = queue;
            this.e = n05Var;
        }
        return this.e;
    }

    public final boolean l() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", j49.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }
}
