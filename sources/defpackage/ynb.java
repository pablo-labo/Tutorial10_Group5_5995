package defpackage;

import android.app.Activity;
import android.os.Handler;
import defpackage.kv8;
import defpackage.znb;

/* JADX INFO: loaded from: classes.dex */
public final class ynb implements zv8 {
    public static final ynb X = new ynb();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final aw8 f = new aw8(this, true);
    public final sm3 V = new sm3(this, 2);
    public final b W = new b();

    public static final class a {
        public static final void a(Activity activity, znb.a aVar) {
            activity.registerActivityLifecycleCallbacks(aVar);
        }
    }

    public static final class b {
        public b() {
        }
    }

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.f(kv8.a.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.V);
            }
        }
    }

    @Override // defpackage.zv8
    public final kv8 getLifecycle() {
        return this.f;
    }
}
