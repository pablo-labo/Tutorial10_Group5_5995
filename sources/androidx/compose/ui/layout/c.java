package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.mj8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends mj8 implements Function2<w.a, Float, Float> {
    final /* synthetic */ e[] $rulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e[] eVarArr) {
        super(2);
        this.$rulers = eVarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Float invoke(w.a aVar, Float f) {
        return Float.valueOf(a0.a(aVar, true, this.$rulers, f.floatValue()));
    }
}
