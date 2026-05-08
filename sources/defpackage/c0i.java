package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class c0i<V> extends FutureTask<V> implements Comparable<c0i<V>> {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ a0i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0i(a0i a0iVar, Callable callable, boolean z) {
        super(callable);
        this.d = a0iVar;
        long andIncrement = a0i.Z.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            a0iVar.zzr().f.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c0i c0iVar = (c0i) obj;
        boolean z = c0iVar.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return z2 ? -1 : 1;
        }
        long j = c0iVar.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        this.d.zzr().V.a(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.d.zzr().f.a(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0i(a0i a0iVar, Runnable runnable, String str) {
        super(runnable, null);
        this.d = a0iVar;
        long andIncrement = a0i.Z.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = false;
        if (andIncrement == Long.MAX_VALUE) {
            a0iVar.zzr().f.b("Tasks index overflow");
        }
    }
}
