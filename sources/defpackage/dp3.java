package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.source.d;
import defpackage.c2f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dp3 implements p55, c2f.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dp3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // c2f.a
    public Object b() {
        ihg ihgVar = (ihg) this.a;
        return Boolean.valueOf(ihgVar.c.Z0((v31) this.b));
    }

    @Override // defpackage.p55
    public m55[] h() {
        d dVar = (d) this.a;
        a aVar = (a) this.b;
        return new m55[]{dVar.c.a(aVar) ? new zxe(dVar.c.c(aVar), null) : new d.b(aVar)};
    }
}
