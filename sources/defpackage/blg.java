package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class blg implements roa {
    public final roa a;
    public final int b;
    public final int c;

    public blg(roa roaVar, int i, int i2) {
        this.a = roaVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.roa
    public final int a(int i) {
        int iA = this.a.a(i);
        if (i >= 0 && i <= this.c) {
            clg.c(iA, this.b, i);
        }
        return iA;
    }

    @Override // defpackage.roa
    public final int c(int i) {
        int iC = this.a.c(i);
        if (i >= 0 && i <= this.b) {
            clg.b(iC, this.c, i);
        }
        return iC;
    }
}
