package defpackage;

import androidx.compose.foundation.text.modifiers.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ru implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ ru(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(str);
                break;
            case 1:
                g4aVar.setValue((String) obj);
                break;
            case 2:
                b.a aVar = (b.a) obj;
                g4aVar.setValue(aVar.c ? aVar.b : aVar.a);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                g4aVar.setValue(bool);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                g4aVar.setValue(str2);
                break;
        }
        return j6g.a;
    }
}
