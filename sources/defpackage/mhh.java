package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.wl0;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class mhh {
    public static volatile mhh g;
    public static Boolean h;
    public final ExecutorService a;
    public final wl0 b;
    public ArrayList c;
    public int d;
    public boolean e;
    public xli f;

    public abstract class a implements Runnable {
        public final long a;
        public final long b;
        public final boolean c;

        public a(boolean z) {
            mhh.this.getClass();
            this.a = System.currentTimeMillis();
            this.b = SystemClock.elapsedRealtime();
            this.c = z;
        }

        public abstract void a();

        public void b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            mhh mhhVar = mhh.this;
            if (mhhVar.e) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                mhhVar.b(e, false, this.c);
                b();
            }
        }
    }

    public class b implements Application.ActivityLifecycleCallbacks {
        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            mhh.this.c(new pmh(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            mhh.this.c(new cnh(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            mhh.this.c(new qmh(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            mhh.this.c(new tmh(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jli jliVar = new jli();
            mhh.this.c(new vmh(this, activity, jliVar));
            Bundle bundleH = jliVar.h(50L);
            if (bundleH != null) {
                bundle.putAll(bundleH);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            mhh.this.c(new nmh(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            mhh.this.c(new ymh(this, activity));
        }
    }

    public static class c extends bgh {
        public final wl0.a a;

        public c(wl0.a aVar) {
            super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
            this.a = aVar;
        }

        @Override // defpackage.igh
        public final void S(long j, Bundle bundle, String str, String str2) {
            this.a.a(j, bundle, str, str2);
        }

        @Override // defpackage.igh
        public final int zza() {
            return System.identityHashCode(this.a);
        }
    }

    public mhh(Context context, Bundle bundle) {
        jjh jjhVar = new jjh();
        jjhVar.a = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), jjhVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new wl0(this);
        try {
            fib.i(context);
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("google_app_id", "string", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
            if (identifier != 0) {
                resources.getString(identifier);
            }
        } catch (IllegalStateException unused) {
        }
        c(new eih(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    public static mhh a(Context context, Bundle bundle) {
        fib.i(context);
        if (g == null) {
            synchronized (mhh.class) {
                try {
                    if (g == null) {
                        g = new mhh(context, bundle);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public static void d(Context context) {
        ApplicationInfo applicationInfoA;
        Bundle bundle;
        synchronized (mhh.class) {
            try {
            } catch (Exception e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                h = Boolean.FALSE;
            }
            if (h != null) {
                return;
            }
            fib.f("app_measurement_internal_disable_startup_flags");
            try {
                applicationInfoA = a5h.a(context).a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, context.getPackageName());
            } catch (PackageManager.NameNotFoundException unused) {
            }
            boolean z = (applicationInfoA == null || (bundle = applicationInfoA.metaData) == null) ? false : bundle.getBoolean("app_measurement_internal_disable_startup_flags");
            if (z) {
                h = Boolean.FALSE;
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
            h = Boolean.valueOf(sharedPreferences.getBoolean("allow_remote_dynamite", false));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove("allow_remote_dynamite");
            editorEdit.apply();
        }
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new llh(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void c(a aVar) {
        this.a.execute(aVar);
    }
}
