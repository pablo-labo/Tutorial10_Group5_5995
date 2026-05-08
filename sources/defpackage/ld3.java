package defpackage;

import android.media.AudioDeviceInfo;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ld3 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        return audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4;
    }
}
