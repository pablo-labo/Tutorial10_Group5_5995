package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ b.d a;
    public final /* synthetic */ h b;
    public final /* synthetic */ f c;
    public final /* synthetic */ b.c d;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.d = cVar;
        this.a = dVar;
        this.b = hVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = b.this;
        b.d dVar = this.a;
        if (dVar != null) {
            bVar.o0 = true;
            dVar.b.c(false);
            bVar.o0 = false;
        }
        h hVar = this.b;
        if (hVar.isEnabled() && hVar.hasSubMenu()) {
            this.c.q(hVar, null, 4);
        }
    }
}
