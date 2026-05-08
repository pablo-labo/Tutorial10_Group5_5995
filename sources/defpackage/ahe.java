package defpackage;

import defpackage.yge;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ahe extends mj8 implements Function2<yge.a<Object>, Throwable, j6g> {
    public static final ahe a = new ahe(2);

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(yge.a<Object> aVar, Throwable th) {
        yge.a<Object> aVar2 = aVar;
        Throwable cancellationException = th;
        aVar2.getClass();
        if (aVar2 instanceof yge.a.b) {
            yd2 yd2Var = ((yge.a.b) aVar2).b;
            if (cancellationException == null) {
                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            yd2Var.h0(cancellationException);
        }
        return j6g.a;
    }
}
