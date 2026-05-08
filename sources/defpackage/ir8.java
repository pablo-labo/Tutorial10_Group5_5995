package defpackage;

import androidx.compose.runtime.r;
import defpackage.kab;
import defpackage.lr8;

/* JADX INFO: loaded from: classes.dex */
public final class ir8 implements kab, kab.a, lr8.a {
    public final Object a;
    public final lr8 b;
    public int d;
    public kab.a e;
    public boolean f;
    public int c = -1;
    public final g4a g = r.f(null);

    public ir8(Object obj, lr8 lr8Var) {
        this.a = obj;
        this.b = lr8Var;
    }

    @Override // defpackage.kab
    public final ir8 a() {
        if (this.f) {
            de7.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            kab kabVar = (kab) ((gme) this.g).getValue();
            this.e = kabVar != null ? kabVar.a() : null;
        }
        this.d++;
        return this;
    }

    @Override // lr8.a
    public final int getIndex() {
        return this.c;
    }

    @Override // lr8.a
    public final Object getKey() {
        return this.a;
    }

    @Override // kab.a
    public final void release() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            de7.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            kab.a aVar = this.e;
            if (aVar != null) {
                aVar.release();
            }
            this.e = null;
        }
    }
}
