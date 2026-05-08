package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class av9 extends n1 {
    public final boolean a0;
    public final gu5<j6g> b0;
    public final zb0<Float, ce0> c0;
    public final e13 d0;
    public final g4a e0;
    public Object f0;
    public boolean g0;

    public static final class a {
        public static final OnBackInvokedCallback a(final gu5<j6g> gu5Var) {
            return new OnBackInvokedCallback() { // from class: zu9
                public final void onBackInvoked() {
                    gu5Var.invoke();
                }
            };
        }

        public static final void b(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
        }

        public static final void c(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    public static final class b {

        public static final class a implements OnBackAnimationCallback {
            public final /* synthetic */ e13 a;
            public final /* synthetic */ zb0<Float, ce0> b;
            public final /* synthetic */ gu5<j6g> c;

            /* JADX INFO: renamed from: av9$b$a$a, reason: collision with other inner class name */
            @uh3(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {419}, m = "invokeSuspend")
            public static final class C0081a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0081a(zb0<Float, ce0> zb0Var, lu2<? super C0081a> lu2Var) {
                    super(2, lu2Var);
                    this.$predictiveBackProgress = zb0Var;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0081a(this.$predictiveBackProgress, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0081a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        r7d.b(obj);
                        zb0<Float, ce0> zb0Var = this.$predictiveBackProgress;
                        Float f = new Float(0.0f);
                        this.label = 1;
                        Object objC = zb0.c(zb0Var, f, null, null, this, 14);
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

            /* JADX INFO: renamed from: av9$b$a$b, reason: collision with other inner class name */
            @uh3(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {410}, m = "invokeSuspend")
            public static final class C0082b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ BackEvent $backEvent;
                final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0082b(zb0<Float, ce0> zb0Var, BackEvent backEvent, lu2<? super C0082b> lu2Var) {
                    super(2, lu2Var);
                    this.$predictiveBackProgress = zb0Var;
                    this.$backEvent = backEvent;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0082b(this.$predictiveBackProgress, this.$backEvent, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0082b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        r7d.b(obj);
                        zb0<Float, ce0> zb0Var = this.$predictiveBackProgress;
                        Float f = new Float(hjb.a.b(this.$backEvent.getProgress()));
                        this.label = 1;
                        Object objE = zb0Var.e(this, f);
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
                    return j6g.a;
                }
            }

            @uh3(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1", f = "ModalBottomSheet.android.kt", l = {404}, m = "invokeSuspend")
            public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ BackEvent $backEvent;
                final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(zb0<Float, ce0> zb0Var, BackEvent backEvent, lu2<? super c> lu2Var) {
                    super(2, lu2Var);
                    this.$predictiveBackProgress = zb0Var;
                    this.$backEvent = backEvent;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new c(this.$predictiveBackProgress, this.$backEvent, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        r7d.b(obj);
                        zb0<Float, ce0> zb0Var = this.$predictiveBackProgress;
                        Float f = new Float(hjb.a.b(this.$backEvent.getProgress()));
                        this.label = 1;
                        Object objE = zb0Var.e(this, f);
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
                    return j6g.a;
                }
            }

            public a(gu5 gu5Var, zb0 zb0Var, e13 e13Var) {
                this.a = e13Var;
                this.b = zb0Var;
                this.c = gu5Var;
            }

            public final void onBackCancelled() {
                u63.Y(this.a, null, null, new C0081a(this.b, null), 3);
            }

            public final void onBackInvoked() {
                this.c.invoke();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                u63.Y(this.a, null, null, new C0082b(this.b, backEvent, null), 3);
            }

            public final void onBackStarted(BackEvent backEvent) {
                u63.Y(this.a, null, null, new c(this.b, backEvent, null), 3);
            }
        }

        public static final OnBackAnimationCallback a(gu5<j6g> gu5Var, zb0<Float, ce0> zb0Var, e13 e13Var) {
            return new a(gu5Var, zb0Var, e13Var);
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            av9.this.a(ka2.L(this.$$changed | 1), bVar);
            return j6g.a;
        }
    }

    public av9(Context context, boolean z, gu5 gu5Var, zb0 zb0Var, e13 e13Var) {
        super(context, null, 6, 0);
        this.a0 = z;
        this.b0 = gu5Var;
        this.c0 = zb0Var;
        this.d0 = e13Var;
        this.e0 = r.f(lj2.a);
    }

    @Override // defpackage.n1
    public final void a(int i, androidx.compose.runtime.b bVar) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(576708319);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && cVarH.i()) {
            cVarH.D();
        } else {
            ((Function2) ((gme) this.e0).getValue()).invoke(cVarH, 0);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c(i);
        }
    }

    @Override // defpackage.n1
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.g0;
    }

    @Override // defpackage.n1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (!this.a0 || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f0 == null) {
            gu5<j6g> gu5Var = this.b0;
            this.f0 = i >= 34 ? b.a(gu5Var, this.c0, this.d0) : a.a(gu5Var);
        }
        a.b(this, this.f0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            a.c(this, this.f0);
        }
        this.f0 = null;
    }
}
