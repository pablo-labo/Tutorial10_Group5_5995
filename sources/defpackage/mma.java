package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mma {
    public final lma a;
    public final boolean b;

    public mma(lma lmaVar) {
        this.a = lmaVar;
        this.b = false;
    }

    public static mma a(mma mmaVar, lma lmaVar, boolean z, int i) {
        if ((i & 1) != 0) {
            lmaVar = mmaVar.a;
        }
        if ((i & 2) != 0) {
            z = mmaVar.b;
        }
        mmaVar.getClass();
        lmaVar.getClass();
        return new mma(lmaVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mma)) {
            return false;
        }
        mma mmaVar = (mma) obj;
        return this.a == mmaVar.a && this.b == mmaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return m6.i(sb, this.b, ')');
    }

    public mma(lma lmaVar, boolean z) {
        this.a = lmaVar;
        this.b = z;
    }
}
