package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
public final class oe3 extends c1f implements Function2<Object, lu2<Object>, Object> {
    final /* synthetic */ List<Function1<lu2<? super j6g>, Object>> $cleanUps;
    final /* synthetic */ List<le3<Object>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    @uh3(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends c1f implements Function1<lu2<? super j6g>, Object> {
        final /* synthetic */ le3<Object> $migration;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(le3<Object> le3Var, lu2<? super a> lu2Var) {
            super(1, lu2Var);
            this.$migration = le3Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return new a(this.$migration, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((a) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                le3<Object> le3Var = this.$migration;
                this.label = 1;
                Object objD = le3Var.d();
                g13 g13Var = g13.a;
                if (objD == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oe3(List<? extends le3<Object>> list, List<Function1<lu2<? super j6g>, Object>> list2, lu2<? super oe3> lu2Var) {
        super(2, lu2Var);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        oe3 oe3Var = new oe3(this.$migrations, this.$cleanUps, lu2Var);
        oe3Var.L$0 = obj;
        return oe3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, lu2<Object> lu2Var) {
        return ((oe3) create(obj, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[RETURN] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L34
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L19
            java.lang.Object r0 = r9.L$1
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r5 = r9.L$0
            java.util.List r5 = (java.util.List) r5
            defpackage.r7d.b(r10)
            goto L43
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r3
        L1f:
            java.lang.Object r0 = r9.L$3
            java.lang.Object r5 = r9.L$2
            le3 r5 = (defpackage.le3) r5
            java.lang.Object r6 = r9.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r9.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r10)
            r8 = r7
            r7 = r5
            r5 = r8
            goto L65
        L34:
            defpackage.r7d.b(r10)
            java.lang.Object r10 = r9.L$0
            java.util.List<le3<java.lang.Object>> r0 = r9.$migrations
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List<kotlin.jvm.functions.Function1<lu2<? super j6g>, java.lang.Object>> r5 = r9.$cleanUps
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L8a
            java.lang.Object r6 = r0.next()
            le3 r6 = (defpackage.le3) r6
            r9.L$0 = r5
            r9.L$1 = r0
            r9.L$2 = r6
            r9.L$3 = r10
            r9.label = r2
            java.lang.Object r7 = r6.f()
            if (r7 != r4) goto L60
            goto L85
        L60:
            r8 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L65:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L88
            oe3$a r10 = new oe3$a
            r10.<init>(r7, r3)
            r5.add(r10)
            r9.L$0 = r5
            r9.L$1 = r6
            r9.L$2 = r3
            r9.L$3 = r3
            r9.label = r1
            java.lang.Object r10 = r7.e()
            if (r10 != r4) goto L86
        L85:
            return r4
        L86:
            r0 = r6
            goto L43
        L88:
            r10 = r0
            goto L86
        L8a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
