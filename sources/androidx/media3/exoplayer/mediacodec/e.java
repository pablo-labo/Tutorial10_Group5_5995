package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.common.a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import defpackage.bg;
import defpackage.e47;
import defpackage.qyc;
import defpackage.st9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static Boolean a;

    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            boolean z;
            int i3;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    z = true;
                    if (i4 >= supportedPerformancePoints.size()) {
                        i3 = 1;
                        break;
                    }
                    if (bg.b(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                        i3 = 2;
                        break;
                    }
                    i4++;
                }
                if (i3 == 1 && e.a == null) {
                    if (Build.VERSION.SDK_INT < 35) {
                        int iB = b(false);
                        int iB2 = b(true);
                        if (iB != 0 && (iB2 != 0 ? !(iB != 2 || iB2 != 2) : iB == 2)) {
                        }
                        e.a = Boolean.valueOf(z);
                        if (!z) {
                        }
                    }
                    z = false;
                    e.a = Boolean.valueOf(z);
                    if (!z) {
                    }
                }
                return i3;
            }
            return 0;
        }

        public static int b(boolean z) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                a.C0036a c0036a = new a.C0036a();
                c0036a.m = st9.p("video/avc");
                androidx.media3.common.a aVar = new androidx.media3.common.a(c0036a);
                String str = aVar.n;
                if (str != null) {
                    List<d> listD = MediaCodecUtil.d(str, z, false);
                    String strB = MediaCodecUtil.b(aVar);
                    Iterable iterableD = strB == null ? qyc.e : MediaCodecUtil.d(strB, z, false);
                    e47.a aVar2 = new e47.a();
                    aVar2.d(listD);
                    aVar2.d(iterableD);
                    qyc qycVarF = aVar2.f();
                    for (int i = 0; i < qycVarF.d; i++) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = ((d) qycVarF.get(i)).d.getVideoCapabilities();
                        if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                            for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                                if (bg.b(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }
    }
}
