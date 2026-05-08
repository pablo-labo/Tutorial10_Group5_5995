package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ki1<T> {

    public static final class a<T> extends ki1<T> {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "And(operands=null)";
        }
    }

    public static final class b<T> extends ki1<T> {
        public final a71 a;

        public b(a71 a71Var) {
            this.a = a71Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Element(value=" + this.a + ')';
        }
    }

    public static final class c extends ki1 {
        public static final c a = new c();
    }

    public static final class d<T> extends ki1<T> {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Not(operand=null)";
        }
    }

    public static final class e<T> extends ki1<T> {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() throws IOException {
            z92.W0(null, " | ", null, null, null, 62);
            throw null;
        }
    }

    public static final class f extends ki1 {
        public static final f a = new f();
    }
}
