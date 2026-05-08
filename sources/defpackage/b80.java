package defpackage;

import android.view.View;
import defpackage.hu8;
import defpackage.iu8;
import defpackage.wl7;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
public final class b80 extends c1f implements Function2<tcb, lu2<?>, Object> {
    final /* synthetic */ Function1<mu8, j6g> $initializeRequest;
    final /* synthetic */ hu8.a $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c80 this$0;

    @uh3(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<?>, Object> {
        final /* synthetic */ tcb $$this$launchTextInputSession;
        final /* synthetic */ Function1<mu8, j6g> $initializeRequest;
        final /* synthetic */ hu8.a $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c80 this$0;

        /* JADX INFO: renamed from: b80$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend")
        public static final class C0088a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ we7 $inputMethodManager;
            int label;
            final /* synthetic */ c80 this$0;

            /* JADX INFO: renamed from: b80$a$a$a, reason: collision with other inner class name */
            public static final class C0089a<T> implements wi5 {
                public final /* synthetic */ we7 a;

                public C0089a(we7 we7Var) {
                    this.a = we7Var;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    this.a.a();
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0088a(c80 c80Var, we7 we7Var, lu2<? super C0088a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = c80Var;
                this.$inputMethodManager = we7Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0088a(this.this$0, this.$inputMethodManager, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0088a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                int i2 = 1;
                g13 g13Var = g13.a;
                if (i == 0) {
                    r7d.b(obj);
                    nf nfVar = new nf(2);
                    this.label = 1;
                    if (ly9.a(getContext()).W(new pp8(nfVar, i2), this) == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            throw s6.e(obj);
                        }
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                c4a<j6g> c4aVarK = this.this$0.k();
                if (c4aVarK == null) {
                    return j6g.a;
                }
                C0089a c0089a = new C0089a(this.$inputMethodManager);
                this.label = 2;
                nde.o((nde) c4aVarK, c0089a, this);
                return g13Var;
            }
        }

        public /* synthetic */ class b extends qv5 implements Function1<if9, j6g> {
            final /* synthetic */ hu8.a $node;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(hu8.a aVar) {
                super(1, wl7.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.$node = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(if9 if9Var) {
                float[] fArr = if9Var.a;
                sl8 sl8VarK = this.$node.K();
                if (sl8VarK != null) {
                    if (!sl8VarK.d()) {
                        sl8VarK = null;
                    }
                    if (sl8VarK != null) {
                        sl8VarK.N(fArr);
                    }
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(tcb tcbVar, Function1<? super mu8, j6g> function1, c80 c80Var, hu8.a aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$$this$launchTextInputSession = tcbVar;
            this.$initializeRequest = function1;
            this.this$0 = c80Var;
            this.$node = aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<?> lu2Var) {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i != 0) {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    throw new KotlinNothingValueException();
                }
                r7d.b(obj);
                e13 e13Var = (e13) this.L$0;
                iu8.a aVar = iu8.a;
                View viewB = this.$$this$launchTextInputSession.b();
                aVar.getClass();
                ye7 ye7Var = new ye7(viewB);
                mu8 mu8Var = new mu8(this.$$this$launchTextInputSession.b(), new b(this.$node), ye7Var);
                if (owe.a) {
                    u63.Y(e13Var, null, null, new C0088a(this.this$0, ye7Var, null), 3);
                }
                Function1<mu8, j6g> function1 = this.$initializeRequest;
                if (function1 != null) {
                    function1.invoke(mu8Var);
                }
                this.this$0.c = mu8Var;
                tcb tcbVar = this.$$this$launchTextInputSession;
                this.label = 1;
                tcbVar.c(mu8Var, this);
                return g13.a;
            } catch (Throwable th) {
                this.this$0.c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b80(Function1<? super mu8, j6g> function1, c80 c80Var, hu8.a aVar, lu2<? super b80> lu2Var) {
        super(2, lu2Var);
        this.$initializeRequest = function1;
        this.this$0 = c80Var;
        this.$node = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        b80 b80Var = new b80(this.$initializeRequest, this.this$0, this.$node, lu2Var);
        b80Var.L$0 = obj;
        return b80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tcb tcbVar, lu2<?> lu2Var) {
        ((b80) create(tcbVar, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            a aVar = new a((tcb) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            Object objD = f13.d(aVar, this);
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
        r40.e();
        return null;
    }
}
