package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qdb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qdb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rdb rdbVar = (rdb) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = rdbVar.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = rdbVar.c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = rdbVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                break;
            case 1:
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                ((Window) obj).setStatusBarColor(((Integer) animatedValue).intValue());
                break;
            default:
                valueAnimator.getClass();
                Window window = ((Activity) obj).getWindow();
                if (window != null) {
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    animatedValue2.getClass();
                    window.setStatusBarColor(((Integer) animatedValue2).intValue());
                }
                break;
        }
    }
}
