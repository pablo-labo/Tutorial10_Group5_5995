package defpackage;

import defpackage.ex7;
import defpackage.j22;
import defpackage.yge;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes.dex */
public final class ife<T> {
    public final e13 a;
    public final bhe b;
    public final go1 c;
    public final AtomicInteger d;

    public ife(e13 e13Var, zge zgeVar, Function2 function2, bhe bheVar) {
        function2.getClass();
        this.a = e13Var;
        this.b = bheVar;
        this.c = h22.a(Integer.MAX_VALUE, 6, null);
        this.d = new AtomicInteger(0);
        ex7 ex7Var = (ex7) e13Var.getCoroutineContext().h1(ex7.a.a);
        if (ex7Var == null) {
            return;
        }
        ex7Var.d0(new gfe(zgeVar, this, function2));
    }

    public final void a(yge.a aVar) {
        Object objF = this.c.f(aVar);
        if (objF instanceof j22.a) {
            Throwable th = ((j22.a) objF).a;
            if (th != null) {
                throw th;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (objF instanceof j22.b) {
            r6.g("Check failed.");
        } else if (this.d.getAndIncrement() == 0) {
            u63.Y(this.a, null, null, new hfe(this, null), 3);
        }
    }
}
