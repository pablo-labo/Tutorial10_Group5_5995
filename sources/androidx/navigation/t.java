package androidx.navigation;

import androidx.navigation.s;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends mj8 implements Function1<d, d> {
    final /* synthetic */ p $navOptions;
    final /* synthetic */ s.a $navigatorExtras = null;
    final /* synthetic */ s<k> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, p pVar) {
        super(1);
        this.this$0 = sVar;
        this.$navOptions = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final d invoke(d dVar) {
        k kVarC;
        d dVar2 = dVar;
        dVar2.getClass();
        k kVar = dVar2.b;
        if (kVar == null) {
            kVar = null;
        }
        if (kVar == null || (kVarC = this.this$0.c(kVar, dVar2.a(), this.$navOptions, this.$navigatorExtras)) == null) {
            return null;
        }
        return kVarC.equals(kVar) ? dVar2 : this.this$0.b().a(kVarC, kVarC.b(dVar2.a()));
    }
}
