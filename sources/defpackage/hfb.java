package defpackage;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hfb extends mj8 implements Function1<MotionEvent, Boolean> {
    final /* synthetic */ pb0 $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfb(ypg ypgVar) {
        super(1);
        this.$view = ypgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        pb0 pb0Var = this.$view;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = pb0Var.dispatchTouchEvent(motionEvent2);
                break;
            default:
                zDispatchTouchEvent = pb0Var.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
