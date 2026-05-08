package com.indeed.android.messaging.data.conversations.model;

import defpackage.u40;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/model/SuggestedMessageModel;", "", "messageBody", "", "label", "trackingKey", "displayIndex", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getMessageBody", "()Ljava/lang/String;", "getLabel", "getTrackingKey", "getDisplayIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SuggestedMessageModel {
    public static final int $stable = 0;
    private final int displayIndex;
    private final String label;
    private final String messageBody;
    private final String trackingKey;

    public SuggestedMessageModel(String str, String str2, String str3, int i) {
        str.getClass();
        this.messageBody = str;
        this.label = str2;
        this.trackingKey = str3;
        this.displayIndex = i;
    }

    public static /* synthetic */ SuggestedMessageModel copy$default(SuggestedMessageModel suggestedMessageModel, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = suggestedMessageModel.messageBody;
        }
        if ((i2 & 2) != 0) {
            str2 = suggestedMessageModel.label;
        }
        if ((i2 & 4) != 0) {
            str3 = suggestedMessageModel.trackingKey;
        }
        if ((i2 & 8) != 0) {
            i = suggestedMessageModel.displayIndex;
        }
        return suggestedMessageModel.copy(str, str2, str3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageBody() {
        return this.messageBody;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackingKey() {
        return this.trackingKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDisplayIndex() {
        return this.displayIndex;
    }

    public final SuggestedMessageModel copy(String messageBody, String label, String trackingKey, int displayIndex) {
        messageBody.getClass();
        return new SuggestedMessageModel(messageBody, label, trackingKey, displayIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedMessageModel)) {
            return false;
        }
        SuggestedMessageModel suggestedMessageModel = (SuggestedMessageModel) other;
        return wl7.b(this.messageBody, suggestedMessageModel.messageBody) && wl7.b(this.label, suggestedMessageModel.label) && wl7.b(this.trackingKey, suggestedMessageModel.trackingKey) && this.displayIndex == suggestedMessageModel.displayIndex;
    }

    public final int getDisplayIndex() {
        return this.displayIndex;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMessageBody() {
        return this.messageBody;
    }

    public final String getTrackingKey() {
        return this.trackingKey;
    }

    public int hashCode() {
        int iHashCode = this.messageBody.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingKey;
        return Integer.hashCode(this.displayIndex) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.messageBody;
        String str2 = this.label;
        String str3 = this.trackingKey;
        int i = this.displayIndex;
        StringBuilder sbF = u40.f("SuggestedMessageModel(messageBody=", str, ", label=", str2, ", trackingKey=");
        sbF.append(str3);
        sbF.append(", displayIndex=");
        sbF.append(i);
        sbF.append(")");
        return sbF.toString();
    }
}
