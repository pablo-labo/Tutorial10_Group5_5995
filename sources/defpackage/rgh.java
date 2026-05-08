package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.zzam;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class rgh implements ServiceConnection {
    public z1b c;
    public final /* synthetic */ kgh f;
    public int a = 0;
    public final Messenger b = new Messenger(new ruh(Looper.getMainLooper(), new Handler.Callback(this) { // from class: ihh
        public final rgh a;

        {
            this.a = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            rgh rghVar = this.a;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (rghVar) {
                try {
                    vih<?> vihVar = rghVar.e.get(i);
                    if (vihVar == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    rghVar.e.remove(i);
                    rghVar.c();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        vihVar.b(new zzam(4, "Not supported by GmsCore"));
                        return true;
                    }
                    vihVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    public final ArrayDeque d = new ArrayDeque();
    public final SparseArray<vih<?>> e = new SparseArray<>();

    public rgh(kgh kghVar) {
        this.f = kghVar;
    }

    public final synchronized void a(int i, String str) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i2 = this.a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    this.a = 4;
                    return;
                } else {
                    if (i2 == 4) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            zo2.b().c(this.f.a, this);
            zzam zzamVar = new zzam(i, str);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((vih) it.next()).b(zzamVar);
            }
            this.d.clear();
            int i3 = 0;
            while (true) {
                int size = this.e.size();
                SparseArray<vih<?>> sparseArray = this.e;
                if (i3 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    sparseArray.valueAt(i3).b(zzamVar);
                    i3++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b(vih<?> vihVar) {
        int i = this.a;
        if (i == 0) {
            this.d.add(vihVar);
            if (this.a != 0) {
                throw new IllegalStateException();
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (zo2.b().a(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new Runnable(this) { // from class: chh
                    public final rgh a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        rgh rghVar = this.a;
                        synchronized (rghVar) {
                            if (rghVar.a == 1) {
                                rghVar.a(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
            return true;
        }
        if (i == 1) {
            this.d.add(vihVar);
            return true;
        }
        if (i == 2) {
            this.d.add(vihVar);
            this.f.b.execute(new phh(this));
            return true;
        }
        if (i != 3 && i != 4) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                zo2.b().c(this.f.a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.b.execute(new Runnable(this, iBinder) { // from class: vhh
            public final rgh a;
            public final IBinder b;

            {
                this.a = this;
                this.b = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                rgh rghVar = this.a;
                IBinder iBinder2 = this.b;
                synchronized (rghVar) {
                    if (iBinder2 == null) {
                        rghVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        rghVar.c = new z1b(iBinder2);
                        rghVar.a = 2;
                        rghVar.f.b.execute(new phh(rghVar));
                    } catch (RemoteException e) {
                        rghVar.a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.b.execute(new Runnable(this) { // from class: fih
            public final rgh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(2, "Service disconnected");
            }
        });
    }
}
