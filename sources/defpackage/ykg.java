package defpackage;

import defpackage.nd6;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ykg {
    public Function1<? super ykg, j6g> a;

    public abstract void a(gb4 gb4Var);

    public Function1<ykg, j6g> b() {
        return this.a;
    }

    public final void c() {
        Function1<ykg, j6g> function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(nd6.a aVar) {
        this.a = aVar;
    }
}
