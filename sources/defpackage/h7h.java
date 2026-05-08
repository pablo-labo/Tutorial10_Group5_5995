package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class h7h {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final s8h b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final y8h i;
    public g7h m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final u8h k = new IBinder.DeathRecipient() { // from class: u8h
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            h7h h7hVar = this.a;
            h7hVar.b.b("reportBinderDeath", new Object[0]);
            x8h x8hVar = (x8h) h7hVar.j.get();
            s8h s8hVar = h7hVar.b;
            if (x8hVar != null) {
                s8hVar.b("calling onBinderDied", new Object[0]);
                x8hVar.a();
            } else {
                s8hVar.b("%s : Binder has died.", h7hVar.c);
                Iterator it = h7hVar.d.iterator();
                while (it.hasNext()) {
                    ((t8h) it.next()).a(new RemoteException(String.valueOf(h7hVar.c).concat(" : Binder has died.")));
                }
                h7hVar.d.clear();
            }
            synchronized (h7hVar.f) {
                h7hVar.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [u8h] */
    public h7h(Context context, s8h s8hVar, String str, Intent intent, y8h y8hVar) {
        this.a = context;
        this.b = s8hVar;
        this.c = str;
        this.h = intent;
        this.i = y8hVar;
    }

    public static /* bridge */ /* synthetic */ void b(h7h h7hVar, t8h t8hVar) {
        IInterface iInterface = h7hVar.n;
        s8h s8hVar = h7hVar.b;
        ArrayList arrayList = h7hVar.d;
        if (iInterface != null || h7hVar.g) {
            if (!h7hVar.g) {
                t8hVar.run();
                return;
            } else {
                s8hVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(t8hVar);
                return;
            }
        }
        s8hVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(t8hVar);
        g7h g7hVar = new g7h(h7hVar);
        h7hVar.m = g7hVar;
        h7hVar.g = true;
        if (h7hVar.a.bindService(h7hVar.h, g7hVar, 1)) {
            return;
        }
        s8hVar.b("Failed to bind to the service.", new Object[0]);
        h7hVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((t8h) it.next()).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(t8h t8hVar, TaskCompletionSource taskCompletionSource) {
        a().post(new v8h(this, t8hVar.c(), taskCompletionSource, t8hVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new w8h(this));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
