package defpackage;

import androidx.navigation.r;
import defpackage.qgd;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xgd extends mj8 implements wu5<Integer, String, r<Object>, j6g> {
    final /* synthetic */ Map<String, List<String>> $argMap;
    final /* synthetic */ qgd<Object> $builder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xgd(Map<String, ? extends List<String>> map, qgd<Object> qgdVar) {
        super(3);
        this.$argMap = map;
        this.$builder = qgdVar;
    }

    @Override // defpackage.wu5
    public final j6g q(Integer num, String str, r<Object> rVar) {
        int iIntValue = num.intValue();
        String str2 = str;
        r<Object> rVar2 = rVar;
        str2.getClass();
        rVar2.getClass();
        List<String> list = this.$argMap.get(str2);
        list.getClass();
        List<String> list2 = list;
        qgd<Object> qgdVar = this.$builder;
        qgdVar.getClass();
        int iOrdinal = (((rVar2 instanceof o92) || qgdVar.a.getDescriptor().j(iIntValue)) ? qgd.a.b : qgd.a.a).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    qgdVar.a(str2, (String) it.next());
                }
            }
        } else {
            if (list2.size() != 1) {
                StringBuilder sbM = akb.m("Expected one value for argument ", str2, ", found ");
                sbM.append(list2.size());
                sbM.append("values instead.");
                throw new IllegalArgumentException(sbM.toString().toString());
            }
            qgdVar.c += '/' + ((String) z92.O0(list2));
        }
        return j6g.a;
    }
}
