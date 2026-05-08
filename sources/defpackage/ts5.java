package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ts5 extends ss5 {
    public long f;
    public long g;

    @Override // defpackage.ss5, defpackage.rs5
    public final boolean equals(Object obj) {
        if (!(obj instanceof ts5) || !super.equals(obj)) {
            return false;
        }
        ts5 ts5Var = (ts5) obj;
        return this.f == ts5Var.f && this.g == ts5Var.g;
    }

    @Override // defpackage.ss5, defpackage.rs5
    public final int hashCode() {
        return Long.hashCode(this.g) + (Long.hashCode(this.f) * 31) + (super.hashCode() * 31);
    }

    @Override // defpackage.ss5, defpackage.rs5
    public final String toString() {
        return "FrameData(frameStartNanos=" + this.b + ", frameDurationUiNanos=" + this.c + ", frameDurationCpuNanos=" + this.e + ", frameDurationTotalNanos=" + this.f + ", frameOverrunNanos=" + this.g + ", isJank=" + this.d + ", states=" + this.a + ')';
    }
}
