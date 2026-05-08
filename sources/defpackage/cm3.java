package defpackage;

import defpackage.fm3;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class cm3 implements bv1<Object, av1<?>> {
    public final /* synthetic */ Type a;
    public final /* synthetic */ Executor b;

    public cm3(Type type, Executor executor) {
        this.a = type;
        this.b = executor;
    }

    @Override // defpackage.bv1
    public final Type a() {
        return this.a;
    }

    @Override // defpackage.bv1
    public final Object b(dpa dpaVar) {
        Executor executor = this.b;
        return executor == null ? dpaVar : new fm3.a(executor, dpaVar);
    }
}
