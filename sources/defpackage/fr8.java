package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fr8 implements PointerInputEventHandler {
    public final /* synthetic */ e2b a;

    @uh3(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {286}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ e2b $state;
        final /* synthetic */ efb $this_pointerInput;
        int label;

        /* JADX INFO: renamed from: fr8$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {288, 292}, m = "invokeSuspend")
        public static final class C0243a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
            final /* synthetic */ e2b $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0243a(e2b e2bVar, lu2<? super C0243a> lu2Var) {
                super(2, lu2Var);
                this.$state = e2bVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0243a c0243a = new C0243a(this.$state, lu2Var);
                c0243a.L$0 = obj;
                return c0243a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                return ((C0243a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
            
                if (r13 == r6) goto L17;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:19:0x0069). Please report as a decompilation issue!!! */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    int r0 = r12.label
                    r1 = 0
                    peb r2 = defpackage.peb.a
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    g13 r6 = defpackage.g13.a
                    if (r0 == 0) goto L2e
                    if (r0 == r5) goto L26
                    if (r0 != r3) goto L20
                    java.lang.Object r0 = r12.L$2
                    yeb r0 = (defpackage.yeb) r0
                    java.lang.Object r1 = r12.L$1
                    yeb r1 = (defpackage.yeb) r1
                    java.lang.Object r5 = r12.L$0
                    l61 r5 = (defpackage.l61) r5
                    defpackage.r7d.b(r13)
                    goto L69
                L20:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r12)
                    return r1
                L26:
                    java.lang.Object r0 = r12.L$0
                    l61 r0 = (defpackage.l61) r0
                    defpackage.r7d.b(r13)
                    goto L41
                L2e:
                    defpackage.r7d.b(r13)
                    java.lang.Object r13 = r12.L$0
                    r0 = r13
                    l61 r0 = (defpackage.l61) r0
                    r12.L$0 = r0
                    r12.label = r5
                    java.lang.Object r13 = defpackage.i8f.b(r0, r4, r2, r12)
                    if (r13 != r6) goto L41
                    goto L64
                L41:
                    yeb r13 = (defpackage.yeb) r13
                    e2b r5 = r12.$state
                    g4a r5 = r5.c
                    ooa r7 = new ooa
                    r8 = 0
                    r7.<init>(r8)
                    gme r5 = (defpackage.gme) r5
                    r5.setValue(r7)
                    r5 = r0
                L54:
                    if (r1 != 0) goto L95
                    r12.L$0 = r5
                    r12.L$1 = r13
                    r12.L$2 = r1
                    r12.label = r3
                    java.lang.Object r0 = r5.B1(r2, r12)
                    if (r0 != r6) goto L65
                L64:
                    return r6
                L65:
                    r11 = r1
                    r1 = r13
                    r13 = r0
                    r0 = r11
                L69:
                    neb r13 = (defpackage.neb) r13
                    java.util.List<yeb> r7 = r13.a
                    r8 = r7
                    java.util.Collection r8 = (java.util.Collection) r8
                    int r8 = r8.size()
                    r9 = r4
                L75:
                    if (r9 >= r8) goto L89
                    java.lang.Object r10 = r7.get(r9)
                    yeb r10 = (defpackage.yeb) r10
                    boolean r10 = defpackage.mh2.h(r10)
                    if (r10 != 0) goto L86
                    r13 = r1
                    r1 = r0
                    goto L54
                L86:
                    int r9 = r9 + 1
                    goto L75
                L89:
                    java.util.List<yeb> r13 = r13.a
                    java.lang.Object r13 = r13.get(r4)
                    yeb r13 = (defpackage.yeb) r13
                    r11 = r1
                    r1 = r13
                    r13 = r11
                    goto L54
                L95:
                    e2b r12 = r12.$state
                    long r0 = r1.c
                    long r2 = r13.c
                    long r0 = defpackage.ooa.e(r0, r2)
                    g4a r12 = r12.c
                    ooa r13 = new ooa
                    r13.<init>(r0)
                    gme r12 = (defpackage.gme) r12
                    r12.setValue(r13)
                    j6g r12 = defpackage.j6g.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: fr8.a.C0243a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(efb efbVar, e2b e2bVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_pointerInput = efbVar;
            this.$state = e2bVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$this_pointerInput, this.$state, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                efb efbVar = this.$this_pointerInput;
                C0243a c0243a = new C0243a(this.$state, null);
                this.label = 1;
                Object objC = ap5.c(efbVar, c0243a, this);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
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

    public fr8(e2b e2bVar) {
        this.a = e2bVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objD = f13.d(new a(efbVar, this.a, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}
