package androidx.compose.material3.internal;

import defpackage.pu2;
import defpackage.uh3;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {713}, m = "restartable")
public final class b<I> extends pu2 {
    int label;
    /* synthetic */ Object result;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, this);
    }
}
