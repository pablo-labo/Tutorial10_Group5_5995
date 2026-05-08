package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rse {
    public long a;
    public rse b;

    public rse() {
        this(ame.j().g());
    }

    public abstract void a(rse rseVar);

    public abstract rse b();

    public rse c(long j) {
        rse rseVarB = b();
        rseVarB.a = j;
        return rseVarB;
    }

    public rse(long j) {
        this.a = j;
    }
}
