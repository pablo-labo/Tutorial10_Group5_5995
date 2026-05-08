package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w8i extends ohh {
    public final /* synthetic */ y8i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8i(y8i y8iVar, i0i i0iVar) {
        super(i0iVar);
        this.e = y8iVar;
    }

    @Override // defpackage.ohh
    public final void a() {
        y8i y8iVar = this.e;
        y8iVar.b();
        if (y8iVar.r()) {
            y8iVar.zzr().c0.b("Inactivity, disconnecting from the service");
            y8iVar.t();
        }
    }
}
