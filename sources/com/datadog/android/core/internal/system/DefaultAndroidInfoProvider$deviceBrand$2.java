package com.datadog.android.core.internal.system;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.ypd;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DefaultAndroidInfoProvider$deviceBrand$2 extends mj8 implements gu5<String> {
    final /* synthetic */ String $rawDeviceBrand;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAndroidInfoProvider$deviceBrand$2(String str) {
        super(0);
        this.$rawDeviceBrand = str;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        String strValueOf;
        String str = this.$rawDeviceBrand;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale locale = Locale.US;
            locale.getClass();
            strValueOf = ypd.Z(cCharAt, locale);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
