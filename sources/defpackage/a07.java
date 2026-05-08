package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class a07 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ String a;
    public final /* synthetic */ pnf b;
    public final /* synthetic */ float c;
    public final /* synthetic */ String d;

    public a07(String str, pnf pnfVar, float f, String str2) {
        this.a = str;
        this.b = pnfVar;
        this.c = f;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            b07.a(this.a, this.b, this.c, null, this.d.concat("_Tooltip"), bVar2, 0);
        }
        return j6g.a;
    }
}
