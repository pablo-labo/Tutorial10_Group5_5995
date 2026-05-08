package defpackage;

import defpackage.df8;
import defpackage.ewc;
import defpackage.nd8;
import defpackage.od8;
import defpackage.qf8;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xf8<V> extends wd8<V> implements qf8<V> {
    public static final Object b0 = new Object();
    public final te8 V;
    public final String W;
    public final String X;
    public final Object Y;
    public final Lazy<Field> Z;
    public final ewc.a<d4c> a0;

    public static abstract class a<PropertyType, ReturnType> extends wd8<ReturnType> implements ve8<ReturnType>, qf8.a<PropertyType> {
        @Override // defpackage.wd8
        public final boolean C() {
            return E().C();
        }

        public abstract w3c D();

        public abstract xf8<PropertyType> E();

        @Override // defpackage.ve8
        public final boolean isExternal() {
            return D().isExternal();
        }

        @Override // defpackage.ve8
        public final boolean isInfix() {
            return D().isInfix();
        }

        @Override // defpackage.ve8
        public final boolean isInline() {
            return D().isInline();
        }

        @Override // defpackage.ve8
        public final boolean isOperator() {
            return D().isOperator();
        }

        @Override // defpackage.ud8
        public final boolean isSuspend() {
            return D().isSuspend();
        }

        @Override // defpackage.wd8
        public final te8 x() {
            return E().V;
        }

        @Override // defpackage.wd8
        public final pv1<?> y() {
            return null;
        }
    }

    public static abstract class b<V> extends a<V, V> implements qf8.b<V> {
        public static final /* synthetic */ qf8<Object>[] X = {fwc.a.g(new l4c(b.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};
        public final ewc.a V = ewc.a(null, new r04(this, 3));
        public final Lazy W = boa.E(qt8.b, new s04(this, 2));

        @Override // xf8.a
        public final w3c D() {
            qf8<Object> qf8Var = X[0];
            Object objInvoke = this.V.invoke();
            objInvoke.getClass();
            return (f4c) objInvoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof b) && wl7.b(E(), ((b) obj).E());
        }

        @Override // defpackage.ud8
        public final String getName() {
            return w40.f(new StringBuilder("<get-"), E().W, '>');
        }

        public final int hashCode() {
            return E().hashCode();
        }

        public final String toString() {
            return "getter of " + E();
        }

        @Override // defpackage.wd8
        public final pv1<?> w() {
            return (pv1) this.W.getValue();
        }

        @Override // defpackage.wd8
        public final hv1 z() {
            qf8<Object> qf8Var = X[0];
            Object objInvoke = this.V.invoke();
            objInvoke.getClass();
            return (f4c) objInvoke;
        }
    }

    public static abstract class c<V> extends a<V, j6g> implements df8.a<V> {
        public static final /* synthetic */ qf8<Object>[] X = {fwc.a.g(new l4c(c.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};
        public final ewc.a V = ewc.a(null, new t04(this, 2));
        public final Lazy W = boa.E(qt8.b, new nx1(this, 4));

        @Override // xf8.a
        public final w3c D() {
            qf8<Object> qf8Var = X[0];
            Object objInvoke = this.V.invoke();
            objInvoke.getClass();
            return (p4c) objInvoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && wl7.b(E(), ((c) obj).E());
        }

        @Override // defpackage.ud8
        public final String getName() {
            return w40.f(new StringBuilder("<set-"), E().W, '>');
        }

        public final int hashCode() {
            return E().hashCode();
        }

        public final String toString() {
            return "setter of " + E();
        }

        @Override // defpackage.wd8
        public final pv1<?> w() {
            return (pv1) this.W.getValue();
        }

        @Override // defpackage.wd8
        public final hv1 z() {
            qf8<Object> qf8Var = X[0];
            Object objInvoke = this.V.invoke();
            objInvoke.getClass();
            return (p4c) objInvoke;
        }
    }

    public xf8(te8 te8Var, String str, String str2, d4c d4cVar, Object obj) {
        this.V = te8Var;
        this.W = str;
        this.X = str2;
        this.Y = obj;
        this.Z = boa.E(qt8.b, new p04(this, 3));
        this.a0 = ewc.a(d4cVar, new q04(this, 4));
    }

    @Override // defpackage.wd8
    public final boolean C() {
        return this.Y != iv1.NO_RECEIVER;
    }

    public final Member D() {
        if (!z().A()) {
            return null;
        }
        a62 a62Var = rhd.a;
        nd8 nd8VarB = rhd.b(z());
        if (nd8VarB instanceof nd8.c) {
            nd8.c cVar = (nd8.c) nd8VarB;
            o8a o8aVar = cVar.d;
            od8.c cVar2 = cVar.c;
            if (cVar2.u()) {
                od8.b bVarP = cVar2.p();
                if (!bVarP.p() || !bVarP.o()) {
                    return null;
                }
                return this.V.q(o8aVar.getString(bVarP.n()), o8aVar.getString(bVarP.m()));
            }
        }
        return this.Z.getValue();
    }

    public final Object E() {
        return wuf.a(this.Y, z());
    }

    @Override // defpackage.wd8
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final d4c z() {
        d4c d4cVarInvoke = this.a0.invoke();
        d4cVarInvoke.getClass();
        return d4cVarInvoke;
    }

    public abstract b<V> G();

    public final boolean equals(Object obj) {
        xf8<?> xf8VarC = akg.c(obj);
        return xf8VarC != null && wl7.b(this.V, xf8VarC.V) && wl7.b(this.W, xf8VarC.W) && wl7.b(this.X, xf8VarC.X) && wl7.b(this.Y, xf8VarC.Y);
    }

    @Override // defpackage.ud8
    public final String getName() {
        return this.W;
    }

    public final int hashCode() {
        return this.X.hashCode() + akb.d(this.V.hashCode() * 31, 31, this.W);
    }

    @Override // defpackage.ud8
    public final boolean isSuspend() {
        return false;
    }

    public final String toString() {
        pz3 pz3Var = lwc.a;
        return lwc.c(z());
    }

    @Override // defpackage.wd8
    public final pv1<?> w() {
        return G().w();
    }

    @Override // defpackage.wd8
    public final te8 x() {
        return this.V;
    }

    @Override // defpackage.wd8
    public final pv1<?> y() {
        G().getClass();
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xf8(te8 te8Var, d4c d4cVar) {
        d4cVar.getClass();
        String strC = d4cVar.getName().c();
        strC.getClass();
        this(te8Var, strC, rhd.b(d4cVar).a(), d4cVar, iv1.NO_RECEIVER);
    }
}
