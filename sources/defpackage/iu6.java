package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class iu6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ String a;

    public iu6(String str) {
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            ev6.b(fv6.W1, f.a(e.a.b, this.a.concat("_CloseButtonIcon")), null, null, 0L, null, bVar2, 6, 60);
        }
        return j6g.a;
    }
}
