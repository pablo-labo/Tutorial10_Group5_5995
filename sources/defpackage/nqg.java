package defpackage;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nqg extends qv5 implements Function1<ViewParent, ViewParent> {
    public static final nqg a = new nqg(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
