package kotlinx.coroutines.android;

import android.os.Looper;
import defpackage.k89;
import defpackage.l89;
import defpackage.pf6;
import defpackage.r6;
import defpackage.rf6;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Ll89;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidDispatcherFactory implements l89 {
    @Override // defpackage.l89
    public final k89 a(List<? extends l89> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new pf6(rf6.a(mainLooper));
        }
        r6.g("The main looper is not available");
        return null;
    }

    @Override // defpackage.l89
    public final int b() {
        return 1073741823;
    }
}
