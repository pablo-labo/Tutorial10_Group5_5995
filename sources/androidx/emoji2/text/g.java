package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.d;
import defpackage.ao5;
import defpackage.b0;
import defpackage.bg;
import defpackage.bo5;
import defpackage.hh2;
import defpackage.hn2;
import defpackage.l6;
import defpackage.qx0;
import defpackage.wo5;
import defpackage.xo5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d.c {
    public static final a d = new a();

    public static class a {
    }

    public static class b implements d.h {
        public final Context a;
        public final bo5 b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public ThreadPoolExecutor f;
        public ThreadPoolExecutor g;
        public d.i h;

        public b(Context context, bo5 bo5Var) {
            hh2.m(context, "Context cannot be null");
            this.a = context.getApplicationContext();
            this.b = bo5Var;
            this.c = g.d;
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            synchronized (this.d) {
                this.h = iVar;
            }
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new hn2("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new qx0(this, 6));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final xo5 c() {
            try {
                a aVar = this.c;
                Context context = this.a;
                bo5 bo5Var = this.b;
                aVar.getClass();
                ArrayList arrayList = new ArrayList(1);
                Object obj = new Object[]{bo5Var}[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                wo5 wo5VarA = ao5.a(context, Collections.unmodifiableList(arrayList));
                int i = wo5VarA.a;
                if (i != 0) {
                    b0.o(bg.d(i, "fetchFonts failed (", ")"));
                    return null;
                }
                xo5[] xo5VarArr = (xo5[]) ((List) wo5VarA.b).get(0);
                if (xo5VarArr != null && xo5VarArr.length != 0) {
                    return xo5VarArr[0];
                }
                b0.o("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                l6.p("provider not found", e);
                return null;
            }
        }
    }
}
