package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.dataflow.qual.Pure;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
public final class st9 {
    public static final ArrayList<a> a = new ArrayList<>();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {
    }

    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            int i = this.b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        b bVarG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (bVarG = g(str2)) != null && (iA = bVarG.a()) != 0 && iA != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : vjg.a0(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrA0 = vjg.a0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrA0) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        b bVarG;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarG = g(str2)) == null) {
                    return 0;
                }
                return bVarG.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        b bVarG;
        String strF = null;
        if (str == null) {
            return null;
        }
        String strI = jh2.I(str.trim());
        if (strI.startsWith("avc1") || strI.startsWith("avc3")) {
            return "video/avc";
        }
        if (strI.startsWith("hev1") || strI.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strI.startsWith("dvav") || strI.startsWith("dva1") || strI.startsWith("dvhe") || strI.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strI.startsWith("av01")) {
            return "video/av01";
        }
        if (strI.startsWith("vp9") || strI.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strI.startsWith("vp8") || strI.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strI.startsWith("mp4a")) {
            if (strI.startsWith("mp4a.") && (bVarG = g(strI)) != null) {
                strF = f(bVarG.a);
            }
            return strF == null ? "audio/mp4a-latm" : strF;
        }
        if (strI.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strI.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strI.startsWith("ac-3") || strI.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strI.startsWith("ec-3") || strI.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strI.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strI.startsWith("ac-4") || strI.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strI.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strI.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strI.startsWith("dtsh") || strI.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strI.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strI.startsWith("opus")) {
            return "audio/opus";
        }
        if (strI.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strI.startsWith("flac")) {
            return "audio/flac";
        }
        if (strI.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strI.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strI.contains("cea708")) {
            return "application/cea-708";
        }
        if (strI.contains("eia608") || strI.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList<a> arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
            if (strI.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static b g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList<a> arrayList = a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : vjg.a0(str)) {
            String strE = e(str2);
            if (strE != null && o(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(h(str));
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean m(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    @Pure
    public static boolean n(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean o(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(h(str));
    }

    public static String p(String str) {
        String strI;
        if (str == null) {
            return null;
        }
        strI = jh2.I(str);
        strI.getClass();
        switch (strI) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strI;
        }
    }
}
