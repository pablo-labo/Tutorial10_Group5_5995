package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.c;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.nyd;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class pd3 extends DefaultHandler implements c.a<od3> {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public static final class a {
        public final androidx.media3.common.a a;
        public final e47<tb1> b;
        public final nyd c;
        public final String d;
        public final ArrayList<DrmInitData.SchemeData> e;
        public final ArrayList<ez3> f;
        public final ArrayList g;
        public final ArrayList h;

        public a(androidx.media3.common.a aVar, ArrayList arrayList, nyd nydVar, String str, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
            this.a = aVar;
            this.b = e47.j(arrayList);
            this.c = nydVar;
            this.d = str;
            this.e = arrayList2;
            this.f = arrayList3;
            this.g = arrayList4;
            this.h = arrayList5;
        }
    }

    public pd3() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            l6.p("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long b(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = vjg.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new nyd.d(j, j2));
            j += j2;
        }
        return j;
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[PHI: r13
  0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01ae, B:120:0x019b, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd3.d(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long e(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                c(xmlPullParser);
            }
        } while (!ojd.f(xmlPullParser, "BaseURL"));
        if (text != null && shg.a(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return nz8.a(new tb1(text, i, i2, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            tb1 tb1Var = (tb1) arrayList.get(i3);
            String strC = shg.c(tb1Var.a, text);
            String str = attributeValue3 == null ? strC : attributeValue3;
            if (z) {
                i = tb1Var.c;
                i2 = tb1Var.d;
                str = tb1Var.b;
            }
            arrayList2.add(new tb1(strC, i, i2, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd3.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static ez3 i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!ojd.f(xmlPullParser, str));
        return new ez3(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = vjg.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static float k(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0b6a  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0c86 A[LOOP:11: B:247:0x06f7->B:484:0x0c86, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:710:0x1373 A[LOOP:1: B:45:0x00cd->B:710:0x1373, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:718:0x133f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:739:0x08fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0b14 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.od3 l(org.xmlpull.v1.XmlPullParser r151, android.net.Uri r152) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd3.l(org.xmlpull.v1.XmlPullParser, android.net.Uri):od3");
    }

    public static mic m(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new mic(j, attributeValue, j2);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                case "description":
                    return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (jh2.k("http://dashif.org/guidelines/trickmode", ((ez3) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static nyd.e p(XmlPullParser xmlPullParser, nyd.e eVar) throws XmlPullParserException, IOException {
        long j = eVar != null ? eVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = eVar != null ? eVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = eVar != null ? eVar.d : 0L;
        long j6 = eVar != null ? eVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j5 = Long.parseLong(strArrSplit[0]);
            j6 = (Long.parseLong(strArrSplit[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        mic micVarM = eVar != null ? eVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (ojd.g(xmlPullParser, "Initialization")) {
                micVarM = m(xmlPullParser, "sourceURL", "range");
            } else {
                c(xmlPullParser);
            }
            mic micVar = micVarM;
            if (ojd.f(xmlPullParser, "SegmentBase")) {
                return new nyd.e(micVar, j2, j4, j8, j7);
            }
            micVarM = micVar;
        }
    }

    public static nyd.b q(XmlPullParser xmlPullParser, nyd.b bVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6 = bVar != null ? bVar.b : 1L;
        List<mic> arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = bVar != null ? bVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = bVar != null ? bVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = bVar != null ? bVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        mic micVarM = null;
        List<nyd.d> listS = null;
        do {
            xmlPullParser.next();
            if (ojd.g(xmlPullParser, "Initialization")) {
                micVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (ojd.g(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j7, j2);
            } else if (ojd.g(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                c(xmlPullParser);
            }
        } while (!ojd.f(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (micVarM == null) {
                micVarM = bVar.a;
            }
            if (listS == null) {
                listS = bVar.f;
            }
            if (arrayList == null) {
                arrayList = bVar.j;
            }
        }
        return new nyd.b(micVarM, j7, j9, j13, j11, listS, j15, arrayList, vjg.O(j5), vjg.O(j));
    }

    public static nyd.c r(XmlPullParser xmlPullParser, nyd.c cVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7 = cVar != null ? cVar.b : 1L;
        mic micVarM = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = cVar != null ? cVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = cVar != null ? cVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = cVar != null ? cVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            ez3 ez3Var = (ez3) list.get(i);
            if (jh2.k("http://dashif.org/guidelines/last-segment-number", ez3Var.a)) {
                j6 = Long.parseLong(ez3Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        uig uigVarT = t(xmlPullParser, "media", cVar != null ? cVar.k : null);
        uig uigVarT2 = t(xmlPullParser, "initialization", cVar != null ? cVar.j : null);
        List<nyd.d> listS = null;
        do {
            xmlPullParser.next();
            if (ojd.g(xmlPullParser, "Initialization")) {
                micVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (ojd.g(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j8, j2);
            } else {
                c(xmlPullParser);
            }
        } while (!ojd.f(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (micVarM == null) {
                micVarM = cVar.a;
            }
            if (listS == null) {
                listS = cVar.f;
            }
        }
        return new nyd.c(micVarM, j8, j10, j14, j15, j12, listS, j17, uigVarT2, uigVarT, vjg.O(j5), vjg.O(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long jB = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (ojd.g(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j5 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = j5;
                    jB = b(arrayList, jB, j4, i2, j3);
                } else {
                    j3 = j5;
                }
                if (j3 != -9223372036854775807L) {
                    jB = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j4 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                c(xmlPullParser);
            }
        } while (!ojd.f(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = vjg.a;
            b(arrayList, jB, j4, i, vjg.X(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00fc. Please report as an issue. */
    public static uig t(XmlPullParser xmlPullParser, String str, uig uigVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return uigVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i);
                String strSubstring2 = attributeValue.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            l5.q("Invalid template: ".concat(attributeValue));
                            return null;
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new uig(arrayList, arrayList2, arrayList3);
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    public final Object a(Uri uri, df3 df3Var) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(df3Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            throw ParserException.b(e2, null);
        }
    }
}
