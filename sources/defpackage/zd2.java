package defpackage;

import defpackage.bv1;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class zd2 extends bv1.a {
    public static final zd2 a = new zd2();

    @IgnoreJRERequirement
    public static final class a<R> implements bv1<R, CompletableFuture<R>> {
        public final Type a;

        /* JADX INFO: renamed from: zd2$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0491a implements jv1<R> {
            public final b a;

            public C0491a(b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.jv1
            public final void a(av1<R> av1Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.jv1
            public final void b(av1<R> av1Var, m6d<R> m6dVar) {
                boolean zH = m6dVar.a.h();
                b bVar = this.a;
                if (zH) {
                    bVar.complete(m6dVar.b);
                } else {
                    bVar.completeExceptionally(new HttpException(m6dVar));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // defpackage.bv1
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.bv1
        public final Object b(dpa dpaVar) {
            b bVar = new b(dpaVar);
            dpaVar.N(new C0491a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {
        public final dpa a;

        public b(dpa dpaVar) {
            this.a = dpaVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.a.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements bv1<R, CompletableFuture<m6d<R>>> {
        public final Type a;

        @IgnoreJRERequirement
        public class a implements jv1<R> {
            public final b a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.jv1
            public final void a(av1<R> av1Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.jv1
            public final void b(av1<R> av1Var, m6d<R> m6dVar) {
                this.a.complete(m6dVar);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // defpackage.bv1
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.bv1
        public final Object b(dpa dpaVar) {
            b bVar = new b(dpaVar);
            dpaVar.N(new a(bVar));
            return bVar;
        }
    }

    @Override // bv1.a
    public final bv1 a(Type type, Annotation[] annotationArr) {
        if (fkg.e(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            r6.g("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeD = fkg.d(0, (ParameterizedType) type);
        if (fkg.e(typeD) != m6d.class) {
            return new a(typeD);
        }
        if (typeD instanceof ParameterizedType) {
            return new c(fkg.d(0, (ParameterizedType) typeD));
        }
        r6.g("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
