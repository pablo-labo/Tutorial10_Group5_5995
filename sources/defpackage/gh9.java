package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gh9 implements k.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ gh9(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // androidx.media3.session.k.c
    public final void h(g gVar, int i) {
        int i2 = this.a;
        k kVar = this.b;
        switch (i2) {
            case 0:
                gVar.C0(kVar.c, i);
                break;
            default:
                gVar.l(kVar.c, i);
                break;
        }
    }
}
