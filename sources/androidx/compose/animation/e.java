package androidx.compose.animation;

import defpackage.iu4;
import defpackage.mj8;
import defpackage.r25;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e extends mj8 implements Function2<iu4, iu4, Boolean> {
    final /* synthetic */ r25 $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r25 r25Var) {
        super(2);
        this.$exit = r25Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(iu4 iu4Var, iu4 iu4Var2) {
        iu4 iu4Var3 = iu4Var;
        iu4 iu4Var4 = iu4Var2;
        iu4 iu4Var5 = iu4.c;
        return Boolean.valueOf(iu4Var3 == iu4Var5 && iu4Var4 == iu4Var5 && !this.$exit.a().e);
    }
}
