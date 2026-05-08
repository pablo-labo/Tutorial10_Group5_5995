package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d15 implements qvf, Cloneable {
    public static final d15 c = new d15();
    public final List<e15> a;
    public final List<e15> b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends pvf<T> {
        public pvf<T> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ae6 d;
        public final /* synthetic */ iyf e;

        public a(boolean z, boolean z2, ae6 ae6Var, iyf iyfVar) {
            this.b = z;
            this.c = z2;
            this.d = ae6Var;
            this.e = iyfVar;
        }

        @Override // defpackage.pvf
        public final T a(nb8 nb8Var) throws IOException {
            if (this.b) {
                nb8Var.I();
                return null;
            }
            pvf<T> pvfVarD = this.a;
            if (pvfVarD == null) {
                pvfVarD = this.d.d(d15.this, this.e);
                this.a = pvfVarD;
            }
            return pvfVarD.a(nb8Var);
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, T t) throws IOException {
            if (this.c) {
                gc8Var.Q();
                return;
            }
            pvf<T> pvfVarD = this.a;
            if (pvfVarD == null) {
                pvfVarD = this.d.d(d15.this, this.e);
                this.a = pvfVarD;
            }
            pvfVarD.b(gc8Var, t);
        }
    }

    public d15() {
        List<e15> list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    public static boolean e(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        Class<? super T> cls = iyfVar.a;
        boolean zE = e(cls);
        boolean z = zE || d(cls, true);
        boolean z2 = zE || d(cls, false);
        if (z || z2) {
            return new a(z2, z, ae6Var, iyfVar);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (d15) super.clone();
        } catch (CloneNotSupportedException e) {
            g7.l(e);
            return null;
        }
    }

    public final boolean d(Class<?> cls, boolean z) {
        Iterator<e15> it = (z ? this.a : this.b).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }
}
