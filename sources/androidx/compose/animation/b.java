package androidx.compose.animation;

import androidx.compose.ui.layout.w;
import defpackage.cme;
import defpackage.it2;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends mj8 implements Function1<w.a, j6g> {
    final /* synthetic */ w $placeable;
    final /* synthetic */ it2 $specOnEnter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, it2 it2Var) {
        super(1);
        this.$placeable = wVar;
        this.$specOnEnter = it2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(w.a aVar) {
        aVar.r(this.$placeable, 0, 0, ((cme) this.$specOnEnter.c).g());
        return j6g.a;
    }
}
