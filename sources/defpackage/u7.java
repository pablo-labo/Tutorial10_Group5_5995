package defpackage;

import com.bumptech.glide.load.engine.a;

/* JADX INFO: loaded from: classes.dex */
public final class u7 implements Runnable {
    public final /* synthetic */ a a;

    public u7(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.a;
        while (true) {
            try {
                aVar.b((a.C0116a) aVar.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
