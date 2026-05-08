package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iy6 implements wu5<List<? extends o6f>, b, Integer, j6g> {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ g4a<j94> d;

    public iy6(int i, String str, long j, g4a<j94> g4aVar) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = g4aVar;
    }

    @Override // defpackage.wu5
    public final j6g q(List<? extends o6f> list, b bVar, Integer num) {
        List<? extends o6f> list2 = list;
        b bVar2 = bVar;
        num.intValue();
        list2.getClass();
        int i = this.a;
        if (i >= 0 && i < list2.size()) {
            ky6.a(this.c, g.r(c.a(e.a.b, tf7.a, new s6f(list2.get(i))), this.d.getValue().a), 0.0f, this.b + "_Indicator_" + i, bVar2, 0);
        }
        return j6g.a;
    }
}
