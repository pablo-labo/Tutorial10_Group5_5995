package defpackage;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l4e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ l4e(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return (ooa) this.b.invoke();
            default:
                ((Context) obj).getClass();
                return (WebView) this.b.invoke();
        }
    }
}
