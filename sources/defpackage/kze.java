package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class kze {

    public static class a<T> implements fze<T>, Serializable {
        private static final long serialVersionUID = 0;
        public transient Object a = new Object();
        public volatile transient boolean b;
        public transient T c;
        final fze<T> delegate;

        public a(fze<T> fzeVar) {
            this.delegate = fzeVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.a = new Object();
        }

        @Override // defpackage.fze
        public final T get() {
            if (!this.b) {
                synchronized (this.a) {
                    try {
                        if (!this.b) {
                            T t = this.delegate.get();
                            this.c = t;
                            this.b = true;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return this.c;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.b) {
                obj = "<supplier that returned " + this.c + ">";
            } else {
                obj = this.delegate;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class b<T> implements fze<T> {
        public static final jze d = new jze();
        public final Object a = new Object();
        public volatile fze<T> b;
        public T c;

        public b(fze<T> fzeVar) {
            this.b = fzeVar;
        }

        @Override // defpackage.fze
        public final T get() {
            fze<T> fzeVar = this.b;
            jze jzeVar = d;
            if (fzeVar != jzeVar) {
                synchronized (this.a) {
                    try {
                        if (this.b != jzeVar) {
                            T t = this.b.get();
                            this.c = t;
                            this.b = jzeVar;
                            return t;
                        }
                    } finally {
                    }
                }
            }
            return this.c;
        }

        public final String toString() {
            Object obj = this.b;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == d) {
                obj = "<supplier that returned " + this.c + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> fze<T> a(fze<T> fzeVar) {
        return ((fzeVar instanceof b) || (fzeVar instanceof a)) ? fzeVar : fzeVar instanceof Serializable ? new a(fzeVar) : new b(fzeVar);
    }
}
