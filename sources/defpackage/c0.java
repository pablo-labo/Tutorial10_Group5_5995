package defpackage;

import androidx.media3.common.ParserException;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static int a(f4b f4bVar) throws ParserException {
        int iG = f4bVar.g(4);
        if (iG == 15) {
            if (f4bVar.b() >= 24) {
                return f4bVar.g(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return a[iG];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static a b(f4b f4bVar, boolean z) {
        int iG = f4bVar.g(5);
        if (iG == 31) {
            iG = f4bVar.g(6) + 32;
        }
        int iA = a(f4bVar);
        int iG2 = f4bVar.g(4);
        String strC = p6.c(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iA = a(f4bVar);
            int iG3 = f4bVar.g(5);
            if (iG3 == 31) {
                iG3 = f4bVar.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = f4bVar.g(4);
            }
        }
        if (z) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + iG);
                }
            }
            if (f4bVar.f()) {
                zkd.T("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (f4bVar.f()) {
                f4bVar.o(14);
            }
            boolean zF = f4bVar.f();
            if (iG2 == 0) {
                b0.l();
                return null;
            }
            if (iG == 6 || iG == 20) {
                f4bVar.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    f4bVar.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    f4bVar.o(3);
                }
                f4bVar.o(1);
            }
            switch (iG) {
                case 17:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = f4bVar.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i = b[iG2];
        if (i != -1) {
            return new a(iA, i, strC);
        }
        throw ParserException.a(null, null);
    }
}
