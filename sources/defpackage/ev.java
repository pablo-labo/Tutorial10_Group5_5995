package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ev implements l74 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ev(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.l74
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj2;
                ibaVar.getClass();
                ibaVar.q.remove((qc) obj);
                break;
            default:
                ((zv8) obj2).getLifecycle().c((s6a) obj);
                break;
        }
    }
}
