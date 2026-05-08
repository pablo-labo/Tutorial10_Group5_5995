package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class cqh extends ContentObserver {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqh(int i, Handler handler) {
        super(handler);
        this.a = i;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                gqh.e.set(true);
                break;
            default:
                hrh.i.incrementAndGet();
                break;
        }
    }
}
