package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.bjg;
import defpackage.dmc;
import defpackage.ekh;
import defpackage.fib;
import defpackage.gm1;
import defpackage.hh6;
import defpackage.hy4;
import defpackage.ikh;
import defpackage.jg7;
import defpackage.kxe;
import defpackage.nli;
import defpackage.pf5;
import defpackage.plh;
import defpackage.qii;
import defpackage.r40;
import defpackage.r6;
import defpackage.v8a;
import defpackage.vf5;
import defpackage.ws9;
import defpackage.xf5;
import defpackage.xih;
import defpackage.yd3;
import defpackage.z3;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstanceId {
    public static ikh i;
    public static final Pattern j = Pattern.compile("\\AA[\\w-]{38}\\z");

    @VisibleForTesting
    public static ScheduledThreadPoolExecutor k;

    @VisibleForTesting
    public final ThreadPoolExecutor a;
    public final pf5 b;
    public final xih c;
    public final nli d;
    public final ws9 e;
    public final vf5 f;
    public boolean g;
    public final a h;

    public class a {
        public boolean a;
        public final kxe b;
        public boolean c;
        public Boolean d;

        public a(kxe kxeVar) {
            this.b = kxeVar;
        }

        public final synchronized boolean a() {
            b();
            Boolean bool = this.d;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.a && FirebaseInstanceId.this.b.h();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [dki] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final synchronized void b() {
            try {
                if (this.c) {
                    return;
                }
                this.a = true;
                Boolean boolC = c();
                this.d = boolC;
                if (boolC == null && this.a) {
                    this.b.a(new hy4(this) { // from class: dki
                        public final FirebaseInstanceId.a a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.hy4
                        public final void a(px4 px4Var) {
                            FirebaseInstanceId.a aVar = this.a;
                            synchronized (aVar) {
                                try {
                                    if (aVar.a()) {
                                        FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.this;
                                        ikh ikhVar = FirebaseInstanceId.i;
                                        if (firebaseInstanceId.e(firebaseInstanceId.f(xih.b(firebaseInstanceId.b), "*"))) {
                                            firebaseInstanceId.i();
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                }
                this.c = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            pf5 pf5Var = FirebaseInstanceId.this.b;
            pf5Var.a();
            Context context = pf5Var.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseInstanceId(pf5 pf5Var, kxe kxeVar, bjg bjgVar, hh6 hh6Var, vf5 vf5Var) {
        pf5Var.a();
        xih xihVar = new xih(pf5Var.a);
        ThreadPoolExecutor threadPoolExecutorO = dmc.o();
        ThreadPoolExecutor threadPoolExecutorO2 = dmc.o();
        this.g = false;
        if (xih.b(pf5Var) == null) {
            r6.g("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
            throw null;
        }
        synchronized (FirebaseInstanceId.class) {
            try {
                if (i == null) {
                    pf5Var.a();
                    i = new ikh(pf5Var.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = pf5Var;
        this.c = xihVar;
        this.d = new nli(pf5Var, xihVar, threadPoolExecutorO, bjgVar, hh6Var, vf5Var);
        this.a = threadPoolExecutorO2;
        this.h = new a(kxeVar);
        this.e = new ws9(threadPoolExecutorO);
        this.f = vf5Var;
        threadPoolExecutorO2.execute(new Runnable(this) { // from class: ofi
            public final FirebaseInstanceId a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstanceId firebaseInstanceId = this.a;
                if (firebaseInstanceId.h.a() && firebaseInstanceId.e(firebaseInstanceId.f(xih.b(firebaseInstanceId.b), "*"))) {
                    firebaseInstanceId.i();
                }
            }
        });
    }

    public static void c(pf5 pf5Var) {
        pf5Var.a();
        xf5 xf5Var = pf5Var.c;
        fib.g(xf5Var.g, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        pf5Var.a();
        String str = xf5Var.b;
        fib.g(str, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        pf5Var.a();
        String str2 = xf5Var.a;
        fib.g(str2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        pf5Var.a();
        fib.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        pf5Var.a();
        fib.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.matcher(str2).matches());
    }

    public static void d(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (k == null) {
                    k = new ScheduledThreadPoolExecutor(1, new v8a("FirebaseInstanceId"));
                }
                k.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Keep
    public static FirebaseInstanceId getInstance(pf5 pf5Var) {
        c(pf5Var);
        return (FirebaseInstanceId) pf5Var.b(FirebaseInstanceId.class);
    }

    public final Task a(String str) {
        return Tasks.forResult(null).continueWithTask(this.a, new yd3(this, str, "*"));
    }

    public final synchronized void b(long j2) {
        d(new plh(this, Math.min(Math.max(30L, j2 << 1), 28800L)), j2);
        this.g = true;
    }

    public final boolean e(ekh ekhVar) {
        if (ekhVar != null) {
            return System.currentTimeMillis() > ekhVar.c + 604800000 || !this.c.d().equals(ekhVar.b);
        }
        return true;
    }

    @VisibleForTesting
    public final ekh f(String str, String str2) {
        ekh ekhVarB;
        ikh ikhVar = i;
        String strK = k();
        synchronized (ikhVar) {
            ekhVarB = ekh.b(ikhVar.a.getString(ikh.d(strK, str, str2), null));
        }
        return ekhVarB;
    }

    public final String g() throws IOException {
        pf5 pf5Var = this.b;
        String strB = xih.b(pf5Var);
        c(pf5Var);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r40.h("MAIN_THREAD");
            return null;
        }
        try {
            return ((jg7) Tasks.await(a(strB), 30000L, TimeUnit.MILLISECONDS)).a();
        } catch (InterruptedException | TimeoutException unused) {
            r40.h("SERVICE_NOT_AVAILABLE");
            return null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    this.h();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final synchronized void h() {
        i.b();
        if (this.h.a()) {
            i();
        }
    }

    public final synchronized void i() {
        if (!this.g) {
            b(0L);
        }
    }

    public final String j() {
        try {
            i.c(this.b.d());
            Task<String> id = this.f.getId();
            fib.j(id, "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            id.addOnCompleteListener(qii.a, new gm1(countDownLatch, 3));
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (id.isSuccessful()) {
                return id.getResult();
            }
            if (id.isCanceled()) {
                throw new CancellationException("Task is already canceled");
            }
            if (id.isComplete()) {
                throw new IllegalStateException(id.getException());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e) {
            z3.q(e);
            return null;
        }
    }

    public final String k() {
        pf5 pf5Var = this.b;
        pf5Var.a();
        return "[DEFAULT]".equals(pf5Var.b) ? "" : pf5Var.d();
    }
}
