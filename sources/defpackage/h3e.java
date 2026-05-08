package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
public final class h3e implements k0d {
    public final long a;
    public final n4e b;
    public final long c;
    public mte d = mte.c;
    public uzd e;
    public final e f;

    public h3e(long j, n4e n4eVar, long j2) {
        this.a = j;
        this.b = n4eVar;
        this.c = j2;
        la laVar = new la(this, 24);
        i3e i3eVar = new i3e(laVar, n4eVar, j);
        j3e j3eVar = new j3e(laVar, n4eVar, j);
        n3e n3eVar = new n3e(j3eVar, i3eVar);
        neb nebVar = f1f.a;
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(j3eVar, i3eVar, n3eVar, 4);
        ueb.a.getClass();
        this.f = bf9.e(suspendPointerInputElement, q92.X);
    }

    @Override // defpackage.k0d
    public final void b() {
        this.e = this.b.f(new w1a(this.a, new n30(this, 15), new ye(this, 23)));
    }

    @Override // defpackage.k0d
    public final void d() {
        uzd uzdVar = this.e;
        if (uzdVar != null) {
            this.b.d(uzdVar);
            this.e = null;
        }
    }

    @Override // defpackage.k0d
    public final void e() {
        uzd uzdVar = this.e;
        if (uzdVar != null) {
            this.b.d(uzdVar);
            this.e = null;
        }
    }
}
