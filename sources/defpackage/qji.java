package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.playcore_age_signals.zzp;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class qji {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final fsh b;
    public boolean g;
    public final Intent h;
    public dhi l;
    public bn6 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final dxh j = new IBinder.DeathRecipient() { // from class: dxh
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            qji qjiVar = this.a;
            fsh fshVar = qjiVar.b;
            fshVar.a("reportBinderDeath", new Object[0]);
            dai daiVar = (dai) qjiVar.i.get();
            if (daiVar != null) {
                fshVar.a("calling onBinderDied", new Object[0]);
                daiVar.zza();
            } else {
                fshVar.a("%s : Binder has died.", qjiVar.c);
                ArrayList arrayList = qjiVar.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((tuh) it.next()).a(new RemoteException(String.valueOf(qjiVar.c).concat(" : Binder has died.")));
                }
                arrayList.clear();
            }
            synchronized (qjiVar.f) {
                HashSet hashSet = qjiVar.e;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((TaskCompletionSource) it2.next()).trySetException(new RemoteException(String.valueOf(qjiVar.c).concat(" : Binder has died.")));
                }
                hashSet.clear();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AgeSignalsService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [dxh] */
    public qji(Context context, fsh fshVar, Intent intent) {
        this.a = context;
        this.b = fshVar;
        this.h = intent;
    }

    public static /* bridge */ /* synthetic */ void b(qji qjiVar, iuh iuhVar) {
        bn6 bn6Var = qjiVar.m;
        ArrayList arrayList = qjiVar.d;
        fsh fshVar = qjiVar.b;
        if (bn6Var != null || qjiVar.g) {
            if (!qjiVar.g) {
                iuhVar.run();
                return;
            } else {
                fshVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(iuhVar);
                return;
            }
        }
        fshVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(iuhVar);
        dhi dhiVar = new dhi(qjiVar);
        qjiVar.l = dhiVar;
        qjiVar.g = true;
        if (qjiVar.a.bindService(qjiVar.h, dhiVar, 1)) {
            return;
        }
        fshVar.a("Failed to bind to the service.", new Object[0]);
        qjiVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tuh) it.next()).a(new zzp());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                String str = this.c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new c7i(this));
    }
}
