package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import defpackage.esa;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static int a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class a {
        public final Animation a;
        public final Animator b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
        }

        public a(Animator animator) {
            this.a = null;
            this.b = animator;
        }
    }

    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup a;
        public final View b;
        public boolean c;
        public boolean d;
        public boolean e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.e = true;
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.c = true;
                esa.a(this.a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.c;
            ViewGroup viewGroup = this.a;
            if (z || !this.e) {
                viewGroup.endViewTransition(this.b);
                this.d = true;
            } else {
                this.e = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.c = true;
                esa.a(this.a, this);
            }
            return true;
        }
    }
}
