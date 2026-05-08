package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n82<T> implements Cloneable, Closeable {
    public static final a e = new a();
    public static final b f = new b();
    public boolean a = false;
    public final SharedReference<T> b;
    public final c c;
    public final Throwable d;

    public class a implements a6d<Closeable> {
        @Override // defpackage.a6d
        public final void a(Closeable closeable) {
            try {
                r82.a(closeable);
            } catch (IOException unused) {
            }
        }
    }

    public class b implements c {
        @Override // n82.c
        public final void a(SharedReference<Object> sharedReference, Throwable th) {
            Object objA = sharedReference.a();
            s55.l(n82.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objA == null ? null : objA.getClass().getName());
        }

        @Override // n82.c
        public final boolean b() {
            return false;
        }
    }

    public interface c {
        void a(SharedReference<Object> sharedReference, Throwable th);

        boolean b();
    }

    public n82(SharedReference<T> sharedReference, c cVar, Throwable th) {
        int i;
        boolean z;
        sharedReference.getClass();
        this.b = sharedReference;
        synchronized (sharedReference) {
            synchronized (sharedReference) {
                i = sharedReference.b;
                z = i > 0;
            }
            this.c = cVar;
            this.d = th;
        }
        if (!z) {
            throw new SharedReference.NullReferenceException();
        }
        sharedReference.b = i + 1;
        this.c = cVar;
        this.d = th;
    }

    public static void G(n82<?> n82Var) {
        if (n82Var != null) {
            n82Var.close();
        }
    }

    public static boolean W(n82<?> n82Var) {
        return n82Var != null && n82Var.Q();
    }

    public static im3 b0(Closeable closeable) {
        return d0(closeable, e, f);
    }

    public static im3 d0(Object obj, a6d a6dVar, c cVar) {
        if (obj == null) {
            return null;
        }
        Throwable th = cVar.b() ? new Throwable() : null;
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof l82;
        }
        return new im3(obj, a6dVar, cVar, th, true);
    }

    public static <T> n82<T> v(n82<T> n82Var) {
        if (n82Var != null) {
            return n82Var.p();
        }
        return null;
    }

    public final synchronized T P() {
        T tA;
        web.i(!this.a);
        tA = this.b.a();
        tA.getClass();
        return tA;
    }

    public synchronized boolean Q() {
        return !this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079 A[ORIG_RETURN, RETURN] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.a     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto La
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L87
        La:
            r0 = 1
            r4.a = r0     // Catch: java.lang.Throwable -> L7
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7
            com.facebook.common.references.SharedReference<T> r1 = r4.b
            monitor-enter(r1)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7a
            int r4 = r1.b     // Catch: java.lang.Throwable -> L82
            r2 = 0
            if (r4 <= 0) goto L19
            r3 = r0
            goto L1a
        L19:
            r3 = r2
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L7c
            if (r4 <= 0) goto L20
            r2 = r0
        L20:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L7a
            defpackage.web.e(r4)     // Catch: java.lang.Throwable -> L7a
            int r4 = r1.b     // Catch: java.lang.Throwable -> L7a
            int r4 = r4 - r0
            r1.b = r4     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r1)
            if (r4 != 0) goto L79
            monitor-enter(r1)
            T r4 = r1.a     // Catch: java.lang.Throwable -> L76
            r2 = 0
            r1.a = r2     // Catch: java.lang.Throwable -> L76
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L79
            a6d<T> r1 = r1.c
            if (r1 == 0) goto L3f
            r1.a(r4)
        L3f:
            java.util.IdentityHashMap r1 = com.facebook.common.references.SharedReference.d
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L5c
            java.lang.String r0 = "SharedReference"
            java.lang.String r2 = "No entry in sLiveObjects for value of type %s"
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L5a
            defpackage.s55.r(r0, r2, r4)     // Catch: java.lang.Throwable -> L5a
            goto L72
        L5a:
            r4 = move-exception
            goto L74
        L5c:
            int r3 = r2.intValue()     // Catch: java.lang.Throwable -> L5a
            if (r3 != r0) goto L66
            r1.remove(r4)     // Catch: java.lang.Throwable -> L5a
            goto L72
        L66:
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L5a
            int r2 = r2 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L5a
        L72:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            goto L79
        L74:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            throw r4
        L76:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L76
            throw r4
        L79:
            return
        L7a:
            r4 = move-exception
            goto L85
        L7c:
            com.facebook.common.references.SharedReference$NullReferenceException r4 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            throw r4     // Catch: java.lang.Throwable -> L7a
        L82:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L82
            throw r4     // Catch: java.lang.Throwable -> L7a
        L85:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            throw r4
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n82.close():void");
    }

    @Override // 
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract n82<T> clone();

    public synchronized n82<T> p() {
        if (!Q()) {
            return null;
        }
        return clone();
    }

    public n82(T t, a6d<T> a6dVar, c cVar, Throwable th, boolean z) {
        this.b = new SharedReference<>(t, a6dVar, z);
        this.c = cVar;
        this.d = th;
    }
}
