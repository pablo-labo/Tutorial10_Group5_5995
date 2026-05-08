package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\u000bJ*\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010$\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001f¨\u0006'"}, d2 = {"Lr2b;", "", "Key", "Value", "<init>", "()V", "Lj6g;", "invalidate", "Lkotlin/Function0;", "onInvalidatedCallback", "registerInvalidatedCallback", "(Lgu5;)V", "unregisterInvalidatedCallback", "Lr2b$a;", "params", "Lr2b$b;", "load", "(Lr2b$a;Llu2;)Ljava/lang/Object;", "Ls2b;", "state", "getRefreshKey", "(Ls2b;)Ljava/lang/Object;", "Lgm7;", "invalidateCallbackTracker", "Lgm7;", "", "getInvalidateCallbackCount$paging_common_release", "()I", "invalidateCallbackCount", "", "getJumpingSupported", "()Z", "jumpingSupported", "getKeyReuseSupported", "keyReuseSupported", "getInvalid", "invalid", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r2b<Key, Value> {
    private final gm7<gu5<j6g>> invalidateCallbackTracker = new gm7<>(c.a);

    public static abstract class a<Key> {
        public final int a;

        /* JADX INFO: renamed from: r2b$a$a, reason: collision with other inner class name */
        public static final class C0405a<Key> extends a<Key> {
            public final Key b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0405a(Object obj, int i) {
                super(i);
                obj.getClass();
                this.b = obj;
            }

            @Override // r2b.a
            public final Key a() {
                return this.b;
            }
        }

        public static final class b<Key> extends a<Key> {
            public final Key b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Object obj, int i) {
                super(i);
                obj.getClass();
                this.b = obj;
            }

            @Override // r2b.a
            public final Key a() {
                return this.b;
            }
        }

        public static final class c<Key> extends a<Key> {
            public final Key b;

            /* JADX WARN: Multi-variable type inference failed */
            public c(Object obj, int i) {
                super(i);
                this.b = obj;
            }

            @Override // r2b.a
            public final Key a() {
                return this.b;
            }
        }

        public a(int i) {
            this.a = i;
        }

        public abstract Key a();
    }

    public static abstract class b<Key, Value> {

        public static final class a<Key, Value> extends b<Key, Value> {
            public final Exception a;

            public a(Exception exc) {
                this.a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return sve.x("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
            }
        }

        /* JADX INFO: renamed from: r2b$b$b, reason: collision with other inner class name */
        public static final class C0406b<Key, Value> extends b<Key, Value> {
            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        public static final class c<Key, Value> extends b<Key, Value> implements Iterable<Value>, ze8 {
            public final List<Value> a;
            public final Key b;
            public final Key c;
            public final int d;
            public final int e;

            static {
                new c(zr4.a, null, null, 0, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c(List list, Integer num, Integer num2, int i, int i2) {
                this.a = list;
                this.b = num;
                this.c = num2;
                this.d = i;
                this.e = i2;
                if (i != Integer.MIN_VALUE && i < 0) {
                    l5.q("itemsBefore cannot be negative");
                    throw null;
                }
                if (i2 == Integer.MIN_VALUE || i2 >= 0) {
                    return;
                }
                l5.q("itemsAfter cannot be negative");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
            }

            public final int hashCode() {
                int iHashCode = this.a.hashCode() * 31;
                Key key = this.b;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.c;
                return Integer.hashCode(this.e) + w40.c(this.d, (iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator<Value> iterator() {
                return this.a.listIterator();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List<Value> list = this.a;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(z92.Q0(list));
                sb.append("\n                    |   last Item: ");
                sb.append(z92.Z0(list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.c);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.b);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.d);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.e);
                sb.append("\n                    |) ");
                return sve.x(sb.toString());
            }
        }
    }

    public static final class c extends mj8 implements Function1<gu5<? extends j6g>, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gu5<? extends j6g> gu5Var) {
            gu5<? extends j6g> gu5Var2 = gu5Var;
            gu5Var2.getClass();
            gu5Var2.invoke();
            return j6g.a;
        }
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.d;
    }

    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.c.size();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Key getRefreshKey(s2b<Key, Value> state);

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void invalidate() {
        gm7<gu5<j6g>> gm7Var = this.invalidateCallbackTracker;
        ArrayList arrayList = gm7Var.c;
        boolean z = false;
        if (!gm7Var.d) {
            ReentrantLock reentrantLock = gm7Var.b;
            try {
                reentrantLock.lock();
                if (!gm7Var.d) {
                    z = true;
                    gm7Var.d = true;
                    List listZ1 = z92.z1(arrayList);
                    arrayList.clear();
                    reentrantLock.unlock();
                    Function1<T, j6g> function1 = gm7Var.a;
                    Iterator it = listZ1.iterator();
                    while (it.hasNext()) {
                        function1.invoke((T) it.next());
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (z && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Invalidated PagingSource " + this, null);
        }
    }

    public abstract Object load(a<Key> aVar, lu2<? super b<Key, Value>> lu2Var);

    public final void registerInvalidatedCallback(gu5<j6g> onInvalidatedCallback) {
        boolean z;
        onInvalidatedCallback.getClass();
        gm7<gu5<j6g>> gm7Var = this.invalidateCallbackTracker;
        Function1<gu5<j6g>, j6g> function1 = gm7Var.a;
        if (gm7Var.d) {
            function1.invoke(onInvalidatedCallback);
            return;
        }
        ReentrantLock reentrantLock = gm7Var.b;
        try {
            reentrantLock.lock();
            if (gm7Var.d) {
                z = true;
            } else {
                gm7Var.c.add(onInvalidatedCallback);
                z = false;
            }
            if (z) {
                function1.invoke(onInvalidatedCallback);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void unregisterInvalidatedCallback(gu5<j6g> onInvalidatedCallback) {
        onInvalidatedCallback.getClass();
        gm7<gu5<j6g>> gm7Var = this.invalidateCallbackTracker;
        ReentrantLock reentrantLock = gm7Var.b;
        try {
            reentrantLock.lock();
            gm7Var.c.remove(onInvalidatedCallback);
        } finally {
            reentrantLock.unlock();
        }
    }
}
