package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ru4 extends mj8 implements Function1<iu4, mrf> {
    final /* synthetic */ lv4 $enter;
    final /* synthetic */ r25 $exit;
    final /* synthetic */ mrf $transformOriginWhenVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru4(mrf mrfVar, lv4 lv4Var, r25 r25Var) {
        super(1);
        this.$transformOriginWhenVisible = mrfVar;
        this.$enter = lv4Var;
        this.$exit = r25Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final mrf invoke(iu4 iu4Var) {
        int iOrdinal = iu4Var.ordinal();
        mrf mrfVar = null;
        if (iOrdinal == 0) {
            vmd vmdVar = this.$enter.a().d;
            if (vmdVar != null) {
                mrfVar = new mrf(vmdVar.b);
            } else {
                vmd vmdVar2 = this.$exit.a().d;
                if (vmdVar2 != null) {
                    mrfVar = new mrf(vmdVar2.b);
                }
            }
        } else if (iOrdinal == 1) {
            mrfVar = this.$transformOriginWhenVisible;
        } else {
            if (iOrdinal != 2) {
                l.g();
                return null;
            }
            vmd vmdVar3 = this.$exit.a().d;
            if (vmdVar3 != null) {
                mrfVar = new mrf(vmdVar3.b);
            } else {
                vmd vmdVar4 = this.$enter.a().d;
                if (vmdVar4 != null) {
                    mrfVar = new mrf(vmdVar4.b);
                }
            }
        }
        return new mrf(mrfVar != null ? mrfVar.a : mrf.b);
    }
}
