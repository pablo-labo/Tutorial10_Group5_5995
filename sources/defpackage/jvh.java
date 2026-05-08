package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jvh {
    public static final HashMap d = new HashMap();
    public static final qvh e = qvh.a;
    public final ExecutorService a;
    public final nwh b;
    public Task<tvh> c = null;

    public jvh(ExecutorService executorService, nwh nwhVar) {
        this.a = executorService;
        this.b = nwhVar;
    }

    public final tvh a() {
        synchronized (this) {
            try {
                Task<tvh> task = this.c;
                if (task != null && task.isSuccessful()) {
                    return this.c.getResult();
                }
                try {
                    Task<tvh> taskC = c();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    v vVar = new v();
                    qvh qvhVar = e;
                    taskC.addOnSuccessListener(qvhVar, vVar);
                    taskC.addOnFailureListener(qvhVar, vVar);
                    taskC.addOnCanceledListener(qvhVar, vVar);
                    try {
                        if (!((CountDownLatch) vVar.a).await(5L, timeUnit)) {
                            throw new TimeoutException("Task await timed out.");
                        }
                        if (taskC.isSuccessful()) {
                            return taskC.getResult();
                        }
                        throw new ExecutionException(taskC.getException());
                    } catch (ExecutionException e2) {
                        e = e2;
                        Log.d("ConfigCacheClient", "Reading from storage file failed.", e);
                        return null;
                    } catch (TimeoutException e3) {
                        e = e3;
                        Log.d("ConfigCacheClient", "Reading from storage file failed.", e);
                        return null;
                    }
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(tvh tvhVar) {
        dig digVar = new dig(this, tvhVar);
        ExecutorService executorService = this.a;
        Task taskCall = Tasks.call(executorService, digVar);
        ua9 ua9Var = new ua9();
        ua9Var.b = this;
        ua9Var.a = tvhVar;
        taskCall.onSuccessTask(executorService, ua9Var);
    }

    public final synchronized Task<tvh> c() {
        try {
            Task<tvh> task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                ExecutorService executorService = this.a;
                final nwh nwhVar = this.b;
                this.c = Tasks.call(executorService, new Callable(nwhVar) { // from class: lvh
                    public final nwh a;

                    {
                        this.a = nwhVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        tvh tvhVar;
                        nwh nwhVar2 = this.a;
                        synchronized (nwhVar2) {
                            try {
                                FileInputStream fileInputStreamOpenFileInput = nwhVar2.a.openFileInput(nwhVar2.b);
                                try {
                                    int iAvailable = fileInputStreamOpenFileInput.available();
                                    byte[] bArr = new byte[iAvailable];
                                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                    JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
                                    tvhVar = new tvh(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
                                    fileInputStreamOpenFileInput.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        if (fileInputStreamOpenFileInput != null) {
                                            try {
                                                fileInputStreamOpenFileInput.close();
                                            } catch (Throwable th3) {
                                                vuh.a.v0(th, th3);
                                            }
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (FileNotFoundException | JSONException unused) {
                                return null;
                            }
                        }
                        return tvhVar;
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }
}
