package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.wa1;

/* JADX INFO: loaded from: classes.dex */
public abstract class wa1<T extends wa1<T>> implements Cloneable {
    public boolean W;
    public int a;
    public boolean b0;
    public boolean c0;
    public boolean e0;
    public d64 b = d64.c;
    public knb c = knb.c;
    public boolean d = true;
    public int e = -1;
    public int f = -1;
    public kg8 V = js4.b;
    public boolean X = true;
    public ova Y = new ova();
    public hu1 Z = new hu1();
    public Class<?> a0 = Object.class;
    public boolean d0 = true;

    public static boolean h(int i, int i2) {
        return (i & i2) != 0;
    }

    public T c(wa1<?> wa1Var) {
        if (this.c0) {
            return (T) clone().c(wa1Var);
        }
        int i = wa1Var.a;
        if (h(wa1Var.a, 1048576)) {
            this.e0 = wa1Var.e0;
        }
        if (h(wa1Var.a, 4)) {
            this.b = wa1Var.b;
        }
        if (h(wa1Var.a, 8)) {
            this.c = wa1Var.c;
        }
        if (h(wa1Var.a, 16)) {
            this.a &= -33;
        }
        if (h(wa1Var.a, 32)) {
            this.a &= -17;
        }
        if (h(wa1Var.a, 64)) {
            this.a &= -129;
        }
        if (h(wa1Var.a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) {
            this.a &= -65;
        }
        if (h(wa1Var.a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER)) {
            this.d = wa1Var.d;
        }
        if (h(wa1Var.a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING)) {
            this.f = wa1Var.f;
            this.e = wa1Var.e;
        }
        if (h(wa1Var.a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)) {
            this.V = wa1Var.V;
        }
        if (h(wa1Var.a, 4096)) {
            this.a0 = wa1Var.a0;
        }
        if (h(wa1Var.a, 8192)) {
            this.a &= -16385;
        }
        if (h(wa1Var.a, 16384)) {
            this.a &= -8193;
        }
        if (h(wa1Var.a, 65536)) {
            this.X = wa1Var.X;
        }
        if (h(wa1Var.a, 131072)) {
            this.W = wa1Var.W;
        }
        if (h(wa1Var.a, 2048)) {
            this.Z.putAll(wa1Var.Z);
            this.d0 = wa1Var.d0;
        }
        if (!this.X) {
            this.Z.clear();
            int i2 = this.a;
            this.W = false;
            this.a = i2 & (-133121);
            this.d0 = true;
        }
        this.a |= wa1Var.a;
        this.Y.b.i(wa1Var.Y.b);
        k();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            ova ovaVar = new ova();
            t.Y = ovaVar;
            ovaVar.b.i(this.Y.b);
            hu1 hu1Var = new hu1();
            t.Z = hu1Var;
            hu1Var.putAll(this.Z);
            t.b0 = false;
            t.c0 = false;
            return t;
        } catch (CloneNotSupportedException e) {
            l5.r(e);
            return null;
        }
    }

    public final T e(Class<?> cls) {
        if (this.c0) {
            return (T) clone().e(cls);
        }
        this.a0 = cls;
        this.a |= 4096;
        k();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wa1) {
            return g((wa1) obj);
        }
        return false;
    }

    public final T f(d64 d64Var) {
        if (this.c0) {
            return (T) clone().f(d64Var);
        }
        beb.e(d64Var, "Argument must not be null");
        this.b = d64Var;
        this.a |= 4;
        k();
        return this;
    }

    public final boolean g(wa1<?> wa1Var) {
        wa1Var.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = xjg.a;
        return this.d == wa1Var.d && this.e == wa1Var.e && this.f == wa1Var.f && this.W == wa1Var.W && this.X == wa1Var.X && this.b.equals(wa1Var.b) && this.c == wa1Var.c && this.Y.equals(wa1Var.Y) && this.Z.equals(wa1Var.Z) && this.a0.equals(wa1Var.a0) && xjg.b(this.V, wa1Var.V);
    }

    public int hashCode() {
        char[] cArr = xjg.a;
        return xjg.h(xjg.h(xjg.h(xjg.h(xjg.h(xjg.h(xjg.h(xjg.g(0, xjg.g(0, xjg.g(this.X ? 1 : 0, xjg.g(this.W ? 1 : 0, xjg.g(this.f, xjg.g(this.e, xjg.g(this.d ? 1 : 0, xjg.h(xjg.g(0, xjg.h(xjg.g(0, xjg.h(xjg.g(0, xjg.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.b), this.c), this.Y), this.Z), this.a0), this.V), null);
    }

    public final T i(int i, int i2) {
        if (this.c0) {
            return (T) clone().i(i, i2);
        }
        this.f = i;
        this.e = i2;
        this.a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        k();
        return this;
    }

    public final wa1 j() {
        if (this.c0) {
            return clone().j();
        }
        this.c = knb.d;
        this.a |= 8;
        k();
        return this;
    }

    public final void k() {
        if (this.b0) {
            r6.g("You cannot modify locked T, consider clone()");
        }
    }

    public final wa1 l(nna nnaVar) {
        if (this.c0) {
            return clone().l(nnaVar);
        }
        this.V = nnaVar;
        this.a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        k();
        return this;
    }

    public final wa1 m() {
        if (this.c0) {
            return clone().m();
        }
        this.d = false;
        this.a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        k();
        return this;
    }

    public final wa1 n(prf prfVar) {
        if (this.c0) {
            return clone().n(prfVar);
        }
        zb4 zb4Var = new zb4(prfVar);
        o(Bitmap.class, prfVar);
        o(Drawable.class, zb4Var);
        o(BitmapDrawable.class, zb4Var);
        o(v86.class, new x86(prfVar));
        k();
        return this;
    }

    public final wa1 o(Class cls, prf prfVar) {
        if (this.c0) {
            return clone().o(cls, prfVar);
        }
        beb.d(prfVar);
        this.Z.put(cls, prfVar);
        int i = this.a;
        this.X = true;
        this.d0 = false;
        this.a = i | 198656;
        this.W = true;
        k();
        return this;
    }

    public final wa1 p() {
        if (this.c0) {
            return clone().p();
        }
        this.e0 = true;
        this.a |= 1048576;
        k();
        return this;
    }
}
