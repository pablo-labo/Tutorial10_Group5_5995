package defpackage;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class yh8 extends mj8 implements Function2<qpd, v3b, Application> {
    final /* synthetic */ Context $androidContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh8(Context context) {
        super(2);
        this.$androidContext = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Application invoke(qpd qpdVar, v3b v3bVar) {
        qpdVar.getClass();
        v3bVar.getClass();
        return (Application) this.$androidContext;
    }
}
