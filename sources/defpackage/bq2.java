package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class bq2<T> {
    public final x2h a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet<aq2<T>> d;
    public T e;

    public bq2(Context context, x2h x2hVar) {
        this.a = x2hVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(xp2 xp2Var) {
        xp2Var.getClass();
        synchronized (this.c) {
            try {
                if (this.d.remove(xp2Var) && this.d.isEmpty()) {
                    e();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 == null || !t2.equals(t)) {
                this.e = t;
                this.a.c.execute(new vb0(1, z92.z1(this.d), this));
                j6g j6gVar = j6g.a;
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
