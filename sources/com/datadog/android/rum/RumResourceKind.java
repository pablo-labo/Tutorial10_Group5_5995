package com.datadog.android.rum;

import defpackage.r6;
import defpackage.zve;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/rum/RumResourceKind;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$dd_sdk_android_rum_release", "()Ljava/lang/String;", "BEACON", "FETCH", "XHR", "DOCUMENT", "NATIVE", "UNKNOWN", "IMAGE", "JS", "FONT", "CSS", "MEDIA", "OTHER", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum RumResourceKind {
    BEACON("beacon"),
    FETCH("fetch"),
    XHR("xhr"),
    DOCUMENT("document"),
    NATIVE("native"),
    UNKNOWN("unknown"),
    IMAGE("image"),
    JS("js"),
    FONT("font"),
    CSS("css"),
    MEDIA("media"),
    OTHER("other");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    RumResourceKind(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: getValue$dd_sdk_android_rum_release, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/datadog/android/rum/RumResourceKind$Companion;", "", "()V", "fromMimeType", "Lcom/datadog/android/rum/RumResourceKind;", "mimeType", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumResourceKind fromMimeType(String mimeType) {
            mimeType.getClass();
            String strP0 = zve.p0(mimeType, '/');
            Locale locale = Locale.US;
            String strF = r6.f(locale, strP0, locale);
            int iR = zve.R(mimeType, '/', 0, false, 6);
            if (iR != -1) {
                mimeType = mimeType.substring(iR + 1, mimeType.length());
            }
            String lowerCase = zve.p0(mimeType, ';').toLowerCase(locale);
            lowerCase.getClass();
            return strF.equals("image") ? RumResourceKind.IMAGE : (strF.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || strF.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) ? RumResourceKind.MEDIA : strF.equals("font") ? RumResourceKind.FONT : (strF.equals("text") && lowerCase.equals("css")) ? RumResourceKind.CSS : (strF.equals("text") && lowerCase.equals("javascript")) ? RumResourceKind.JS : RumResourceKind.NATIVE;
        }

        private Companion() {
        }
    }
}
