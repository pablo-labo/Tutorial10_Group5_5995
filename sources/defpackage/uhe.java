package defpackage;

import defpackage.p2e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uhe implements u3e {
    public final boolean a;
    public final int b;
    public final int c;
    public final p2e d;
    public final vzd e;

    public uhe(boolean z, int i, int i2, p2e p2eVar, vzd vzdVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = p2eVar;
        this.e = vzdVar;
    }

    @Override // defpackage.u3e
    public final int a() {
        return 1;
    }

    @Override // defpackage.u3e
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.u3e
    public final vzd c() {
        return this.e;
    }

    @Override // defpackage.u3e
    public final vzd d() {
        return this.e;
    }

    @Override // defpackage.u3e
    public final int e() {
        return this.c;
    }

    @Override // defpackage.u3e
    public final l73 f() {
        int i = this.b;
        int i2 = this.c;
        return i < i2 ? l73.b : i > i2 ? l73.a : this.e.b();
    }

    @Override // defpackage.u3e
    public final void g(Function1<? super vzd, j6g> function1) {
    }

    @Override // defpackage.u3e
    public final p2e h() {
        return this.d;
    }

    @Override // defpackage.u3e
    public final vzd i() {
        return this.e;
    }

    @Override // defpackage.u3e
    public final vzd j() {
        return this.e;
    }

    @Override // defpackage.u3e
    public final int k() {
        return this.b;
    }

    @Override // defpackage.u3e
    public final boolean l(u3e u3eVar) {
        if (this.d == null || u3eVar == null || !(u3eVar instanceof uhe)) {
            return true;
        }
        uhe uheVar = (uhe) u3eVar;
        if (this.b != uheVar.b || this.c != uheVar.c || this.a != uheVar.a) {
            return true;
        }
        vzd vzdVar = uheVar.e;
        vzd vzdVar2 = this.e;
        return (vzdVar2.a == vzdVar.a && vzdVar2.c == vzdVar.c && vzdVar2.d == vzdVar.d) ? false : true;
    }

    @Override // defpackage.u3e
    public final k3a m(p2e p2eVar) {
        boolean z = p2eVar.c;
        p2e.a aVar = p2eVar.b;
        p2e.a aVar2 = p2eVar.a;
        if ((!z && aVar2.b > aVar.b) || (z && aVar2.b <= aVar.b)) {
            p2eVar = p2e.a(p2eVar, null, null, !z, 3);
        }
        long j = this.e.a;
        k3a k3aVar = j59.a;
        k3a k3aVar2 = new k3a();
        k3aVar2.h(p2eVar, j);
        return k3aVar2;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + f() + ", info=\n\t" + this.e + ')';
    }
}
