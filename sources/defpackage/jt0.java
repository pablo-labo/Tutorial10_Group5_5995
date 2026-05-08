package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jt0<T> extends it0<T> {
    public Object[] a;
    public int b;

    public static final class a extends o2<T> {
        public int c = -1;
        public final /* synthetic */ jt0<T> d;

        public a(jt0<T> jt0Var) {
            this.d = jt0Var;
        }

        @Override // defpackage.o2
        public final void a() {
            int i;
            Object[] objArr;
            do {
                i = this.c + 1;
                this.c = i;
                objArr = this.d.a;
                if (i >= objArr.length) {
                    break;
                }
            } while (objArr[i] == null);
            if (i >= objArr.length) {
                this.a = 2;
                return;
            }
            T t = (T) objArr[i];
            t.getClass();
            this.b = t;
            this.a = 1;
        }
    }

    @Override // defpackage.it0
    public final int a() {
        return this.b;
    }

    @Override // defpackage.it0
    public final void b(int i, T t) {
        t.getClass();
        Object[] objArr = this.a;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.a = Arrays.copyOf(this.a, length);
        }
        Object[] objArr2 = this.a;
        if (objArr2[i] == null) {
            this.b++;
        }
        objArr2[i] = t;
    }

    @Override // defpackage.it0
    public final T get(int i) {
        return (T) ut0.o0(i, this.a);
    }

    @Override // defpackage.it0, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
