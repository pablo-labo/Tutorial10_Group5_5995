package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xlf extends ipe {
    public final long a;
    public final long b;

    public xlf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long d(long j, g4b g4bVar) {
        long jX = g4bVar.x();
        if ((128 & jX) != 0) {
            return 8589934591L & ((((jX & 1) << 32) | g4bVar.z()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.ipe
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return r6.d(this.b, " }", sb);
    }
}
