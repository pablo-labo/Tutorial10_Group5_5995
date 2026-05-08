package defpackage;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public final class lt8 extends uqe {
    public final lu2<j6g> d;

    public lt8(v03 v03Var, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2) {
        super(v03Var, false);
        this.d = ewa.s(this, this, function2);
    }

    @Override // defpackage.d78
    public final void X() throws Throwable {
        try {
            mh2.w(ewa.v(this.d), j6g.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            resumeWith(r7d.a(th));
            throw th;
        }
    }
}
