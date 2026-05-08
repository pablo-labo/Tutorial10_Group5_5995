package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {352, 366}, m = "waitForUpOrCancellation")
public final class s8f extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i8f.i(null, null, this);
    }
}
