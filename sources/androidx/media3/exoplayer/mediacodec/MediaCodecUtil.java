package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.akb;
import defpackage.d92;
import defpackage.e47;
import defpackage.ja;
import defpackage.jh2;
import defpackage.qg9;
import defpackage.qyc;
import defpackage.st9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {
    public static final HashMap<a, List<d>> a = new HashMap<>();

    public static class DecoderQueryException extends Exception {
    }

    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((akb.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
        }
    }

    public static final class b {
        public final int a;
        public MediaCodecInfo[] b;

        public b(boolean z, boolean z2, boolean z3) {
            this.a = (z || z2 || z3) ? 1 : 0;
        }
    }

    public interface c<T> {
        int d(T t);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new qg9(new ja(14)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((d) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((d) arrayList.remove(0));
    }

    public static String b(androidx.media3.common.a aVar) {
        Pair<Integer, Integer> pairB;
        String str = aVar.n;
        String str2 = aVar.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = d92.b(aVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List<d> d(String str, boolean z, boolean z2) {
        try {
            a aVar = new a(str, z, z2);
            HashMap<a, List<d>> map = a;
            List<d> list = map.get(aVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListE = e(aVar, new b(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListE.isEmpty();
            }
            a(str, arrayListE);
            e47 e47VarJ = e47.j(arrayListE);
            map.put(aVar, e47VarJ);
            return e47VarJ;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(androidx.media3.exoplayer.mediacodec.MediaCodecUtil.a r19, androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b r20) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.e(androidx.media3.exoplayer.mediacodec.MediaCodecUtil$a, androidx.media3.exoplayer.mediacodec.MediaCodecUtil$b):java.util.ArrayList");
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static qyc f(f fVar, androidx.media3.common.a aVar, boolean z, boolean z2) {
        List<d> listC = fVar.c(aVar.n, z, z2);
        String strB = b(aVar);
        List<d> listC2 = strB == null ? qyc.e : fVar.c(strB, z, z2);
        e47.a aVar2 = new e47.a();
        aVar2.d(listC);
        aVar2.d(listC2);
        return aVar2.f();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (st9.k(str)) {
            return true;
        }
        String strI = jh2.I(mediaCodecInfo.getName());
        if (strI.startsWith("arc.")) {
            return false;
        }
        if (strI.startsWith("omx.google.") || strI.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strI.startsWith("omx.sec.") && strI.contains(".sw.")) || strI.equals("omx.qcom.video.decoder.hevcswvdec") || strI.startsWith("c2.android.") || strI.startsWith("c2.google.")) {
            return true;
        }
        return (strI.startsWith("omx.") || strI.startsWith("c2.")) ? false : true;
    }
}
