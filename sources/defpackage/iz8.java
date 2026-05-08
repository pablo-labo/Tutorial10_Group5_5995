package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iz8<L> {
    public final auh a = auh.a;
    public volatile mqh b;
    public volatile a c;

    public static final class a<L> {
        public final mqh a;

        public a(mqh mqhVar) {
            this.a = mqhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + 1237763640;
        }
    }

    public iz8(mqh mqhVar) {
        this.b = mqhVar;
        fib.f("GetCurrentLocation");
        this.c = new a(mqhVar);
    }
}
