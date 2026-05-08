package defpackage;

import android.view.Surface;
import androidx.media3.common.a;
import androidx.media3.session.g;
import androidx.media3.session.k;
import defpackage.c2f;
import defpackage.lz8;
import defpackage.v20;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk3 implements lz8.a, k.c, c2f.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xk3(v20.a aVar, a aVar2, dk3 dk3Var) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // c2f.a
    public Object b() {
        ihg ihgVar = (ihg) this.a;
        ihgVar.c.A((Iterable) this.b);
        return null;
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = (k) this.a;
        gVar.x0(kVar.c, i, (Surface) this.b);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).j((v20.a) this.a, (a) this.b);
    }

    public /* synthetic */ xk3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
