package defpackage;

import androidx.media3.exoplayer.source.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fm9 implements wq2 {
    public final /* synthetic */ i.a a;
    public final /* synthetic */ uz8 b;
    public final /* synthetic */ nj9 c;
    public final /* synthetic */ int d;

    public /* synthetic */ fm9(i.a aVar, uz8 uz8Var, nj9 nj9Var, int i) {
        this.a = aVar;
        this.b = uz8Var;
        this.c = nj9Var;
        this.d = i;
    }

    @Override // defpackage.wq2
    public final void accept(Object obj) {
        i iVar = (i) obj;
        i.a aVar = this.a;
        iVar.e0(aVar.a, aVar.b, this.b, this.c, this.d);
    }
}
