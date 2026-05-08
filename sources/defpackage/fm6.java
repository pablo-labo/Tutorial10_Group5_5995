package defpackage;

import okhttp3.Call;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fm6<ResponseT, ReturnT> extends m8e<ReturnT> {
    public final c4d a;
    public final Call.Factory b;
    public final az2<ResponseBody, ResponseT> c;

    public static final class a<ResponseT, ReturnT> extends fm6<ResponseT, ReturnT> {
        public final bv1<ResponseT, ReturnT> d;

        public a(c4d c4dVar, Call.Factory factory, az2<ResponseBody, ResponseT> az2Var, bv1<ResponseT, ReturnT> bv1Var) {
            super(c4dVar, factory, az2Var);
            this.d = bv1Var;
        }

        @Override // defpackage.fm6
        public final Object c(dpa dpaVar, Object[] objArr) {
            return this.d.b(dpaVar);
        }
    }

    public static final class b<ResponseT> extends fm6<ResponseT, Object> {
        public final bv1<ResponseT, av1<ResponseT>> d;

        public b(c4d c4dVar, Call.Factory factory, az2 az2Var, bv1 bv1Var) {
            super(c4dVar, factory, az2Var);
            this.d = bv1Var;
        }

        @Override // defpackage.fm6
        public final Object c(dpa dpaVar, Object[] objArr) {
            av1 av1Var = (av1) this.d.b(dpaVar);
            lu2 lu2Var = (lu2) objArr[objArr.length - 1];
            try {
                qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
                qw1Var.t(new ii8(av1Var));
                av1Var.N(new wy3(qw1Var, 3));
                return qw1Var.p();
            } catch (Exception e) {
                return li8.a(e, lu2Var);
            }
        }
    }

    public static final class c<ResponseT> extends fm6<ResponseT, Object> {
        public final bv1<ResponseT, av1<ResponseT>> d;

        public c(c4d c4dVar, Call.Factory factory, az2<ResponseBody, ResponseT> az2Var, bv1<ResponseT, av1<ResponseT>> bv1Var) {
            super(c4dVar, factory, az2Var);
            this.d = bv1Var;
        }

        @Override // defpackage.fm6
        public final Object c(dpa dpaVar, Object[] objArr) {
            av1 av1Var = (av1) this.d.b(dpaVar);
            lu2 lu2Var = (lu2) objArr[objArr.length - 1];
            try {
                qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
                qw1Var.t(new ji8(av1Var));
                av1Var.N(new ki8(qw1Var));
                return qw1Var.p();
            } catch (Exception e) {
                return li8.a(e, lu2Var);
            }
        }
    }

    public fm6(c4d c4dVar, Call.Factory factory, az2<ResponseBody, ResponseT> az2Var) {
        this.a = c4dVar;
        this.b = factory;
        this.c = az2Var;
    }

    @Override // defpackage.m8e
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new dpa(this.a, objArr, this.b, this.c), objArr);
    }

    public abstract Object c(dpa dpaVar, Object[] objArr);
}
