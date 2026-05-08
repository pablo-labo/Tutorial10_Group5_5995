package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class rfh implements ykh {
    public static final Object c = new Object();
    public static dmh d;
    public final Context a;
    public final ExecutorService b;

    public rfh(Context context, ThreadPoolExecutor threadPoolExecutor) {
        this.a = context;
        this.b = threadPoolExecutor;
    }

    public static Task<Integer> b(Context context, Intent intent) {
        dmh dmhVar;
        Task<Void> task;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new dmh(context);
                }
                dmhVar = d;
            } finally {
            }
        }
        synchronized (dmhVar) {
            try {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
                }
                amh amhVar = new amh(intent);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = dmhVar.c;
                amhVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new gm1(scheduledThreadPoolExecutor.schedule(new yfh(amhVar, 1), 9000L, TimeUnit.MILLISECONDS), 2));
                dmhVar.d.add(amhVar);
                dmhVar.a();
                task = amhVar.b.getTask();
            } finally {
            }
        }
        return task.continueWith(r0i.a, pyd.g0);
    }

    @Override // defpackage.ykh
    public final Task<Integer> a(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.a;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return b(context, intent);
        }
        Callable callable = new Callable(context, intent) { // from class: wrh
            public final Context a;
            public final Intent b;

            {
                this.a = context;
                this.b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = this.a;
                Intent intent2 = this.b;
                wjh wjhVarA = wjh.a();
                wjhVarA.getClass();
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Starting service");
                }
                wjhVarA.d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (wjhVarA) {
                    try {
                        str = wjhVarA.a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        String strValueOf = String.valueOf(context2.getPackageName());
                                        String strValueOf2 = String.valueOf(serviceInfo.name);
                                        wjhVarA.a = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                                    } else {
                                        wjhVarA.a = serviceInfo.name;
                                    }
                                    str = wjhVarA.a;
                                }
                                String str3 = serviceInfo.packageName;
                                String str4 = serviceInfo.name;
                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                                sb.append(str3);
                                sb.append("/");
                                sb.append(str4);
                                Log.e("FirebaseInstanceId", sb.toString());
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", str.length() != 0 ? "Restricting intent to a specific service: ".concat(str) : new String("Restricting intent to a specific service: "));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (wjhVarA.b(context2)) {
                        componentNameStartService = h4.C(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    String strValueOf3 = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 45);
                    sb2.append("Failed to start service while in background: ");
                    sb2.append(strValueOf3);
                    Log.e("FirebaseInstanceId", sb2.toString());
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
                    i = DataOkHttpUploader.HTTP_UNAUTHORIZED;
                }
                return Integer.valueOf(i);
            }
        };
        ExecutorService executorService = this.b;
        return Tasks.call(executorService, callable).continueWithTask(executorService, new ou7(context, intent));
    }
}
