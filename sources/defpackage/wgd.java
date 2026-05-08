package defpackage;

import androidx.navigation.r;
import defpackage.qgd;

/* JADX INFO: loaded from: classes.dex */
public final class wgd extends mj8 implements wu5<Integer, String, r<Object>, j6g> {
    final /* synthetic */ qgd<Object> $builder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgd(qgd<Object> qgdVar) {
        super(3);
        this.$builder = qgdVar;
    }

    @Override // defpackage.wu5
    public final j6g q(Integer num, String str, r<Object> rVar) {
        int iIntValue = num.intValue();
        String str2 = str;
        r<Object> rVar2 = rVar;
        str2.getClass();
        rVar2.getClass();
        qgd<Object> qgdVar = this.$builder;
        qgdVar.getClass();
        int iOrdinal = (((rVar2 instanceof o92) || qgdVar.a.getDescriptor().j(iIntValue)) ? qgd.a.b : qgd.a.a).ordinal();
        if (iOrdinal == 0) {
            qgdVar.c += '/' + ja.f('}', "{", str2);
        } else if (iOrdinal == 1) {
            qgdVar.a(str2, "{" + str2 + '}');
        }
        return j6g.a;
    }
}
