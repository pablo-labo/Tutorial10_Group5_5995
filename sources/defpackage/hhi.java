package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hhi extends x9i {
    public final /* synthetic */ uwh b;
    public final /* synthetic */ mli c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhi(mli mliVar, TaskCompletionSource taskCompletionSource, uwh uwhVar) {
        super(taskCompletionSource);
        this.c = mliVar;
        this.b = uwhVar;
    }

    @Override // defpackage.x9i
    public final void a() {
        mli mliVar = this.c;
        vwh vwhVar = mliVar.m;
        w6i w6iVar = mliVar.b;
        ArrayList<x9i> arrayList = mliVar.d;
        uwh uwhVar = this.b;
        if (vwhVar != null || mliVar.g) {
            if (!mliVar.g) {
                uwhVar.run();
                return;
            } else {
                w6iVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(uwhVar);
                return;
            }
        }
        w6iVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(uwhVar);
        eli eliVar = new eli(mliVar);
        mliVar.l = eliVar;
        mliVar.g = true;
        if (mliVar.a.bindService(mliVar.h, eliVar, 1)) {
            return;
        }
        w6iVar.a("Failed to bind to the service.", new Object[0]);
        mliVar.g = false;
        for (x9i x9iVar : arrayList) {
            zzu zzuVar = new zzu();
            TaskCompletionSource taskCompletionSource = x9iVar.a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzuVar);
            }
        }
        arrayList.clear();
    }
}
