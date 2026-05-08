package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
public final class kk5 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ c4a<Object> $shared;
    final /* synthetic */ yde $started;
    final /* synthetic */ vi5<Object> $upstream;
    int label;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<Integer, lu2<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(2, lu2Var);
            aVar.I$0 = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, lu2<? super Boolean> lu2Var) {
            return ((a) create(Integer.valueOf(num.intValue()), lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return Boolean.valueOf(this.I$0 > 0);
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<wde, lu2<? super j6g>, Object> {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ c4a<Object> $shared;
        final /* synthetic */ vi5<Object> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vi5<Object> vi5Var, c4a<Object> c4aVar, Object obj, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$upstream = vi5Var;
            this.$shared = c4aVar;
            this.$initialValue = obj;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(this.$upstream, this.$shared, this.$initialValue, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wde wdeVar, lu2<? super j6g> lu2Var) {
            return ((b) create(wdeVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                int iOrdinal = ((wde) this.L$0).ordinal();
                if (iOrdinal == 0) {
                    vi5<Object> vi5Var = this.$upstream;
                    c4a<Object> c4aVar = this.$shared;
                    this.label = 1;
                    Object objE = vi5Var.e(c4aVar, this);
                    g13 g13Var = g13.a;
                    if (objE == g13Var) {
                        return g13Var;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        l.g();
                        return null;
                    }
                    Object obj2 = this.$initialValue;
                    ux0 ux0Var = wg2.b0;
                    c4a<Object> c4aVar2 = this.$shared;
                    if (obj2 == ux0Var) {
                        c4aVar2.i();
                    } else {
                        c4aVar2.b(obj2);
                    }
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
    public kk5(yde ydeVar, vi5<Object> vi5Var, c4a<Object> c4aVar, Object obj, lu2<? super kk5> lu2Var) {
        super(2, lu2Var);
        this.$started = ydeVar;
        this.$upstream = vi5Var;
        this.$shared = c4aVar;
        this.$initialValue = obj;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new kk5(this.$started, this.$upstream, this.$shared, this.$initialValue, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((kk5) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r8.e(r0, r7) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r8.e(r0, r7) != r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (defpackage.wg2.q(r8, r0, r7) == r6) goto L28;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            g13 r6 = defpackage.g13.a
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1e
            if (r0 == r5) goto L1a
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L14
            goto L1e
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r1
        L1a:
            defpackage.r7d.b(r8)
            goto L50
        L1e:
            defpackage.r7d.b(r8)
            goto L7d
        L22:
            defpackage.r7d.b(r8)
            yde r8 = r7.$started
            pi3 r0 = yde.a.a
            if (r8 != r0) goto L38
            vi5<java.lang.Object> r8 = r7.$upstream
            c4a<java.lang.Object> r0 = r7.$shared
            r7.label = r4
            java.lang.Object r7 = r8.e(r0, r7)
            if (r7 != r6) goto L7d
            goto L7c
        L38:
            c4a<java.lang.Object> r0 = r7.$shared
            wre r4 = yde.a.b
            if (r8 != r4) goto L5d
            lxe r8 = r0.f()
            kk5$a r0 = new kk5$a
            r0.<init>(r5, r1)
            r7.label = r5
            java.lang.Object r8 = defpackage.wg2.C(r8, r0, r7)
            if (r8 != r6) goto L50
            goto L7c
        L50:
            vi5<java.lang.Object> r8 = r7.$upstream
            c4a<java.lang.Object> r0 = r7.$shared
            r7.label = r3
            java.lang.Object r7 = r8.e(r0, r7)
            if (r7 != r6) goto L7d
            goto L7c
        L5d:
            lxe r0 = r0.f()
            vi5 r8 = r8.a(r0)
            vi5 r8 = defpackage.wg2.v(r8)
            kk5$b r0 = new kk5$b
            vi5<java.lang.Object> r3 = r7.$upstream
            c4a<java.lang.Object> r4 = r7.$shared
            java.lang.Object r5 = r7.$initialValue
            r0.<init>(r3, r4, r5, r1)
            r7.label = r2
            java.lang.Object r7 = defpackage.wg2.q(r8, r0, r7)
            if (r7 != r6) goto L7d
        L7c:
            return r6
        L7d:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
