package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.d92;
import defpackage.dk3;
import defpackage.ha2;
import defpackage.st9;
import defpackage.vjg;
import defpackage.w40;
import defpackage.zkd;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public d(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = st9.o(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(vjg.f(i, widthAlignment) * widthAlignment, vjg.f(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.exoplayer.mediacodec.d i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17) {
        /*
            androidx.media3.exoplayer.mediacodec.d r0 = new androidx.media3.exoplayer.mediacodec.d
            java.lang.String r1 = "adaptive-playback"
            boolean r8 = r14.isFeatureSupported(r1)
            java.lang.String r1 = "tunneled-playback"
            r14.isFeatureSupported(r1)
            java.lang.String r1 = "secure-playback"
            boolean r9 = r14.isFeatureSupported(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L58
            java.lang.String r1 = "detached-surface"
            boolean r1 = r14.isFeatureSupported(r1)
            if (r1 == 0) goto L58
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "OPPO"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "realme"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "motorola"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L58
            java.lang.String r2 = "LENOVO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4c
            goto L58
        L4c:
            r1 = 1
        L4d:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r1
            r1 = r11
            goto L5a
        L58:
            r1 = 0
            goto L4d
        L5a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.d.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):androidx.media3.exoplayer.mediacodec.d");
    }

    public final dk3 b(androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        androidx.media3.common.a aVar3;
        androidx.media3.common.a aVar4;
        int i;
        String str = aVar.n;
        ha2 ha2Var = aVar.D;
        String str2 = aVar2.n;
        ha2 ha2Var2 = aVar2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (aVar.z != aVar2.z) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            boolean z = (aVar.u == aVar2.u && aVar.v == aVar2.v) ? false : true;
            if (!this.e && z) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            if ((!ha2.e(ha2Var) || !ha2.e(ha2Var2)) && !Objects.equals(ha2Var, ha2Var2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !aVar.b(aVar2)) {
                i2 |= 2;
            }
            int i3 = aVar.w;
            if (i3 != -1 && (i = aVar.x) != -1 && i3 == aVar2.w && i == aVar2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new dk3(this.a, aVar, aVar2, aVar.b(aVar2) ? 3 : 2, 0);
            }
            aVar3 = aVar;
            aVar4 = aVar2;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            if (aVar3.F != aVar4.F) {
                i2 |= 4096;
            }
            if (aVar3.G != aVar4.G) {
                i2 |= 8192;
            }
            if (aVar3.H != aVar4.H) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                HashMap<MediaCodecUtil.a, List<d>> map = MediaCodecUtil.a;
                Pair<Integer, Integer> pairB = d92.b(aVar3);
                Pair<Integer, Integer> pairB2 = d92.b(aVar4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new dk3(this.a, aVar3, aVar4, 3, 0);
                    }
                }
            }
            if (!aVar3.b(aVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new dk3(this.a, aVar3, aVar4, 1, 0);
            }
        }
        return new dk3(this.a, aVar3, aVar4, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[PHI: r2
  0x00c3: PHI (r2v2 android.util.Pair<java.lang.Integer, java.lang.Integer>) = 
  (r2v1 android.util.Pair<java.lang.Integer, java.lang.Integer>)
  (r2v1 android.util.Pair<java.lang.Integer, java.lang.Integer>)
  (r2v1 android.util.Pair<java.lang.Integer, java.lang.Integer>)
  (r2v14 android.util.Pair<java.lang.Integer, java.lang.Integer>)
 binds: [B:3:0x0010, B:5:0x0018, B:10:0x002c, B:37:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(androidx.media3.common.a r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.d.c(androidx.media3.common.a, boolean):boolean");
    }

    public final boolean d(androidx.media3.common.a aVar) {
        return (Objects.equals(aVar.n, "audio/flac") && aVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(androidx.media3.common.a aVar) {
        int i;
        String str = aVar.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(MediaCodecUtil.b(aVar))) || !c(aVar, true) || !d(aVar)) {
            return false;
        }
        if (this.i) {
            int i2 = aVar.u;
            if (i2 > 0 && (i = aVar.v) > 0) {
                return g(i2, i, aVar.y);
            }
        } else {
            int i3 = aVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = aVar.F;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder sbH = w40.h(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    sbH.append(i5);
                    sbH.append("]");
                    zkd.T("MediaCodecInfo", sbH.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(androidx.media3.common.a aVar) {
        if (this.i) {
            return this.e;
        }
        HashMap<MediaCodecUtil.a, List<d>> map = MediaCodecUtil.a;
        Pair<Integer, Integer> pairB = d92.b(aVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r9, int r10, double r11) {
        /*
            r8 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r8.d
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            r1 = 0
            if (r0 != 0) goto Lf
            java.lang.String r9 = "sizeAndRate.vCaps"
            r8.h(r9)
            return r1
        Lf:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            java.lang.String r4 = "@"
            java.lang.String r5 = "x"
            r6 = 1
            if (r2 < r3) goto L45
            if (r2 < r3) goto L2c
            java.lang.Boolean r2 = androidx.media3.exoplayer.mediacodec.e.a
            if (r2 == 0) goto L27
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L27
            goto L2c
        L27:
            int r2 = androidx.media3.exoplayer.mediacodec.e.a.a(r0, r9, r10, r11)
            goto L2d
        L2c:
            r2 = r1
        L2d:
            r3 = 2
            if (r2 != r3) goto L32
            goto Lad
        L32:
            if (r2 != r6) goto L45
            java.lang.String r0 = "sizeAndRate.cover, "
            java.lang.StringBuilder r9 = defpackage.uz.f(r0, r9, r5, r10, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.h(r9)
            return r1
        L45:
            boolean r2 = a(r0, r9, r10, r11)
            if (r2 != 0) goto Lad
            if (r9 >= r10) goto L9c
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.HEVC"
            java.lang.String r3 = r8.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L62
            java.lang.String r2 = "mcv5a"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L62
            goto L9c
        L62:
            boolean r0 = a(r0, r10, r9, r11)
            if (r0 != 0) goto L69
            goto L9c
        L69:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r9 = defpackage.uz.f(r0, r9, r5, r10, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = ", "
            java.lang.String r11 = "AssumedSupport ["
            java.lang.String r12 = "] ["
            java.lang.StringBuilder r9 = defpackage.u40.f(r11, r9, r12, r3, r10)
            java.lang.String r8 = r8.b
            r9.append(r8)
            r9.append(r12)
            java.lang.String r8 = defpackage.vjg.a
            r9.append(r8)
            java.lang.String r8 = "]"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "MediaCodecInfo"
            defpackage.zkd.u(r9, r8)
            return r6
        L9c:
            java.lang.String r0 = "sizeAndRate.support, "
            java.lang.StringBuilder r9 = defpackage.uz.f(r0, r9, r5, r10, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.h(r9)
            return r1
        Lad:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.d.g(int, int, double):boolean");
    }

    public final void h(String str) {
        StringBuilder sbM = akb.m("NoSupport [", str, "] [");
        sbM.append(this.a);
        sbM.append(", ");
        sbM.append(this.b);
        sbM.append("] [");
        sbM.append(vjg.a);
        sbM.append("]");
        zkd.u("MediaCodecInfo", sbM.toString());
    }

    public final String toString() {
        return this.a;
    }
}
