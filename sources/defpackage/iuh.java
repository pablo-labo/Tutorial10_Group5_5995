package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.playcore_age_signals.zzp;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.agesignals.AgeSignalsException;

/* JADX INFO: loaded from: classes2.dex */
public final class iuh extends tuh {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ wab c;
    public final /* synthetic */ o0i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuh(o0i o0iVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, wab wabVar) {
        super(taskCompletionSource);
        this.b = taskCompletionSource2;
        this.c = wabVar;
        this.d = o0iVar;
    }

    @Override // defpackage.tuh
    public final void a(Exception exc) {
        if (exc instanceof zzp) {
            super.a(new AgeSignalsException(-5));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.tuh
    public final void b() {
        TaskCompletionSource taskCompletionSource = this.b;
        try {
            o0i o0iVar = this.d;
            bn6 bn6Var = o0iVar.b.m;
            String packageName = o0iVar.a.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 1);
            bn6Var.w(packageName, bundle, new twh(o0iVar, taskCompletionSource));
        } catch (RemoteException e) {
            fsh fshVar = o0i.c;
            Object[] objArr = {this.c};
            fshVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", fsh.c(fshVar.a, "checkAgeSignals(%s)", objArr), e);
            }
            taskCompletionSource.trySetException(new AgeSignalsException(-100));
        }
    }
}
