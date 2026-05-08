package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class ex9<A, B> {
    public final dx9 a = new dx9(500);

    public static final class a<A> {
        public static final ArrayDeque b;
        public A a;

        static {
            char[] cArr = xjg.a;
            b = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = b;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.a = obj;
            return aVar;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
