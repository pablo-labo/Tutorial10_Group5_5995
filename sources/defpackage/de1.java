package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class de1 implements PointerInputEventHandler {
    public final /* synthetic */ fe1 a;

    @uh3(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {186}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ fe1 $state;
        final /* synthetic */ efb $this_pointerInput;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: de1$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {190}, m = "invokeSuspend")
        public static final class C0206a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
            final /* synthetic */ e13 $$this$coroutineScope;
            final /* synthetic */ fe1 $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: de1$a$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {195}, m = "invokeSuspend")
            public static final class C0207a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ fe1 $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0207a(fe1 fe1Var, lu2<? super C0207a> lu2Var) {
                    super(2, lu2Var);
                    this.$state = fe1Var;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0207a(this.$state, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0207a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        r7d.b(obj);
                        fe1 fe1Var = this.$state;
                        this.label = 1;
                        Object objB = fe1Var.b(n4a.b, this);
                        g13 g13Var = g13.a;
                        if (objB == g13Var) {
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
            public C0206a(e13 e13Var, fe1 fe1Var, lu2<? super C0206a> lu2Var) {
                super(2, lu2Var);
                this.$$this$coroutineScope = e13Var;
                this.$state = fe1Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0206a c0206a = new C0206a(this.$$this$coroutineScope, this.$state, lu2Var);
                c0206a.L$0 = obj;
                return c0206a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
                ((C0206a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
                return g13.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:12:0x0033). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    int r0 = r6.label
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L1a
                    if (r0 != r2) goto L14
                    java.lang.Object r0 = r6.L$1
                    peb r0 = (defpackage.peb) r0
                    java.lang.Object r3 = r6.L$0
                    l61 r3 = (defpackage.l61) r3
                    defpackage.r7d.b(r7)
                    goto L33
                L14:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r6)
                    return r1
                L1a:
                    defpackage.r7d.b(r7)
                    java.lang.Object r7 = r6.L$0
                    l61 r7 = (defpackage.l61) r7
                    peb r0 = defpackage.peb.b
                    r3 = r7
                L24:
                    r6.L$0 = r3
                    r6.L$1 = r0
                    r6.label = r2
                    java.lang.Object r7 = r3.B1(r0, r6)
                    g13 r4 = defpackage.g13.a
                    if (r7 != r4) goto L33
                    return r4
                L33:
                    neb r7 = (defpackage.neb) r7
                    java.util.List<yeb> r4 = r7.a
                    r5 = 0
                    java.lang.Object r4 = r4.get(r5)
                    yeb r4 = (defpackage.yeb) r4
                    int r4 = r4.i
                    r5 = 2
                    if (r4 != r5) goto L24
                    int r7 = r7.e
                    r4 = 4
                    if (r7 != r4) goto L56
                    e13 r7 = r6.$$this$coroutineScope
                    de1$a$a$a r4 = new de1$a$a$a
                    fe1 r5 = r6.$state
                    r4.<init>(r5, r1)
                    r5 = 3
                    defpackage.u63.Y(r7, r1, r1, r4, r5)
                    goto L24
                L56:
                    r4 = 5
                    if (r7 != r4) goto L24
                    fe1 r7 = r6.$state
                    r7.dismiss()
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: de1.a.C0206a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(efb efbVar, fe1 fe1Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_pointerInput = efbVar;
            this.$state = fe1Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$this_pointerInput, this.$state, lu2Var);
            aVar.L$0 = obj;
            return aVar;
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
                e13 e13Var = (e13) this.L$0;
                efb efbVar = this.$this_pointerInput;
                C0206a c0206a = new C0206a(e13Var, this.$state, null);
                this.label = 1;
                Object objW0 = efbVar.w0(c0206a, this);
                g13 g13Var = g13.a;
                if (objW0 == g13Var) {
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

    public de1(fe1 fe1Var) {
        this.a = fe1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objD = f13.d(new a(efbVar, this.a, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}
