package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class m9c {
    public final Date a;
    public final Date b;

    public m9c(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        this.a = date;
        this.b = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9c)) {
            return false;
        }
        m9c m9cVar = (m9c) obj;
        return wl7.b(this.a, m9cVar.a) && wl7.b(this.b, m9cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueryTimeWindowInput(start=" + this.a + ", end=" + this.b + ")";
    }
}
