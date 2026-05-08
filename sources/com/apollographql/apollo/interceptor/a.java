package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import defpackage.be4;
import defpackage.c1f;
import defpackage.ead;
import defpackage.g13;
import defpackage.j6g;
import defpackage.juc;
import defpackage.kjd;
import defpackage.ls3;
import defpackage.lu2;
import defpackage.pg8;
import defpackage.ph0;
import defpackage.pk5;
import defpackage.pua;
import defpackage.qh0;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rh0;
import defpackage.rj5;
import defpackage.sh0;
import defpackage.uh3;
import defpackage.vi5;
import defpackage.wd4;
import defpackage.wg2;
import defpackage.wi5;
import defpackage.xu5;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ph0 {

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* JADX INFO: renamed from: com.apollographql.apollo.interceptor.a$a, reason: collision with other inner class name */
    @uh3(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1", f = "RetryOnErrorInterceptor.kt", l = {65, 67}, m = "invokeSuspend", v = 1)
    public static final class C0110a<D> extends c1f implements Function2<wi5<? super sh0<D>>, lu2<? super j6g>, Object> {
        final /* synthetic */ vi5<sh0<D>> $downStream;
        final /* synthetic */ boolean $failFastIfOffline;
        final /* synthetic */ rh0<D> $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0110a(boolean z, a aVar, rh0<D> rh0Var, vi5<sh0<D>> vi5Var, lu2<? super C0110a> lu2Var) {
            super(2, lu2Var);
            this.$failFastIfOffline = z;
            this.this$0 = aVar;
            this.$request = rh0Var;
            this.$downStream = vi5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            C0110a c0110a = new C0110a(this.$failFastIfOffline, this.this$0, this.$request, this.$downStream, lu2Var);
            c0110a.L$0 = obj;
            return c0110a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((C0110a) create((wi5) obj, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                if (this.$failFastIfOffline) {
                    this.this$0.getClass();
                }
                vi5<sh0<D>> vi5Var = this.$downStream;
                this.label = 2;
                Object objX = wg2.x(wi5Var, vi5Var, this);
                g13 g13Var = g13.a;
                if (objX == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @uh3(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2", f = "RetryOnErrorInterceptor.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b<D> extends c1f implements Function2<sh0<D>, lu2<? super j6g>, Object> {
        final /* synthetic */ juc $attempt;
        final /* synthetic */ boolean $retryOnError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, juc jucVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$retryOnError = z;
            this.$attempt = jucVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.$retryOnError, this.$attempt, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((b) create((sh0) obj, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws RetryException {
            ApolloException apolloException;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            sh0 sh0Var = (sh0) this.L$0;
            if (this.$retryOnError && (apolloException = sh0Var.e) != null) {
                apolloException.getClass();
                int i = ead.a;
                if (apolloException instanceof ApolloNetworkException) {
                    throw RetryException.a;
                }
            }
            this.$attempt.element = 0;
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    @uh3(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3", f = "RetryOnErrorInterceptor.kt", l = {79, 81}, m = "invokeSuspend", v = 1)
    public static final class c<D> extends c1f implements xu5<wi5<? super sh0<D>>, Throwable, Long, lu2<? super Boolean>, Object> {
        final /* synthetic */ juc $attempt;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(juc jucVar, a aVar, lu2<? super c> lu2Var) {
            super(4, lu2Var);
            this.$attempt = jucVar;
            this.this$0 = aVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                r7d.b(obj);
                if (((Throwable) this.L$0) instanceof RetryException) {
                    this.$attempt.element++;
                    this.this$0.getClass();
                    int i2 = wd4.d;
                    long jS = pg8.S(Math.pow(2.0d, this.$attempt.element), be4.SECONDS);
                    this.label = 2;
                    Object objB = ls3.b(ls3.d(jS), this);
                    Object obj2 = g13.a;
                    if (objB != obj2) {
                        objB = j6g.a;
                    }
                    if (objB == obj2) {
                        return obj2;
                    }
                } else {
                    z = false;
                }
            } else {
                if (i != 1 && i != 2) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return Boolean.valueOf(z);
        }

        @Override // defpackage.xu5
        public final Object j(Object obj, Throwable th, Long l, lu2<? super Boolean> lu2Var) {
            l.longValue();
            c cVar = new c(this.$attempt, this.this$0, lu2Var);
            cVar.L$0 = th;
            return cVar.invokeSuspend(j6g.a);
        }
    }

    @Override // defpackage.ph0
    public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var, qh0 qh0Var) {
        rh0Var.getClass();
        qh0Var.getClass();
        Boolean bool = rh0Var.j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = rh0Var.i;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        if (!zBooleanValue && !zBooleanValue2) {
            return qh0Var.a(rh0Var);
        }
        juc jucVar = new juc();
        return new rj5(new pk5(new kjd(new C0110a(zBooleanValue, this, rh0Var, qh0Var.a(rh0Var), null)), new b(zBooleanValue2, jucVar, null)), new c(jucVar, this, null));
    }
}
