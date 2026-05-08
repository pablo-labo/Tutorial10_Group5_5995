package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class uzf implements Comparable<uzf> {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(uzf uzfVar) {
        return wl7.c(this.a & 255, uzfVar.a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uzf) {
            return this.a == ((uzf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
