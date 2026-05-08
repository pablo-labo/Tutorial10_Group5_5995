package defpackage;

import defpackage.js9;

/* JADX INFO: loaded from: classes.dex */
public final class tz9 implements js9.a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public tz9(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tz9.class == obj.getClass()) {
            tz9 tz9Var = (tz9) obj;
            if (this.a == tz9Var.a && this.b == tz9Var.b && this.c == tz9Var.c && this.d == tz9Var.d && this.e == tz9Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return u59.b(this.e) + ((u59.b(this.d) + ((u59.b(this.c) + ((u59.b(this.b) + ((u59.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
