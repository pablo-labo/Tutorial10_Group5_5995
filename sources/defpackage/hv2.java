package defpackage;

import android.net.Uri;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hv2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ hv2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                break;
            default:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                Uri uri = Uri.parse(str);
                uri.getClass();
                bVar.a("sourceUrl", wea.i(false, uri));
                break;
        }
        return j6g.a;
    }
}
