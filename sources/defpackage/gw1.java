package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface gw1 extends bla {

    public static final class a implements gw1 {
        public final Function1<Throwable, j6g> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, j6g> function1) {
            this.a = function1;
        }

        @Override // defpackage.gw1
        public final void b(Throwable th) {
            this.a.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + pi3.f(this) + ']';
        }
    }

    void b(Throwable th);
}
