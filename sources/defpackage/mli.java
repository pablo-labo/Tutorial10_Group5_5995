package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mli {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final w6i b;
    public boolean g;
    public final Intent h;
    public eli l;
    public vwh m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final nfi j = new IBinder.DeathRecipient() { // from class: nfi
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            mli mliVar = this.a;
            String str = mliVar.c;
            w6i w6iVar = mliVar.b;
            ArrayList<x9i> arrayList = mliVar.d;
            w6iVar.a("reportBinderDeath", new Object[0]);
            sji sjiVar = (sji) mliVar.i.get();
            if (sjiVar != null) {
                w6iVar.a("calling onBinderDied", new Object[0]);
                sjiVar.zza();
            } else {
                w6iVar.a("%s : Binder has died.", str);
                for (x9i x9iVar : arrayList) {
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = x9iVar.a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                arrayList.clear();
            }
            mliVar.b();
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [nfi] */
    public mli(Context context, w6i w6iVar, Intent intent) {
        this.a = context;
        this.b = w6iVar;
        this.h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
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

    public final void b() {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
