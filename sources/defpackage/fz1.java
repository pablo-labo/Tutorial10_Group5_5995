package defpackage;

import android.content.SharedPreferences;
import android.location.Location;
import android.util.Log;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fz1 implements wxe, Callback, SuccessContinuation, Continuation {
    public final Object a;

    public fz1() {
        this.a = new ArrayList();
    }

    @Override // defpackage.wxe
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.wxe
    public List e(long j) {
        return j >= 0 ? (List) this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.wxe
    public long f(int i) {
        ka2.l(i == 0);
        return 0L;
    }

    @Override // okhttp3.Callback
    public void h(Call call, IOException iOException) {
        ((ebe) this.a).m(iOException);
    }

    @Override // defpackage.wxe
    public int m() {
        return 1;
    }

    @Override // okhttp3.Callback
    public void p(Call call, Response response) {
        ((ebe) this.a).l(response);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        JSONObject jSONObjectF;
        FileWriter fileWriter;
        nbe nbeVar = (nbe) this.a;
        oq2 oq2Var = nbeVar.f;
        rbe rbeVar = nbeVar.b;
        String str = (String) oq2Var.b;
        FileWriter fileWriter2 = null;
        try {
            HashMap mapC = oq2.c(rbeVar);
            ll6 ll6Var = new ll6(str, mapC);
            ll6Var.c(DataOkHttpUploader.HEADER_USER_AGENT, "Crashlytics Android SDK/18.6.3");
            ll6Var.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            oq2.a(ll6Var, rbeVar);
            String strConcat = "Requesting settings from ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strConcat, null);
            }
            String str2 = "Settings query params were: " + mapC;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str2, null);
            }
            jSONObjectF = oq2Var.f(ll6Var.b());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObjectF = null;
        }
        if (jSONObjectF != null) {
            hbe hbeVarA = nbeVar.c.a(jSONObjectF);
            qei qeiVar = nbeVar.e;
            long j = hbeVarA.c;
            qeiVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectF.put("expires_at", j);
                fileWriter = new FileWriter((File) qeiVar.a);
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th) {
                th = th;
                wc2.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            try {
                try {
                    fileWriter.write(jSONObjectF.toString());
                    fileWriter.flush();
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    wc2.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
            }
            wc2.b(fileWriter, "Failed to close settings writer.");
            nbe.c(jSONObjectF, "Loaded settings: ");
            String str3 = rbeVar.f;
            SharedPreferences.Editor editorEdit = nbeVar.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str3);
            editorEdit.apply();
            nbeVar.h.set(hbeVarA);
            nbeVar.i.get().trySetResult(hbeVarA);
        }
        return Tasks.forResult(null);
    }

    public /* synthetic */ fz1(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.a;
        vf0 vf0Var = smh.k;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult((Location) task.getResult());
            return null;
        }
        Exception exception = task.getException();
        exception.getClass();
        taskCompletionSource.trySetException(exception);
        return null;
    }
}
