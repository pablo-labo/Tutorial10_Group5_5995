package com.datadog.android.core.internal.persistence.tlvformat;

import defpackage.kc9;
import defpackage.u4g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "", "Lu4g;", "rawValue", "<init>", "(Ljava/lang/String;IS)V", "S", "getRawValue-Mh2AYeg", "()S", "Companion", "VERSION_CODE", "DATA", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum TLVBlockType {
    VERSION_CODE(0),
    DATA(1);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<u4g, TLVBlockType> map;
    private final short rawValue;

    static {
        TLVBlockType[] tLVBlockTypeArrValues = values();
        int iV = kc9.V(tLVBlockTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (TLVBlockType tLVBlockType : tLVBlockTypeArrValues) {
            linkedHashMap.put(new u4g(tLVBlockType.rawValue), tLVBlockType);
        }
        map = linkedHashMap;
    }

    TLVBlockType(short s) {
        this.rawValue = s;
    }

    /* JADX INFO: renamed from: getRawValue-Mh2AYeg, reason: not valid java name and from getter */
    public final short getRawValue() {
        return this.rawValue;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType$Companion;", "", "<init>", "()V", "Lu4g;", "value", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "fromValue-xj2QHRw", "(S)Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockType;", "fromValue", "", "map", "Ljava/util/Map;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fromValue-xj2QHRw, reason: not valid java name */
        public final TLVBlockType m18fromValuexj2QHRw(short value) {
            return (TLVBlockType) TLVBlockType.map.get(new u4g(value));
        }

        private Companion() {
        }
    }
}
