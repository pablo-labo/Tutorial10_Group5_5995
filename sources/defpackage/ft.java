package defpackage;

import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ft implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ ft(iba ibaVar, g4a g4aVar, int i) {
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
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                ibaVar.r();
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                ibaVar.p("TIME_PERIOD");
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                g4aVar.setValue(str3);
                ibaVar.p("LANGUAGE_EDIT_HOME");
                break;
            default:
                Locale locale = (Locale) obj;
                locale.getClass();
                g4aVar.setValue(locale);
                ibaVar.r();
                break;
        }
        return j6g.a;
    }
}
