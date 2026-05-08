package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.b;
import com.swmansion.rnscreens.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class br3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ br3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                bVar.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bVar.invalidate(bVar.a);
                break;
            case 1:
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
            default:
                e eVar = (e) obj;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f != null) {
                    eVar.l().setTranslationY(f.floatValue());
                }
                break;
        }
    }
}
