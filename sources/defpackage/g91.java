package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g91<T extends IInterface> {
    public static final Feature[] x = new Feature[0];
    public zki b;
    public final Context c;
    public final ka6 d;
    public final oa6 e;
    public final dlh f;
    public gn6 i;
    public c j;
    public IInterface k;
    public muh m;
    public final a o;
    public final b p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public ConnectionResult t = null;
    public boolean u = false;
    public volatile zzj v = null;
    public final AtomicInteger w = new AtomicInteger(0);

    public interface a {
        void c();

        void e(int i);
    }

    public interface b {
        void h(ConnectionResult connectionResult);
    }

    public interface c {
        void a(ConnectionResult connectionResult);
    }

    public class d implements c {
        public final /* synthetic */ g91 a;

        public d(g91 g91Var) {
            Objects.requireNonNull(g91Var);
            this.a = g91Var;
        }

        @Override // g91.c
        public final void a(ConnectionResult connectionResult) {
            boolean zS0 = connectionResult.s0();
            g91 g91Var = this.a;
            if (zS0) {
                g91Var.v0(null, g91Var.h());
                return;
            }
            b bVar = g91Var.p;
            if (bVar != null) {
                bVar.h(connectionResult);
            }
        }
    }

    public g91(Context context, Looper looper, fki fkiVar, oa6 oa6Var, int i, a aVar, b bVar, String str) {
        fib.j(context, "Context must not be null");
        this.c = context;
        fib.j(looper, "Looper must not be null");
        fib.j(fkiVar, "Supervisor must not be null");
        this.d = fkiVar;
        fib.j(oa6Var, "API availability must not be null");
        this.e = oa6Var;
        this.f = new dlh(this, looper);
        this.q = i;
        this.o = aVar;
        this.p = bVar;
        this.r = str;
    }

    public final String A0() {
        return this.a;
    }

    public final void B0(c00 c00Var) {
        ((y9h) c00Var.a).q.c0.post(new x9h(c00Var));
    }

    public final void c() {
        int iC = this.e.c(this.c, y0());
        if (iC == 0) {
            w0(new d(this));
            return;
        }
        p(1, null);
        this.j = new d(this);
        int i = this.w.get();
        dlh dlhVar = this.f;
        dlhVar.sendMessage(dlhVar.obtainMessage(3, i, iC, null));
    }

    public abstract T d(IBinder iBinder);

    public Account e() {
        return null;
    }

    public Feature[] f() {
        return x;
    }

    public Bundle g() {
        return new Bundle();
    }

    public Set<Scope> h() {
        return Collections.EMPTY_SET;
    }

    public final T i() {
        T t;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!o0()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface = this.k;
                fib.j(iInterface, "Client is connected but service is null");
                t = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public abstract String j();

    public abstract String k();

    public boolean l() {
        return y0() >= 211700000;
    }

    public void m() {
        System.currentTimeMillis();
    }

    public boolean n() {
        return this instanceof mdh;
    }

    public final /* synthetic */ boolean o(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                p(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o0() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final void p(int i, IInterface iInterface) {
        zki zkiVar;
        fib.b((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    muh muhVar = this.m;
                    if (muhVar != null) {
                        ka6 ka6Var = this.d;
                        String str = this.b.a;
                        fib.i(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        boolean z = this.b.b;
                        ka6Var.getClass();
                        ka6Var.G1(new jii(str, z), muhVar);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    muh muhVar2 = this.m;
                    if (muhVar2 != null && (zkiVar = this.b) != null) {
                        String str2 = zkiVar.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        ka6 ka6Var2 = this.d;
                        String str3 = this.b.a;
                        fib.i(str3);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        boolean z2 = this.b.b;
                        ka6Var2.getClass();
                        ka6Var2.G1(new jii(str3, z2), muhVar2);
                        this.w.incrementAndGet();
                    }
                    muh muhVar3 = new muh(this, this.w.get());
                    this.m = muhVar3;
                    String strK = k();
                    boolean zL = l();
                    this.b = new zki(strK, zL);
                    if (zL && y0() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));
                    }
                    ka6 ka6Var3 = this.d;
                    String str4 = this.b.a;
                    fib.i(str4);
                    this.b.getClass();
                    String name = this.r;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    ConnectionResult connectionResultC1 = ka6Var3.C1(new jii(str4, this.b.b), muhVar3, name, null);
                    if (!connectionResultC1.s0()) {
                        String str5 = this.b.a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = connectionResultC1.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (connectionResultC1.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultC1.c);
                        }
                        int i3 = this.w.get();
                        t0i t0iVar = new t0i(this, i2, bundle);
                        dlh dlhVar = this.f;
                        dlhVar.sendMessage(dlhVar.obtainMessage(7, i3, -1, t0iVar));
                    }
                } else if (i == 4) {
                    fib.i(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public final void p0(String str) {
        this.a = str;
        x0();
    }

    public final boolean q0() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String r0() {
        if (o0() && this.b != null) {
            return "com.google.android.gms";
        }
        b0.o("Failed to connect when checking package");
        return null;
    }

    public final boolean s0() {
        return true;
    }

    public boolean t0() {
        return false;
    }

    public final void v0(com.google.android.gms.common.internal.b bVar, Set<Scope> set) {
        Bundle bundleG = g();
        String str = this.s;
        int i = this.q;
        int i2 = oa6.a;
        Scope[] scopeArr = GetServiceRequest.d0;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.e0;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.d = this.c.getPackageName();
        getServiceRequest.V = bundleG;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (t0()) {
            Account accountE = e();
            if (accountE == null) {
                accountE = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.W = accountE;
            if (bVar != null) {
                getServiceRequest.e = bVar.asBinder();
            }
        }
        getServiceRequest.X = x;
        getServiceRequest.Y = f();
        if (n()) {
            getServiceRequest.b0 = true;
        }
        try {
            synchronized (this.h) {
                try {
                    gn6 gn6Var = this.i;
                    if (gn6Var != null) {
                        gn6Var.H(new zrh(this, this.w.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.w.get();
            dlh dlhVar = this.f;
            dlhVar.sendMessage(dlhVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.w.get();
            zwh zwhVar = new zwh(this, 8, null, null);
            dlh dlhVar2 = this.f;
            dlhVar2.sendMessage(dlhVar2.obtainMessage(1, i4, -1, zwhVar));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.w.get();
            zwh zwhVar2 = new zwh(this, 8, null, null);
            dlh dlhVar22 = this.f;
            dlhVar22.sendMessage(dlhVar22.obtainMessage(1, i42, -1, zwhVar2));
        }
    }

    public final void w0(c cVar) {
        this.j = cVar;
        p(2, null);
    }

    public final void x0() {
        this.w.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zoh zohVar = (zoh) arrayList.get(i);
                    synchronized (zohVar) {
                        zohVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        p(1, null);
    }

    public int y0() {
        return oa6.a;
    }

    public final Feature[] z0() {
        zzj zzjVar = this.v;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.b;
    }
}
