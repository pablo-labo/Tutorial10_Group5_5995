package defpackage;

import com.google.android.material.datepicker.a;

/* JADX INFO: loaded from: classes2.dex */
public final class gg3 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ a b;

    public gg3(a aVar, long j) {
        this.b = aVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.b;
        aVar.a.setError(String.format(aVar.d, ng3.a(this.a)));
        aVar.a();
    }
}
