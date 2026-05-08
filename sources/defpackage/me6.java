package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class me6 implements VideoDecoderFactory {
    public final HardwareVideoDecoderFactory a;
    public final okc b = new okc();

    public me6(EglBase.Context context) {
        this.a = new HardwareVideoDecoderFactory(context);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return videoCodecInfo.name.equalsIgnoreCase("H264") ? this.a.createDecoder(videoCodecInfo) : this.b.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
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
