package com.indeed.android.tare.broadcast;

import defpackage.boa;
import defpackage.o7e;
import defpackage.ojh;
import defpackage.qt8;
import defpackage.web;
import defpackage.ym0;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/tare/broadcast/ApplyType;", "", "<init>", "(Ljava/lang/String;I)V", "AutoApply", "Companion", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApplyType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApplyType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final ApplyType AutoApply = new ApplyType("AutoApply", 0);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ApplyType[] $values() {
        return new ApplyType[]{AutoApply};
    }

    static {
        ApplyType[] applyTypeArr$values = $values();
        $VALUES = applyTypeArr$values;
        $ENTRIES = ojh.k(applyTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = boa.E(qt8.b, new ym0(1));
    }

    private ApplyType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return web.j("com.indeed.android.tare.broadcast.ApplyType", values(), new String[]{"autoApply"}, new Annotation[][]{null});
    }

    public static EnumEntries<ApplyType> getEntries() {
        return $ENTRIES;
    }

    public static ApplyType valueOf(String str) {
        return (ApplyType) Enum.valueOf(ApplyType.class, str);
    }

    public static ApplyType[] values() {
        return (ApplyType[]) $VALUES.clone();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/ApplyType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/ApplyType;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ApplyType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ApplyType> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
