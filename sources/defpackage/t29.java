package defpackage;

import defpackage.f65;
import defpackage.use;

/* JADX INFO: loaded from: classes.dex */
public final class t29<Z> implements f5d<Z>, f65.d {
    public static final f65.c e = f65.a(20, new a());
    public final use.a a = new use.a();
    public f5d<Z> b;
    public boolean c;
    public boolean d;

    public class a implements f65.b<t29<?>> {
        @Override // f65.b
        public final t29<?> create() {
            return new t29<>();
        }
    }

    @Override // defpackage.f5d
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.f5d
    public final Class<Z> b() {
        return this.b.b();
    }

    @Override // f65.d
    public final use.a c() {
        return this.a;
    }

    public final synchronized void d() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            recycle();
        }
    }

    @Override // defpackage.f5d
    public final Z get() {
        return this.b.get();
    }

    @Override // defpackage.f5d
    public final synchronized void recycle() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.recycle();
            this.b = null;
            e.a(this);
        }
    }
}
