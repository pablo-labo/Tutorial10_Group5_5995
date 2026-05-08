package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import defpackage.j24;

/* JADX INFO: loaded from: classes2.dex */
public final class c8b extends zyc {
    public final j24 b;
    public final m24 c;

    public static final class a implements j24.a {
        @Override // j24.a
        public final void a() {
        }
    }

    public c8b(Context context) {
        context.getClass();
        j24 j24Var = new j24(context, new a());
        this.b = j24Var;
        this.c = new m24(j24Var, context, j24Var.c);
    }

    @Override // defpackage.zyc, defpackage.w24
    public final void e() {
        m24 m24Var = this.c;
        m24Var.getClass();
        new n24(m24Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // defpackage.zyc, defpackage.w24
    public final void t() {
        m24 m24Var = this.c;
        if (m24Var.i != null) {
            s55.n("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new q24(m24Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // defpackage.zyc, defpackage.w24
    public final n34 y() {
        return this.b;
    }
}
