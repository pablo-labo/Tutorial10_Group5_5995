package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d8h extends e8h {
    public final int a;
    public final long b;

    public d8h(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.e8h
    public final int a() {
        return this.a;
    }

    @Override // defpackage.e8h
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e8h)) {
            return false;
        }
        e8h e8hVar = (e8h) obj;
        return this.a == e8hVar.a() && this.b == e8hVar.b();
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.a);
        sb.append(", eventTimestamp=");
        return r6.d(this.b, "}", sb);
    }
}
