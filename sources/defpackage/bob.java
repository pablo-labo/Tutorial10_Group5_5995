package defpackage;

import defpackage.cob;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bob implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ynb.X.f.a(new cob());
            cob.b = cob.b.c;
        } catch (NoClassDefFoundError unused) {
            cob.b = cob.b.a;
            c49.b("cob", "Class 'ProcessLifecycleOwner' not found. The tracker can't track lifecycle events.", new Object[0]);
        }
    }
}
