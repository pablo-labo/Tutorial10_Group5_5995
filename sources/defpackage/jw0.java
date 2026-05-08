package defpackage;

import android.net.Uri;
import defpackage.et7;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jw0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ jw0(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.h(4, "messagingAttachmentBanner", "attachmentSelect", new a3(uw0.b, 15)));
                    function1.invoke(uri);
                }
                return j6g.a;
            case 1:
                function1.invoke((k38) obj);
                return j6g.a;
            case 2:
                wle wleVar = (wle) function1.invoke((zle) obj);
                synchronized (ame.c) {
                    ame.d = ame.d.g(wleVar.g());
                    j6g j6gVar = j6g.a;
                }
                return wleVar;
            default:
                et7 et7Var = (et7) obj;
                et7Var.getClass();
                if (et7Var instanceof et7.b) {
                    int iOrdinal = ((et7.b) et7Var).a.ordinal();
                    str = iOrdinal != 1 ? iOrdinal != 2 ? "cancel" : "grant" : "deny";
                } else {
                    str = "error";
                }
                ((tp7) cr8.p(tp7.class)).b(new sp7.b("system-authorization-alert", str, null, null, 12));
                function1.invoke(et7Var);
                return j6g.a;
        }
    }
}
