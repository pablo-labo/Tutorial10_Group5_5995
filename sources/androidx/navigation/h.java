package androidx.navigation;

import android.os.Bundle;
import defpackage.huc;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.zr4;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends mj8 implements Function1<d, j6g> {
    final /* synthetic */ Bundle $finalArgs;
    final /* synthetic */ huc $navigated;
    final /* synthetic */ k $node;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(huc hucVar, e eVar, k kVar, Bundle bundle) {
        super(1);
        this.$navigated = hucVar;
        this.this$0 = eVar;
        this.$node = kVar;
        this.$finalArgs = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(d dVar) {
        d dVar2 = dVar;
        dVar2.getClass();
        this.$navigated.element = true;
        this.this$0.a(this.$node, this.$finalArgs, dVar2, zr4.a);
        return j6g.a;
    }
}
