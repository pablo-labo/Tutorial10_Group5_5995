package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mic {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public mic(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final mic a(mic micVar, String str) {
        String strC = shg.c(str, this.c);
        if (micVar == null) {
            return null;
        }
        long j = micVar.b;
        if (!strC.equals(shg.c(str, micVar.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == micVar.a) {
                return new mic(j3, strC, j != -1 ? j2 + j : -1L);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = micVar.a;
        if (j4 + j == this.a) {
            return new mic(j4, strC, j2 != -1 ? j + j2 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mic.class != obj.getClass()) {
            return false;
        }
        mic micVar = (mic) obj;
        return this.a == micVar.a && this.b == micVar.b && this.c.equals(micVar.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return r6.d(this.b, ")", sb);
    }
}
