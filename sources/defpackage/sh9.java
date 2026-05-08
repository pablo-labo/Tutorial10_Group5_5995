package defpackage;

import androidx.media3.session.l;
import androidx.media3.session.z;
import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh9 implements lz8.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sh9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // lz8.a
    public final void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((gdb.c) obj).v0(((z) obj2).v);
                break;
            default:
                ((gdb.c) obj).V(4, ((l.c) obj2).a.t);
                break;
        }
    }
}
