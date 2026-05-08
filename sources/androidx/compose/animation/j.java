package androidx.compose.animation;

import androidx.compose.ui.layout.w;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends mj8 implements Function1<w.a, j6g> {
    final /* synthetic */ w $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w wVar) {
        super(1);
        this.$placeable = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(w.a aVar) {
        aVar.r(this.$placeable, 0, 0, 0.0f);
        return j6g.a;
    }
}
