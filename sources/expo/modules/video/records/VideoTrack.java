package expo.modules.video.records;

import androidx.media3.common.a;
import defpackage.ftc;
import defpackage.w85;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\t\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010 \u0012\u0004\b#\u0010\u0016\u001a\u0004\b!\u0010\"R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010$\u0012\u0004\b'\u0010\u0016\u001a\u0004\b%\u0010&R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lexpo/modules/video/records/VideoTrack;", "Lftc;", "Ljava/io/Serializable;", "", "id", "Lexpo/modules/video/records/VideoSize;", "size", "mimeType", "", "isSupported", "", "bitrate", "", "frameRate", "Landroidx/media3/common/a;", "format", "<init>", "(Ljava/lang/String;Lexpo/modules/video/records/VideoSize;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Float;Landroidx/media3/common/a;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "Lexpo/modules/video/records/VideoSize;", "getSize", "()Lexpo/modules/video/records/VideoSize;", "getSize$annotations", "getMimeType", "getMimeType$annotations", "Z", "()Z", "isSupported$annotations", "Ljava/lang/Integer;", "getBitrate", "()Ljava/lang/Integer;", "getBitrate$annotations", "Ljava/lang/Float;", "getFrameRate", "()Ljava/lang/Float;", "getFrameRate$annotations", "Landroidx/media3/common/a;", "getFormat", "()Landroidx/media3/common/a;", "setFormat", "(Landroidx/media3/common/a;)V", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoTrack implements ftc, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Integer bitrate;
    private a format;
    private final Float frameRate;
    private final String id;
    private final boolean isSupported;
    private final String mimeType;
    private final VideoSize size;

    /* JADX INFO: renamed from: expo.modules.video.records.VideoTrack$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ VideoTrack(java.lang.String r9, expo.modules.video.records.VideoSize r10, java.lang.String r11, boolean r12, java.lang.Integer r13, java.lang.Float r14, androidx.media3.common.a r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L5
            r12 = 1
        L5:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Ld
            r5 = r0
            goto Le
        Ld:
            r5 = r13
        Le:
            r12 = r16 & 32
            if (r12 == 0) goto L14
            r6 = r0
            goto L15
        L14:
            r6 = r14
        L15:
            r12 = r16 & 64
            if (r12 == 0) goto L1f
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r0 = r8
            goto L24
        L1f:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
        L24:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.video.records.VideoTrack.<init>(java.lang.String, expo.modules.video.records.VideoSize, java.lang.String, boolean, java.lang.Integer, java.lang.Float, androidx.media3.common.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @w85
    public static /* synthetic */ void getBitrate$annotations() {
    }

    @w85
    public static /* synthetic */ void getFrameRate$annotations() {
    }

    @w85
    public static /* synthetic */ void getId$annotations() {
    }

    @w85
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @w85
    public static /* synthetic */ void getSize$annotations() {
    }

    @w85
    public static /* synthetic */ void isSupported$annotations() {
    }

    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final a getFormat() {
        return this.format;
    }

    public final Float getFrameRate() {
        return this.frameRate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final VideoSize getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: isSupported, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    public final void setFormat(a aVar) {
        this.format = aVar;
    }

    public VideoTrack(String str, VideoSize videoSize, String str2, boolean z, Integer num, Float f, a aVar) {
        str.getClass();
        videoSize.getClass();
        this.id = str;
        this.size = videoSize;
        this.mimeType = str2;
        this.isSupported = z;
        this.bitrate = num;
        this.frameRate = f;
        this.format = aVar;
    }
}
