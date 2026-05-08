package defpackage;

import androidx.media3.session.q;
import androidx.media3.session.r;
import defpackage.c2f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj9 implements c2f.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uj9(ihg ihgVar, v31 v31Var, int i) {
        this.b = ihgVar;
        this.c = v31Var;
        this.a = i;
    }

    @Override // c2f.a
    public Object b() {
        ihg ihgVar = (ihg) this.b;
        ihgVar.d.a((v31) this.c, this.a + 1);
        return null;
    }

    public /* synthetic */ uj9(q qVar, int i, r rVar) {
        this.b = qVar;
        this.a = i;
        this.c = rVar;
    }
}
