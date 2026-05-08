package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fl2 {
    public final Integer a;

    public fl2(vfd vfdVar, Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fl2) {
            return wl7.b(null, null) && wl7.b(this.a, ((fl2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.a + ')';
    }
}
