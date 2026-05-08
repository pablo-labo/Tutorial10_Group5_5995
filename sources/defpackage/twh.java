package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class twh extends cn6 {
    public final fsh a;
    public final TaskCompletionSource b;
    public final /* synthetic */ o0i c;

    public twh(o0i o0iVar, TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(o0iVar);
        this.c = o0iVar;
        attachInterface(this, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        this.a = new fsh("OnCheckAgeSignalsCallback");
        this.b = taskCompletionSource;
    }
}
