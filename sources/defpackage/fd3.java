package defpackage;

import android.media.AudioDeviceInfo;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fd3 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((AudioDeviceInfo) obj).getType() == 7;
    }
}
