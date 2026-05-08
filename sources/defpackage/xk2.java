package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xk2 implements ScrollCaptureCallback {
    public final f5e a;
    public final ph7 b;
    public final nrd c;
    public final AndroidComposeView d;
    public final eu2 e;
    public final wyc f;

    @uh3(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {186}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Runnable $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$onReady = runnable;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return xk2.this.new a(this.$onReady, lu2Var);
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
                wyc wycVar = xk2.this.f;
                this.label = 1;
                Object objA = wycVar.a(0.0f - wycVar.c, this);
                g13 g13Var = g13.a;
                if (objA != g13Var) {
                    objA = j6g.a;
                }
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
            ((gme) xk2.this.c.a).setValue(Boolean.FALSE);
            this.$onReady.run();
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {119}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return xk2.this.new b(this.$session, this.$captureArea, this.$onComplete, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                xk2 xk2Var = xk2.this;
                ScrollCaptureSession scrollCaptureSession = this.$session;
                Rect rect = this.$captureArea;
                ph7 ph7Var = new ph7(rect.left, rect.top, rect.right, rect.bottom);
                this.label = 1;
                obj = xk2.a(xk2Var, scrollCaptureSession, ph7Var, this);
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
            this.$onComplete.accept(wab.x((ph7) obj));
            return j6g.a;
        }
    }

    public xk2(f5e f5eVar, ph7 ph7Var, eu2 eu2Var, nrd nrdVar, AndroidComposeView androidComposeView) {
        this.a = f5eVar;
        this.b = ph7Var;
        this.c = nrdVar;
        this.d = androidComposeView;
        this.e = new eu2(eu2Var.a.d1(q54.a));
        this.f = new wyc(ph7Var.d - ph7Var.b, new al2(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.xk2 r10, android.view.ScrollCaptureSession r11, defpackage.ph7 r12, defpackage.pu2 r13) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk2.a(xk2, android.view.ScrollCaptureSession, ph7, pu2):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        u63.Y(this.e, gja.b, null, new a(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final uqe uqeVarY = u63.Y(this.e, null, null, new b(scrollCaptureSession, rect, consumer, null), 3);
        uqeVarY.d0(new cl2(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: bl2
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                uqeVarY.h(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(wab.x(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = 0.0f;
        ((gme) this.c.a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
