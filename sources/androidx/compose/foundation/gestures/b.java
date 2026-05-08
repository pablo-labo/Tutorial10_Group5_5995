package androidx.compose.foundation.gestures;

import defpackage.pu2;
import defpackage.uh3;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1051}, m = "semanticsScrollBy-d-4ec7I")
public final class b extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, 0L, this);
    }
}
