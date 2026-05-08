package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.kv8;
import defpackage.ml0;
import defpackage.nd7;
import defpackage.r6;
import defpackage.rv8;
import defpackage.ynb;
import defpackage.znb;
import defpackage.zr4;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lnd7;", "Lzv8;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements nd7<zv8> {
    @Override // defpackage.nd7
    public final zv8 create(Context context) {
        context.getClass();
        ml0 ml0VarC = ml0.c(context);
        ml0VarC.getClass();
        if (!ml0VarC.b.contains(ProcessLifecycleInitializer.class)) {
            r6.g("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!rv8.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new rv8.a());
        }
        ynb ynbVar = ynb.X;
        ynbVar.getClass();
        ynbVar.e = new Handler();
        ynbVar.f.f(kv8.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new znb(ynbVar));
        return ynbVar;
    }

    @Override // defpackage.nd7
    public final List<Class<? extends nd7<?>>> dependencies() {
        return zr4.a;
    }
}
