package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c19;
import defpackage.gj0;
import defpackage.ot0;
import defpackage.vl0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final c a = new c(new ExecutorC0007d());
    public static int b = -100;
    public static c19 c = null;
    public static c19 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final ot0<WeakReference<d>> V = new ot0<>(0);
    public static final Object W = new Object();
    public static final Object X = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static class c implements Executor {
        public final Object a = new Object();
        public final ArrayDeque b = new ArrayDeque();
        public final ExecutorC0007d c;
        public Runnable d;

        public c(ExecutorC0007d executorC0007d) {
            this.c = executorC0007d;
        }

        public final void a() {
            synchronized (this.a) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    this.d = runnable;
                    if (runnable != null) {
                        this.c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.a) {
                try {
                    this.b.add(new gj0(0, this, runnable));
                    if (this.d == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.d$d, reason: collision with other inner class name */
    public static class ExecutorC0007d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean h(Context context) {
        if (e == null) {
            try {
                int i = vl0.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) vl0.class), vl0.a.a() | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(d dVar) {
        synchronized (W) {
            try {
                ot0<WeakReference<d>> ot0Var = V;
                ot0Var.getClass();
                ot0.a aVar = new ot0.a();
                while (aVar.hasNext()) {
                    d dVar2 = (d) ((WeakReference) aVar.next()).get();
                    if (dVar2 == dVar || dVar2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (b != i) {
            b = i;
            synchronized (W) {
                try {
                    ot0<WeakReference<d>> ot0Var = V;
                    ot0Var.getClass();
                    ot0.a aVar = new ot0.a();
                    while (aVar.hasNext()) {
                        d dVar = (d) ((WeakReference) aVar.next()).get();
                        if (dVar != null) {
                            dVar.b();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b();

    public abstract <T extends View> T c(int i);

    public Context d() {
        return null;
    }

    public int e() {
        return -100;
    }

    public abstract void f();

    public abstract void g();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract boolean n(int i);

    public abstract void o(int i);

    public abstract void p(View view);

    public abstract void r(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void t(CharSequence charSequence);
}
