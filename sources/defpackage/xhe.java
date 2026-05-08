package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import defpackage.fp2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xhe {
    public static volatile xhe d;
    public final c a;
    public final HashSet b = new HashSet();
    public boolean c;

    public class a implements o96<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.o96
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    public class b implements fp2.a {
        public b() {
        }

        @Override // fp2.a
        public final void a(boolean z) {
            ArrayList arrayList;
            xjg.a();
            synchronized (xhe.this) {
                arrayList = new ArrayList(xhe.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fp2.a) it.next()).a(z);
            }
        }
    }

    public static final class c {
        public boolean a;
        public final b b;
        public final n96 c;
        public final a d = new a();

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                xjg.f().post(new yhe(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                xjg.f().post(new yhe(this, false));
            }
        }

        public c(n96 n96Var, b bVar) {
            this.c = n96Var;
            this.b = bVar;
        }
    }

    public xhe(Context context) {
        this.a = new c(new n96(new a(context)), new b());
    }

    public static xhe a(Context context) {
        if (d == null) {
            synchronized (xhe.class) {
                try {
                    if (d == null) {
                        d = new xhe(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void b() {
        if (this.c || this.b.isEmpty()) {
            return;
        }
        c cVar = this.a;
        n96 n96Var = cVar.c;
        boolean z = false;
        cVar.a = ((ConnectivityManager) n96Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) n96Var.get()).registerDefaultNetworkCallback(cVar.d);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.c = z;
    }
}
