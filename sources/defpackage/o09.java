package defpackage;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e(with = p09.class)
public final class o09 implements Comparable<o09> {
    public static final a Companion = new a();
    public final LocalDateTime a;

    public static final class a {
        public final KSerializer<o09> serializer() {
            return p09.a;
        }
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new o09(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new o09(localDateTime2);
    }

    public o09(int i, int i2) {
        try {
            LocalDateTime localDateTimeOf = LocalDateTime.of(i, 1, 1, 0, 0, 0, 0);
            localDateTimeOf.getClass();
            this.a = localDateTimeOf;
        } catch (DateTimeException e) {
            b0.s(e);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(o09 o09Var) {
        o09 o09Var2 = o09Var;
        o09Var2.getClass();
        return this.a.compareTo((ChronoLocalDateTime<?>) o09Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o09) {
            return wl7.b(this.a, ((o09) obj).a);
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

    public o09(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.a = localDateTime;
    }
}
