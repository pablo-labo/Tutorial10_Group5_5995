package defpackage;

import androidx.paging.SingleRunner;
import defpackage.r0d;
import defpackage.x6;
import defpackage.xz8;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", l = {386}, m = "invokeSuspend")
public final class v0d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ s0d<Object, Object> this$0;

    @uh3(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", l = {393}, m = "invokeSuspend")
    public static final class a extends c1f implements Function1<lu2<? super j6g>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ s0d<Object, Object> this$0;

        /* JADX INFO: renamed from: v0d$a$a, reason: collision with other inner class name */
        public static final class C0439a extends mj8 implements Function1<x6<Object, Object>, Pair<? extends zz8, ? extends s2b<Object, Object>>> {
            public static final C0439a a = new C0439a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Pair<? extends zz8, ? extends s2b<Object, Object>> invoke(x6<Object, Object> x6Var) {
                x6<Object, Object> x6Var2 = x6Var;
                x6Var2.getClass();
                return x6Var2.c();
            }
        }

        public static final class b extends mj8 implements Function1<x6<Object, Object>, j6g> {
            final /* synthetic */ r0d.b $loadResult;
            final /* synthetic */ zz8 $loadType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zz8 zz8Var, r0d.b.C0404b c0404b) {
                super(1);
                this.$loadType = zz8Var;
                this.$loadResult = c0404b;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(x6<Object, Object> x6Var) {
                x6<Object, Object> x6Var2 = x6Var;
                x6Var2.getClass();
                x6Var2.a(this.$loadType);
                if (((r0d.b.C0404b) this.$loadResult).a) {
                    x6Var2.d(this.$loadType, x6.a.b);
                }
                return j6g.a;
            }
        }

        public static final class c extends mj8 implements Function1<x6<Object, Object>, j6g> {
            final /* synthetic */ r0d.b $loadResult;
            final /* synthetic */ zz8 $loadType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(zz8 zz8Var, r0d.b.a aVar) {
                super(1);
                this.$loadType = zz8Var;
                this.$loadResult = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(x6<Object, Object> x6Var) {
                x6<Object, Object> x6Var2 = x6Var;
                x6Var2.getClass();
                x6Var2.a(this.$loadType);
                x6Var2.e(this.$loadType, new xz8.a(((r0d.b.a) this.$loadResult).a));
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0d<Object, Object> s0dVar, lu2<? super a> lu2Var) {
            super(1, lu2Var);
            this.this$0 = s0dVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return new a(this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((a) create(lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0044 -> B:16:0x0047). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L16
                if (r0 != r1) goto Lf
                java.lang.Object r0 = r4.L$0
                zz8 r0 = (defpackage.zz8) r0
                defpackage.r7d.b(r5)
                goto L47
            Lf:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L16:
                defpackage.r7d.b(r5)
            L19:
                s0d<java.lang.Object, java.lang.Object> r5 = r4.this$0
                y6 r5 = r5.c
                v0d$a$a r0 = v0d.a.C0439a.a
                java.lang.Object r5 = r5.b(r0)
                kotlin.Pair r5 = (kotlin.Pair) r5
                if (r5 != 0) goto L2a
                j6g r4 = defpackage.j6g.a
                return r4
            L2a:
                java.lang.Object r0 = r5.a()
                zz8 r0 = (defpackage.zz8) r0
                java.lang.Object r5 = r5.b()
                s2b r5 = (defpackage.s2b) r5
                s0d<java.lang.Object, java.lang.Object> r2 = r4.this$0
                r0d<Key, Value> r2 = r2.b
                r4.L$0 = r0
                r4.label = r1
                java.lang.Object r5 = r2.load(r0, r5, r4)
                g13 r2 = defpackage.g13.a
                if (r5 != r2) goto L47
                return r2
            L47:
                r0d$b r5 = (r0d.b) r5
                boolean r2 = r5 instanceof r0d.b.C0404b
                if (r2 == 0) goto L5c
                s0d<java.lang.Object, java.lang.Object> r2 = r4.this$0
                y6 r2 = r2.c
                v0d$a$b r3 = new v0d$a$b
                r0d$b$b r5 = (r0d.b.C0404b) r5
                r3.<init>(r0, r5)
                r2.b(r3)
                goto L19
            L5c:
                boolean r2 = r5 instanceof r0d.b.a
                if (r2 == 0) goto L19
                s0d<java.lang.Object, java.lang.Object> r2 = r4.this$0
                y6 r2 = r2.c
                v0d$a$c r3 = new v0d$a$c
                r0d$b$a r5 = (r0d.b.a) r5
                r3.<init>(r0, r5)
                r2.b(r3)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: v0d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0d(s0d<Object, Object> s0dVar, lu2<? super v0d> lu2Var) {
        super(2, lu2Var);
        this.this$0 = s0dVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new v0d(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((v0d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            s0d<Object, Object> s0dVar = this.this$0;
            SingleRunner singleRunner = s0dVar.d;
            a aVar = new a(s0dVar, null);
            this.label = 1;
            Object objA = singleRunner.a(1, aVar, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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
