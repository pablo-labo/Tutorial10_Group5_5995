package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class ne6 implements VideoEncoderFactory {
    public final HardwareVideoEncoderFactory a;
    public final r7i b = new r7i();

    public ne6(EglBase.Context context) {
        this.a = new HardwareVideoEncoderFactory(context, false, true);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return videoCodecInfo.name.equalsIgnoreCase("H264") ? this.a.createEncoder(videoCodecInfo) : this.b.createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        String str;
        ArrayList arrayList = new ArrayList();
        VideoCodecInfo videoCodecInfo = null;
        VideoCodecInfo videoCodecInfo2 = null;
        for (VideoCodecInfo videoCodecInfo3 : this.a.getSupportedCodecs()) {
            if (videoCodecInfo3.name.equalsIgnoreCase("H264") && (str = videoCodecInfo3.params.get("profile-level-id")) != null) {
                if (str.equalsIgnoreCase("640c1f")) {
                    videoCodecInfo = videoCodecInfo3;
                } else if (str.equalsIgnoreCase("42e01f")) {
                    videoCodecInfo2 = videoCodecInfo3;
                }
            }
        }
        if (videoCodecInfo != null) {
            arrayList.add(videoCodecInfo);
        }
        if (videoCodecInfo2 != null) {
            arrayList.add(videoCodecInfo2);
        }
        arrayList.addAll(Arrays.asList(this.b.getSupportedCodecs()));
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
