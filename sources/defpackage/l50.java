package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class l50 extends mj8 implements gu5<Boolean> {
    final /* synthetic */ MotionEvent $event;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l50(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
        this.$event = motionEvent;
    }

    @Override // defpackage.gu5
    public final Boolean invoke() {
        return Boolean.valueOf(AndroidComposeView.E(this.$event, this.this$0));
    }
}
