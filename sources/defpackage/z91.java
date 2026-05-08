package defpackage;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z91<K, A> {
    public final c<K> c;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public A e = null;
    public float f = -1.0f;
    public float g = -1.0f;

    public interface a {
        void a();
    }

    public static final class b<T> implements c<T> {
        @Override // z91.c
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // z91.c
        public final lh8<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // z91.c
        public final boolean c(float f) {
            return false;
        }

        @Override // z91.c
        public final float d() {
            return 0.0f;
        }

        @Override // z91.c
        public final float e() {
            return 1.0f;
        }

        @Override // z91.c
        public final boolean isEmpty() {
            return true;
        }
    }

    public interface c<T> {
        boolean a(float f);

        lh8<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    public static final class d<T> implements c<T> {
        public final List<? extends lh8<T>> a;
        public lh8<T> c = null;
        public float d = -1.0f;
        public lh8<T> b = f(0.0f);

        public d(List<? extends lh8<T>> list) {
            this.a = list;
        }

        @Override // z91.c
        public final boolean a(float f) {
            lh8<T> lh8Var = this.c;
            lh8<T> lh8Var2 = this.b;
            if (lh8Var == lh8Var2 && this.d == f) {
                return true;
            }
            this.c = lh8Var2;
            this.d = f;
            return false;
        }

        @Override // z91.c
        public final lh8<T> b() {
            return this.b;
        }

        @Override // z91.c
        public final boolean c(float f) {
            lh8<T> lh8Var = this.b;
            if (f >= lh8Var.b() && f < lh8Var.a()) {
                return !this.b.c();
            }
            this.b = f(f);
            return true;
        }

        @Override // z91.c
        public final float d() {
            return this.a.get(0).b();
        }

        @Override // z91.c
        public final float e() {
            return this.a.get(r1.size() - 1).a();
        }

        public final lh8<T> f(float f) {
            List<? extends lh8<T>> list = this.a;
            lh8<T> lh8Var = list.get(list.size() - 1);
            if (f >= lh8Var.b()) {
                return lh8Var;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                lh8<T> lh8Var2 = list.get(size);
                if (this.b != lh8Var2 && f >= lh8Var2.b() && f < lh8Var2.a()) {
                    return lh8Var2;
                }
            }
            return list.get(0);
        }

        @Override // z91.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class e<T> implements c<T> {
        public final lh8<T> a;
        public float b = -1.0f;

        public e(List<? extends lh8<T>> list) {
            this.a = list.get(0);
        }

        @Override // z91.c
        public final boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // z91.c
        public final lh8<T> b() {
            return this.a;
        }

        @Override // z91.c
        public final boolean c(float f) {
            return !this.a.c();
        }

        @Override // z91.c
        public final float d() {
            return this.a.b();
        }

        @Override // z91.c
        public final float e() {
            return this.a.a();
        }

        @Override // z91.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public z91(List<? extends lh8<K>> list) {
        c<K> eVar;
        if (list.isEmpty()) {
            eVar = new b<>();
        } else {
            eVar = list.size() == 1 ? new e<>(list) : new d<>(list);
        }
        this.c = eVar;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    @SuppressLint({"Range"})
    public float b() {
        if (this.g == -1.0f) {
            this.g = this.c.e();
        }
        return this.g;
    }

    public final float c() {
        Interpolator interpolator;
        lh8<K> lh8VarB = this.c.b();
        if (lh8VarB == null || lh8VarB.c() || (interpolator = lh8VarB.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        lh8<K> lh8VarB = this.c.b();
        if (lh8VarB.c()) {
            return 0.0f;
        }
        return (this.d - lh8VarB.b()) / (lh8VarB.a() - lh8VarB.b());
    }

    public A e() {
        float fD = d();
        c<K> cVar = this.c;
        if (cVar.a(fD) && !i()) {
            return this.e;
        }
        lh8<K> lh8VarB = cVar.b();
        Interpolator interpolator = lh8VarB.e;
        Interpolator interpolator2 = lh8VarB.f;
        A aF = (interpolator == null || interpolator2 == null) ? f(lh8VarB, c()) : g(lh8VarB, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.e = aF;
        return aF;
    }

    public abstract A f(lh8<K> lh8Var, float f);

    public A g(lh8<K> lh8Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h(float f) {
        c<K> cVar = this.c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.f == -1.0f) {
            this.f = cVar.d();
        }
        float f2 = this.f;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f = cVar.d();
            }
            f = this.f;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (!cVar.c(f)) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).a();
            i++;
        }
    }

    public boolean i() {
        return false;
    }
}
