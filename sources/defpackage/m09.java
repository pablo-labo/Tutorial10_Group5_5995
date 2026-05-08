package defpackage;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e(with = n09.class)
public final class m09 implements Comparable<m09> {
    public static final a Companion = new a();
    public final LocalDate a;

    public static final class a {
        public final KSerializer<m09> serializer() {
            return n09.a;
        }
    }

    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new m09(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new m09(localDate2);
    }

    public m09(LocalDate localDate) {
        localDate.getClass();
        this.a = localDate;
    }

    @Override // java.lang.Comparable
    public final int compareTo(m09 m09Var) {
        m09 m09Var2 = m09Var;
        m09Var2.getClass();
        return this.a.compareTo((ChronoLocalDate) m09Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m09) {
            return wl7.b(this.a, ((m09) obj).a);
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
