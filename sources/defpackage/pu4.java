package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pu4 extends mj8 implements Function1<iu4, Float> {
    final /* synthetic */ lv4 $enter;
    final /* synthetic */ r25 $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu4(lv4 lv4Var, r25 r25Var) {
        super(1);
        this.$enter = lv4Var;
        this.$exit = r25Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(iu4 iu4Var) {
        int iOrdinal = iu4Var.ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            vmd vmdVar = this.$enter.a().d;
            if (vmdVar != null) {
                f = vmdVar.a;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                l.g();
                return null;
            }
            vmd vmdVar2 = this.$exit.a().d;
            if (vmdVar2 != null) {
                f = vmdVar2.a;
            }
        }
        return Float.valueOf(f);
    }
}
