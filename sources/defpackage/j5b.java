package defpackage;

import defpackage.h5b;

/* JADX INFO: loaded from: classes2.dex */
public final class j5b extends wpa {
    public final /* synthetic */ h5b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5b(h5b h5bVar) {
        super(true);
        this.d = h5bVar;
    }

    @Override // defpackage.wpa
    public final void b() {
        h5b h5bVar = this.d;
        if (h5bVar.N().canGoBack()) {
            h5bVar.N().goBack();
        } else {
            h5bVar.O(h5b.a.b);
        }
    }
}
