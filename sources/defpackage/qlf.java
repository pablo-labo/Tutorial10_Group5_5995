package defpackage;

import defpackage.w3d;

/* JADX INFO: loaded from: classes.dex */
public final class qlf implements w3d, n3d {
    public final w3d a;
    public final Object b;
    public volatile qhe c;
    public volatile n3d d;
    public w3d.a e;
    public w3d.a f;
    public boolean g;

    public qlf(Object obj, w3d w3dVar) {
        w3d.a aVar = w3d.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.b = obj;
        this.a = w3dVar;
    }

    @Override // defpackage.w3d, defpackage.n3d
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.n3d
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.e == w3d.a.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.n3d
    public final void c() {
        synchronized (this.b) {
            try {
                if (!this.f.a()) {
                    this.f = w3d.a.PAUSED;
                    this.d.c();
                }
                if (!this.e.a()) {
                    this.e = w3d.a.PAUSED;
                    this.c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n3d
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            w3d.a aVar = w3d.a.CLEARED;
            this.e = aVar;
            this.f = aVar;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.w3d
    public final boolean d(n3d n3dVar) {
        boolean z;
        synchronized (this.b) {
            try {
                w3d w3dVar = this.a;
                z = (w3dVar == null || w3dVar.d(this)) && (n3dVar.equals(this.c) || this.e != w3d.a.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.w3d
    public final boolean e(n3d n3dVar) {
        boolean z;
        synchronized (this.b) {
            try {
                w3d w3dVar = this.a;
                z = (w3dVar == null || w3dVar.e(this)) && n3dVar.equals(this.c) && this.e != w3d.a.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.n3d
    public final boolean f(n3d n3dVar) {
        if (!(n3dVar instanceof qlf)) {
            return false;
        }
        qlf qlfVar = (qlf) n3dVar;
        if (this.c == null) {
            if (qlfVar.c != null) {
                return false;
            }
        } else if (!this.c.f(qlfVar.c)) {
            return false;
        }
        return this.d == null ? qlfVar.d == null : this.d.f(qlfVar.d);
    }

    @Override // defpackage.n3d
    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            z = this.e == w3d.a.CLEARED;
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
        synchronized (this.b) {
            try {
                w3d w3dVar = this.a;
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
        synchronized (this.b) {
            try {
                if (!n3dVar.equals(this.c)) {
                    this.f = w3d.a.FAILED;
                    return;
                }
                this.e = w3d.a.FAILED;
                w3d w3dVar = this.a;
                if (w3dVar != null) {
                    w3dVar.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w3d
    public final boolean i(n3d n3dVar) {
        boolean z;
        synchronized (this.b) {
            try {
                w3d w3dVar = this.a;
                z = (w3dVar == null || w3dVar.i(this)) && n3dVar.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.n3d
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == w3d.a.RUNNING;
        }
        return z;
    }

    @Override // defpackage.w3d
    public final void j(n3d n3dVar) {
        synchronized (this.b) {
            try {
                if (n3dVar.equals(this.d)) {
                    this.f = w3d.a.SUCCESS;
                    return;
                }
                this.e = w3d.a.SUCCESS;
                w3d w3dVar = this.a;
                if (w3dVar != null) {
                    w3dVar.j(this);
                }
                if (!this.f.a()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n3d
    public final void k() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != w3d.a.SUCCESS) {
                        w3d.a aVar = this.f;
                        w3d.a aVar2 = w3d.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f = aVar2;
                            this.d.k();
                        }
                    }
                    if (this.g) {
                        w3d.a aVar3 = this.e;
                        w3d.a aVar4 = w3d.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.e = aVar4;
                            this.c.k();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
