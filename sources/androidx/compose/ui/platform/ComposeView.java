package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.r;
import defpackage.g4a;
import defpackage.gme;
import defpackage.j6g;
import defpackage.ka2;
import defpackage.mj8;
import defpackage.n1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Ln1;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Lj6g;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", "value", "b0", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeView extends n1 {
    public final g4a<Function2<androidx.compose.runtime.b, Integer, j6g>> a0;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            ComposeView.this.a(ka2.L(this.$$changed | 1), bVar);
            return j6g.a;
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a0 = r.f(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // defpackage.n1
    public final void a(int i, androidx.compose.runtime.b bVar) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(420213850);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) ((gme) this.a0).getValue();
            if (function2 == null) {
                cVarH.L(-1238798753);
            } else {
                cVarH.L(98586082);
                function2.invoke(cVarH, 0);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.n1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        ((gme) this.a0).setValue(content);
        if (isAttachedToWindow()) {
            d();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }
}
