package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bhb extends Animation implements xl8 {
    public int V;
    public int W;
    public int X;
    public final WeakReference<View> a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;

    public bhb(View view, int i, int i2, int i3, int i4) {
        this.a = new WeakReference<>(view);
        d(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        transformation.getClass();
        View view = this.a.get();
        if (view != null) {
            float f2 = (this.d * f) + this.b;
            float f3 = (this.e * f) + this.c;
            view.layout(Math.round(f2), Math.round(f3), Math.round(f2 + (this.W * f) + this.f), Math.round(f3 + (this.X * f) + this.V));
        }
    }

    @Override // defpackage.xl8
    public final void c(int i, int i2, int i3, int i4) {
        d(i, i2, i3, i4);
    }

    public final void d(int i, int i2, int i3, int i4) {
        View view = this.a.get();
        if (view != null) {
            this.b = view.getX() - view.getTranslationX();
            this.c = view.getY() - view.getTranslationY();
            this.f = view.getWidth();
            int height = view.getHeight();
            this.V = height;
            this.d = i - this.b;
            this.e = i2 - this.c;
            this.W = i3 - this.f;
            this.X = i4 - height;
        }
    }

    @Override // defpackage.xl8
    public final boolean isValid() {
        return this.a.get() != null;
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
