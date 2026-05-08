package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class px2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ px2(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                w1f w1fVar = (w1f) obj;
                w1fVar.getClass();
                int iOrdinal = w1fVar.ordinal();
                boolean z = true;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        z = false;
                    }
                } else if (!((Boolean) g4aVar.getValue()).booleanValue()) {
                    ArrayList arrayList = lz2.a;
                    Log.d("ConversationListItem", "Swiped to dismiss conversation: " + w1fVar, null);
                    g4aVar.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                g4aVar.setValue(bool);
                break;
            case 2:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                g4aVar.setValue(jhfVar);
                break;
            case 3:
                lcf lcfVar = (lcf) obj;
                lcfVar.getClass();
                g4aVar.setValue(lcfVar);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                g4aVar.setValue(((Set) g4aVar.getValue()).contains(str) ? bbe.m((Set) g4aVar.getValue(), str) : bbe.p((Set) g4aVar.getValue(), str));
                break;
        }
        return j6g.a;
    }
}
