package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k13 {
    public static final a a = new a();

    public static final class a {

        /* JADX INFO: renamed from: k13$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", l = {48, 49}, m = "execute")
        public static final class C0288a<R> extends pu2 {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C0288a(lu2<? super C0288a> lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.a(null, false, null, this);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R] */
        @uh3(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
        public static final class b<R> extends c1f implements Function2<e13, lu2<? super R>, Object> {
            final /* synthetic */ Callable<R> $callable;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Callable<R> callable, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$callable = callable;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.$callable, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, Object obj) {
                return ((b) create(e13Var, (lu2) obj)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r7d.b(obj);
                    return this.$callable.call();
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @defpackage.sy3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <R> java.lang.Object a(defpackage.xed r6, boolean r7, java.util.concurrent.Callable<R> r8, defpackage.lu2<? super R> r9) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r9 instanceof k13.a.C0288a
                if (r0 == 0) goto L13
                r0 = r9
                k13$a$a r0 = (k13.a.C0288a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                k13$a$a r0 = new k13$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r5 = r0.result
                int r9 = r0.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r9 == 0) goto L3a
                if (r9 == r3) goto L31
                if (r9 != r2) goto L2b
                defpackage.r7d.b(r5)
                return r5
            L2b:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return r1
            L31:
                java.lang.Object r6 = r0.L$0
                r8 = r6
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                defpackage.r7d.b(r5)
                goto L59
            L3a:
                defpackage.r7d.b(r5)
                boolean r5 = r6.u()
                if (r5 == 0) goto L4e
                boolean r5 = r6.r()
                if (r5 == 0) goto L4e
                java.lang.Object r5 = r8.call()
                return r5
            L4e:
                r0.L$0 = r8
                r0.label = r3
                v03 r5 = defpackage.pg8.v(r6, r7, r0)
                if (r5 != r4) goto L59
                goto L6a
            L59:
                v03 r5 = (defpackage.v03) r5
                k13$a$b r6 = new k13$a$b
                r6.<init>(r8, r1)
                r0.L$0 = r1
                r0.label = r2
                java.lang.Object r5 = defpackage.u63.q0(r5, r6, r0)
                if (r5 != r4) goto L6b
            L6a:
                return r4
            L6b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k13.a.a(xed, boolean, java.util.concurrent.Callable, lu2):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @defpackage.sy3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(com.indeed.android.backendservices.data.IndeedAppDatabase_Impl r6, android.os.CancellationSignal r7, defpackage.lda r8, defpackage.pu2 r9) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r9 instanceof defpackage.l13
                if (r0 == 0) goto L13
                r0 = r9
                l13 r0 = (defpackage.l13) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                l13 r0 = new l13
                r0.<init>(r5, r9)
            L18:
                java.lang.Object r5 = r0.result
                int r9 = r0.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r9 == 0) goto L53
                if (r9 == r3) goto L41
                if (r9 != r2) goto L3b
                java.lang.Object r6 = r0.L$3
                v03 r6 = (defpackage.v03) r6
                java.lang.Object r6 = r0.L$2
                java.util.concurrent.Callable r6 = (java.util.concurrent.Callable) r6
                java.lang.Object r6 = r0.L$1
                android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6
                java.lang.Object r6 = r0.L$0
                xed r6 = (defpackage.xed) r6
                defpackage.r7d.b(r5)
                return r5
            L3b:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return r1
            L41:
                java.lang.Object r6 = r0.L$2
                r8 = r6
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                java.lang.Object r6 = r0.L$1
                r7 = r6
                android.os.CancellationSignal r7 = (android.os.CancellationSignal) r7
                java.lang.Object r6 = r0.L$0
                xed r6 = (defpackage.xed) r6
                defpackage.r7d.b(r5)
                goto L77
            L53:
                defpackage.r7d.b(r5)
                boolean r5 = r6.u()
                if (r5 == 0) goto L67
                boolean r5 = r6.r()
                if (r5 == 0) goto L67
                java.lang.Object r5 = r8.call()
                return r5
            L67:
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r3
                r5 = 0
                v03 r5 = defpackage.pg8.v(r6, r5, r0)
                if (r5 != r4) goto L77
                goto Laa
            L77:
                v03 r5 = (defpackage.v03) r5
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.L$3 = r5
                r0.label = r2
                qw1 r9 = new qw1
                lu2 r0 = defpackage.ewa.v(r0)
                r9.<init>(r3, r0)
                r9.q()
                e13 r6 = r6.j()
                n13 r0 = new n13
                r0.<init>(r8, r9, r1)
                uqe r5 = defpackage.u63.Y(r6, r5, r1, r0, r2)
                m13 r6 = new m13
                r6.<init>(r7, r5)
                r9.t(r6)
                java.lang.Object r5 = r9.p()
                if (r5 != r4) goto Lab
            Laa:
                return r4
            Lab:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k13.a.b(com.indeed.android.backendservices.data.IndeedAppDatabase_Impl, android.os.CancellationSignal, lda, pu2):java.lang.Object");
        }
    }

    @sy3
    public static final kl5 a(IndeedAppDatabase_Impl indeedAppDatabase_Impl, boolean z, String[] strArr, Callable callable) {
        return ee3.k(indeedAppDatabase_Impl, z, strArr, new k1(callable, 4));
    }
}
