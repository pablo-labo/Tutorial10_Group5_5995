package defpackage;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y4a {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final a5a b = pnb.i();

    public static final class a {
        public final n4a a;
        public final ex7 b;

        public a(n4a n4aVar, ex7 ex7Var) {
            this.a = n4aVar;
            this.b = ex7Var;
        }
    }

    public static final void a(y4a y4aVar, a aVar) {
        AtomicReference<a> atomicReference = y4aVar.a;
        while (true) {
            a aVar2 = atomicReference.get();
            if (aVar2 != null && aVar.a.compareTo(aVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            if (aVar2 != null) {
                aVar2.b.h(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    public static Object b(y4a y4aVar, Function1 function1, c1f c1fVar) {
        y4aVar.getClass();
        return f13.d(new v4a(n4a.a, y4aVar, function1, null), c1fVar);
    }
}
