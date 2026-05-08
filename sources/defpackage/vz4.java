package defpackage;

import android.net.Uri;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ vz4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        lx5.b bVar = (lx5.b) obj;
        switch (i) {
            case 0:
                bVar.getClass();
                bVar.a("subTabName", str);
                break;
            default:
                bVar.getClass();
                Uri uri = Uri.parse(str);
                uri.getClass();
                r97.a.getClass();
                bVar.a("sourceUrl", wea.i(r97.j(str), uri));
                break;
        }
        return j6g.a;
    }
}
