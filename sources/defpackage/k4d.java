package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.g;
import defpackage.ew8;

/* JADX INFO: loaded from: classes.dex */
public final class k4d implements Handler.Callback {
    public static final a e = new a();
    public volatile j4d a;
    public final b b;
    public final vs5 c;
    public final ew8 d;

    public class a implements b {
    }

    public interface b {
    }

    public k4d() {
        new ht0();
        a aVar = e;
        this.b = aVar;
        this.d = new ew8(aVar);
        this.c = (gg6.f && gg6.e) ? new ig5() : new ypd(23);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final j4d b(Context context) {
        if (context == null) {
            l5.q("You cannot start a load on a null Context");
            return null;
        }
        char[] cArr = xjg.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof g) {
                g gVar = (g) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(gVar.getApplicationContext());
                }
                if (gVar.isDestroyed()) {
                    l5.q("You cannot start a load for a destroyed activity");
                    return null;
                }
                this.c.g(gVar);
                Activity activityA = a(gVar);
                boolean z = activityA == null || !activityA.isFinishing();
                com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(gVar.getApplicationContext());
                ew8 ew8Var = this.d;
                aw8 aw8Var = gVar.a;
                gVar.u();
                ew8Var.getClass();
                xjg.a();
                xjg.a();
                j4d j4dVar = (j4d) ew8Var.a.get(aw8Var);
                if (j4dVar != null) {
                    return j4dVar;
                }
                wv8 wv8Var = new wv8(aw8Var);
                b bVar = ew8Var.b;
                ew8.a aVar = new ew8.a();
                ((a) bVar).getClass();
                j4d j4dVar2 = new j4d(aVarA, wv8Var, aVar, gVar);
                ew8Var.a.put(aw8Var, j4dVar2);
                wv8Var.c(new dw8(ew8Var, aw8Var));
                if (z) {
                    j4dVar2.f();
                }
                return j4dVar2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        com.bumptech.glide.a aVarA2 = com.bumptech.glide.a.a(context.getApplicationContext());
                        b bVar2 = this.b;
                        ie7 ie7Var = new ie7(13);
                        ie7 ie7Var2 = new ie7(19);
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar2).getClass();
                        this.a = new j4d(aVarA2, ie7Var, ie7Var2, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
