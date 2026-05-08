package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vdi extends ohh {
    public final /* synthetic */ fei e;
    public final /* synthetic */ ydi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdi(ydi ydiVar, f3i f3iVar, fei feiVar) {
        super(f3iVar);
        this.f = ydiVar;
        this.e = feiVar;
    }

    @Override // defpackage.ohh
    public final void a() {
        ydi ydiVar = this.f;
        ydiVar.l();
        ydiVar.zzr().c0.b("Starting upload from DelayedRunnable");
        this.e.E();
    }
}
