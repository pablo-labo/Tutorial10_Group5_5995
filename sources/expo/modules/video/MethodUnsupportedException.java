package expo.modules.video;

import defpackage.l5;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/video/MethodUnsupportedException;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MethodUnsupportedException extends CodedException {
    public MethodUnsupportedException(String str) {
        super(l5.m("Method `", str, "` is not supported on Android"), null);
    }
}
