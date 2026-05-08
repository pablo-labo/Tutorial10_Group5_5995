package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wre implements yde {

    @uh3(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<wi5<? super wde>, lu2<? super j6g>, Object> {
        final /* synthetic */ fse<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: wre$a$a, reason: collision with other inner class name */
        public static final class C0472a<T> implements wi5 {
            public final /* synthetic */ huc a;
            public final /* synthetic */ wi5<wde> b;

            /* JADX INFO: renamed from: wre$a$a$a, reason: collision with other inner class name */
            @uh3(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            public static final class C0473a extends pu2 {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C0472a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0473a(C0472a<? super T> c0472a, lu2<? super C0473a> lu2Var) {
                    super(lu2Var);
                    this.this$0 = c0472a;
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.c(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0472a(huc hucVar, wi5<? super wde> wi5Var) {
                this.a = hucVar;
                this.b = wi5Var;
            }

            @Override // defpackage.wi5
            public final /* bridge */ /* synthetic */ Object a(Object obj, lu2 lu2Var) {
                return c(((Number) obj).intValue(), lu2Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object c(int r5, defpackage.lu2<? super defpackage.j6g> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof wre.a.C0472a.C0473a
                    if (r0 == 0) goto L13
                    r0 = r6
                    wre$a$a$a r0 = (wre.a.C0472a.C0473a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    wre$a$a$a r0 = new wre$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    int r1 = r0.label
                    r2 = 1
                    if (r1 == 0) goto L2c
                    if (r1 != r2) goto L25
                    defpackage.r7d.b(r6)
                    goto L48
                L25:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L2c:
                    defpackage.r7d.b(r6)
                    if (r5 <= 0) goto L4b
                    huc r5 = r4.a
                    boolean r6 = r5.element
                    if (r6 != 0) goto L4b
                    r5.element = r2
                    r0.label = r2
                    wi5<wde> r4 = r4.b
                    wde r5 = defpackage.wde.a
                    java.lang.Object r4 = r4.a(r5, r0)
                    g13 r5 = defpackage.g13.a
                    if (r4 != r5) goto L48
                    return r5
                L48:
                    j6g r4 = defpackage.j6g.a
                    return r4
                L4b:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: wre.a.C0472a.c(int, lu2):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fse<Integer> fseVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$subscriptionCount = fseVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$subscriptionCount, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wi5<? super wde> wi5Var, lu2<? super j6g> lu2Var) {
            ((a) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                wi5 wi5Var = (wi5) this.L$0;
                huc hucVar = new huc();
                fse<Integer> fseVar = this.$subscriptionCount;
                C0472a c0472a = new C0472a(hucVar, wi5Var);
                this.label = 1;
                Object objE = fseVar.e(c0472a, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            r40.e();
            return null;
        }
    }

    @Override // defpackage.yde
    public final vi5<wde> a(fse<Integer> fseVar) {
        return new kjd(new a(fseVar, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
