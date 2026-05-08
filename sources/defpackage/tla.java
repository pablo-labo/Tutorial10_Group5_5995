package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import defpackage.mn6;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tla {
    public static String d;
    public static c g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public static class a implements d {
        public final String a;
        public final int b;
        public final String c;
        public final Notification d;

        public a(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        @Override // tla.d
        public final void a(mn6 mn6Var) {
            mn6Var.e1(this.a, this.b, this.c, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            return l6.i(sb, this.c, "]");
        }
    }

    public static class b {
        public final ComponentName a;
        public final IBinder b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    public static class c implements Handler.Callback, ServiceConnection {
        public final Context a;
        public final Handler b;
        public final HashMap c = new HashMap();
        public HashSet d = new HashSet();

        public static class a {
            public final ComponentName a;
            public mn6 c;
            public boolean b = false;
            public final ArrayDeque<d> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public c(Context context) {
            this.a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.b = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z;
            ArrayDeque<d> arrayDeque = aVar.d;
            ComponentName componentName = aVar.a;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (aVar.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean zBindService = context.bindService(component, this, 33);
                aVar.b = zBindService;
                if (zBindService) {
                    aVar.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = aVar.b;
            }
            if (!z || aVar.c == null) {
                b(aVar);
                return;
            }
            while (true) {
                d dVarPeek = arrayDeque.peek();
                if (dVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + dVarPeek);
                    }
                    dVarPeek.a(aVar.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            ComponentName componentName = aVar.a;
            ArrayDeque<d> arrayDeque = aVar.d;
            Handler handler = this.b;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = aVar.e;
            int i2 = i + 1;
            aVar.e = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + aVar.e + " retries");
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i = message.what;
            mn6 mn6Var = null;
            if (i == 0) {
                d dVar = (d) message.obj;
                String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
                synchronized (tla.c) {
                    if (string != null) {
                        try {
                            if (!string.equals(tla.d)) {
                                String[] strArrSplit = string.split(":", -1);
                                HashSet hashSet2 = new HashSet(strArrSplit.length);
                                for (String str : strArrSplit) {
                                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                    if (componentNameUnflattenFromString != null) {
                                        hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                    }
                                }
                                tla.e = hashSet2;
                                tla.d = string;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hashSet = tla.e;
                }
                if (!hashSet.equals(this.d)) {
                    this.d = hashSet;
                    List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet3 = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                        if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet3.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet3) {
                        if (!this.c.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                            }
                            this.c.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator it = this.c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!hashSet3.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                            }
                            a aVar = (a) entry.getValue();
                            if (aVar.b) {
                                this.a.unbindService(this);
                                aVar.b = false;
                            }
                            aVar.c = null;
                            it.remove();
                        }
                    }
                }
                for (a aVar2 : this.c.values()) {
                    aVar2.d.add(dVar);
                    a(aVar2);
                }
            } else if (i == 1) {
                b bVar = (b) message.obj;
                ComponentName componentName3 = bVar.a;
                IBinder iBinder = bVar.b;
                a aVar3 = (a) this.c.get(componentName3);
                if (aVar3 != null) {
                    int i2 = mn6.a.a;
                    if (iBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(mn6.h);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mn6)) {
                            mn6.a.C0323a c0323a = new mn6.a.C0323a();
                            c0323a.a = iBinder;
                            mn6Var = c0323a;
                        } else {
                            mn6Var = (mn6) iInterfaceQueryLocalInterface;
                        }
                    }
                    aVar3.c = mn6Var;
                    aVar3.e = 0;
                    a(aVar3);
                    return true;
                }
            } else if (i == 2) {
                a aVar4 = (a) this.c.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.b) {
                        this.a.unbindService(this);
                        aVar4.b = false;
                    }
                    aVar4.c = null;
                    return true;
                }
            } else {
                if (i != 3) {
                    return false;
                }
                a aVar5 = (a) this.c.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    a(aVar5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.b.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface d {
        void a(mn6 mn6Var);
    }

    public tla(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.b.notify(str, i, notification);
            return;
        }
        a aVar = new a(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new c(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, aVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.cancel(str, i);
    }
}
