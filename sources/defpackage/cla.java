package defpackage;

import defpackage.d04;
import defpackage.in9;
import defpackage.j29;
import defpackage.lf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cla {
    public final j29 a;
    public final xx9 b;
    public final nn9<mq5, lya> c;
    public final nn9<a, t52> d;

    public static final class a {
        public final a62 a;
        public final List<Integer> b;

        public a(a62 a62Var, List<Integer> list) {
            a62Var.getClass();
            this.a = a62Var;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
        }
    }

    public static final class b extends u52 {
        public final boolean V;
        public final ArrayList W;
        public final k62 X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j29 j29Var, f62 f62Var, n8a n8aVar, boolean z, int i) {
            super(j29Var, f62Var, n8aVar, qne.p);
            f62Var.getClass();
            this.V = z;
            oh7 oh7VarH = nic.H(0, i);
            ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
            Iterator<Integer> it = oh7VarH.iterator();
            while (((nh7) it).c) {
                int iNextInt = ((fh7) it).nextInt();
                arrayList.add(sxf.P0(this, ylg.INVARIANT, n8a.h("T" + iNextInt), iNextInt, j29Var));
            }
            this.W = arrayList;
            List listH = oie.h(this);
            int i2 = b04.a;
            xx9 xx9VarD = yz3.d(this);
            xx9VarD.getClass();
            this.X = new k62(this, listH, pi3.k(xx9VarD.l().e()), j29Var);
        }

        @Override // defpackage.t52
        public final m52 C() {
            return null;
        }

        @Override // defpackage.t52
        public final boolean H0() {
            return false;
        }

        @Override // defpackage.tx9
        public final in9 K(bj8 bj8Var) {
            bj8Var.getClass();
            return in9.b.b;
        }

        @Override // defpackage.t52
        public final hlg<mge> U() {
            return null;
        }

        @Override // defpackage.zm9
        public final boolean X() {
            return false;
        }

        @Override // defpackage.t52
        public final boolean a0() {
            return false;
        }

        @Override // defpackage.t52
        public final boolean e0() {
            return false;
        }

        @Override // defpackage.t52
        public final c62 f() {
            return c62.CLASS;
        }

        @Override // defpackage.ie0
        public final lf0 getAnnotations() {
            return lf0.a.a;
        }

        @Override // defpackage.t52, defpackage.zm9, defpackage.fj3
        public final e04 getVisibility() {
            d04.h hVar = d04.e;
            hVar.getClass();
            return hVar;
        }

        @Override // defpackage.zm9
        public final boolean i0() {
            return false;
        }

        @Override // defpackage.u52, defpackage.zm9
        public final boolean isExternal() {
            return false;
        }

        @Override // defpackage.t52
        public final boolean isInline() {
            return false;
        }

        @Override // defpackage.v62
        public final kwf j() {
            return this.X;
        }

        @Override // defpackage.t52
        public final Collection<m52> k() {
            return is4.a;
        }

        @Override // defpackage.t52
        public final in9 l0() {
            return in9.b.b;
        }

        @Override // defpackage.t52
        public final t52 m0() {
            return null;
        }

        @Override // defpackage.t52, defpackage.w62
        public final List<rxf> p() {
            return this.W;
        }

        @Override // defpackage.t52, defpackage.zm9
        public final ax9 r() {
            return ax9.b;
        }

        @Override // defpackage.t52
        public final boolean s() {
            return false;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // defpackage.t52
        public final Collection<t52> x() {
            return zr4.a;
        }

        @Override // defpackage.w62
        public final boolean y() {
            return this.V;
        }
    }

    public cla(j29 j29Var, xx9 xx9Var) {
        xx9Var.getClass();
        this.a = j29Var;
        this.b = xx9Var;
        this.c = j29Var.g(new l4(this, 4));
        this.d = j29Var.g(new b00(this, 3));
    }

    public final t52 a(a62 a62Var, List<Integer> list) {
        a62Var.getClass();
        return (t52) ((j29.k) this.d).invoke(new a(a62Var, list));
    }
}
