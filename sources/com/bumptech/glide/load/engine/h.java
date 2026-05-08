package com.bumptech.glide.load.engine;

import defpackage.beb;
import defpackage.f5d;
import defpackage.kg8;

/* JADX INFO: loaded from: classes.dex */
public final class h<Z> implements f5d<Z> {
    public boolean V;
    public final boolean a;
    public final boolean b;
    public final f5d<Z> c;
    public final a d;
    public final kg8 e;
    public int f;

    public interface a {
        void a(kg8 kg8Var, h<?> hVar);
    }

    public h(f5d<Z> f5dVar, boolean z, boolean z2, kg8 kg8Var, a aVar) {
        beb.e(f5dVar, "Argument must not be null");
        this.c = f5dVar;
        this.a = z;
        this.b = z2;
        this.e = kg8Var;
        beb.e(aVar, "Argument must not be null");
        this.d = aVar;
    }

    @Override // defpackage.f5d
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.f5d
    public final Class<Z> b() {
        return this.c.b();
    }

    public final synchronized void c() {
        if (this.V) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.a(this.e, this);
        }
    }

    @Override // defpackage.f5d
    public final Z get() {
        return this.c.get();
    }

    @Override // defpackage.f5d
    public final synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.V) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.V = true;
        if (this.b) {
            this.c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.V + ", resource=" + this.c + '}';
    }
}
