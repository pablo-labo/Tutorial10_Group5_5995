package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface c47<E> extends List<E>, Collection, ze8 {

    public static final class a<E> extends w2<E> implements c47<E> {
        public final c47<E> a;
        public final int b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c47<? extends E> c47Var, int i, int i2) {
            this.a = c47Var;
            this.b = i;
            c0h.o(i, i2, c47Var.size());
            this.c = i2 - i;
        }

        @Override // defpackage.l1
        public final int a() {
            return this.c;
        }

        @Override // java.util.List
        public final E get(int i) {
            c0h.m(i, this.c);
            return this.a.get(this.b + i);
        }

        @Override // defpackage.w2, java.util.List
        public final List subList(int i, int i2) {
            c0h.o(i, i2, this.c);
            int i3 = this.b;
            return new a(this.a, i + i3, i3 + i2);
        }
    }
}
