package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class ce3 {
    public final pf5 a;
    public final boolean d;
    public final Boolean e;
    public final Object b = new Object();
    public final TaskCompletionSource<Void> c = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> f = new TaskCompletionSource<>();

    public ce3(pf5 pf5Var) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.d = false;
        pf5Var.a();
        Context context = pf5Var.a;
        this.a = pf5Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.d = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.d = false;
                boolValueOf = null;
            } else {
                this.d = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.e = boolValueOf;
        synchronized (this.b) {
            try {
                if (a()) {
                    this.c.trySetResult(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zH;
        Boolean bool = this.e;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = this.a.h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        String strK = akb.k("Crashlytics automatic data collection ", zH ? "ENABLED" : "DISABLED", " by ", this.e == null ? "global Firebase setting" : this.d ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strK, null);
        }
        return zH;
    }
}
