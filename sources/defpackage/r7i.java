package defpackage;

import android.content.Context;
import android.graphics.RectF;
import defpackage.e47;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class r7i implements r83, VideoEncoderFactory, cxg {
    public static final z7i b = new z7i();
    public Object a;

    public r7i(int i) {
        t8i t8iVar;
        switch (i) {
            case 1:
                this.a = new Float[o49.values().length];
                break;
            case 2:
                this.a = new ArrayList();
                break;
            default:
                try {
                    t8iVar = (t8i) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    t8iVar = b;
                }
                t8i[] t8iVarArr = {g5i.a, t8iVar};
                w7i w7iVar = new w7i();
                w7iVar.a = t8iVarArr;
                Charset charset = p5i.a;
                this.a = w7iVar;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // defpackage.r83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(defpackage.s83 r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r9 = r9.a
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L13
            r4 = r6
            goto L14
        L13:
            r4 = r5
        L14:
            defpackage.ka2.l(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L27
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L25
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L27
        L25:
            r2 = r6
            goto L28
        L27:
            r2 = r5
        L28:
            int r3 = r9.size()
            int r3 = r3 - r6
        L2d:
            if (r3 < 0) goto L50
            java.lang.Object r4 = r9.get(r3)
            s83 r4 = (defpackage.s83) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L40
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L40:
            java.lang.Object r4 = r9.get(r3)
            s83 r4 = (defpackage.s83) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L4d
            r2 = r5
        L4d:
            int r3 = r3 + (-1)
            goto L2d
        L50:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r7i.a(s83, long):boolean");
    }

    @Override // defpackage.r83
    public e47 b(long j) {
        int i = i(j);
        if (i == 0) {
            e47.b bVar = e47.b;
            return qyc.e;
        }
        s83 s83Var = (s83) ((ArrayList) this.a).get(i - 1);
        long j2 = s83Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return s83Var.a;
        }
        e47.b bVar2 = e47.b;
        return qyc.e;
    }

    @Override // defpackage.r83
    public long c(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty() || j < ((s83) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((s83) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                s83 s83Var = (s83) arrayList.get(i - 1);
                long j3 = s83Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? s83Var.b : j3;
            }
        }
        s83 s83Var2 = (s83) h4.l(arrayList);
        long j4 = s83Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? s83Var2.b : j4;
    }

    @Override // defpackage.r83
    public void clear() {
        ((ArrayList) this.a).clear();
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return h().createEncoder(videoCodecInfo);
    }

    @Override // defpackage.r83
    public long d(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((s83) arrayList.get(0)).b) {
            return ((s83) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            s83 s83Var = (s83) arrayList.get(i);
            long j2 = s83Var.b;
            long j3 = s83Var.b;
            if (j < j2) {
                long j4 = ((s83) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((s83) h4.l(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // defpackage.r83
    public void e(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        int i = i(j);
        if (i == 0) {
            return;
        }
        long j2 = ((s83) arrayList.get(i - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            i--;
        }
        arrayList.subList(0, i).clear();
    }

    @Override // defpackage.cxg
    public String[] f() {
        return ((WebViewProviderFactoryBoundaryInterface) this.a).getSupportedFeatures();
    }

    @Override // defpackage.cxg
    public WebViewProviderBoundaryInterface g(wbc wbcVar) {
        return (WebViewProviderBoundaryInterface) al1.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.a).createWebView(wbcVar));
    }

    @Override // defpackage.cxg
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) al1.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.a).getStatics());
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return h().getSupportedCodecs();
    }

    @Override // defpackage.cxg
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) al1.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.a).getWebkitToCompatConverter());
    }

    public synchronized VideoEncoderFactory h() {
        try {
            if (((SoftwareVideoEncoderFactory) this.a) == null) {
                this.a = new SoftwareVideoEncoderFactory();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (SoftwareVideoEncoderFactory) this.a;
    }

    public int i(long j) {
        ArrayList arrayList = (ArrayList) this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((s83) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public RectF j(Context context, int i) {
        float fFloatValue;
        float fFloatValue2;
        Float[] fArr = (Float[]) this.a;
        context.getClass();
        float fFloatValue3 = 0.0f;
        if (i == 0) {
            Float f = fArr[5];
            float fFloatValue4 = (f == null && (f = fArr[1]) == null && (f = fArr[7]) == null && (f = fArr[0]) == null) ? 0.0f : f.floatValue();
            Float f2 = fArr[9];
            float fFloatValue5 = (f2 == null && (f2 = fArr[3]) == null && (f2 = fArr[11]) == null && (f2 = fArr[8]) == null && (f2 = fArr[0]) == null) ? 0.0f : f2.floatValue();
            Float f3 = fArr[6];
            float fFloatValue6 = (f3 == null && (f3 = fArr[2]) == null && (f3 = fArr[7]) == null && (f3 = fArr[0]) == null) ? 0.0f : f3.floatValue();
            Float f4 = fArr[10];
            if (f4 != null) {
                fFloatValue3 = f4.floatValue();
            } else {
                Float f5 = fArr[4];
                if (f5 == null && (f5 = fArr[11]) == null && (f5 = fArr[8]) == null) {
                    Float f6 = fArr[0];
                    if (f6 != null) {
                        fFloatValue3 = f6.floatValue();
                    }
                } else {
                    fFloatValue3 = f5.floatValue();
                }
            }
            return new RectF(fFloatValue4, fFloatValue5, fFloatValue6, fFloatValue3);
        }
        if (i != 1) {
            l5.q("Expected resolved layout direction");
            return null;
        }
        if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
            Float f7 = fArr[6];
            float fFloatValue7 = (f7 == null && (f7 = fArr[2]) == null && (f7 = fArr[7]) == null && (f7 = fArr[0]) == null) ? 0.0f : f7.floatValue();
            Float f8 = fArr[9];
            if (f8 != null) {
                fFloatValue2 = f8.floatValue();
            } else {
                Float f9 = fArr[3];
                fFloatValue2 = (f9 == null && (f9 = fArr[11]) == null && (f9 = fArr[8]) == null && (f9 = fArr[0]) == null) ? 0.0f : f9.floatValue();
            }
            Float f10 = fArr[5];
            float fFloatValue8 = (f10 == null && (f10 = fArr[1]) == null && (f10 = fArr[7]) == null && (f10 = fArr[0]) == null) ? 0.0f : f10.floatValue();
            Float f11 = fArr[10];
            if (f11 != null) {
                fFloatValue3 = f11.floatValue();
            } else {
                Float f12 = fArr[4];
                if (f12 == null && (f12 = fArr[11]) == null && (f12 = fArr[8]) == null) {
                    Float f13 = fArr[0];
                    if (f13 != null) {
                        fFloatValue3 = f13.floatValue();
                    }
                } else {
                    fFloatValue3 = f12.floatValue();
                }
            }
            return new RectF(fFloatValue7, fFloatValue2, fFloatValue8, fFloatValue3);
        }
        Float f14 = fArr[6];
        float fFloatValue9 = (f14 == null && (f14 = fArr[1]) == null && (f14 = fArr[7]) == null && (f14 = fArr[0]) == null) ? 0.0f : f14.floatValue();
        Float f15 = fArr[9];
        if (f15 != null) {
            fFloatValue = f15.floatValue();
        } else {
            Float f16 = fArr[3];
            fFloatValue = (f16 == null && (f16 = fArr[11]) == null && (f16 = fArr[8]) == null && (f16 = fArr[0]) == null) ? 0.0f : f16.floatValue();
        }
        Float f17 = fArr[5];
        float fFloatValue10 = (f17 == null && (f17 = fArr[2]) == null && (f17 = fArr[7]) == null && (f17 = fArr[0]) == null) ? 0.0f : f17.floatValue();
        Float f18 = fArr[10];
        if (f18 != null) {
            fFloatValue3 = f18.floatValue();
        } else {
            Float f19 = fArr[4];
            if (f19 == null && (f19 = fArr[11]) == null && (f19 = fArr[8]) == null) {
                Float f20 = fArr[0];
                if (f20 != null) {
                    fFloatValue3 = f20.floatValue();
                }
            } else {
                fFloatValue3 = f19.floatValue();
            }
        }
        return new RectF(fFloatValue9, fFloatValue, fFloatValue10, fFloatValue3);
    }
}
