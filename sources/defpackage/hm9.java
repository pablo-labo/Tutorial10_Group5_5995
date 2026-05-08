package defpackage;

import androidx.media3.exoplayer.source.i;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm9 implements wq2 {
    public final /* synthetic */ i.a a;
    public final /* synthetic */ uz8 b;
    public final /* synthetic */ nj9 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ hm9(i.a aVar, uz8 uz8Var, nj9 nj9Var, IOException iOException, boolean z) {
        this.a = aVar;
        this.b = uz8Var;
        this.c = nj9Var;
        this.d = iOException;
        this.e = z;
    }

    @Override // defpackage.wq2
    public final void accept(Object obj) {
        i iVar = (i) obj;
        i.a aVar = this.a;
        iVar.m0(aVar.a, aVar.b, this.b, this.c, this.d, this.e);
    }
}
