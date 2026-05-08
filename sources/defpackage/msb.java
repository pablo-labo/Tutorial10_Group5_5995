package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.util.RCTLog;
import com.indeed.android.jobsearch.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class msb implements a6d, v9a, t20, ovh {
    public static msb a;

    public static final void d(final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, final gu5 gu5Var4, String str, b bVar, final int i) {
        final String str2;
        int i2;
        String str3;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        gu5Var4.getClass();
        c cVarH = bVar.h(1830569173);
        int i3 = i | (cVarH.x(gu5Var) ? 4 : 2) | (cVarH.x(gu5Var2) ? 32 : 16) | (cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var4) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | 8192;
        if (cVarH.o(i3 & 1, (i3 & 9363) != 9362)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                i2 = i3 & (-57345);
                str3 = ((ep7) cr8.p(ep7.class)).b().a;
            } else {
                cVarH.D();
                i2 = i3 & (-57345);
                str3 = str;
            }
            cVarH.V();
            List listA0 = u63.a0("US", "CA");
            Boolean bool = Boolean.FALSE;
            List listA02 = u63.a0(new c9d(R.string.resume_option_download, null, R.drawable.ic_idl_download_24, bool, gu5Var2), new c9d(R.string.profile_option_share, null, R.drawable.ic_idl_native_android_share_24, bool, gu5Var3));
            if (listA0.contains(str3)) {
                listA02 = z92.g1(new c9d(R.string.profile_option_resume_report, null, R.drawable.ic_idl_discover_24, bool, gu5Var4), listA02);
            }
            la1.a(gu5Var, ak2.I(R.string.profile_options_sheet_header, cVarH), listA02, "ProfileOptionsSheet", cVarH, (i2 & 14) | 3072);
            str2 = str3;
        } else {
            cVarH.D();
            str2 = str;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var2, gu5Var3, gu5Var4, str2, i) { // from class: lsb
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ String e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    msb.d(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final int e(int i) {
        return i % 2 == 0 ? 2 : 1;
    }

    public static int f(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int h(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return f(b, bArr[i]);
        }
        if (i3 != 2) {
            b0.t();
            return 0;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static int i(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return h(i3, bArr, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return h(i3, bArr, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static avf j(avf avfVar, String[] strArr, Map map) {
        int i = 0;
        if (avfVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (avf) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                avf avfVar2 = new avf();
                int length = strArr.length;
                while (i < length) {
                    avfVar2.a((avf) map.get(strArr[i]));
                    i++;
                }
                return avfVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                avfVar.a((avf) map.get(strArr[0]));
                return avfVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    avfVar.a((avf) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return avfVar;
    }

    public static final void k(ReactContext reactContext, String str) {
        if (reactContext != null && reactContext.hasActiveReactInstance()) {
            ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook("warn", str);
        }
        s55.n("ReactNative", str);
    }

    @Override // defpackage.a6d
    public void a(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.ovh
    public byte[] b(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.v9a
    public boolean c(String str) {
        System.loadLibrary(str);
        return true;
    }

    @Override // defpackage.t20
    public void g(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }
}
