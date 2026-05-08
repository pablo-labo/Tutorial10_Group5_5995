package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qta extends Animation {
    public final float a;
    public final WeakReference<View> b;
    public final float c;

    public static final class a implements Animation.AnimationListener {
        public final WeakReference<View> a;
        public boolean b;

        public a(View view) {
            this.a = new WeakReference<>(view);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            animation.getClass();
            View view = this.a.get();
            if (view == null || !this.b) {
                return;
            }
            view.setLayerType(0, null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            animation.getClass();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            animation.getClass();
            View view = this.a.get();
            if (view != null && view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public qta(View view, float f, float f2) {
        this.a = f;
        this.b = new WeakReference<>(view);
        this.c = f2 - f;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        transformation.getClass();
        View view = this.b.get();
        if (view != null) {
            view.setAlpha((this.c * f) + this.a);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return false;
    }
}
