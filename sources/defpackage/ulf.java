package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ulf implements Serializable {
    private final TimeUnit unit;
    private final long value;

    public ulf(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.value = j;
        this.unit = timeUnit;
    }

    public final long a(TimeUnit timeUnit) {
        timeUnit.getClass();
        return timeUnit.convert(this.value, this.unit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ulf.class.equals(obj.getClass())) {
            ulf ulfVar = obj instanceof ulf ? (ulf) obj : null;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jA = a(timeUnit);
            Long lValueOf = ulfVar != null ? Long.valueOf(ulfVar.a(timeUnit)) : null;
            if (lValueOf != null && jA == lValueOf.longValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.value;
        return this.unit.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        return "TimeMeasure{value=" + this.value + ", unit=" + this.unit + '}';
    }
}
