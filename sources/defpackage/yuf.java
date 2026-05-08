package defpackage;

import androidx.media3.extractor.text.SubtitleDecoderException;
import defpackage.dye;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class yuf implements dye {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final a i = new a(1, 30.0f, 1);
    public final XmlPullParserFactory a;

    public static final class a {
        public final float a;
        public final int b;
        public final int c;

        public a(int i, float f, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public yuf() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            l6.p("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static avf d(avf avfVar) {
        return avfVar == null ? new avf() : avfVar;
    }

    public static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int f(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            zkd.T("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            ka2.k("Invalid cell resolution " + i2 + " " + i3, z);
            return i3;
        } catch (NumberFormatException unused) {
            zkd.T("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void g(String str, avf avfVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        String str2 = vjg.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(w20.k(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            zkd.T("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(l5.m("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                avfVar.j = 3;
                break;
            case "em":
                avfVar.j = 2;
                break;
            case "px":
                avfVar.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(l5.m("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        avfVar.k = Float.parseFloat(strGroup2);
    }

    public static a h(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = vjg.a;
            ka2.k("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        a aVar = i;
        int i3 = aVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = aVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new a(i3, i2 * f2, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, yuf.b r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuf.i(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, yuf$b, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.xuf j(org.xmlpull.v1.XmlPullParser r21, defpackage.xuf r22, java.util.HashMap r23, yuf.a r24) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuf.j(org.xmlpull.v1.XmlPullParser, xuf, java.util.HashMap, yuf$a):xuf");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.avf k(org.xmlpull.v1.XmlPullParser r18, defpackage.avf r19) {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuf.k(org.xmlpull.v1.XmlPullParser, avf):avf");
    }

    public static long l(String str, a aVar) throws SubtitleDecoderException {
        double d2;
        double d3;
        double d4;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d5 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d6 = d5 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d7 = d6 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d7 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / aVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) aVar.b)) / ((double) aVar.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(l5.l("Malformed time expression: ", str));
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        d2 = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d3 = aVar.a;
                d2 /= d3;
                return (long) (d2 * 1000000.0d);
            case "h":
                d4 = 3600.0d;
                break;
            case "m":
                d4 = 60.0d;
                break;
            case "t":
                d3 = aVar.c;
                d2 /= d3;
                return (long) (d2 * 1000000.0d);
            case "ms":
                d3 = 1000.0d;
                d2 /= d3;
                return (long) (d2 * 1000000.0d);
            default:
                return (long) (d2 * 1000000.0d);
        }
        d2 *= d4;
        return (long) (d2 * 1000000.0d);
    }

    public static b m(XmlPullParser xmlPullParser) {
        String strB = ojd.b(xmlPullParser, "extent");
        if (strB == null) {
            return null;
        }
        Matcher matcher = g.matcher(strB);
        if (!matcher.matches()) {
            zkd.T("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strB));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new b(i2, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            zkd.T("TtmlParser", "Ignoring malformed tts extent: ".concat(strB));
            return null;
        }
    }

    @Override // defpackage.dye
    public final wxe a(int i2, byte[] bArr, int i3) {
        wxe wxeVar;
        wxe wxeVar2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new zuf("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            a aVarH = i;
            int iF = 15;
            int i4 = 0;
            gn3 gn3Var = null;
            b bVarM = null;
            while (eventType != 1) {
                xuf xufVar = (xuf) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    wxeVar = wxeVar2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                aVarH = h(xmlPullParserNewPullParser);
                                iF = f(xmlPullParserNewPullParser);
                                bVarM = m(xmlPullParserNewPullParser);
                            }
                            a aVar = aVarH;
                            int i5 = iF;
                            b bVar = bVarM;
                            if (e(name)) {
                                if ("head".equals(name)) {
                                    i(xmlPullParserNewPullParser, map, i5, bVar, map2, map3);
                                } else {
                                    try {
                                        xuf xufVarJ = j(xmlPullParserNewPullParser, xufVar, map2, aVar);
                                        arrayDeque.push(xufVarJ);
                                        if (xufVar != null) {
                                            if (xufVar.m == null) {
                                                xufVar.m = new ArrayList();
                                            }
                                            xufVar.m.add(xufVarJ);
                                        }
                                    } catch (SubtitleDecoderException e2) {
                                        zkd.U("TtmlParser", "Suppressing parser error", e2);
                                        i4++;
                                    }
                                }
                                bVarM = bVar;
                                iF = i5;
                                aVarH = aVar;
                            } else {
                                zkd.D("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i4++;
                            bVarM = bVar;
                            iF = i5;
                            aVarH = aVar;
                        } catch (IOException e3) {
                            e = e3;
                            ja.m("Unexpected error when reading input.", e);
                            return wxeVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            ja.m("Unable to decode source", e);
                            return wxeVar;
                        }
                    } else if (eventType == 4) {
                        xufVar.getClass();
                        xuf xufVarA = xuf.a(xmlPullParserNewPullParser.getText());
                        if (xufVar.m == null) {
                            xufVar.m = new ArrayList();
                        }
                        xufVar.m.add(xufVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            xuf xufVar2 = (xuf) arrayDeque.peek();
                            xufVar2.getClass();
                            gn3Var = new gn3(xufVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    wxeVar = wxeVar2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                wxeVar2 = wxeVar;
            }
            wxeVar = wxeVar2;
            gn3Var.getClass();
            return gn3Var;
        } catch (IOException e5) {
            e = e5;
            wxeVar = wxeVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            wxeVar = wxeVar2;
        }
    }

    @Override // defpackage.dye
    public final void b(byte[] bArr, int i2, int i3, dye.b bVar, wq2<s83> wq2Var) {
        ku8.b(a(i2, bArr, i3), bVar, wq2Var);
    }

    @Override // defpackage.dye
    public final int c() {
        return 1;
    }
}
