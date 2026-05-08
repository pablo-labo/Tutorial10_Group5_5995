package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yy2 extends ds3 {
    public final Object a;

    public yy2(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yy2) && wl7.b(this.a, ((yy2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v40.e(this.a, "ConvertedValue(convertedValue=", ")");
    }
}
