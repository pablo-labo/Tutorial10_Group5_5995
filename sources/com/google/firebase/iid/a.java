package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.akh;
import defpackage.bjh;
import defpackage.jfe;
import defpackage.kgh;
import defpackage.xih;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static int g;
    public static PendingIntent h;
    public final Context b;
    public final xih c;
    public Messenger e;
    public zzj f;
    public final jfe<String, TaskCompletionSource<Bundle>> a = new jfe<>();
    public final Messenger d = new Messenger(new akh(this, Looper.getMainLooper()));

    public a(Context context, xih xihVar) {
        this.b = context;
        this.c = xihVar;
    }

    public final Bundle a(Bundle bundle) throws IOException {
        int i;
        if (this.c.e() < 12000000) {
            Bundle bundleC = c(bundle);
            if (bundleC == null || !bundleC.containsKey("google.messenger")) {
                return bundleC;
            }
            Bundle bundleC2 = c(bundle);
            if (bundleC2 == null || !bundleC2.containsKey("google.messenger")) {
                return bundleC2;
            }
            return null;
        }
        kgh kghVarB = kgh.b(this.b);
        synchronized (kghVarB) {
            i = kghVarB.d;
            kghVarB.d = i + 1;
        }
        try {
            return (Bundle) Tasks.await(kghVarB.a(new bjh(i, 1, bundle)));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
                sb.append("Error making request: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e.getCause() instanceof zzam) || ((zzam) e.getCause()).a() != 4) {
                return null;
            }
            Bundle bundleC3 = c(bundle);
            if (bundleC3 == null || !bundleC3.containsKey("google.messenger")) {
                return bundleC3;
            }
            Bundle bundleC4 = c(bundle);
            if (bundleC4 == null || !bundleC4.containsKey("google.messenger")) {
                return bundleC4;
            }
            return null;
        }
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                TaskCompletionSource<Bundle> taskCompletionSourceRemove = this.a.remove(str);
                if (taskCompletionSourceRemove != null) {
                    taskCompletionSourceRemove.setResult(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle c(android.os.Bundle r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.a.c(android.os.Bundle):android.os.Bundle");
    }
}
