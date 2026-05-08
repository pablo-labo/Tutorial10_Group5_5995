package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.mj8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends mj8 implements Function2<w.a, Float, Float> {
    final /* synthetic */ i0[] $rulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0[] i0VarArr) {
        super(2);
        this.$rulers = i0VarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Float invoke(w.a aVar, Float f) {
        return Float.valueOf(a0.a(aVar, false, this.$rulers, f.floatValue()));
    }
}
