package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class njb extends mj8 implements gu5<File> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ ojb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njb(Context context, ojb ojbVar) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = ojbVar;
    }

    @Override // defpackage.gu5
    public final File invoke() {
        Context context = this.$applicationContext;
        context.getClass();
        String str = this.this$0.a;
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), wl7.f(wl7.f(".preferences_pb", str), "datastore/"));
    }
}
