package app.rive.runtime.kotlin.fonts;

import android.util.Log;
import android.util.Xml;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.akb;
import defpackage.bs4;
import defpackage.kc9;
import defpackage.l5;
import defpackage.muf;
import defpackage.r6;
import defpackage.t92;
import defpackage.u63;
import defpackage.vve;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zr4;
import defpackage.zve;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/SystemFontsParser;", "", "()V", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class SystemFontsParser {
    public static final int $stable = 0;
    public static final String FALLBACK_FONTS_XML_PATH = "/system/etc/system_fallback.xml";
    public static final String FONTS_XML_PATH = "/system/etc/fonts.xml";
    public static final String SYSTEM_FONTS_XML_PATH = "/system/etc/system_fonts.xml";
    private static final String TAG = "SystemFontsParser";
    private static final List<Pair<Fonts.Weight, String>> fontFilesOrder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> SYSTEM_FONTS_PATHS = u63.a0("/system/fonts/", "/system/font/", "/data/fonts/", "/system/product/fonts/");

    static {
        Fonts.Weight.Companion companion = Fonts.Weight.INSTANCE;
        fontFilesOrder = u63.a0(new Pair(companion.getNORMAL(), Fonts.Font.STYLE_NORMAL), new Pair(companion.getBOLD(), Fonts.Font.STYLE_NORMAL), new Pair(companion.getNORMAL(), Fonts.Font.STYLE_ITALIC), new Pair(companion.getBOLD(), Fonts.Font.STYLE_ITALIC));
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b\u0018\u00010#2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%JY\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010 \u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b+\u0010,JK\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0#2\u0006\u0010 \u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u0010\rJ\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010\rJ\u001f\u0010;\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010<J-\u0010>\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010AJ#\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bD\u0010EJ\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bG\u0010HR \u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010Q\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\bQ\u0010OR\u0014\u0010R\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010OR&\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u00070#0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010K¨\u0006U"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/SystemFontsParser$Companion;", "", "<init>", "()V", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "readRootElementMap", "(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/Map;", "", "readRootElement", "(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;", "", "familiesMap", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;", "aliases", "Lj6g;", "readNestedFamilies", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Map;Ljava/util/List;)V", "readNestedFamiliesList", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Ljava/util/List;", "readFamilyEntry", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "readAlias", "(Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;", "alias", "ogFamily", "remapAlias", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;Lapp/rive/runtime/kotlin/fonts/Fonts$Family;)Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "familyName", "readFamily", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "Lkotlin/Pair;", "readLegacyFamily", "(Lorg/xmlpull/v1/XmlPullParser;)Lkotlin/Pair;", "Lapp/rive/runtime/kotlin/fonts/Fonts$FileFont;", "filesList", "aliasNames", "familyLang", "familyVariant", "fromFileFonts", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "fontList", "lang", "variant", "fromFontList", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "readFont", "(Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "readAxis", "(Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "readNameset", "readFileset", "name", "getRequiredAttribute", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;", "default", "getOptionalAttribute", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "skip", "(Lorg/xmlpull/v1/XmlPullParser;)V", "Ljava/io/InputStream;", "xmlFileStream", "parseFontsXMLMap$kotlin_release", "(Ljava/io/InputStream;)Ljava/util/Map;", "parseFontsXMLMap", "parseFontsXML$kotlin_release", "(Ljava/io/InputStream;)Ljava/util/List;", "parseFontsXML", "SYSTEM_FONTS_PATHS", "Ljava/util/List;", "getSYSTEM_FONTS_PATHS$kotlin_release", "()Ljava/util/List;", "FALLBACK_FONTS_XML_PATH", "Ljava/lang/String;", "FONTS_XML_PATH", "SYSTEM_FONTS_XML_PATH", "TAG", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "fontFilesOrder", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> fromFileFonts(List<Fonts.FileFont> filesList, List<String> aliasNames, String familyName, String familyLang, String familyVariant) {
            String lang = familyLang;
            String variant = familyVariant;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = filesList.iterator();
            int i = 0;
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    if (linkedHashMap.isEmpty()) {
                        Log.e(SystemFontsParser.TAG, "Could not extract any valid fonts from <fileset> for legacy family '" + familyName + '\'');
                        return new Pair<>(new Fonts.Family(familyName, variant, lang, bs4.a), zr4.a);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = aliasNames.iterator();
                    while (it2.hasNext()) {
                        String string = zve.s0((String) it2.next()).toString();
                        Fonts.Alias alias = string.length() > 0 ? new Fonts.Alias(string, familyName, null) : null;
                        if (alias != null) {
                            arrayList.add(alias);
                        }
                    }
                    if (variant == null) {
                        Fonts.FileFont fileFont = (Fonts.FileFont) z92.Q0(filesList);
                        variant = fileFont != null ? fileFont.getVariant() : null;
                    }
                    if (lang == null) {
                        Fonts.FileFont fileFont2 = (Fonts.FileFont) z92.Q0(filesList);
                        lang = fileFont2 != null ? fileFont2.getLang() : null;
                    }
                    String string2 = variant != null ? zve.s0(variant).toString() : null;
                    if (string2 == null || zve.U(string2)) {
                        string2 = null;
                    }
                    String string3 = lang != null ? zve.s0(lang).toString() : null;
                    if (string3 != null && !zve.U(string3)) {
                        str = string3;
                    }
                    return new Pair<>(new Fonts.Family(familyName, string2, str, linkedHashMap), arrayList);
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                Fonts.FileFont fileFont3 = (Fonts.FileFont) next;
                if (i >= SystemFontsParser.fontFilesOrder.size()) {
                    StringBuilder sbM = akb.m("Legacy family '", familyName, "' has more than ");
                    sbM.append(SystemFontsParser.fontFilesOrder.size());
                    sbM.append(" files in <fileset>. Ignoring extra file: '");
                    sbM.append(fileFont3.getName());
                    sbM.append('\'');
                    Log.w(SystemFontsParser.TAG, sbM.toString());
                } else {
                    Pair pair = (Pair) SystemFontsParser.fontFilesOrder.get(i);
                    Fonts.Weight weight = (Fonts.Weight) pair.a();
                    String str2 = (String) pair.b();
                    String string4 = zve.s0(fileFont3.getName()).toString();
                    if (string4.length() == 0) {
                        Log.w(SystemFontsParser.TAG, "Skipping empty filename in <fileset> for family '" + familyName + "'.");
                    } else {
                        Fonts.Font font = new Fonts.Font(weight, str2, string4, null, 0, null, null, 112, null);
                        Object arrayList2 = linkedHashMap.get(weight);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(weight, arrayList2);
                        }
                        ((List) arrayList2).add(font);
                    }
                }
                i = i2;
            }
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> fromFontList(String familyName, List<Fonts.Font> fontList, String lang, String variant) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Fonts.Font font : fontList) {
                if (zve.U(font.getName())) {
                    Log.w(SystemFontsParser.TAG, "Skipping font with blank filename in family '" + familyName + "'.");
                } else {
                    Fonts.Weight weight = font.getWeight();
                    Object arrayList = linkedHashMap.get(weight);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(weight, arrayList);
                    }
                    ((List) arrayList).add(font);
                }
            }
            boolean zIsEmpty = linkedHashMap.isEmpty();
            zr4 zr4Var = zr4.a;
            if (!zIsEmpty) {
                return new Pair<>(new Fonts.Family(familyName, variant, lang, linkedHashMap), zr4Var);
            }
            Log.w(SystemFontsParser.TAG, "Family '" + familyName + "' from <font> list resulted in no valid fonts. Creating empty family.");
            return new Pair<>(new Fonts.Family(familyName, variant, lang, bs4.a), zr4Var);
        }

        private final String getOptionalAttribute(XmlPullParser parser, String name, String str) {
            String attributeValue = parser.getAttributeValue(null, name);
            return attributeValue == null ? str : attributeValue;
        }

        public static /* synthetic */ String getOptionalAttribute$default(Companion companion, XmlPullParser xmlPullParser, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.getOptionalAttribute(xmlPullParser, str, str2);
        }

        private final String getRequiredAttribute(XmlPullParser parser, String name) {
            String attributeValue = parser.getAttributeValue(null, name);
            if (attributeValue != null) {
                return attributeValue;
            }
            l5.q(l5.l("Missing required attribute: ", name));
            return null;
        }

        private final Fonts.Alias readAlias(XmlPullParser parser) throws XmlPullParserException, IOException {
            Companion companion;
            XmlPullParser xmlPullParser;
            parser.require(2, null, "alias");
            try {
                String requiredAttribute = getRequiredAttribute(parser, "name");
                String requiredAttribute2 = getRequiredAttribute(parser, "to");
                companion = this;
                xmlPullParser = parser;
                try {
                    String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser, "weight", null, 4, null);
                    Fonts.Weight weightFromString = optionalAttribute$default != null ? Fonts.Weight.INSTANCE.fromString(optionalAttribute$default) : null;
                    companion.skip(xmlPullParser);
                    if (!zve.U(requiredAttribute) && !zve.U(requiredAttribute2)) {
                        return new Fonts.Alias(zve.s0(requiredAttribute).toString(), zve.s0(requiredAttribute2).toString(), weightFromString);
                    }
                    Log.w(SystemFontsParser.TAG, "Skipping alias with blank name ('" + requiredAttribute + "') or to ('" + requiredAttribute2 + "').");
                    return null;
                } catch (IllegalArgumentException e) {
                    e = e;
                    Log.e(SystemFontsParser.TAG, "Skipping alias due to missing required attribute: " + e.getMessage());
                    companion.skip(xmlPullParser);
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                companion = this;
                xmlPullParser = parser;
            }
        }

        private final Fonts.Axis readAxis(XmlPullParser parser) throws XmlPullParserException, IOException {
            String requiredAttribute = getRequiredAttribute(parser, "tag");
            String requiredAttribute2 = getRequiredAttribute(parser, "stylevalue");
            skip(parser);
            if (!zve.U(requiredAttribute) && !zve.U(requiredAttribute2)) {
                return new Fonts.Axis(requiredAttribute, requiredAttribute2);
            }
            l5.q("Axis tag found with blank 'tag' or 'stylevalue'.");
            return null;
        }

        private final Fonts.Family readFamily(String familyName, XmlPullParser parser) throws XmlPullParserException, IOException {
            Companion companion = SystemFontsParser.INSTANCE;
            muf mufVar = new muf(getOptionalAttribute$default(companion, parser, "lang", null, 4, null), getOptionalAttribute$default(companion, parser, "variant", null, 4, null), getOptionalAttribute$default(companion, parser, "ignore", null, 4, null));
            String str = (String) mufVar.a();
            String str2 = (String) mufVar.b();
            String str3 = (String) mufVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    name.getClass();
                    if (wl7.b(zve.s0(name).toString(), "font")) {
                        try {
                            Fonts.Font font = readFont(parser);
                            Fonts.Weight weight = font.getWeight();
                            Object arrayList = linkedHashMap.get(weight);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(weight, arrayList);
                            }
                            ((List) arrayList).add(font);
                        } catch (Exception e) {
                            StringBuilder sbM = akb.m("Failed to read <font> in family '", familyName, "': ");
                            sbM.append(e.getMessage());
                            Log.e(SystemFontsParser.TAG, sbM.toString(), e);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            if (z92.I0(u63.a0("true", "1"), str3) || linkedHashMap.isEmpty()) {
                return null;
            }
            return new Fonts.Family(familyName, str2, str, linkedHashMap);
        }

        private final Fonts.Family readFamilyEntry(XmlPullParser parser, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "family");
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "name", null, 4, null);
            String string = optionalAttribute$default != null ? zve.s0(optionalAttribute$default).toString() : null;
            if (string != null && string.length() > 0) {
                return readFamily(string, parser);
            }
            Pair<Fonts.Family, List<Fonts.Alias>> legacyFamily = readLegacyFamily(parser);
            if (legacyFamily == null) {
                return null;
            }
            Fonts.Family familyA = legacyFamily.a();
            List<Fonts.Alias> listB = legacyFamily.b();
            if (!listB.isEmpty()) {
                Log.w(SystemFontsParser.TAG, "Legacy family generated aliases - these will be processed globally.");
                aliases.addAll(listB);
            }
            return familyA;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<app.rive.runtime.kotlin.fonts.Fonts.FileFont> readFileset(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.fonts.SystemFontsParser.Companion.readFileset(org.xmlpull.v1.XmlPullParser):java.util.List");
        }

        private final Fonts.Font readFont(XmlPullParser parser) throws XmlPullParserException, IOException {
            String text;
            Integer numB;
            parser.require(2, null, "font");
            Fonts.Weight.Companion companion = Fonts.Weight.INSTANCE;
            Fonts.Weight weightFromString = companion.fromString(getOptionalAttribute(parser, "weight", String.valueOf(companion.getNORMAL().getWeight())));
            String optionalAttribute = getOptionalAttribute(parser, "style", Fonts.Font.STYLE_NORMAL);
            String str = optionalAttribute == null ? Fonts.Font.STYLE_NORMAL : optionalAttribute;
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "index", null, 4, null);
            int iIntValue = (optionalAttribute$default == null || (numB = vve.B(10, optionalAttribute$default)) == null) ? 0 : numB.intValue();
            String optionalAttribute$default2 = getOptionalAttribute$default(this, parser, "postScriptName", null, 4, null);
            if (optionalAttribute$default2 == null || zve.U(optionalAttribute$default2)) {
                optionalAttribute$default2 = null;
            }
            String optionalAttribute$default3 = getOptionalAttribute$default(this, parser, "fallbackFor", null, 4, null);
            String str2 = (optionalAttribute$default3 == null || zve.U(optionalAttribute$default3)) ? null : optionalAttribute$default3;
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                int eventType = parser.getEventType();
                if (eventType == 2) {
                    String name = parser.getName();
                    name.getClass();
                    if (wl7.b(zve.s0(name).toString(), "axis")) {
                        try {
                            arrayList.add(readAxis(parser));
                        } catch (Exception e) {
                            Log.e(SystemFontsParser.TAG, "Failed to read <axis> tag: " + e.getMessage(), e);
                        }
                    } else {
                        skip(parser);
                    }
                } else if (eventType == 4 && (text = parser.getText()) != null) {
                    sb.append(text);
                }
            }
            String string = zve.s0(sb.toString()).toString();
            String str3 = string.length() == 0 ? null : string;
            if (str3 != null) {
                return new Fonts.Font(weightFromString, str, str3, !arrayList.isEmpty() ? arrayList : null, iIntValue, optionalAttribute$default2, str2);
            }
            r6.g("Font tag found with empty filename");
            return null;
        }

        private final Pair<Fonts.Family, List<Fonts.Alias>> readLegacyFamily(XmlPullParser parser) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "variant", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(this, parser, "lang", null, 4, null);
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    try {
                        String name = parser.getName();
                        name.getClass();
                        String string = zve.s0(name).toString();
                        int iHashCode = string.hashCode();
                        if (iHashCode != -854981274) {
                            if (iHashCode != 3148879) {
                                if (iHashCode == 1721971191 && string.equals("nameset")) {
                                    arrayList.addAll(readNameset(parser));
                                } else {
                                    skip(parser);
                                }
                            } else if (string.equals("font")) {
                                arrayList3.add(readFont(parser));
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("fileset")) {
                            arrayList2.addAll(readFileset(parser));
                        } else {
                            skip(parser);
                        }
                    } catch (Exception e) {
                        Log.e(SystemFontsParser.TAG, "Error reading tag '" + parser.getName() + "' inside legacy family - Skipping tag - " + e.getMessage(), e);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return fromFontList(arrayList.isEmpty() ? "" : arrayList.remove(0), arrayList3, optionalAttribute$default2, optionalAttribute$default);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
            return fromFileFonts(arrayList2, arrayList, zve.s0(arrayList.remove(0)).toString(), optionalAttribute$default2, optionalAttribute$default);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<java.lang.String> readNameset(org.xmlpull.v1.XmlPullParser r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                r7 = this;
                r0 = 0
                java.lang.String r1 = "nameset"
                r2 = 2
                r8.require(r2, r0, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            Lc:
                int r1 = r8.next()
                r3 = 3
                if (r1 == r3) goto L9c
                int r1 = r8.getEventType()
                if (r1 != r2) goto Lc
                java.lang.String r1 = r8.getName()
                r1.getClass()
                java.lang.CharSequence r1 = defpackage.zve.s0(r1)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "name"
                boolean r1 = defpackage.wl7.b(r1, r4)
                if (r1 == 0) goto L97
                int r1 = r8.next()
                r5 = 4
                java.lang.String r6 = ""
                if (r1 != r5) goto L4e
                java.lang.String r1 = r8.getText()
                if (r1 == 0) goto L4b
                java.lang.CharSequence r1 = defpackage.zve.s0(r1)
                java.lang.String r1 = r1.toString()
                if (r1 != 0) goto L4a
                goto L4b
            L4a:
                r6 = r1
            L4b:
                r8.next()
            L4e:
                int r1 = r8.getEventType()
                if (r1 != r3) goto L69
                java.lang.String r1 = r8.getName()
                r1.getClass()
                java.lang.CharSequence r1 = defpackage.zve.s0(r1)
                java.lang.String r1 = r1.toString()
                boolean r1 = defpackage.wl7.b(r1, r4)
                if (r1 != 0) goto L8c
            L69:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Expected </name> tag after reading text, but found "
                r1.<init>(r3)
                int r3 = r8.getEventType()
                r1.append(r3)
                r3 = 32
                r1.append(r3)
                java.lang.String r3 = r8.getName()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "SystemFontsParser"
                android.util.Log.w(r3, r1)
            L8c:
                boolean r1 = defpackage.zve.U(r6)
                if (r1 != 0) goto Lc
                r0.add(r6)
                goto Lc
            L97:
                r7.skip(r8)
                goto Lc
            L9c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.fonts.SystemFontsParser.Companion.readNameset(org.xmlpull.v1.XmlPullParser):java.util.List");
        }

        private final void readNestedFamilies(XmlPullParser parser, Map<String, Fonts.Family> familiesMap, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "familyset");
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    name.getClass();
                    String string = zve.s0(name).toString();
                    if (wl7.b(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(parser, aliases);
                        if (familyEntry != null) {
                            String name2 = familyEntry.getName();
                            familiesMap.put((name2 == null || name2.length() == 0) ? ((Fonts.Font) z92.O0(t92.s0(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                        }
                    } else if (wl7.b(string, "alias")) {
                        Fonts.Alias alias = readAlias(parser);
                        if (alias != null) {
                            aliases.add(alias);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
        }

        private final List<Fonts.Family> readNestedFamiliesList(XmlPullParser parser, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "familyset");
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    name.getClass();
                    String string = zve.s0(name).toString();
                    if (wl7.b(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(parser, aliases);
                        if (familyEntry != null) {
                            arrayList.add(familyEntry);
                        }
                    } else if (wl7.b(string, "alias")) {
                        Fonts.Alias alias = readAlias(parser);
                        if (alias != null) {
                            aliases.add(alias);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            return arrayList;
        }

        private final List<Fonts.Family> readRootElement(XmlPullParser parser) throws XmlPullParserException, IOException {
            boolean z;
            Object next;
            Fonts.Family familyRemapAlias;
            Object next2;
            parser.require(2, null, null);
            String name = parser.getName();
            if (!wl7.b(name, "familyset") && !wl7.b(name, "fonts-modification") && !wl7.b(name, "config")) {
                Log.w(SystemFontsParser.TAG, "Unexpected root tag '" + name + "' in font XML");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<Fonts.Alias> arrayList2 = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name2 = parser.getName();
                    name2.getClass();
                    String string = zve.s0(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(parser);
                                if (alias != null) {
                                    arrayList2.add(alias);
                                }
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(parser, arrayList2);
                            if (familyEntry != null) {
                                arrayList.add(familyEntry);
                            }
                        } else {
                            skip(parser);
                        }
                    } else if (string.equals("familyset")) {
                        arrayList.addAll(readNestedFamiliesList(parser, arrayList2));
                    } else {
                        skip(parser);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(t92.r0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Fonts.Family) it.next()).getName());
            }
            Set setD1 = z92.D1(arrayList3);
            for (Fonts.Alias alias2 : arrayList2) {
                if (!setD1.contains(alias2.getName())) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (wl7.b(((Fonts.Family) next2).getName(), alias2.getOriginal())) {
                            break;
                        }
                    }
                    Fonts.Family family = (Fonts.Family) next2;
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.INSTANCE.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            setD1.add(alias2.getName());
                            arrayList.add(familyRemapAlias2);
                        } else {
                            Log.w(SystemFontsParser.TAG, "Could not remap alias '" + alias2.getName() + "' because target '" + alias2.getOriginal() + "' not found.");
                        }
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(arrayList2);
            for (boolean z2 = true; z2 && !arrayList4.isEmpty(); z2 = z) {
                Iterator it3 = arrayList4.iterator();
                z = false;
                while (it3.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it3.next();
                    if (setD1.contains(alias3.getName())) {
                        it3.remove();
                    } else {
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                            if (wl7.b(((Fonts.Family) next).getName(), alias3.getOriginal())) {
                                break;
                            }
                        }
                        Fonts.Family family2 = (Fonts.Family) next;
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.INSTANCE.remapAlias(alias3, family2)) != null) {
                            setD1.add(alias3.getName());
                            arrayList.add(familyRemapAlias);
                            it3.remove();
                            z = true;
                        }
                    }
                }
            }
            return arrayList;
        }

        private final Map<String, Fonts.Family> readRootElementMap(XmlPullParser parser) throws XmlPullParserException, IOException {
            boolean z;
            Fonts.Family familyRemapAlias;
            parser.require(2, null, null);
            String name = parser.getName();
            if (!wl7.b(name, "familyset") && !wl7.b(name, "fonts-modification") && !wl7.b(name, "config")) {
                Log.w(SystemFontsParser.TAG, "Unexpected root tag '" + name + "' in font XML");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<Fonts.Alias> arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String name2 = parser.getName();
                    name2.getClass();
                    String string = zve.s0(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(parser);
                                if (alias != null) {
                                    arrayList.add(alias);
                                }
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(parser, arrayList);
                            if (familyEntry != null) {
                                String name3 = familyEntry.getName();
                                linkedHashMap.put((name3 == null || name3.length() == 0) ? ((Fonts.Font) z92.O0(t92.s0(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                            }
                        } else {
                            skip(parser);
                        }
                    } else if (string.equals("familyset")) {
                        readNestedFamilies(parser, linkedHashMap, arrayList);
                    } else {
                        skip(parser);
                    }
                }
            }
            for (Fonts.Alias alias2 : arrayList) {
                if (linkedHashMap.containsKey(alias2.getName())) {
                    Log.w(SystemFontsParser.TAG, "Skipping alias '" + alias2.getName() + "' because a family with that name already exists.");
                } else {
                    Fonts.Family family = (Fonts.Family) linkedHashMap.get(alias2.getOriginal());
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.INSTANCE.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            linkedHashMap.put(alias2.getName(), familyRemapAlias2);
                        } else {
                            Log.w(SystemFontsParser.TAG, "Could not remap alias '" + alias2.getName() + "' because target '" + alias2.getOriginal() + "' not found.");
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (boolean z2 = true; z2 && !arrayList2.isEmpty(); z2 = z) {
                Iterator it = arrayList2.iterator();
                z = false;
                while (it.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it.next();
                    if (linkedHashMap.containsKey(alias3.getName())) {
                        it.remove();
                    } else {
                        Fonts.Family family2 = (Fonts.Family) linkedHashMap.get(alias3.getOriginal());
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.INSTANCE.remapAlias(alias3, family2)) != null) {
                            linkedHashMap.put(alias3.getName(), familyRemapAlias);
                            it.remove();
                            z = true;
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        private final Fonts.Family remapAlias(Fonts.Alias alias, Fonts.Family ogFamily) {
            Fonts.Weight weight = alias.getWeight();
            if (weight == null) {
                return new Fonts.Family(alias.getName(), ogFamily.getVariant(), ogFamily.getLang(), ogFamily.getFonts());
            }
            List<Fonts.Font> list = ogFamily.getFonts().get(weight);
            if (list != null && !list.isEmpty()) {
                ogFamily.getName();
                return new Fonts.Family(alias.getName(), ogFamily.getVariant(), ogFamily.getLang(), kc9.W(new Pair(weight, list)));
            }
            Log.w(SystemFontsParser.TAG, "Alias '" + alias.getName() + "' targets weight " + weight.getWeight() + " in family '" + alias.getOriginal() + "', but that doesn't exist");
            return null;
        }

        private final void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
            int i = 1;
            while (i > 0) {
                int next = parser.next();
                if (next == 1) {
                    return;
                }
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
        }

        public final List<String> getSYSTEM_FONTS_PATHS$kotlin_release() {
            return SystemFontsParser.SYSTEM_FONTS_PATHS;
        }

        public final List<Fonts.Family> parseFontsXML$kotlin_release(InputStream xmlFileStream) throws XmlPullParserException, IOException {
            xmlFileStream.getClass();
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            return readRootElement(xmlPullParserNewPullParser);
        }

        public final Map<String, Fonts.Family> parseFontsXMLMap$kotlin_release(InputStream xmlFileStream) throws XmlPullParserException, IOException {
            xmlFileStream.getClass();
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            return readRootElementMap(xmlPullParserNewPullParser);
        }

        private Companion() {
        }
    }
}
