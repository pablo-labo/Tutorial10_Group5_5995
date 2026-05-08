package defpackage;

import androidx.media3.exoplayer.video.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qog implements Runnable {
    public final /* synthetic */ g.a a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ qog(g.a aVar, Object obj, long j) {
        this.a = aVar;
        this.b = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.a.b;
        String str = vjg.a;
        gVar.l(this.b, this.c);
    }
}
