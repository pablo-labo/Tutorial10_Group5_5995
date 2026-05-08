package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tse<T> extends rse {
    public o9b<? extends T> c;
    public int d;

    public tse(long j, o9b<? extends T> o9bVar) {
        super(j);
        this.c = o9bVar;
    }

    @Override // defpackage.rse
    public final void a(rse rseVar) {
        synchronized (rme.a) {
            rseVar.getClass();
            this.c = ((tse) rseVar).c;
            this.d = ((tse) rseVar).d;
            j6g j6gVar = j6g.a;
        }
    }

    @Override // defpackage.rse
    public final rse b() {
        return new tse(ame.j().g(), this.c);
    }

    @Override // defpackage.rse
    public final rse c(long j) {
        return new tse(j, this.c);
    }
}
