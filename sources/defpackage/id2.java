package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class id2 {
    public static final a a = new a();
    public static final b b = new b(-1);
    public static final b c = new b(1);

    public class a extends id2 {
        public static id2 f(int i) {
            return i < 0 ? id2.b : i > 0 ? id2.c : id2.a;
        }

        @Override // defpackage.id2
        public final id2 a(int i, int i2) {
            return f(Integer.compare(i, i2));
        }

        @Override // defpackage.id2
        public final <T> id2 b(T t, T t2, Comparator<T> comparator) {
            return f(comparator.compare(t, t2));
        }

        @Override // defpackage.id2
        public final id2 c(boolean z, boolean z2) {
            return f(Boolean.compare(z, z2));
        }

        @Override // defpackage.id2
        public final id2 d(boolean z, boolean z2) {
            return f(Boolean.compare(z2, z));
        }

        @Override // defpackage.id2
        public final int e() {
            return 0;
        }
    }

    public static final class b extends id2 {
        public final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // defpackage.id2
        public final id2 a(int i, int i2) {
            return this;
        }

        @Override // defpackage.id2
        public final <T> id2 b(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // defpackage.id2
        public final id2 c(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.id2
        public final id2 d(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.id2
        public final int e() {
            return this.d;
        }
    }

    public abstract id2 a(int i, int i2);

    public abstract <T> id2 b(T t, T t2, Comparator<T> comparator);

    public abstract id2 c(boolean z, boolean z2);

    public abstract id2 d(boolean z, boolean z2);

    public abstract int e();
}
