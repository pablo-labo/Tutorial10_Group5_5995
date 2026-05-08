package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class o0d {
    public static final ExecutorService h = Executors.newCachedThreadPool();
    public final HashMap a;
    public final Context b;
    public final pf5 c;
    public final mf5 d;
    public final n20 e;
    public final String f;
    public final String g;

    static {
        new Random();
    }

    public o0d(Context context, pf5 pf5Var, FirebaseInstanceId firebaseInstanceId, mf5 mf5Var, n20 n20Var) {
        pf5Var.a();
        xf5 xf5Var = pf5Var.c;
        txh txhVar = new txh(context, xf5Var.b);
        this.a = new HashMap();
        new HashMap();
        this.g = "https://firebaseremoteconfig.googleapis.com/";
        this.b = context;
        this.c = pf5Var;
        this.d = mf5Var;
        this.e = n20Var;
        pf5Var.a();
        this.f = xf5Var.b;
        Callable callable = new Callable(this) { // from class: lji
            public final o0d a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        };
        ExecutorService executorService = h;
        Tasks.call(executorService, callable);
        Tasks.call(executorService, new j2i(txhVar));
    }

    public static jvh d(Context context, String str, String str2, String str3) {
        nwh nwhVar;
        jvh jvhVar;
        String strI = l6.i(u40.f("frc_", str, "_", str2, "_"), str3, ".json");
        ExecutorService executorService = h;
        HashMap map = nwh.c;
        synchronized (nwh.class) {
            try {
                HashMap map2 = nwh.c;
                if (!map2.containsKey(strI)) {
                    map2.put(strI, new nwh(context, strI));
                }
                nwhVar = (nwh) map2.get(strI);
            } finally {
            }
        }
        HashMap map3 = jvh.d;
        synchronized (jvh.class) {
            try {
                String str4 = nwhVar.b;
                HashMap map4 = jvh.d;
                if (!map4.containsKey(str4)) {
                    map4.put(str4, new jvh(executorService, nwhVar));
                }
                jvhVar = (jvh) map4.get(str4);
            } finally {
            }
        }
        return jvhVar;
    }

    public final synchronized yf5 a() throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            jvh jvhVarD = d(this.b, this.f, "firebase", "fetch");
            jvh jvhVarD2 = d(this.b, this.f, "firebase", "activate");
            jvh jvhVarD3 = d(this.b, this.f, "firebase", "defaults");
            this.b.getSharedPreferences("frc_" + this.f + "_firebase_settings", 0);
            mf5 mf5Var = this.d;
            ExecutorService executorService = h;
            pf5 pf5Var = this.c;
            pf5Var.a();
            String str = pf5Var.c.b;
            n20 n20Var = this.e;
            pf5 pf5Var2 = this.c;
            pf5Var2.a();
            String str2 = pf5Var2.c.a;
            c();
            new cwh(str, n20Var, executorService);
            return b(mf5Var, executorService, jvhVarD, jvhVarD2, jvhVarD3, new kwh(jvhVarD2, jvhVarD3));
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized yf5 b(mf5 mf5Var, Executor executor, jvh jvhVar, jvh jvhVar2, jvh jvhVar3, kwh kwhVar) {
        try {
            if (!this.a.containsKey("firebase")) {
                yf5 yf5Var = new yf5(executor, jvhVar, jvhVar2, jvhVar3, kwhVar);
                jvhVar2.c();
                jvhVar3.c();
                jvhVar.c();
                this.a.put("firebase", yf5Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (yf5) this.a.get("firebase");
    }

    public final nrh c() {
        nrh nrhVar;
        synchronized (this) {
            new ijh();
            if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
                new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
            }
            a6g a6gVar = fmh.a;
            new HashSet();
            a6gVar.getClass();
            Set set = Collections.EMPTY_SET;
            new pi3(14);
            new HashSet(set);
            mrh mrhVar = new mrh();
            mrhVar.a();
            mrhVar.b();
            mrhVar.a = dsh.a(this.g);
            nrhVar = new nrh();
            dsh.a(mrhVar.a);
            dsh.b(mrhVar.b);
            int i = fth.a;
            dsh.a.logp(Level.WARNING, "com.google.api.client.googleapis.services.AbstractGoogleClient", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        return nrhVar;
    }
}
