package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eha {
    public static eha f;
    public final Executor a;
    public final CopyOnWriteArrayList<c> b;
    public final Object c;
    public int d;
    public boolean e;

    public static final class a {

        /* JADX INFO: renamed from: eha$a$a, reason: collision with other inner class name */
        public static final class C0217a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            public final eha a;

            public C0217a(eha ehaVar) {
                this.a = ehaVar;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.a.c(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, eha ehaVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C0217a c0217a = new C0217a(ehaVar);
                telephonyManager.registerTelephonyCallback(ehaVar.a, c0217a);
                telephonyManager.unregisterTelephonyCallback(c0217a);
            } catch (RuntimeException unused) {
                ehaVar.c(5);
            }
        }
    }

    public interface b {
        void a(int i);
    }

    public final class c {
        public final WeakReference<b> a;
        public final Executor b;

        public c(ql3 ql3Var, Executor executor) {
            this.a = new WeakReference<>(ql3Var);
            this.b = executor;
        }
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            eha.this.a.execute(new y71(3, this, context));
        }
    }

    public eha(Context context) {
        Executor executorA = q71.a();
        this.a = executorA;
        this.b = new CopyOnWriteArrayList<>();
        this.c = new Object();
        this.d = 0;
        executorA.execute(new w71(4, this, context));
    }

    public static synchronized eha a(Context context) {
        try {
            if (f == null) {
                f = new eha(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.b;
        for (c cVar : copyOnWriteArrayList) {
            if (cVar.a.get() == null) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (c cVar2 : this.b) {
                    cVar2.b.execute(new ob0(cVar2, 4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
