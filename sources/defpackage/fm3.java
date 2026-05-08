package defpackage;

import defpackage.bv1;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class fm3 extends bv1.a {
    public final Executor a;

    public static final class a<T> implements av1<T> {
        public final Executor a;
        public final av1<T> b;

        /* JADX INFO: renamed from: fm3$a$a, reason: collision with other inner class name */
        public class C0234a implements jv1<T> {
            public final /* synthetic */ jv1 a;

            public C0234a(jv1 jv1Var) {
                this.a = jv1Var;
            }

            @Override // defpackage.jv1
            public final void a(av1<T> av1Var, Throwable th) {
                a.this.a.execute(new em3(this, this.a, th));
            }

            @Override // defpackage.jv1
            public final void b(av1<T> av1Var, m6d<T> m6dVar) {
                a.this.a.execute(new dm3(0, this, this.a, m6dVar));
            }
        }

        public a(Executor executor, av1<T> av1Var) {
            this.a = executor;
            this.b = av1Var;
        }

        @Override // defpackage.av1
        public final void N(jv1<T> jv1Var) {
            this.b.N(new C0234a(jv1Var));
        }

        @Override // defpackage.av1
        public final Request a() {
            return this.b.a();
        }

        @Override // defpackage.av1
        public final m6d<T> b() {
            return this.b.b();
        }

        @Override // defpackage.av1
        public final void cancel() {
            this.b.cancel();
        }

        @Override // defpackage.av1
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public final av1<T> m33clone() {
            return new a(this.a, this.b.m33clone());
        }

        @Override // defpackage.av1
        public final boolean s() {
            return this.b.s();
        }
    }

    public fm3(Executor executor) {
        this.a = executor;
    }

    @Override // bv1.a
    public final bv1 a(Type type, Annotation[] annotationArr) {
        if (fkg.e(type) != av1.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new cm3(fkg.d(0, (ParameterizedType) type), fkg.h(annotationArr, xje.class) ? null : this.a);
        }
        l5.q("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
