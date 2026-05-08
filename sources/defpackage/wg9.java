package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;
import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg9 implements lz8.a, k.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ wg9(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        int i2 = this.a;
        k kVar = this.b;
        switch (i2) {
            case 1:
                gVar.x0(kVar.c, i, null);
                break;
            default:
                gVar.d0(kVar.c, i);
                break;
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).p0(this.b.y);
    }
}
