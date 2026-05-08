package defpackage;

import java.time.Instant;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e(with = ng7.class)
public final class lg7 implements Comparable<lg7> {
    public static final a Companion = new a();
    public final Instant a;

    public static final class a {
        public final KSerializer<lg7> serializer() {
            return ng7.a;
        }
    }

    static {
        Instant.ofEpochSecond(-3217862419201L, 999999999L).getClass();
        Instant.ofEpochSecond(3093527980800L, 0L).getClass();
        Instant.MIN.getClass();
        Instant.MAX.getClass();
    }

    public lg7(Instant instant) {
        this.a = instant;
    }

    @Override // java.lang.Comparable
    public final int compareTo(lg7 lg7Var) {
        lg7 lg7Var2 = lg7Var;
        lg7Var2.getClass();
        return this.a.compareTo(lg7Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lg7) {
            return this.a.equals(((lg7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}
