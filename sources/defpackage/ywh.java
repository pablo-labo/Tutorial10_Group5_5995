package defpackage;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class ywh extends Service {
    public final ExecutorService a;
    public tlh b;
    public final Object c;
    public int d;
    public int e;

    public ywh() {
        v8a v8aVar = new v8a("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), v8aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public Intent a(Intent intent) {
        return intent;
    }

    public boolean b(Intent intent) {
        return false;
    }

    public abstract void c(Intent intent);

    public final Task<Void> d(final Intent intent) {
        if (b(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.execute(new Runnable(this, intent, taskCompletionSource) { // from class: u3i
            public final ywh a;
            public final Intent b;
            public final TaskCompletionSource c;

            {
                this.a = this;
                this.b = intent;
                this.c = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ywh ywhVar = this.a;
                Intent intent2 = this.b;
                TaskCompletionSource taskCompletionSource2 = this.c;
                try {
                    ywhVar.c(intent2);
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void e(Intent intent) {
        if (intent != null) {
            synchronized (h4.Z) {
                try {
                    if (h4.a0 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                        h4.a0.b();
                    }
                } finally {
                }
            }
        }
        synchronized (this.c) {
            try {
                int i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    stopSelfResult(this.d);
                }
            } finally {
            }
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.b == null) {
                this.b = new tlh(new ke0(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intentA = a(intent);
        if (intentA == null) {
            e(intent);
            return 2;
        }
        Task<Void> taskD = d(intentA);
        if (taskD.isComplete()) {
            e(intent);
            return 2;
        }
        taskD.addOnCompleteListener(s0i.a, new r33(this, intent));
        return 3;
    }
}
