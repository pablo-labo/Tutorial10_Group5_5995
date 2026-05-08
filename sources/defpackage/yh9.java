package defpackage;

import androidx.media3.session.k;
import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh9 implements lz8.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ int c;

    public /* synthetic */ yh9(k kVar, int i, int i2) {
        this.a = i2;
        this.b = kVar;
        this.c = i;
    }

    @Override // lz8.a
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        k kVar = this.b;
        gdb.c cVar = (gdb.c) obj;
        switch (i) {
            case 0:
                cVar.z(i2, kVar.p.s);
                break;
            default:
                cVar.z(i2, kVar.p.s);
                break;
        }
    }
}
