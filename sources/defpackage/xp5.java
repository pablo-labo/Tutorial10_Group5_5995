package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xp5<V> extends wp5<V> implements hz8<V> {

    public static abstract class a<V> extends xp5<V> {
        public final j2 b;

        public a(j2 j2Var) {
            super(2);
            this.b = j2Var;
        }

        @Override // defpackage.h91
        public final Object t() {
            return this.b;
        }
    }

    @Override // defpackage.hz8
    public final void a(Runnable runnable, Executor executor) {
        ((a) this).b.a(runnable, executor);
    }
}
