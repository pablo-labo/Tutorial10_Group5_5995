package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import defpackage.k15;

/* JADX INFO: loaded from: classes.dex */
public final class nt1 implements k15.a {
    public static final b a = new b();

    public static final class a {
        public long a;
        public long b;
        public long c;
        public long d;
        public boolean e;
        public ApolloException f;

        public final nt1 a() {
            return new nt1();
        }
    }

    public static final class b implements k15.b<nt1> {
    }

    @Override // k15.a
    public final k15.b<?> getKey() {
        return a;
    }
}
