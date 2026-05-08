package defpackage;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import defpackage.mja;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k3e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k3e(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                huc hucVar = (huc) obj2;
                yeb yebVar = (yeb) obj;
                if (((b0a) obj4).b(yebVar.c, (u2e) obj3)) {
                    yebVar.a();
                    hucVar.element = true;
                }
                break;
            default:
                String str = (String) obj4;
                String str2 = (String) obj3;
                ConsoleMessage consoleMessage = (ConsoleMessage) obj2;
                mja.a aVar = (mja.a) obj;
                aVar.getClass();
                if (str != null) {
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    aVar.a("url", wea.i(true, uri));
                }
                aVar.a("webChromeClientName", str2);
                String strSourceId = consoleMessage.sourceId();
                if (strSourceId == null) {
                    strSourceId = "";
                }
                aVar.a("sourceFileName", strSourceId);
                aVar.b(Long.valueOf(consoleMessage.lineNumber()));
                break;
        }
        return j6g.a;
    }
}
