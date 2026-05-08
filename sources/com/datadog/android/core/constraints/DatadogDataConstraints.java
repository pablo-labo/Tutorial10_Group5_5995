package com.datadog.android.core.constraints;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.MapUtilsKt;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.bg;
import defpackage.gu5;
import defpackage.kc9;
import defpackage.mj8;
import defpackage.pxc;
import defpackage.u63;
import defpackage.ut0;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002JP\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\u0004\b\u0000\u0010\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u001a0\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0016J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0016J(\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0\u00192\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\t0\u0006X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000b¨\u0006&"}, d2 = {"Lcom/datadog/android/core/constraints/DatadogDataConstraints;", "Lcom/datadog/android/core/constraints/DataConstraints;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", "tagTransforms", "", "Lkotlin/Function1;", "", "Lcom/datadog/android/core/internal/constraints/StringTransform;", "getTagTransforms$annotations", "()V", "convertAttributeKey", "rawKey", "prefixDotCount", "", "convertTag", "rawTag", "isKeyReserved", "", "tag", "resolveDiscardedAttrsWarning", "attributesGroupName", "discardedCount", "validateAttributes", "", "T", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "keyPrefix", "reservedKeys", "", "validateTags", "tags", "validateTimings", "", "timings", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class DatadogDataConstraints implements DataConstraints {
    public static final String CUSTOM_TIMING_KEY_REPLACED_WARNING = "Invalid timing name: %s, sanitized to: %s";
    private static final int MAX_ATTR_COUNT = 128;
    private static final int MAX_DEPTH_LEVEL = 9;
    private static final int MAX_TAG_COUNT = 100;
    private static final int MAX_TAG_LENGTH = 200;
    private final InternalLogger internalLogger;
    private final List<Function1<String, String>> tagTransforms;
    private static final Set<String> reservedTagKeys = ut0.I0(new String[]{LogAttributes.HOST, "device", "source", "service"});

    /* JADX INFO: renamed from: com.datadog.android.core.constraints.DatadogDataConstraints$validateTags$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05001 extends mj8 implements gu5<String> {
        final /* synthetic */ int $discardedCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05001(int i) {
            super(0);
            this.$discardedCount = i;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return bg.d(this.$discardedCount, "too many tags were added, ", " had to be discarded.");
        }
    }

    public DatadogDataConstraints(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.tagTransforms = u63.a0(DatadogDataConstraints$tagTransforms$1.INSTANCE, DatadogDataConstraints$tagTransforms$2.INSTANCE, DatadogDataConstraints$tagTransforms$3.INSTANCE, DatadogDataConstraints$tagTransforms$4.INSTANCE, DatadogDataConstraints$tagTransforms$5.INSTANCE, new DatadogDataConstraints$tagTransforms$6(this));
    }

    private final String convertAttributeKey(String rawKey, int prefixDotCount) {
        ArrayList arrayList = new ArrayList(rawKey.length());
        int i = 0;
        for (int i2 = 0; i2 < rawKey.length(); i2++) {
            char cCharAt = rawKey.charAt(i2);
            if (cCharAt == '.' && (prefixDotCount = prefixDotCount + 1) > 9) {
                cCharAt = '_';
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        char[] cArr = new char[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cArr[i] = ((Character) it.next()).charValue();
            i++;
        }
        return new String(cArr);
    }

    private final String convertTag(String rawTag) {
        Iterator<T> it = this.tagTransforms.iterator();
        while (it.hasNext()) {
            rawTag = rawTag == null ? null : (String) ((Function1) it.next()).invoke(rawTag);
        }
        return rawTag;
    }

    private static /* synthetic */ void getTagTransforms$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKeyReserved(String tag) {
        int iR = zve.R(tag, ':', 0, false, 6);
        if (iR <= 0) {
            return false;
        }
        return reservedTagKeys.contains(tag.substring(0, iR));
    }

    private final String resolveDiscardedAttrsWarning(String attributesGroupName, int discardedCount) {
        if (attributesGroupName == null) {
            return bg.d(discardedCount, "Too many attributes were added, ", " had to be discarded.");
        }
        return "Too many attributes were added for [" + attributesGroupName + "], " + discardedCount + " had to be discarded.";
    }

    @Override // com.datadog.android.core.constraints.DataConstraints
    public <T> Map<String, T> validateAttributes(Map<String, ? extends T> attributes, String keyPrefix, String attributesGroupName, Set<String> reservedKeys) {
        attributes.getClass();
        reservedKeys.getClass();
        int i = 0;
        if (keyPrefix != null) {
            int i2 = 0;
            while (i < keyPrefix.length()) {
                if (keyPrefix.charAt(i) == '.') {
                    i2++;
                }
                i++;
            }
            i = i2 + 1;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends T> entry : attributes.entrySet()) {
            Pair pair = null;
            if (entry.getKey() == null) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new DatadogDataConstraints$validateAttributes$convertedAttributes$1$1(entry), (Throwable) null, false, (Map) null, 56, (Object) null);
            } else if (reservedKeys.contains(entry.getKey())) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new DatadogDataConstraints$validateAttributes$convertedAttributes$1$2(entry), (Throwable) null, false, (Map) null, 56, (Object) null);
            } else {
                String strConvertAttributeKey = convertAttributeKey(entry.getKey(), i);
                if (!wl7.b(strConvertAttributeKey, entry.getKey())) {
                    InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new DatadogDataConstraints$validateAttributes$convertedAttributes$1$3(entry, strConvertAttributeKey), (Throwable) null, false, (Map) null, 56, (Object) null);
                }
                pair = new Pair(strConvertAttributeKey, entry.getValue());
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        int size = arrayList.size() - 128;
        if (size > 0) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass1(resolveDiscardedAttrsWarning(attributesGroupName, size)), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        return MapUtilsKt.toMutableMap(z92.q1(arrayList, 128));
    }

    @Override // com.datadog.android.core.constraints.DataConstraints
    public List<String> validateTags(List<String> tags) {
        tags.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : tags) {
            String strConvertTag = convertTag(str);
            if (strConvertTag == null) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new DatadogDataConstraints$validateTags$convertedTags$1$1(str), (Throwable) null, false, (Map) null, 56, (Object) null);
            } else if (!strConvertTag.equals(str)) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new DatadogDataConstraints$validateTags$convertedTags$1$2(str, strConvertTag), (Throwable) null, true, (Map) null, 40, (Object) null);
            }
            if (strConvertTag != null) {
                arrayList.add(strConvertTag);
            }
        }
        int size = arrayList.size() - 100;
        if (size > 0) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05001(size), (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        return z92.q1(arrayList, 100);
    }

    @Override // com.datadog.android.core.constraints.DataConstraints
    public Map<String, Long> validateTimings(Map<String, Long> timings) {
        timings.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(timings.size()));
        Iterator<T> it = timings.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strE = new pxc("[^a-zA-Z0-9\\-_.@$]").e((CharSequence) entry.getKey(), "_");
            if (!strE.equals(entry.getKey())) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new DatadogDataConstraints$validateTimings$1$1(entry, strE), (Throwable) null, false, (Map) null, 56, (Object) null);
            }
            linkedHashMap.put(strE, entry.getValue());
        }
        return new LinkedHashMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $warningMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$warningMessage = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return this.$warningMessage;
        }
    }
}
