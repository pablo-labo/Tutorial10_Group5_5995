package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1092}, m = "awaitDragOrCancellation-rnUCldI")
public final class y94 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return da4.b(null, 0L, this);
    }
}
