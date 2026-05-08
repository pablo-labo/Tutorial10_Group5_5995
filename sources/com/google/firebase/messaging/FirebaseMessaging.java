package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.bjg;
import defpackage.btf;
import defpackage.hh6;
import defpackage.nli;
import defpackage.pf5;
import defpackage.v8a;
import defpackage.vf5;
import defpackage.wm2;
import defpackage.xih;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    @SuppressLint({"FirebaseUnknownNullness"})
    public static btf b;
    public final FirebaseInstanceId a;

    public FirebaseMessaging(pf5 pf5Var, final FirebaseInstanceId firebaseInstanceId, bjg bjgVar, hh6 hh6Var, vf5 vf5Var, btf btfVar) {
        b = btfVar;
        this.a = firebaseInstanceId;
        pf5Var.a();
        final Context context = pf5Var.a;
        final xih xihVar = new xih(context);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        v8a v8aVar = new v8a("Firebase-Messaging-Rpc-Task");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, v8aVar);
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new v8a("Firebase-Messaging-Topics-Io"));
        final nli nliVar = new nli(pf5Var, xihVar, threadPoolExecutor, bjgVar, hh6Var, vf5Var);
        Tasks.call(scheduledThreadPoolExecutor, new Callable(context, scheduledThreadPoolExecutor, firebaseInstanceId, xihVar, nliVar) { // from class: fgh
            public final Context a;
            public final ScheduledThreadPoolExecutor b;
            public final FirebaseInstanceId c;
            public final xih d;
            public final nli e;

            {
                this.a = context;
                this.b = scheduledThreadPoolExecutor;
                this.c = firebaseInstanceId;
                this.d = xihVar;
                this.e = nliVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                xmi xmiVar;
                Context context2 = this.a;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.b;
                FirebaseInstanceId firebaseInstanceId2 = this.c;
                xih xihVar2 = this.d;
                nli nliVar2 = this.e;
                synchronized (xmi.class) {
                    try {
                        WeakReference<xmi> weakReference = xmi.c;
                        xmi xmiVar2 = weakReference != null ? weakReference.get() : null;
                        if (xmiVar2 == null) {
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.android.gms.appid", 0);
                            xmiVar = new xmi(sharedPreferences, scheduledThreadPoolExecutor2);
                            synchronized (xmiVar) {
                                xmiVar.a = hmi.a(sharedPreferences, scheduledThreadPoolExecutor2);
                            }
                            xmi.c = new WeakReference<>(xmiVar);
                        } else {
                            xmiVar = xmiVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new lgh(firebaseInstanceId2, xihVar2, xmiVar, nliVar2, context2, scheduledThreadPoolExecutor2);
            }
        }).addOnSuccessListener(new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), new v8a("Firebase-Messaging-Trigger-Topics-Io")), new wm2(this));
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(pf5 pf5Var) {
        return (FirebaseMessaging) pf5Var.b(FirebaseMessaging.class);
    }
}
