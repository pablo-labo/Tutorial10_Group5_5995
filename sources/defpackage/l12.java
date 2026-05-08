package defpackage;

import android.net.Uri;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l12 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ l12(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                o5e.i(s5eVar, 0);
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                if (str == null) {
                    str = "";
                }
                Uri uri = Uri.parse(str);
                uri.getClass();
                bVar.a("sourceUrl", wea.i(false, uri));
                break;
            default:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.f(s5eVar2, str);
                break;
        }
        return j6g.a;
    }
}
