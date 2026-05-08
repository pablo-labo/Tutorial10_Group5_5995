package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ao1 {
    public int a;

    public final void c(int i) {
        this.a = i | this.a;
    }

    public final boolean h(int i) {
        return (this.a & i) == i;
    }
}
