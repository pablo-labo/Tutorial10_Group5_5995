package defpackage;

import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a3c extends mj8 implements Function1<w.a, j6g> {
    final /* synthetic */ int $paddingPx;
    final /* synthetic */ w $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3c(w wVar, int i) {
        super(1);
        this.$placeable = wVar;
        this.$paddingPx = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(w.a aVar) {
        aVar.r(this.$placeable, 0, -this.$paddingPx, 0.0f);
        return j6g.a;
    }
}
