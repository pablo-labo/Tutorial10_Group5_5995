package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.iz8;
import defpackage.pa6;
import defpackage.vf0;
import defpackage.w72;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public final class y9h implements pa6.a, pa6.b {

    @NotOnlyInitialized
    public final vf0.f b;
    public final vg0 c;
    public final j9h d;
    public final int k;
    public final qah l;
    public boolean m;
    public final /* synthetic */ qa6 q;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList n = new ArrayList();
    public ConnectionResult o = null;
    public int p = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public y9h(qa6 qa6Var, ma6 ma6Var) {
        this.q = qa6Var;
        Looper looper = qa6Var.c0.getLooper();
        w72.a aVarC = ma6Var.c();
        w72 w72Var = new w72(aVarC.a, aVarC.b, aVarC.c, aVarC.d);
        vf0.a aVar = ma6Var.c.a;
        fib.i(aVar);
        vf0.f fVarA = aVar.a(ma6Var.a, looper, w72Var, ma6Var.d, this, this);
        String str = ma6Var.b;
        if (str != null && (fVarA instanceof g91)) {
            ((g91) fVarA).s = str;
        }
        this.b = fVarA;
        this.c = ma6Var.e;
        this.d = new j9h();
        this.k = ma6Var.g;
        if (!fVarA.t0()) {
            this.l = null;
            return;
        }
        Context context = qa6Var.e;
        och ochVar = qa6Var.c0;
        w72.a aVarC2 = ma6Var.c();
        this.l = new qah(context, ochVar, new w72(aVarC2.a, aVarC2.b, aVarC2.c, aVarC2.d));
    }

    public final void a(ConnectionResult connectionResult) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        zbh zbhVar = (zbh) it.next();
        if (xna.a(connectionResult, ConnectionResult.f)) {
            this.b.r0();
        }
        zbhVar.getClass();
        throw null;
    }

    public final void b(Status status) {
        fib.d(this.q.c0);
        d(status, null, false);
    }

    @Override // defpackage.oo2
    public final void c() {
        Looper looperMyLooper = Looper.myLooper();
        och ochVar = this.q.c0;
        if (looperMyLooper == ochVar.getLooper()) {
            g();
        } else {
            ochVar.post(new w9h(this));
        }
    }

    public final void d(Status status, Exception exc, boolean z) {
        fib.d(this.q.c0);
        if ((status == null) == (exc == null)) {
            l5.q("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vbh vbhVar = (vbh) it.next();
            if (!z || vbhVar.a == 2) {
                if (status != null) {
                    vbhVar.a(status);
                } else {
                    vbhVar.b(exc);
                }
                it.remove();
            }
        }
    }

    @Override // defpackage.oo2
    public final void e(int i) {
        Looper looperMyLooper = Looper.myLooper();
        och ochVar = this.q.c0;
        if (looperMyLooper == ochVar.getLooper()) {
            i(i);
        } else {
            ochVar.post(new mv1(this, i, 1));
        }
    }

    public final void f() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vbh vbhVar = (vbh) arrayList.get(i);
            if (!this.b.o0()) {
                return;
            }
            if (k(vbhVar)) {
                linkedList.remove(vbhVar);
            }
        }
    }

    public final void g() {
        qa6 qa6Var = this.q;
        fib.d(qa6Var.c0);
        this.o = null;
        a(ConnectionResult.f);
        och ochVar = qa6Var.c0;
        if (this.m) {
            vg0 vg0Var = this.c;
            ochVar.removeMessages(11, vg0Var);
            ochVar.removeMessages(9, vg0Var);
            this.m = false;
        }
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            ((nah) it.next()).getClass();
            throw null;
        }
        f();
        j();
    }

    @Override // defpackage.jqa
    public final void h(ConnectionResult connectionResult) {
        p(connectionResult, null);
    }

    public final void i(int i) {
        qa6 qa6Var = this.q;
        och ochVar = qa6Var.c0;
        fib.d(qa6Var.c0);
        this.o = null;
        this.m = true;
        String strA0 = this.b.A0();
        j9h j9hVar = this.d;
        j9hVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strA0 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strA0);
        }
        j9hVar.a(true, new Status(20, sb.toString(), null, null));
        vg0 vg0Var = this.c;
        ochVar.sendMessageDelayed(Message.obtain(ochVar, 9, vg0Var), 5000L);
        ochVar.sendMessageDelayed(Message.obtain(ochVar, 11, vg0Var), 120000L);
        qa6Var.V.a.clear();
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            ((nah) it.next()).getClass();
            throw null;
        }
    }

    public final void j() {
        qa6 qa6Var = this.q;
        och ochVar = qa6Var.c0;
        vg0 vg0Var = this.c;
        ochVar.removeMessages(12, vg0Var);
        ochVar.sendMessageDelayed(ochVar.obtainMessage(12, vg0Var), qa6Var.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(vbh vbhVar) {
        Feature feature;
        if (!(vbhVar instanceof eah)) {
            j9h j9hVar = this.d;
            vf0.f fVar = this.b;
            vbhVar.d(j9hVar, fVar.t0());
            try {
                vbhVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                e(1);
                fVar.p0("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        eah eahVar = (eah) vbhVar;
        Feature[] featureArrG = eahVar.g(this);
        if (featureArrG == null || featureArrG.length == 0) {
            feature = null;
        } else {
            Feature[] featureArrZ0 = this.b.z0();
            if (featureArrZ0 == null) {
                featureArrZ0 = new Feature[0];
            }
            ht0 ht0Var = new ht0(featureArrZ0.length);
            for (Feature feature2 : featureArrZ0) {
                ht0Var.put(feature2.a, Long.valueOf(feature2.s0()));
            }
            int length = featureArrG.length;
            for (int i = 0; i < length; i++) {
                feature = featureArrG[i];
                Long l = (Long) ht0Var.get(feature.a);
                if (l == null || l.longValue() < feature.s0()) {
                    break;
                }
            }
            feature = null;
        }
        if (feature == null) {
            j9h j9hVar2 = this.d;
            vf0.f fVar2 = this.b;
            vbhVar.d(j9hVar2, fVar2.t0());
            try {
                vbhVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                e(1);
                fVar2.p0("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + feature.a + ", " + feature.s0() + ").");
        if (!this.q.d0 || !eahVar.f(this)) {
            eahVar.b(new UnsupportedApiCallException(feature));
            return true;
        }
        z9h z9hVar = new z9h(this.c, feature);
        int iIndexOf = this.n.indexOf(z9hVar);
        ArrayList arrayList = this.n;
        if (iIndexOf >= 0) {
            z9h z9hVar2 = (z9h) arrayList.get(iIndexOf);
            this.q.c0.removeMessages(15, z9hVar2);
            och ochVar = this.q.c0;
            ochVar.sendMessageDelayed(Message.obtain(ochVar, 15, z9hVar2), 5000L);
        } else {
            arrayList.add(z9hVar);
            och ochVar2 = this.q.c0;
            ochVar2.sendMessageDelayed(Message.obtain(ochVar2, 15, z9hVar), 5000L);
            och ochVar3 = this.q.c0;
            ochVar3.sendMessageDelayed(Message.obtain(ochVar3, 16, z9hVar), 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null, null);
            if (!l(connectionResult)) {
                this.q.c(connectionResult, this.k);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r3.get() == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = defpackage.qa6.g0
            monitor-enter(r0)
            qa6 r1 = r3.q     // Catch: java.lang.Throwable -> L44
            k9h r2 = r1.Z     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            ot0 r1 = r1.a0     // Catch: java.lang.Throwable -> L44
            vg0 r2 = r3.c     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L46
            qa6 r1 = r3.q     // Catch: java.lang.Throwable -> L44
            k9h r1 = r1.Z     // Catch: java.lang.Throwable -> L44
            int r3 = r3.k     // Catch: java.lang.Throwable -> L44
            r1.getClass()     // Catch: java.lang.Throwable -> L44
            ach r2 = new ach     // Catch: java.lang.Throwable -> L44
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L44
        L21:
            java.util.concurrent.atomic.AtomicReference r3 = r1.b     // Catch: java.lang.Throwable -> L44
        L23:
            r4 = 0
            boolean r4 = r3.compareAndSet(r4, r2)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L35
            och r3 = r1.c     // Catch: java.lang.Throwable -> L44
            fch r4 = new fch     // Catch: java.lang.Throwable -> L44
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L44
            r3.post(r4)     // Catch: java.lang.Throwable -> L44
            goto L41
        L35:
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L23
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r3 = 1
            return r3
        L44:
            r3 = move-exception
            goto L49
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r3 = 0
            return r3
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9h.l(com.google.android.gms.common.ConnectionResult):boolean");
    }

    public final boolean m(boolean z) {
        fib.d(this.q.c0);
        vf0.f fVar = this.b;
        if (!fVar.o0() || !this.f.isEmpty()) {
            return false;
        }
        j9h j9hVar = this.d;
        if (j9hVar.a.isEmpty() && j9hVar.b.isEmpty()) {
            fVar.p0("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        j();
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [fbh, vf0$f] */
    public final void n() {
        qa6 qa6Var = this.q;
        fib.d(qa6Var.c0);
        vf0.f fVar = this.b;
        if (fVar.o0() || fVar.q0()) {
            return;
        }
        try {
            xbh xbhVar = qa6Var.V;
            Context context = qa6Var.e;
            SparseIntArray sparseIntArray = xbhVar.a;
            fib.i(context);
            int iC = 0;
            if (fVar.s0()) {
                int iY0 = fVar.y0();
                int i = xbhVar.a.get(iY0, -1);
                if (i != -1) {
                    iC = i;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= sparseIntArray.size()) {
                            iC = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i2);
                        if (iKeyAt > iY0 && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (iC == -1) {
                        iC = xbhVar.b.c(context, iY0);
                    }
                    sparseIntArray.put(iY0, iC);
                }
            }
            if (iC != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iC, null, null);
                Log.w("GoogleApiManager", "The service for " + fVar.getClass().getName() + " is not available: " + connectionResult.toString());
                p(connectionResult, null);
                return;
            }
            bah bahVar = new bah(qa6Var, fVar, this.c);
            if (fVar.t0()) {
                qah qahVar = this.l;
                fib.i(qahVar);
                Handler handler = qahVar.b;
                w72 w72Var = qahVar.e;
                fbh fbhVar = qahVar.f;
                if (fbhVar != null) {
                    fbhVar.x0();
                }
                w72Var.h = Integer.valueOf(System.identityHashCode(qahVar));
                qahVar.f = qahVar.c.a(qahVar.a, handler.getLooper(), w72Var, w72Var.g, qahVar, qahVar);
                qahVar.k = bahVar;
                Set set = qahVar.d;
                if (set == null || set.isEmpty()) {
                    handler.post(new oah(qahVar));
                } else {
                    qahVar.f.a();
                }
            }
            try {
                fVar.w0(bahVar);
            } catch (SecurityException e) {
                p(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            p(new ConnectionResult(10, null, null), e2);
        }
    }

    public final void o(vbh vbhVar) {
        fib.d(this.q.c0);
        boolean zO0 = this.b.o0();
        LinkedList linkedList = this.a;
        if (zO0) {
            if (k(vbhVar)) {
                j();
                return;
            } else {
                linkedList.add(vbhVar);
                return;
            }
        }
        linkedList.add(vbhVar);
        ConnectionResult connectionResult = this.o;
        if (connectionResult == null || connectionResult.b == 0 || connectionResult.c == null) {
            n();
        } else {
            p(connectionResult, null);
        }
    }

    public final void p(ConnectionResult connectionResult, RuntimeException runtimeException) {
        fbh fbhVar;
        fib.d(this.q.c0);
        qah qahVar = this.l;
        if (qahVar != null && (fbhVar = qahVar.f) != null) {
            fbhVar.x0();
        }
        fib.d(this.q.c0);
        this.o = null;
        this.q.V.a.clear();
        a(connectionResult);
        if ((this.b instanceof hch) && connectionResult.b != 24) {
            qa6 qa6Var = this.q;
            qa6Var.b = true;
            och ochVar = qa6Var.c0;
            ochVar.sendMessageDelayed(ochVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.b == 4) {
            b(qa6.f0);
            return;
        }
        if (this.a.isEmpty()) {
            this.o = connectionResult;
            return;
        }
        qa6 qa6Var2 = this.q;
        if (runtimeException != null) {
            fib.d(qa6Var2.c0);
            d(null, runtimeException, false);
            return;
        }
        boolean z = qa6Var2.d0;
        vg0 vg0Var = this.c;
        if (!z) {
            b(qa6.d(vg0Var, connectionResult));
            return;
        }
        d(qa6.d(vg0Var, connectionResult), null, true);
        if (this.a.isEmpty() || l(connectionResult) || this.q.c(connectionResult, this.k)) {
            return;
        }
        if (connectionResult.b == 18) {
            this.m = true;
        }
        if (!this.m) {
            b(qa6.d(this.c, connectionResult));
            return;
        }
        qa6 qa6Var3 = this.q;
        vg0 vg0Var2 = this.c;
        och ochVar2 = qa6Var3.c0;
        ochVar2.sendMessageDelayed(Message.obtain(ochVar2, 9, vg0Var2), 5000L);
    }

    public final void q(ConnectionResult connectionResult) {
        fib.d(this.q.c0);
        vf0.f fVar = this.b;
        fVar.p0("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        p(connectionResult, null);
    }

    public final void r() {
        fib.d(this.q.c0);
        Status status = qa6.e0;
        b(status);
        j9h j9hVar = this.d;
        j9hVar.getClass();
        j9hVar.a(false, status);
        for (iz8.a aVar : (iz8.a[]) this.f.keySet().toArray(new iz8.a[0])) {
            o(new obh(aVar, new TaskCompletionSource()));
        }
        a(new ConnectionResult(4, null, null));
        vf0.f fVar = this.b;
        if (fVar.o0()) {
            fVar.B0(new c00(this));
        }
    }
}
