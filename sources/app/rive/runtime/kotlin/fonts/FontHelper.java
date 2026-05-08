package app.rive.runtime.kotlin.fonts;

import android.util.Log;
import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.a7e;
import defpackage.ak2;
import defpackage.cc5;
import defpackage.hb5;
import defpackage.hs4;
import defpackage.kc9;
import defpackage.r6e;
import defpackage.sy3;
import defpackage.t92;
import defpackage.v6e;
import defpackage.wd;
import defpackage.wl7;
import defpackage.xrf;
import defpackage.y92;
import defpackage.z92;
import defpackage.zr4;
import defpackage.zve;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontHelper;", "", "()V", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class FontHelper {
    public static final int $stable = 0;
    private static final String TAG = "FontHelper";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicReference<Map<String, Fonts.Family>> familiesMapCache = new AtomicReference<>(null);
    private static final AtomicReference<List<Fonts.Family>> familiesListCache = new AtomicReference<>(null);

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\u001b\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0018H\u0000¢\u0006\u0004\b!\u0010\u001eJ\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b#\u0010 J\u001b\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00182\b\b\u0002\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b+\u0010/J\u0017\u00102\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u0004\u0018\u0001042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0007¢\u0006\u0004\b9\u0010\u0003R\u0014\u0010:\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00180<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>¨\u0006@"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontHelper$Companion;", "", "<init>", "()V", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "families", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "resultSet", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "weight", "", "style", "Lj6g;", "filterFamilies", "(Ljava/util/List;Ljava/util/Set;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;)V", "Lr6e;", "matchingFamiliesSequence", "requestedLang", "requestedWeight", "requestedStyle", "processMatchingFamilies", "(Lr6e;Ljava/lang/String;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;)Ljava/util/List;", "", "fontFamilies", "filterNonExistingFonts", "(Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/List;)Ljava/util/List;", "getSystemFonts", "()Ljava/util/Map;", "getSystemFontList", "()Ljava/util/List;", "loadFonts$kotlin_release", "loadFonts", "loadFontList$kotlin_release", "loadFontList", "Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "opts", "getFallbackFont", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "getFallbackFonts", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Ljava/util/List;", "findMatches$kotlin_release", "(Ljava/util/Map;Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Ljava/util/List;", "findMatches", "fontFamiliesList", "(Ljava/util/List;Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Ljava/util/List;", "font", "Ljava/io/File;", "getFontFile", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Font;)Ljava/io/File;", "", "getFontBytes", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Font;)[B", "getFallbackFontBytes", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)[B", "resetForTesting", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReference;", "familiesListCache", "Ljava/util/concurrent/atomic/AtomicReference;", "familiesMapCache", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void filterFamilies(List<Fonts.Family> families, Set<Fonts.Font> resultSet, Fonts.Weight weight, String style) {
            r6e<Fonts.Font> y92Var;
            for (Fonts.Family family : families) {
                if (weight == null) {
                    y92Var = v6e.M(z92.G0(family.getFonts().values()), new wd(10));
                } else {
                    List<Fonts.Font> list = family.getFonts().get(weight);
                    y92Var = list != null ? new y92(list) : hs4.a;
                }
                for (Fonts.Font font : y92Var) {
                    if (style == null || zve.U(style) || wl7.b(font.getStyle(), style)) {
                        resultSet.add(font);
                    }
                }
            }
        }

        private final List<Fonts.Family> filterNonExistingFonts(List<Fonts.Family> fontFamilies) {
            if (fontFamilies.isEmpty()) {
                return fontFamilies;
            }
            ArrayList arrayList = new ArrayList();
            for (Fonts.Family family : fontFamilies) {
                Map<Fonts.Weight, List<Fonts.Font>> fonts = family.getFonts();
                LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(fonts.size()));
                Iterator<T> it = fonts.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (FontHelper.INSTANCE.getFontFile((Fonts.Font) obj) != null) {
                            arrayList2.add(obj);
                        }
                    }
                    linkedHashMap.put(key, arrayList2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!((List) entry2.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Fonts.Family family2 = !linkedHashMap2.isEmpty() ? new Fonts.Family(family.getName(), family.getVariant(), family.getLang(), linkedHashMap2) : null;
                if (family2 != null) {
                    arrayList.add(family2);
                }
            }
            return arrayList;
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, Map map, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 2) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((Map<String, Fonts.Family>) map, fontOpts);
        }

        public static /* synthetic */ Fonts.Font getFallbackFont$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFont(fontOpts);
        }

        public static /* synthetic */ byte[] getFallbackFontBytes$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFontBytes(fontOpts);
        }

        public static /* synthetic */ List getFallbackFonts$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 1) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.getFallbackFonts(fontOpts);
        }

        private final List<Fonts.Font> processMatchingFamilies(r6e<Fonts.Family> matchingFamiliesSequence, final String requestedLang, Fonts.Weight requestedWeight, String requestedStyle) {
            List listW = a7e.W(matchingFamiliesSequence);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listW) {
                String name = ((Fonts.Family) obj).getName();
                if (name == null || zve.U(name)) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.a();
            List list2 = (List) pair.b();
            List<Fonts.Family> listP1 = z92.p1(list, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ak2.i(Boolean.valueOf(wl7.b(((Fonts.Family) t2).getLang(), requestedLang)), Boolean.valueOf(wl7.b(((Fonts.Family) t).getLang(), requestedLang)));
                }
            });
            List<Fonts.Family> listP12 = z92.p1(list2, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ak2.i(Boolean.valueOf(wl7.b(((Fonts.Family) t2).getLang(), requestedLang)), Boolean.valueOf(wl7.b(((Fonts.Family) t).getLang(), requestedLang)));
                }
            });
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            filterFamilies(listP1, linkedHashSet, requestedWeight, requestedStyle);
            filterFamilies(listP12, linkedHashSet, requestedWeight, requestedStyle);
            return z92.z1(linkedHashSet);
        }

        public final List<Fonts.Font> findMatches$kotlin_release(Map<String, Fonts.Family> fontFamilies, Fonts.FontOpts opts) {
            fontFamilies.getClass();
            opts.getClass();
            cc5 cc5Var = new cc5(z92.G0(fontFamilies.entrySet()), true, new FontHelper$Companion$findMatches$matchingFamiliesSequence$1(opts.getFamilyName(), opts.getLang()));
            FontHelper$Companion$findMatches$matchingFamiliesSequence$2 fontHelper$Companion$findMatches$matchingFamiliesSequence$2 = FontHelper$Companion$findMatches$matchingFamiliesSequence$2.INSTANCE;
            fontHelper$Companion$findMatches$matchingFamiliesSequence$2.getClass();
            return processMatchingFamilies(new xrf(cc5Var, fontHelper$Companion$findMatches$matchingFamiliesSequence$2), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        public final Fonts.Font getFallbackFont(Fonts.FontOpts opts) {
            if (opts == null) {
                opts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return (Fonts.Font) z92.Q0(getFallbackFonts(opts));
        }

        public final byte[] getFallbackFontBytes(Fonts.FontOpts opts) {
            if (opts == null) {
                opts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            Fonts.Font fallbackFont = getFallbackFont(opts);
            if (fallbackFont != null) {
                return FontHelper.INSTANCE.getFontBytes(fallbackFont);
            }
            return null;
        }

        public final List<Fonts.Font> getFallbackFonts(Fonts.FontOpts opts) {
            opts.getClass();
            List<Fonts.Family> systemFontList = getSystemFontList();
            if (!systemFontList.isEmpty()) {
                return findMatches$kotlin_release(systemFontList, opts);
            }
            Log.e(FontHelper.TAG, "getFallbackFonts: no system font found");
            return zr4.a;
        }

        public final byte[] getFontBytes(Fonts.Font font) {
            font.getClass();
            File fontFile = getFontFile(font);
            if (fontFile != null) {
                return hb5.S(fontFile);
            }
            return null;
        }

        public final File getFontFile(Fonts.Font font) {
            File fileInvoke;
            font.getClass();
            y92 y92VarG0 = z92.G0(SystemFontsParser.INSTANCE.getSYSTEM_FONTS_PATHS$kotlin_release());
            FontHelper$Companion$getFontFile$1 fontHelper$Companion$getFontFile$1 = new FontHelper$Companion$getFontFile$1(font);
            Iterator<Object> it = y92VarG0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fileInvoke = null;
                    break;
                }
                fileInvoke = fontHelper$Companion$getFontFile$1.invoke(it.next());
                if (fileInvoke.exists()) {
                    break;
                }
            }
            return fileInvoke;
        }

        public final List<Fonts.Family> getSystemFontList() {
            List<Fonts.Family> listLoadFontList$kotlin_release;
            List<Fonts.Family> list = (List) FontHelper.familiesListCache.get();
            if (list != null) {
                return list;
            }
            synchronized (this) {
                listLoadFontList$kotlin_release = (List) FontHelper.familiesListCache.get();
                if (listLoadFontList$kotlin_release == null) {
                    listLoadFontList$kotlin_release = FontHelper.INSTANCE.loadFontList$kotlin_release();
                }
            }
            return listLoadFontList$kotlin_release;
        }

        @sy3
        public final Map<String, Fonts.Family> getSystemFonts() {
            Map<String, Fonts.Family> mapLoadFonts$kotlin_release;
            Map<String, Fonts.Family> map = (Map) FontHelper.familiesMapCache.get();
            if (map != null) {
                return map;
            }
            synchronized (this) {
                mapLoadFonts$kotlin_release = (Map) FontHelper.familiesMapCache.get();
                if (mapLoadFonts$kotlin_release == null) {
                    mapLoadFonts$kotlin_release = FontHelper.INSTANCE.loadFonts$kotlin_release();
                }
            }
            return mapLoadFonts$kotlin_release;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<app.rive.runtime.kotlin.fonts.Fonts.Family> loadFontList$kotlin_release() throws java.io.IOException {
            /*
                r6 = this;
                java.lang.String r0 = "/system/etc/system_fonts.xml"
                java.lang.String r1 = "/system/etc/system_fallback.xml"
                java.lang.String r2 = "/system/etc/fonts.xml"
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                r6e r0 = defpackage.ut0.e0(r0)
                app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFontList$validPath$1 r1 = app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFontList$validPath$1.INSTANCE
                r1.getClass()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2f
                java.lang.Object r2 = r0.next()
                java.lang.Object r2 = r1.invoke(r2)
                r3 = r2
                java.io.File r3 = (java.io.File) r3
                boolean r3 = r3.exists()
                if (r3 == 0) goto L17
                goto L30
            L2f:
                r2 = 0
            L30:
                java.io.File r2 = (java.io.File) r2
                zr4 r0 = defpackage.zr4.a
                java.lang.String r1 = "FontHelper"
                if (r2 == 0) goto L6d
                java.io.FileInputStream r3 = new java.io.FileInputStream
                r3.<init>(r2)
                app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion r2 = app.rive.runtime.kotlin.fonts.SystemFontsParser.INSTANCE     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                java.util.List r2 = r2.parseFontsXML$kotlin_release(r3)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                goto L60
            L44:
                r6 = move-exception
                goto L67
            L46:
                r2 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
                r4.<init>()     // Catch: java.lang.Throwable -> L44
                java.lang.String r5 = "Error parsing fonts XML: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L44
                java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> L44
                r4.append(r5)     // Catch: java.lang.Throwable -> L44
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L44
                android.util.Log.e(r1, r4, r2)     // Catch: java.lang.Throwable -> L44
                r2 = r0
            L60:
                r3.close()
                if (r2 == 0) goto L6d
                r0 = r2
                goto L72
            L67:
                throw r6     // Catch: java.lang.Throwable -> L68
            L68:
                r0 = move-exception
                defpackage.c0h.q(r3, r6)
                throw r0
            L6d:
                java.lang.String r2 = "No valid system font XML file found at expected paths."
                android.util.Log.w(r1, r2)
            L72:
                java.util.List r6 = r6.filterNonExistingFonts(r0)
                java.util.concurrent.atomic.AtomicReference r0 = app.rive.runtime.kotlin.fonts.FontHelper.access$getFamiliesListCache$cp()
                r0.set(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.fonts.FontHelper.Companion.loadFontList$kotlin_release():java.util.List");
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Map<java.lang.String, app.rive.runtime.kotlin.fonts.Fonts.Family> loadFonts$kotlin_release() throws java.io.IOException {
            /*
                r6 = this;
                java.lang.String r0 = "/system/etc/system_fonts.xml"
                java.lang.String r1 = "/system/etc/system_fallback.xml"
                java.lang.String r2 = "/system/etc/fonts.xml"
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                r6e r0 = defpackage.ut0.e0(r0)
                app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFonts$validPath$1 r1 = app.rive.runtime.kotlin.fonts.FontHelper$Companion$loadFonts$validPath$1.INSTANCE
                r1.getClass()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2f
                java.lang.Object r2 = r0.next()
                java.lang.Object r2 = r1.invoke(r2)
                r3 = r2
                java.io.File r3 = (java.io.File) r3
                boolean r3 = r3.exists()
                if (r3 == 0) goto L17
                goto L30
            L2f:
                r2 = 0
            L30:
                java.io.File r2 = (java.io.File) r2
                bs4 r0 = defpackage.bs4.a
                java.lang.String r1 = "FontHelper"
                if (r2 == 0) goto L6d
                java.io.FileInputStream r3 = new java.io.FileInputStream
                r3.<init>(r2)
                app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion r2 = app.rive.runtime.kotlin.fonts.SystemFontsParser.INSTANCE     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                java.util.Map r2 = r2.parseFontsXMLMap$kotlin_release(r3)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                goto L60
            L44:
                r6 = move-exception
                goto L67
            L46:
                r2 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
                r4.<init>()     // Catch: java.lang.Throwable -> L44
                java.lang.String r5 = "Error parsing fonts XML: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L44
                java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> L44
                r4.append(r5)     // Catch: java.lang.Throwable -> L44
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L44
                android.util.Log.e(r1, r4, r2)     // Catch: java.lang.Throwable -> L44
                r2 = r0
            L60:
                r3.close()
                if (r2 == 0) goto L6d
                r0 = r2
                goto L72
            L67:
                throw r6     // Catch: java.lang.Throwable -> L68
            L68:
                r0 = move-exception
                defpackage.c0h.q(r3, r6)
                throw r0
            L6d:
                java.lang.String r2 = "No valid system font XML file found at expected paths."
                android.util.Log.w(r1, r2)
            L72:
                java.util.Map r6 = r6.filterNonExistingFonts(r0)
                java.util.concurrent.atomic.AtomicReference r0 = app.rive.runtime.kotlin.fonts.FontHelper.access$getFamiliesMapCache$cp()
                r0.set(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.fonts.FontHelper.Companion.loadFonts$kotlin_release():java.util.Map");
        }

        public final void resetForTesting() {
            FontHelper.familiesMapCache.set(null);
            FontHelper.familiesListCache.set(null);
        }

        private Companion() {
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, List list, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 2) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((List<Fonts.Family>) list, fontOpts);
        }

        public final List<Fonts.Font> findMatches$kotlin_release(List<Fonts.Family> fontFamiliesList, Fonts.FontOpts opts) {
            fontFamiliesList.getClass();
            opts.getClass();
            return processMatchingFamilies(new cc5(new y92(fontFamiliesList), true, new FontHelper$Companion$findMatches$matchingFamiliesSequence$3(opts.getFamilyName(), opts.getLang())), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        private final Map<String, Fonts.Family> filterNonExistingFonts(Map<String, Fonts.Family> fontFamilies) {
            String name;
            if (fontFamilies.isEmpty()) {
                return fontFamilies;
            }
            List<Fonts.Family> listFilterNonExistingFonts = filterNonExistingFonts(z92.z1(fontFamilies.values()));
            int iV = kc9.V(t92.r0(listFilterNonExistingFonts, 10));
            if (iV < 16) {
                iV = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
            for (Object obj : listFilterNonExistingFonts) {
                Fonts.Family family = (Fonts.Family) obj;
                String name2 = family.getName();
                if (name2 != null && name2.length() != 0) {
                    name = family.getName();
                } else {
                    name = ((Fonts.Font) z92.O0(t92.s0(family.getFonts().values()))).getName();
                }
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }
    }
}
