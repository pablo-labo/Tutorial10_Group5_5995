package defpackage;

import defpackage.v03;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wb2 implements v03, Serializable {
    private final v03.a element;
    private final v03 left;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 0;
        private final v03[] elements;

        public a(v03[] v03VarArr) {
            this.elements = v03VarArr;
        }

        private final Object readResolve() {
            v03[] v03VarArr = this.elements;
            v03 v03VarD1 = vr4.a;
            for (v03 v03Var : v03VarArr) {
                v03VarD1 = v03VarD1.d1(v03Var);
            }
            return v03VarD1;
        }
    }

    public wb2(v03.a aVar, v03 v03Var) {
        v03Var.getClass();
        aVar.getClass();
        this.left = v03Var;
        this.element = aVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iB = b();
        v03[] v03VarArr = new v03[iB];
        juc jucVar = new juc();
        j1(j6g.a, new tn0(3, v03VarArr, jucVar));
        if (jucVar.element == iB) {
            return new a(v03VarArr);
        }
        r6.g("Check failed.");
        return null;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        bVar.getClass();
        v03.a aVarH1 = this.element.h1(bVar);
        v03 v03Var = this.left;
        if (aVarH1 != null) {
            return v03Var;
        }
        v03 v03VarP = v03Var.P(bVar);
        if (v03VarP == this.left) {
            return this;
        }
        v03.a aVar = this.element;
        return v03VarP == vr4.a ? aVar : new wb2(aVar, v03VarP);
    }

    public final int b() {
        int i = 2;
        while (true) {
            v03 v03Var = this.left;
            this = v03Var instanceof wb2 ? (wb2) v03Var : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        v03Var.getClass();
        return v03Var == vr4.a ? this : (v03) v03Var.j1(this, new kk2(1));
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this == obj) {
            return true;
        }
        if (obj instanceof wb2) {
            wb2 wb2Var = (wb2) obj;
            if (wb2Var.b() == b()) {
                while (true) {
                    v03.a aVar = this.element;
                    if (!wl7.b(wb2Var.h1(aVar.getKey()), aVar)) {
                        zB = false;
                        break;
                    }
                    v03 v03Var = this.left;
                    if (!(v03Var instanceof wb2)) {
                        v03Var.getClass();
                        v03.a aVar2 = (v03.a) v03Var;
                        zB = wl7.b(wb2Var.h1(aVar2.getKey()), aVar2);
                        break;
                    }
                    this = (wb2) v03Var;
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        bVar.getClass();
        while (true) {
            E e = (E) this.element.h1(bVar);
            if (e != null) {
                return e;
            }
            v03 v03Var = this.left;
            if (!(v03Var instanceof wb2)) {
                return (E) v03Var.h1(bVar);
            }
            this = (wb2) v03Var;
        }
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return function2.invoke((Object) this.left.j1(r, function2), this.element);
    }

    public final String toString() {
        return w40.f(new StringBuilder("["), (String) j1("", new vb2(0)), ']');
    }
}
