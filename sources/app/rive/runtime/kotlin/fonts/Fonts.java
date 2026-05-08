package app.rive.runtime.kotlin.fonts;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.akb;
import defpackage.k6;
import defpackage.nic;
import defpackage.oh7;
import defpackage.vve;
import defpackage.w40;
import defpackage.wl7;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts;", "", "()V", "Alias", "Axis", "Family", "FileFont", "Font", "FontOpts", "Weight", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class Fonts {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "", "tag", "", "styleValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getStyleValue", "()Ljava/lang/String;", "getTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class Axis {
        public static final int $stable = 0;
        private final String styleValue;
        private final String tag;

        public Axis(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.tag = str;
            this.styleValue = str2;
        }

        public static /* synthetic */ Axis copy$default(Axis axis, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = axis.tag;
            }
            if ((i & 2) != 0) {
                str2 = axis.styleValue;
            }
            return axis.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStyleValue() {
            return this.styleValue;
        }

        public final Axis copy(String tag, String styleValue) {
            tag.getClass();
            styleValue.getClass();
            return new Axis(tag, styleValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Axis)) {
                return false;
            }
            Axis axis = (Axis) other;
            return wl7.b(this.tag, axis.tag) && wl7.b(this.styleValue, axis.styleValue);
        }

        public final String getStyleValue() {
            return this.styleValue;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return this.styleValue.hashCode() + (this.tag.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Axis(tag=");
            sb.append(this.tag);
            sb.append(", styleValue=");
            return w40.f(sb, this.styleValue, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "", "familyName", "", "lang", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "style", "(Ljava/lang/String;Ljava/lang/String;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;)V", "getFamilyName", "()Ljava/lang/String;", "getLang", "getStyle", "getWeight", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class FontOpts {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final FontOpts DEFAULT = new FontOpts("sans-serif", null, null, null, 14, null);
        private final String familyName;
        private final String lang;
        private final String style;
        private final Weight weight;

        public /* synthetic */ FontOpts(String str, String str2, Weight weight, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Weight.INSTANCE.getNORMAL() : weight, (i & 8) != 0 ? Font.STYLE_NORMAL : str3);
        }

        public static /* synthetic */ FontOpts copy$default(FontOpts fontOpts, String str, String str2, Weight weight, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fontOpts.familyName;
            }
            if ((i & 2) != 0) {
                str2 = fontOpts.lang;
            }
            if ((i & 4) != 0) {
                weight = fontOpts.weight;
            }
            if ((i & 8) != 0) {
                str3 = fontOpts.style;
            }
            return fontOpts.copy(str, str2, weight, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFamilyName() {
            return this.familyName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Weight getWeight() {
            return this.weight;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        public final FontOpts copy(String familyName, String lang, Weight weight, String style) {
            return new FontOpts(familyName, lang, weight, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FontOpts)) {
                return false;
            }
            FontOpts fontOpts = (FontOpts) other;
            return wl7.b(this.familyName, fontOpts.familyName) && wl7.b(this.lang, fontOpts.lang) && wl7.b(this.weight, fontOpts.weight) && wl7.b(this.style, fontOpts.style);
        }

        public final String getFamilyName() {
            return this.familyName;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getStyle() {
            return this.style;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            String str = this.familyName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lang;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Weight weight = this.weight;
            int iHashCode3 = (iHashCode2 + (weight == null ? 0 : weight.hashCode())) * 31;
            String str3 = this.style;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FontOpts(familyName=");
            sb.append(this.familyName);
            sb.append(", lang=");
            sb.append(this.lang);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", style=");
            return w40.f(sb, this.style, ')');
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts$Companion;", "", "()V", "DEFAULT", "Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "getDEFAULT", "()Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FontOpts getDEFAULT() {
                return FontOpts.DEFAULT;
            }

            private Companion() {
            }
        }

        public FontOpts(String str, String str2, Weight weight, String str3) {
            this.familyName = str;
            this.lang = str2;
            this.weight = weight;
            this.style = str3;
        }

        public FontOpts() {
            this(null, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "", "weight", "", "(I)V", "getWeight", "()I", "compareTo", "other", "component1", "copy", "equals", "", "", "hashCode", "toString", "", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class Weight implements Comparable<Weight> {
        public static final int $stable = 0;
        private final int weight;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Weight NORMAL = new Weight(DataOkHttpUploader.HTTP_BAD_REQUEST);
        private static final Weight BOLD = new Weight(700);

        public /* synthetic */ Weight(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? DataOkHttpUploader.HTTP_BAD_REQUEST : i);
        }

        public static /* synthetic */ Weight copy$default(Weight weight, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = weight.weight;
            }
            return weight.copy(i);
        }

        @Override // java.lang.Comparable
        public int compareTo(Weight other) {
            other.getClass();
            return wl7.c(this.weight, other.weight);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWeight() {
            return this.weight;
        }

        public final Weight copy(int weight) {
            return new Weight(weight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Weight) && this.weight == ((Weight) other).weight;
        }

        public final int getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Integer.hashCode(this.weight);
        }

        public String toString() {
            return k6.h(new StringBuilder("Weight(weight="), this.weight, ')');
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000f"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Weight$Companion;", "", "()V", "BOLD", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "getBOLD", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "NORMAL", "getNORMAL", "fromInt", "intValue", "", "fromString", "stringValue", "", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Weight fromInt$default(Companion companion, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = DataOkHttpUploader.HTTP_BAD_REQUEST;
                }
                return companion.fromInt(i);
            }

            public final Weight fromInt(int intValue) {
                return new Weight(nic.D(intValue, new oh7(0, 1000, 1)));
            }

            public final Weight fromString(String stringValue) {
                Integer numB;
                return new Weight((stringValue == null || (numB = vve.B(10, stringValue)) == null) ? DataOkHttpUploader.HTTP_BAD_REQUEST : nic.D(numB.intValue(), new oh7(0, 1000, 1)));
            }

            public final Weight getBOLD() {
                return Weight.BOLD;
            }

            public final Weight getNORMAL() {
                return Weight.NORMAL;
            }

            private Companion() {
            }
        }

        public Weight(int i) {
            this.weight = i;
        }

        public Weight() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$FileFont;", "", "name", "", "variant", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLang", "()Ljava/lang/String;", "getName", "getVariant", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class FileFont {
        public static final int $stable = 0;
        private final String lang;
        private final String name;
        private final String variant;

        public /* synthetic */ FileFont(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ FileFont copy$default(FileFont fileFont, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileFont.name;
            }
            if ((i & 2) != 0) {
                str2 = fileFont.variant;
            }
            if ((i & 4) != 0) {
                str3 = fileFont.lang;
            }
            return fileFont.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        public final FileFont copy(String name, String variant, String lang) {
            name.getClass();
            return new FileFont(name, variant, lang);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileFont)) {
                return false;
            }
            FileFont fileFont = (FileFont) other;
            return wl7.b(this.name, fileFont.name) && wl7.b(this.variant, fileFont.variant) && wl7.b(this.lang, fileFont.lang);
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.variant;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lang;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FileFont(name=");
            sb.append(this.name);
            sb.append(", variant=");
            sb.append(this.variant);
            sb.append(", lang=");
            return w40.f(sb, this.lang, ')');
        }

        public FileFont(String str, String str2, String str3) {
            str.getClass();
            this.name = str;
            this.variant = str2;
            this.lang = str3;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;", "", "name", "", "original", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "(Ljava/lang/String;Ljava/lang/String;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;)V", "getName", "()Ljava/lang/String;", "getOriginal", "getWeight", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class Alias {
        public static final int $stable = 0;
        private final String name;
        private final String original;
        private final Weight weight;

        public Alias(String str, String str2, Weight weight) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.original = str2;
            this.weight = weight;
        }

        public static /* synthetic */ Alias copy$default(Alias alias, String str, String str2, Weight weight, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alias.name;
            }
            if ((i & 2) != 0) {
                str2 = alias.original;
            }
            if ((i & 4) != 0) {
                weight = alias.weight;
            }
            return alias.copy(str, str2, weight);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Weight getWeight() {
            return this.weight;
        }

        public final Alias copy(String name, String original, Weight weight) {
            name.getClass();
            original.getClass();
            return new Alias(name, original, weight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Alias)) {
                return false;
            }
            Alias alias = (Alias) other;
            return wl7.b(this.name, alias.name) && wl7.b(this.original, alias.original) && wl7.b(this.weight, alias.weight);
        }

        public final String getName() {
            return this.name;
        }

        public final String getOriginal() {
            return this.original;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iD = akb.d(this.name.hashCode() * 31, 31, this.original);
            Weight weight = this.weight;
            return iD + (weight == null ? 0 : weight.hashCode());
        }

        public String toString() {
            return "Alias(name=" + this.name + ", original=" + this.original + ", weight=" + this.weight + ')';
        }

        public /* synthetic */ Alias(String str, String str2, Weight weight, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? Weight.INSTANCE.getNORMAL() : weight);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007HÆ\u0003JI\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "", "name", "", "variant", "lang", "fonts", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFonts", "()Ljava/util/Map;", "getLang", "()Ljava/lang/String;", "getName", "getVariant", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class Family {
        public static final int $stable = 8;
        private final Map<Weight, List<Font>> fonts;
        private final String lang;
        private final String name;
        private final String variant;

        public /* synthetic */ Family(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Family copy$default(Family family, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = family.name;
            }
            if ((i & 2) != 0) {
                str2 = family.variant;
            }
            if ((i & 4) != 0) {
                str3 = family.lang;
            }
            if ((i & 8) != 0) {
                map = family.fonts;
            }
            return family.copy(str, str2, str3, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        public final Map<Weight, List<Font>> component4() {
            return this.fonts;
        }

        public final Family copy(String name, String variant, String lang, Map<Weight, ? extends List<Font>> fonts) {
            fonts.getClass();
            return new Family(name, variant, lang, fonts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Family)) {
                return false;
            }
            Family family = (Family) other;
            return wl7.b(this.name, family.name) && wl7.b(this.variant, family.variant) && wl7.b(this.lang, family.lang) && wl7.b(this.fonts, family.fonts);
        }

        public final Map<Weight, List<Font>> getFonts() {
            return this.fonts;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.variant;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lang;
            return this.fonts.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Family(name=" + this.name + ", variant=" + this.variant + ", lang=" + this.lang + ", fonts=" + this.fonts + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Family(String str, String str2, String str3, Map<Weight, ? extends List<Font>> map) {
            map.getClass();
            this.name = str;
            this.variant = str2;
            this.lang = str3;
            this.fonts = map;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "style", "", "name", "axis", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "ttcIndex", "", "postScriptName", "fallbackFor", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getAxis", "()Ljava/util/List;", "getFallbackFor", "()Ljava/lang/String;", "getName", "getPostScriptName", "getStyle", "getTtcIndex", "()I", "getWeight", "()Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final /* data */ class Font {
        public static final String STYLE_ITALIC = "italic";
        public static final String STYLE_NORMAL = "normal";
        private final List<Axis> axis;
        private final String fallbackFor;
        private final String name;
        private final String postScriptName;
        private final String style;
        private final int ttcIndex;
        private final Weight weight;
        public static final int $stable = 8;

        public Font(Weight weight, String str, String str2, List<Axis> list, int i, String str3, String str4) {
            weight.getClass();
            str.getClass();
            str2.getClass();
            this.weight = weight;
            this.style = str;
            this.name = str2;
            this.axis = list;
            this.ttcIndex = i;
            this.postScriptName = str3;
            this.fallbackFor = str4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Font copy$default(Font font, Weight weight, String str, String str2, List list, int i, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                weight = font.weight;
            }
            if ((i2 & 2) != 0) {
                str = font.style;
            }
            if ((i2 & 4) != 0) {
                str2 = font.name;
            }
            if ((i2 & 8) != 0) {
                list = font.axis;
            }
            if ((i2 & 16) != 0) {
                i = font.ttcIndex;
            }
            if ((i2 & 32) != 0) {
                str3 = font.postScriptName;
            }
            if ((i2 & 64) != 0) {
                str4 = font.fallbackFor;
            }
            String str5 = str3;
            String str6 = str4;
            int i3 = i;
            String str7 = str2;
            return font.copy(weight, str, str7, list, i3, str5, str6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Weight getWeight() {
            return this.weight;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<Axis> component4() {
            return this.axis;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getTtcIndex() {
            return this.ttcIndex;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPostScriptName() {
            return this.postScriptName;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getFallbackFor() {
            return this.fallbackFor;
        }

        public final Font copy(Weight weight, String style, String name, List<Axis> axis, int ttcIndex, String postScriptName, String fallbackFor) {
            weight.getClass();
            style.getClass();
            name.getClass();
            return new Font(weight, style, name, axis, ttcIndex, postScriptName, fallbackFor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Font)) {
                return false;
            }
            Font font = (Font) other;
            return wl7.b(this.weight, font.weight) && wl7.b(this.style, font.style) && wl7.b(this.name, font.name) && wl7.b(this.axis, font.axis) && this.ttcIndex == font.ttcIndex && wl7.b(this.postScriptName, font.postScriptName) && wl7.b(this.fallbackFor, font.fallbackFor);
        }

        public final List<Axis> getAxis() {
            return this.axis;
        }

        public final String getFallbackFor() {
            return this.fallbackFor;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPostScriptName() {
            return this.postScriptName;
        }

        public final String getStyle() {
            return this.style;
        }

        public final int getTtcIndex() {
            return this.ttcIndex;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iD = akb.d(akb.d(this.weight.hashCode() * 31, 31, this.style), 31, this.name);
            List<Axis> list = this.axis;
            int iC = w40.c(this.ttcIndex, (iD + (list == null ? 0 : list.hashCode())) * 31, 31);
            String str = this.postScriptName;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fallbackFor;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Font(weight=");
            sb.append(this.weight);
            sb.append(", style=");
            sb.append(this.style);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", axis=");
            sb.append(this.axis);
            sb.append(", ttcIndex=");
            sb.append(this.ttcIndex);
            sb.append(", postScriptName=");
            sb.append(this.postScriptName);
            sb.append(", fallbackFor=");
            return w40.f(sb, this.fallbackFor, ')');
        }

        public /* synthetic */ Font(Weight weight, String str, String str2, List list, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(weight, str, str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4);
        }
    }
}
