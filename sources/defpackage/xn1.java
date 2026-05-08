package defpackage;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class xn1<T> {
    public final SparseArray<a<T>> a = new SparseArray<>();
    public a<T> b;
    public a<T> c;

    public static class a<I> {
        public a<I> a;
        public int b;
        public LinkedList<I> c;
        public a<I> d;

        public a() {
            throw null;
        }

        public final String toString() {
            return w20.k(new StringBuilder("LinkedEntry(key: "), this.b, ")");
        }
    }

    public final synchronized void a(a<T> aVar) {
        try {
            a aVar2 = (a<T>) aVar.a;
            a aVar3 = (a<T>) aVar.d;
            if (aVar2 != null) {
                aVar2.d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.a = aVar2;
            }
            aVar.a = null;
            aVar.d = null;
            if (aVar == this.b) {
                this.b = aVar3;
            }
            if (aVar == this.c) {
                this.c = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
