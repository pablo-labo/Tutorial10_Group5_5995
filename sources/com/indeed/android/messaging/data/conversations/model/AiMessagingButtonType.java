package com.indeed.android.messaging.data.conversations.model;

import defpackage.ojh;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/model/AiMessagingButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK_TO_OPTIONS", "REFINE_DRAFT", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AiMessagingButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AiMessagingButtonType[] $VALUES;
    public static final AiMessagingButtonType BACK_TO_OPTIONS = new AiMessagingButtonType("BACK_TO_OPTIONS", 0);
    public static final AiMessagingButtonType REFINE_DRAFT = new AiMessagingButtonType("REFINE_DRAFT", 1);

    private static final /* synthetic */ AiMessagingButtonType[] $values() {
        return new AiMessagingButtonType[]{BACK_TO_OPTIONS, REFINE_DRAFT};
    }

    static {
        AiMessagingButtonType[] aiMessagingButtonTypeArr$values = $values();
        $VALUES = aiMessagingButtonTypeArr$values;
        $ENTRIES = ojh.k(aiMessagingButtonTypeArr$values);
    }

    private AiMessagingButtonType(String str, int i) {
    }

    public static EnumEntries<AiMessagingButtonType> getEntries() {
        return $ENTRIES;
    }

    public static AiMessagingButtonType valueOf(String str) {
        return (AiMessagingButtonType) Enum.valueOf(AiMessagingButtonType.class, str);
    }

    public static AiMessagingButtonType[] values() {
        return (AiMessagingButtonType[]) $VALUES.clone();
    }
}
