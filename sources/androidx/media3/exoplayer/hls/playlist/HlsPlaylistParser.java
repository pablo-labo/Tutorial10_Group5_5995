package androidx.media3.exoplayer.hls.playlist;

import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.c;
import defpackage.k20;
import defpackage.n6c;
import defpackage.vjg;
import defpackage.xi6;
import defpackage.zr1;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public final class HlsPlaylistParser implements c.a<xi6> {
    public final c a;
    public final b b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = b("CAN-SKIP-DATERANGES");
    public static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = b("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = b("AUTOSELECT");
    public static final Pattern X = b("DEFAULT");
    public static final Pattern Y = b("FORCED");
    public static final Pattern Z = b("INDEPENDENT");
    public static final Pattern a0 = b("GAP");
    public static final Pattern b0 = b("PRECISE");
    public static final Pattern c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern k0 = b("END-ON-NEXT");
    public static final Pattern l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class a {
        public final BufferedReader a;
        public final ArrayDeque b;
        public String c;

        public a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.b = arrayDeque;
            this.a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public final boolean a() throws IOException {
            String strTrim;
            if (this.c == null) {
                ArrayDeque arrayDeque = this.b;
                if (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    str.getClass();
                    this.c = str;
                    return true;
                }
                do {
                    String line = this.a.readLine();
                    this.c = line;
                    if (line == null) {
                        return false;
                    }
                    strTrim = line.trim();
                    this.c = strTrim;
                } while (strTrim.isEmpty());
            }
            return true;
        }

        public final String b() {
            if (!a()) {
                k20.p();
                return null;
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public HlsPlaylistParser(c cVar, b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData c(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i2];
            schemeDataArr2[i2] = new DrmInitData.SchemeData(schemeData.b, schemeData.c, schemeData.d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData d(String str, String str2, HashMap map) throws ParserException {
        String strJ = j(str, M, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new DrmInitData.SchemeData(zr1.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = zr1.d;
            String str3 = vjg.a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = zr1.e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", n6c.a(uuid2, null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static androidx.media3.exoplayer.hls.playlist.b e(androidx.media3.exoplayer.hls.playlist.c r113, androidx.media3.exoplayer.hls.playlist.b r114, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.a r115, java.lang.String r116) {
        /*
            Method dump skipped, instruction units count: 4178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.e(androidx.media3.exoplayer.hls.playlist.c, androidx.media3.exoplayer.hls.playlist.b, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$a, java.lang.String):androidx.media3.exoplayer.hls.playlist.b");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0233  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.exoplayer.hls.playlist.c f(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.a r43, java.lang.String r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.f(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$a, java.lang.String):androidx.media3.exoplayer.hls.playlist.c");
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(String str, Map<String, String> map) {
        Matcher matcher = u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004f A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.upstream.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r7, defpackage.df3 r8) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.a(android.net.Uri, df3):java.lang.Object");
    }
}
