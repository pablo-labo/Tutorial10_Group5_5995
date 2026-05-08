package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pjf extends esf {

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView a;

        public a(TextView textView) {
            this.a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.a;
            textView.setScaleX(fFloatValue);
            textView.setScaleY(fFloatValue);
        }
    }

    @Override // defpackage.esf
    public final void f(usf usfVar) {
        View view = usfVar.b;
        if (view instanceof TextView) {
            usfVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.esf
    public final void i(usf usfVar) {
        View view = usfVar.b;
        if (view instanceof TextView) {
            usfVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.esf
    public final Animator m(ViewGroup viewGroup, usf usfVar, usf usfVar2) {
        if (usfVar == null || usfVar2 == null || !(usfVar.b instanceof TextView)) {
            return null;
        }
        View view = usfVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = usfVar.a;
        HashMap map2 = usfVar2.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
