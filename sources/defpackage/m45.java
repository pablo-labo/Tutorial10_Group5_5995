package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lm45;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lgk0;", "appContext", "<init>", "(Landroid/content/Context;Lgk0;)V", "Lj6g;", "measureAndLayout", "()V", "requestLayout", "Landroid/graphics/Canvas;", "canvas", "clipToPaddingBox", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "Lgk0;", "getAppContext", "()Lgk0;", "Lvse;", "stateWrapper", "Lvse;", "getStateWrapper", "()Lvse;", "setStateWrapper", "(Lvse;)V", "Lxbe;", "shadowNodeProxy", "Lxbe;", "getShadowNodeProxy", "()Lxbe;", "", "shouldUseAndroidLayout", "Z", "getShouldUseAndroidLayout", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m45 extends LinearLayout {
    private final gk0 appContext;
    private final xbe shadowNodeProxy;
    private final boolean shouldUseAndroidLayout;
    private vse stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m45(Context context, gk0 gk0Var) {
        super(context);
        context.getClass();
        gk0Var.getClass();
        this.appContext = gk0Var;
        this.shadowNodeProxy = new xbe();
    }

    public void clipToPaddingBox(Canvas canvas) {
        canvas.getClass();
        if (getClipToPadding()) {
            v71.a(this, canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        clipToPaddingBox(canvas);
        super.dispatchDraw(canvas);
    }

    public final gk0 getAppContext() {
        return this.appContext;
    }

    public final xbe getShadowNodeProxy() {
        return this.shadowNodeProxy;
    }

    public boolean getShouldUseAndroidLayout() {
        return this.shouldUseAndroidLayout;
    }

    public final vse getStateWrapper() {
        return this.stateWrapper;
    }

    public final void measureAndLayout() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (getShouldUseAndroidLayout()) {
            post(new m50(this, 4));
        }
    }

    public final void setStateWrapper(vse vseVar) {
        this.stateWrapper = vseVar;
    }
}
