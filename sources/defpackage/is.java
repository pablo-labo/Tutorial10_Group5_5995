package defpackage;

import android.net.Uri;
import defpackage.sp7;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class is implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ is(Function1 function1, g4a g4aVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (wve.E(((Locale) g4aVar.getValue()).getCountry(), "US", true)) {
                    function1.invoke(str);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.h(4, "messagingAttachmentBanner", "attachmentSelect", new a3(uw0.c, 15)));
                    Uri uri = (Uri) g4aVar.getValue();
                    uri.getClass();
                    function1.invoke(uri);
                }
                break;
        }
        return j6g.a;
    }
}
