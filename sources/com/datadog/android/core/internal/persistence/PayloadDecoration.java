package com.datadog.android.core.internal.persistence;

import defpackage.a32;
import defpackage.wl7;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "", "prefix", "", "suffix", "separator", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getPrefix", "()Ljava/lang/CharSequence;", "prefixBytes", "", "getPrefixBytes", "()[B", "getSeparator", "separatorBytes", "getSeparatorBytes", "getSuffix", "suffixBytes", "getSuffixBytes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class PayloadDecoration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PayloadDecoration JSON_ARRAY_DECORATION = new PayloadDecoration("[", "]", ",");
    private static final PayloadDecoration NEW_LINE_DECORATION = new PayloadDecoration("", "", "\n");
    private final CharSequence prefix;
    private final byte[] prefixBytes;
    private final CharSequence separator;
    private final byte[] separatorBytes;
    private final CharSequence suffix;
    private final byte[] suffixBytes;

    public PayloadDecoration(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        this.prefix = charSequence;
        this.suffix = charSequence2;
        this.separator = charSequence3;
        String string = charSequence3.toString();
        Charset charset = a32.b;
        byte[] bytes = string.getBytes(charset);
        bytes.getClass();
        this.separatorBytes = bytes;
        byte[] bytes2 = charSequence.toString().getBytes(charset);
        bytes2.getClass();
        this.prefixBytes = bytes2;
        byte[] bytes3 = charSequence2.toString().getBytes(charset);
        bytes3.getClass();
        this.suffixBytes = bytes3;
    }

    public static /* synthetic */ PayloadDecoration copy$default(PayloadDecoration payloadDecoration, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = payloadDecoration.prefix;
        }
        if ((i & 2) != 0) {
            charSequence2 = payloadDecoration.suffix;
        }
        if ((i & 4) != 0) {
            charSequence3 = payloadDecoration.separator;
        }
        return payloadDecoration.copy(charSequence, charSequence2, charSequence3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getPrefix() {
        return this.prefix;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharSequence getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CharSequence getSeparator() {
        return this.separator;
    }

    public final PayloadDecoration copy(CharSequence prefix, CharSequence suffix, CharSequence separator) {
        prefix.getClass();
        suffix.getClass();
        separator.getClass();
        return new PayloadDecoration(prefix, suffix, separator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayloadDecoration)) {
            return false;
        }
        PayloadDecoration payloadDecoration = (PayloadDecoration) other;
        return wl7.b(this.prefix, payloadDecoration.prefix) && wl7.b(this.suffix, payloadDecoration.suffix) && wl7.b(this.separator, payloadDecoration.separator);
    }

    public final CharSequence getPrefix() {
        return this.prefix;
    }

    public final byte[] getPrefixBytes() {
        return this.prefixBytes;
    }

    public final CharSequence getSeparator() {
        return this.separator;
    }

    public final byte[] getSeparatorBytes() {
        return this.separatorBytes;
    }

    public final CharSequence getSuffix() {
        return this.suffix;
    }

    public final byte[] getSuffixBytes() {
        return this.suffixBytes;
    }

    public int hashCode() {
        return this.separator.hashCode() + ((this.suffix.hashCode() + (this.prefix.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "PayloadDecoration(prefix=" + ((Object) this.prefix) + ", suffix=" + ((Object) this.suffix) + ", separator=" + ((Object) this.separator) + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/internal/persistence/PayloadDecoration$Companion;", "", "()V", "JSON_ARRAY_DECORATION", "Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "getJSON_ARRAY_DECORATION", "()Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "NEW_LINE_DECORATION", "getNEW_LINE_DECORATION", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PayloadDecoration getJSON_ARRAY_DECORATION() {
            return PayloadDecoration.JSON_ARRAY_DECORATION;
        }

        public final PayloadDecoration getNEW_LINE_DECORATION() {
            return PayloadDecoration.NEW_LINE_DECORATION;
        }

        private Companion() {
        }
    }
}
