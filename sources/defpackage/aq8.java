package defpackage;

import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aq8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ aq8(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        w wVar = this.b;
        w.a aVar = (w.a) obj;
        switch (i) {
            case 0:
                aVar.r(wVar, 0, 0, 0.0f);
                break;
            default:
                aVar.r(wVar, 0, 0, 0.0f);
                break;
        }
        return j6g.a;
    }
}
