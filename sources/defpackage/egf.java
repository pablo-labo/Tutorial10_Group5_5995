package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hmb;
import defpackage.i8f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class egf implements PointerInputEventHandler {
    public final /* synthetic */ e13 a;
    public final /* synthetic */ g4a<hmb.b> b;
    public final /* synthetic */ d3a c;
    public final /* synthetic */ g4a d;

    @uh3(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<dmb, ooa, lu2<? super j6g>, Object> {
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ g4a<hmb.b> $pressedInteraction;
        final /* synthetic */ e13 $scope;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: egf$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend")
        public static final class C0216a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ d3a $interactionSource;
            final /* synthetic */ long $it;
            final /* synthetic */ g4a<hmb.b> $pressedInteraction;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0216a(g4a<hmb.b> g4aVar, long j, d3a d3aVar, lu2<? super C0216a> lu2Var) {
                super(2, lu2Var);
                this.$pressedInteraction = g4aVar;
                this.$it = j;
                this.$interactionSource = d3aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0216a(this.$pressedInteraction, this.$it, this.$interactionSource, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0216a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
            
                if (r8.a(r0, r7) == r4) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
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
                    r2 = 2
                    r3 = 1
                    g13 r4 = defpackage.g13.a
                    if (r0 == 0) goto L23
                    if (r0 == r3) goto L1b
                    if (r0 != r2) goto L15
                    java.lang.Object r0 = r7.L$0
                    hmb$b r0 = (hmb.b) r0
                    defpackage.r7d.b(r8)
                    goto L61
                L15:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r7)
                    return r1
                L1b:
                    java.lang.Object r0 = r7.L$0
                    g4a r0 = (defpackage.g4a) r0
                    defpackage.r7d.b(r8)
                    goto L47
                L23:
                    defpackage.r7d.b(r8)
                    g4a<hmb$b> r8 = r7.$pressedInteraction
                    java.lang.Object r8 = r8.getValue()
                    hmb$b r8 = (hmb.b) r8
                    if (r8 == 0) goto L4b
                    d3a r0 = r7.$interactionSource
                    g4a<hmb$b> r5 = r7.$pressedInteraction
                    hmb$a r6 = new hmb$a
                    r6.<init>(r8)
                    if (r0 == 0) goto L48
                    r7.L$0 = r5
                    r7.label = r3
                    java.lang.Object r8 = r0.a(r6, r7)
                    if (r8 != r4) goto L46
                    goto L60
                L46:
                    r0 = r5
                L47:
                    r5 = r0
                L48:
                    r5.setValue(r1)
                L4b:
                    hmb$b r0 = new hmb$b
                    long r5 = r7.$it
                    r0.<init>(r5)
                    d3a r8 = r7.$interactionSource
                    if (r8 == 0) goto L61
                    r7.L$0 = r0
                    r7.label = r2
                    java.lang.Object r8 = r8.a(r0, r7)
                    if (r8 != r4) goto L61
                L60:
                    return r4
                L61:
                    g4a<hmb$b> r7 = r7.$pressedInteraction
                    r7.setValue(r0)
                    j6g r7 = defpackage.j6g.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: egf.a.C0216a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ d3a $interactionSource;
            final /* synthetic */ g4a<hmb.b> $pressedInteraction;
            final /* synthetic */ boolean $success;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g4a<hmb.b> g4aVar, boolean z, d3a d3aVar, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.$pressedInteraction = g4aVar;
                this.$success = z;
                this.$interactionSource = d3aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.$pressedInteraction, this.$success, this.$interactionSource, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                g4a<hmb.b> g4aVar;
                g4a<hmb.b> g4aVar2;
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    hmb.b value = this.$pressedInteraction.getValue();
                    if (value != null) {
                        boolean z = this.$success;
                        d3a d3aVar = this.$interactionSource;
                        g4aVar = this.$pressedInteraction;
                        ci7 cVar = z ? new hmb.c(value) : new hmb.a(value);
                        if (d3aVar != null) {
                            this.L$0 = g4aVar;
                            this.label = 1;
                            Object objA = d3aVar.a(cVar, this);
                            g13 g13Var = g13.a;
                            if (objA == g13Var) {
                                return g13Var;
                            }
                            g4aVar2 = g4aVar;
                        }
                        g4aVar.setValue(null);
                    }
                    return j6g.a;
                }
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g4aVar2 = (g4a) this.L$0;
                r7d.b(obj);
                g4aVar = g4aVar2;
                g4aVar.setValue(null);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e13 e13Var, g4a<hmb.b> g4aVar, d3a d3aVar, lu2<? super a> lu2Var) {
            super(3, lu2Var);
            this.$scope = e13Var;
            this.$pressedInteraction = g4aVar;
            this.$interactionSource = d3aVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                dmb dmbVar = (dmb) this.L$0;
                u63.Y(this.$scope, null, null, new C0216a(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
                this.label = 1;
                obj = dmbVar.T(this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            u63.Y(this.$scope, null, null, new b(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
            return j6g.a;
        }

        @Override // defpackage.wu5
        public final Object q(dmb dmbVar, ooa ooaVar, lu2<? super j6g> lu2Var) {
            long j = ooaVar.a;
            a aVar = new a(this.$scope, this.$pressedInteraction, this.$interactionSource, lu2Var);
            aVar.L$0 = dmbVar;
            aVar.J$0 = j;
            return aVar.invokeSuspend(j6g.a);
        }
    }

    public egf(e13 e13Var, g4a g4aVar, d3a d3aVar, g4a g4aVar2) {
        this.a = e13Var;
        this.b = g4aVar;
        this.c = d3aVar;
        this.d = g4aVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        a aVar = new a(this.a, this.b, this.c, null);
        ls lsVar = new ls(6, this.d);
        i8f.a aVar2 = i8f.a;
        Object objD = f13.d(new n8f(efbVar, aVar, lsVar, new gmb(efbVar), null), lu2Var);
        g13 g13Var = g13.a;
        if (objD != g13Var) {
            objD = j6g.a;
        }
        return objD == g13Var ? objD : j6g.a;
    }
}
