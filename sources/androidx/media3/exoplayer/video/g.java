package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.media3.exoplayer.d;
import defpackage.ak3;
import defpackage.dk3;
import defpackage.tog;
import defpackage.y71;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    public static final class a {
        public final Handler a;
        public final g b;

        public a(Handler handler, d.a aVar) {
            if (aVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = aVar;
        }

        public final void a(tog togVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new y71(4, this, togVar));
            }
        }
    }

    default void a(tog togVar) {
    }

    default void b(ak3 ak3Var) {
    }

    default void c(androidx.media3.common.a aVar, dk3 dk3Var) {
    }

    default void d(String str) {
    }

    default void e(long j, String str, long j2) {
    }

    default void f(Exception exc) {
    }

    default void i(int i, long j) {
    }

    default void j(ak3 ak3Var) {
    }

    default void k(int i, long j) {
    }

    default void l(Object obj, long j) {
    }
}
