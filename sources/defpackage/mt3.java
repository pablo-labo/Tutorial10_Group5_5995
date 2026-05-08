package defpackage;

import android.annotation.SuppressLint;
import defpackage.a4;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class mt3<V> extends a4<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> W;

    public class a {
        public a() {
        }

        public final void a(Exception exc) {
            a4.c cVar = new a4.c(exc);
            a4.a aVar = a4.f;
            mt3 mt3Var = mt3.this;
            if (aVar.b(mt3Var, null, cVar)) {
                a4.f(mt3Var);
            }
        }
    }

    public interface b<T> {
        ScheduledFuture a(a aVar);
    }

    public mt3(b<V> bVar) {
        this.W = bVar.a(new a());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.W.compareTo(delayed);
    }

    @Override // defpackage.a4
    public final void e() {
        ScheduledFuture<?> scheduledFuture = this.W;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof a4.b) && ((a4.b) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.W.getDelay(timeUnit);
    }
}
