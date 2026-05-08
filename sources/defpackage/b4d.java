package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class b4d<T> implements Runnable {
    public eo5 a;
    public fo5 b;
    public Handler c;

    public class a implements Runnable {
        public final /* synthetic */ fo5 a;
        public final /* synthetic */ Object b;

        public a(fo5 fo5Var, Object obj) {
            this.a = fo5Var;
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.a.accept(this.b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.a.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.c.post(new a(this.b, objCall));
    }
}
