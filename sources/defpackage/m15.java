package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class m15 implements d65<Executor> {

    public static final class a {
        public static final m15 a = new m15();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new njd(Executors.newSingleThreadExecutor());
    }
}
