package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd1 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ gd1(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                if (g4aVar != null) {
                    return (List) g4aVar.getValue();
                }
                return null;
            case 1:
                g4aVar.setValue("");
                return j6g.a;
            case 2:
                g4aVar.setValue(Boolean.TRUE);
                return j6g.a;
            case 3:
                g4aVar.setValue(Boolean.FALSE);
                return j6g.a;
            case 4:
                return new qn8((Function1) g4aVar.getValue());
            case 5:
                return (c) ((gu5) g4aVar.getValue()).invoke();
            case 6:
                return new yr8((Function1) g4aVar.getValue());
            default:
                g4aVar.setValue(Boolean.valueOf(!((Boolean) g4aVar.getValue()).booleanValue()));
                return j6g.a;
        }
    }
}
