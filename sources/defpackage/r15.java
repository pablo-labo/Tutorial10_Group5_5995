package defpackage;

import android.os.Handler;
import com.android.volley.VolleyError;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r15 implements o6d {
    public final a a;

    public class a implements Executor {
        public final /* synthetic */ Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    public static class b implements Runnable {
        public final m3d a;
        public final l6d b;
        public final Runnable c;

        public b(m3d m3dVar, l6d l6dVar, Runnable runnable) {
            this.a = m3dVar;
            this.b = l6dVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m3d m3dVar = this.a;
            if (m3dVar.isCanceled()) {
                m3dVar.finish("canceled-at-delivery");
                return;
            }
            l6d l6dVar = this.b;
            VolleyError volleyError = l6dVar.c;
            if (volleyError == null) {
                m3dVar.deliverResponse(l6dVar.a);
            } else {
                m3dVar.deliverError(volleyError);
            }
            if (l6dVar.d) {
                m3dVar.addMarker("intermediate-response");
            } else {
                m3dVar.finish("done");
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public r15(Handler handler) {
        this.a = new a(handler);
    }

    public final void a(m3d m3dVar, l6d l6dVar, zs1 zs1Var) {
        m3dVar.markDelivered();
        m3dVar.addMarker("post-response");
        this.a.execute(new b(m3dVar, l6dVar, zs1Var));
    }
}
