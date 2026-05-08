package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class unb extends ipe {
    public final long a;
    public final long b;

    public unb(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // defpackage.ipe
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return r6.d(this.b, " }", sb);
    }
}
