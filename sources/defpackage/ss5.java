package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ss5 extends rs5 {
    public long e;

    @Override // defpackage.rs5
    public boolean equals(Object obj) {
        return (obj instanceof ss5) && super.equals(obj) && this.e == ((ss5) obj).e;
    }

    @Override // defpackage.rs5
    public int hashCode() {
        return Long.hashCode(this.e) + (super.hashCode() * 31);
    }

    @Override // defpackage.rs5
    public String toString() {
        return "FrameData(frameStartNanos=" + this.b + ", frameDurationUiNanos=" + this.c + ", frameDurationCpuNanos=" + this.e + ", isJank=" + this.d + ", states=" + this.a + ')';
    }
}
