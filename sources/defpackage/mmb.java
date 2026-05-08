package defpackage;

import androidx.compose.runtime.b;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mmb implements Function2<b, Integer, j6g> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object[] c;

    public mmb(String str, String str2, Object[] objArr) {
        this.a = str;
        this.b = str2;
        this.c = objArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) throws Exception {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object[] objArr = this.c;
            wg2.M(this.a, this.b, bVar2, Arrays.copyOf(objArr, objArr.length));
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
