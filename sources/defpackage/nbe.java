package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class nbe implements qbe {
    public final Context a;
    public final rbe b;
    public final b36 c;
    public final ojh d;
    public final qei e;
    public final oq2 f;
    public final ce3 g;
    public final AtomicReference<hbe> h;
    public final AtomicReference<TaskCompletionSource<hbe>> i;

    public nbe(Context context, rbe rbeVar, ojh ojhVar, b36 b36Var, qei qeiVar, oq2 oq2Var, ce3 ce3Var) {
        AtomicReference<hbe> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.b = rbeVar;
        this.d = ojhVar;
        this.c = b36Var;
        this.e = qeiVar;
        this.f = oq2Var;
        this.g = ce3Var;
        atomicReference.set(iq3.b(ojhVar));
    }

    public static void c(JSONObject jSONObject, String str) {
        StringBuilder sbG = q6.g(str);
        sbG.append(jSONObject.toString());
        String string = sbG.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public final hbe a(mbe mbeVar) {
        hbe hbeVar = null;
        try {
            if (!mbe.b.equals(mbeVar)) {
                JSONObject jSONObjectD = this.e.d();
                if (jSONObjectD != null) {
                    hbe hbeVarA = this.c.a(jSONObjectD);
                    c(jSONObjectD, "Loaded cached settings: ");
                    this.d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (mbe.c.equals(mbeVar) || hbeVarA.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return hbeVarA;
                        } catch (Exception e) {
                            e = e;
                            hbeVar = hbeVarA;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return hbeVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final hbe b() {
        return this.h.get();
    }
}
