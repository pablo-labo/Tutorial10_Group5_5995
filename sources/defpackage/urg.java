package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class urg implements Function1<Throwable, j6g> {
    public final /* synthetic */ wrg<View> a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ vrg c;

    public urg(wrg<View> wrgVar, ViewTreeObserver viewTreeObserver, vrg vrgVar) {
        this.a = wrgVar;
        this.b = viewTreeObserver;
        this.c = vrgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        this.a.s(this.b, this.c);
        return j6g.a;
    }
}
