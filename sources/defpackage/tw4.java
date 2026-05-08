package defpackage;

import defpackage.w3d;

/* JADX INFO: loaded from: classes.dex */
public final class tw4 implements w3d, n3d {
    public final Object a;
    public final w3d b;
    public volatile n3d c;
    public volatile n3d d;
    public w3d.a e;
    public w3d.a f;

    public tw4(Object obj, w3d w3dVar) {
        w3d.a aVar = w3d.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.a = obj;
        this.b = w3dVar;
    }

    @Override // defpackage.w3d, defpackage.n3d
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.n3d
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            try {
                w3d.a aVar = this.e;
                w3d.a aVar2 = w3d.a.SUCCESS;
                z = aVar == aVar2 || this.f == aVar2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.n3d
    public final void c() {
        synchronized (this.a) {
            try {
                w3d.a aVar = this.e;
                w3d.a aVar2 = w3d.a.RUNNING;
                if (aVar == aVar2) {
                    this.e = w3d.a.PAUSED;
                    this.c.c();
                }
                if (this.f == aVar2) {
                    this.f = w3d.a.PAUSED;
                    this.d.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n3d
    public final void clear() {
        synchronized (this.a) {
            try {
                w3d.a aVar = w3d.a.CLEARED;
                this.e = aVar;
                this.c.clear();
                if (this.f != aVar) {
                    this.f = aVar;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w3d
    public final boolean d(n3d n3dVar) {
        boolean z;
        synchronized (this.a) {
            w3d w3dVar = this.b;
            z = w3dVar == null || w3dVar.d(this);
        }
        return z;
    }

    @Override // defpackage.w3d
    public final boolean e(n3d n3dVar) {
        boolean z;
        synchronized (this.a) {
            w3d w3dVar = this.b;
            z = (w3dVar == null || w3dVar.e(this)) && n3dVar.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.n3d
    public final boolean f(n3d n3dVar) {
        if (n3dVar instanceof tw4) {
            tw4 tw4Var = (tw4) n3dVar;
            if (this.c.f(tw4Var.c) && this.d.f(tw4Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n3d
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            try {
                w3d.a aVar = this.e;
                w3d.a aVar2 = w3d.a.CLEARED;
                z = aVar == aVar2 && this.f == aVar2;
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [w3d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.w3d
    public final w3d getRoot() {
        ?? root;
        synchronized (this.a) {
            try {
                w3d w3dVar = this.b;
                this = this;
                if (w3dVar != null) {
                    root = w3dVar.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // defpackage.w3d
    public final void h(n3d n3dVar) {
        synchronized (this.a) {
            try {
                if (n3dVar.equals(this.d)) {
                    this.f = w3d.a.FAILED;
                    w3d w3dVar = this.b;
                    if (w3dVar != null) {
                        w3dVar.h(this);
                    }
                    return;
                }
                this.e = w3d.a.FAILED;
                w3d.a aVar = this.f;
                w3d.a aVar2 = w3d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f = aVar2;
                    this.d.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w3d
    public final boolean i(n3d n3dVar) {
        boolean z;
        w3d.a aVar;
        synchronized (this.a) {
            w3d w3dVar = this.b;
            z = false;
            if (w3dVar == null || w3dVar.i(this)) {
                w3d.a aVar2 = this.e;
                w3d.a aVar3 = w3d.a.FAILED;
                if (aVar2 != aVar3 ? n3dVar.equals(this.c) : n3dVar.equals(this.d) && ((aVar = this.f) == w3d.a.SUCCESS || aVar == aVar3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.n3d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                w3d.a aVar = this.e;
                w3d.a aVar2 = w3d.a.RUNNING;
                z = aVar == aVar2 || this.f == aVar2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.w3d
    public final void j(n3d n3dVar) {
        synchronized (this.a) {
            try {
                if (n3dVar.equals(this.c)) {
                    this.e = w3d.a.SUCCESS;
                } else if (n3dVar.equals(this.d)) {
                    this.f = w3d.a.SUCCESS;
                }
                w3d w3dVar = this.b;
                if (w3dVar != null) {
                    w3dVar.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n3d
    public final void k() {
        synchronized (this.a) {
            try {
                w3d.a aVar = this.e;
                w3d.a aVar2 = w3d.a.RUNNING;
                if (aVar != aVar2) {
                    this.e = aVar2;
                    this.c.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
