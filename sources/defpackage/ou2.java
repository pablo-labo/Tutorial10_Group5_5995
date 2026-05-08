package defpackage;

import defpackage.o7d;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class ou2 implements Callback, Function1<Throwable, j6g> {
    public final Call a;
    public final qw1 b;

    public ou2(Call call, qw1 qw1Var) {
        this.a = call;
        this.b = qw1Var;
    }

    @Override // okhttp3.Callback
    public final void h(Call call, IOException iOException) {
        if (call.getE0()) {
            return;
        }
        this.b.resumeWith(new o7d.a(iOException));
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        try {
            this.a.cancel();
        } catch (Throwable unused) {
        }
        return j6g.a;
    }

    @Override // okhttp3.Callback
    public final void p(Call call, Response response) {
        this.b.resumeWith(response);
    }
}
