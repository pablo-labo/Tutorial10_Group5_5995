package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.a;
import com.swmansion.rnscreens.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b54 {
    public final y44 a;
    public final float b;
    public a c;

    public static final class a extends BottomSheetBehavior.c {
        public final com.swmansion.rnscreens.a a;
        public final View b;
        public float c;
        public float d;
        public float e;
        public final ValueAnimator f;

        public a(com.swmansion.rnscreens.a aVar, y44 y44Var, float f) {
            y44Var.getClass();
            this.a = aVar;
            this.b = y44Var;
            this.c = c(aVar.getSheetLargestUndimmedDetentIndex());
            float fC = c(nic.C(aVar.getSheetLargestUndimmedDetentIndex() + 1, 0, aVar.getSheetDetents().size() - 1));
            this.d = fC;
            this.e = fC - this.c;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a54
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    View view = this.a.b;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    view.setAlpha(((Float) animatedValue).floatValue());
                }
            });
            this.f = valueAnimatorOfFloat;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
            float f2 = this.c;
            if (f2 >= f || f >= this.d) {
                return;
            }
            this.f.setCurrentFraction((f - f2) / this.e);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
            if (i == 1 || i == 2) {
                com.swmansion.rnscreens.a aVar = this.a;
                this.c = c(aVar.getSheetLargestUndimmedDetentIndex());
                float fC = c(nic.C(aVar.getSheetLargestUndimmedDetentIndex() + 1, 0, aVar.getSheetDetents().size() - 1));
                this.d = fC;
                this.e = fC - this.c;
            }
        }

        public final float c(int i) {
            com.swmansion.rnscreens.a aVar = this.a;
            int size = aVar.getSheetDetents().size();
            if (size == 1) {
                return (i == -1 || i != 0) ? -1.0f : 1.0f;
            }
            if (size == 2) {
                if (i == -1) {
                    return -1.0f;
                }
                if (i != 0) {
                    return i != 1 ? -1.0f : 1.0f;
                }
                return 0.0f;
            }
            if (size != 3 || i == -1) {
                return -1.0f;
            }
            if (i == 0) {
                return 0.0f;
            }
            if (i != 1) {
                return i != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<com.swmansion.rnscreens.a> sheetBehavior = aVar.getSheetBehavior();
            sheetBehavior.getClass();
            return sheetBehavior.A;
        }
    }

    public b54(mkf mkfVar, final com.swmansion.rnscreens.a aVar) {
        mkfVar.getClass();
        y44 y44Var = new y44(mkfVar, this.b);
        y44Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        y44Var.setOnClickListener(new View.OnClickListener() { // from class: z44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar2 = aVar;
                if (aVar2.getSheetClosesOnTouchOutside()) {
                    Fragment fragment = aVar2.getFragment();
                    fragment.getClass();
                    ((e) fragment).J();
                }
            }
        });
        this.a = y44Var;
        this.b = 0.3f;
    }
}
