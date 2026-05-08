package defpackage;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface k81 {

    public interface a {

        /* JADX INFO: renamed from: k81$a$a, reason: collision with other inner class name */
        public static final class C0289a {
            public final CopyOnWriteArrayList<C0290a> a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: k81$a$a$a, reason: collision with other inner class name */
            public static final class C0290a {
                public final Handler a;
                public final a b;
                public boolean c;

                public C0290a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }
            }
        }

        void O(long j, int i, long j2);
    }

    rl3 a();

    long c();

    void d(Handler handler, a aVar);

    void e(m20 m20Var);
}
