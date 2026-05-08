package defpackage;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gfb extends mj8 implements Function1<MotionEvent, j6g> {
    final /* synthetic */ ffb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfb(ffb ffbVar) {
        super(1);
        this.this$0 = ffbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        hfb hfbVar = this.this$0.b;
        if (hfbVar != null) {
            hfbVar.invoke(motionEvent2);
            return j6g.a;
        }
        wl7.g("onTouchEvent");
        throw null;
    }
}
