package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.core.a;
import com.swmansion.rnscreens.f;
import com.swmansion.rnscreens.g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class ac3 extends Toolbar {
    public final f M0;
    public kf7 N0;
    public boolean O0;
    public boolean P0;
    public final a Q0;

    public static final class a implements Choreographer.FrameCallback {
        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            ac3 ac3Var = ac3.this;
            ac3Var.P0 = false;
            ac3Var.measure(View.MeasureSpec.makeMeasureSpec(ac3Var.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(ac3Var.getHeight(), Integer.MIN_VALUE));
            ac3Var.layout(ac3Var.getLeft(), ac3Var.getTop(), ac3Var.getRight(), ac3Var.getBottom());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac3(Context context, f fVar) {
        super(context, null);
        context.getClass();
        this.M0 = fVar;
        this.N0 = kf7.e;
        this.Q0 = new a();
    }

    private final boolean getShouldApplyTopInset() {
        return this.M0.n0;
    }

    private final boolean getShouldAvoidDisplayCutout() {
        return this.M0.n0;
    }

    public final f getConfig() {
        return this.M0;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        kf7 kf7VarG;
        kf7 kf7VarG2;
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        WindowInsets rootWindowInsets = getRootWindowInsets();
        kf7 kf7VarH = kf7.e;
        if (rootWindowInsets == null) {
            kf7VarG = kf7VarH;
        } else {
            kf7VarG = rzg.h(this, rootWindowInsets).a.g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            kf7VarG.getClass();
        }
        if (rootWindowInsets == null) {
            kf7VarG2 = kf7VarH;
        } else {
            kf7VarG2 = rzg.h(this, rootWindowInsets).a.g(7);
            kf7VarG2.getClass();
        }
        if (rootWindowInsets != null) {
            kf7VarH = rzg.h(this, rootWindowInsets).a.h(7);
            kf7VarH.getClass();
        }
        kf7 kf7VarB = kf7.b(kf7VarG.a + kf7VarG2.a, 0, kf7VarG.c + kf7VarG2.c, 0);
        kf7 kf7VarB2 = kf7.b(0, Math.max(kf7VarG.b, getShouldApplyTopInset() ? kf7VarH.b : 0), 0, Math.max(kf7VarG.d, 0));
        kf7 kf7VarB3 = kf7.b(kf7VarB.a + kf7VarB2.a, kf7VarB.b + kf7VarB2.b, kf7VarB.c + kf7VarB2.c, kf7VarB.d + kf7VarB2.d);
        if (!wl7.b(this.N0, kf7VarB3)) {
            this.N0 = kf7VarB3;
            int i = kf7VarB3.a;
            int i2 = kf7VarB3.b;
            int i3 = kf7VarB3.c;
            int i4 = kf7VarB3.d;
            this.O0 = getShouldAvoidDisplayCutout();
            setPadding(i, i2, i3, i4);
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g next;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = z || this.O0;
        f fVar = this.M0;
        fVar.getClass();
        if (z2) {
            int paddingStart = getNavigationIcon() != null ? getPaddingStart() + getCurrentContentInsetStart() : Math.max(getCurrentContentInsetStart(), getPaddingStart());
            Iterator<g> it = fVar.V.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.getType() == g.a.a) {
                        break;
                    }
                }
            }
            g gVar = next;
            if (gVar != null) {
                paddingStart = gVar.getLeft();
            }
            int paddingEnd = getPaddingEnd() + getCurrentContentInsetEnd();
            int width = getWidth();
            int height = getHeight();
            float fC = nn2.C(width);
            float fC2 = nn2.C(height);
            float fC3 = nn2.C(paddingStart);
            float fC4 = nn2.C(paddingEnd);
            if (Math.abs(fVar.b - fC) >= 0.9f || Math.abs(fVar.c - fC2) >= 0.9f || Math.abs(fVar.d - fC3) >= 0.9f || Math.abs(fVar.e - fC4) >= 0.9f) {
                fVar.b = fC;
                fVar.c = fC2;
                fVar.d = fC3;
                fVar.e = fC4;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("frameWidth", fC);
                writableNativeMap.putDouble("frameHeight", fC2);
                writableNativeMap.putDouble("paddingStart", fC3);
                writableNativeMap.putDouble("paddingEnd", fC4);
                vse vseVar = fVar.a;
                if (vseVar != null) {
                    vseVar.updateState(writableNativeMap);
                }
            }
        }
        this.O0 = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        a aVar;
        Window window;
        WindowManager.LayoutParams attributes;
        super.requestLayout();
        Context context = getContext();
        context.getClass();
        Activity currentActivity = ((mkf) context).a.getCurrentActivity();
        Integer numValueOf = (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        if (Build.VERSION.SDK_INT > 29 || numValueOf == null || numValueOf.intValue() != 32 || this.P0 || (aVar = this.Q0) == null) {
            return;
        }
        this.P0 = true;
        com.facebook.react.modules.core.a aVar2 = com.facebook.react.modules.core.a.f;
        if (aVar2 != null) {
            aVar2.b(a.EnumC0132a.b, aVar);
        } else {
            r6.g("ReactChoreographer needs to be initialized.");
        }
    }
}
