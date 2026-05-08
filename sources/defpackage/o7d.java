package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class o7d<T> implements Serializable {
    private final Object value;

    public static final class a implements Serializable {
        public final Throwable exception;

        public a(Throwable th) {
            th.getClass();
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && wl7.b(this.exception, ((a) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).exception;
        }
        return null;
    }

    public final /* synthetic */ Object b() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o7d) && wl7.b(this.value, ((o7d) obj).value);
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.value;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
