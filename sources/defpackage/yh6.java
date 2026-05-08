package defpackage;

import defpackage.qsg;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yh6 {
    public final b a = new b(this);

    public final class a {
        public qsg a;
        public final nde b = wg2.d(1, 0, eo1.b, 2);
    }

    public final class b {
        public qsg.a c;
        public final a a = new a();
        public final a b = new a();
        public final ReentrantLock d = new ReentrantLock();

        public b(yh6 yh6Var) {
        }

        public final void a(qsg.a aVar, Function2<? super a, ? super a, j6g> function2) {
            ReentrantLock reentrantLock = this.d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.c = aVar;
                }
                function2.invoke(this.a, this.b);
                j6g j6gVar = j6g.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
