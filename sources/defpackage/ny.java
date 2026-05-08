package defpackage;

import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ny implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ ny(iba ibaVar, g4a g4aVar, int i) {
        this.a = i;
        this.b = ibaVar;
        this.c = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.c;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                Locale locale = (Locale) obj;
                locale.getClass();
                g4aVar.setValue(locale);
                ibaVar.r();
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                ibaVar.p("JOB_TITLE_AUTOCOMPLETE");
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                ibaVar.p("LOCATION_AUTOCOMPLETE");
                break;
        }
        return j6g.a;
    }
}
