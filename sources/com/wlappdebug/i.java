package com.wlappdebug;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.LocaleList;
import android.text.SpannableStringBuilder;
import defpackage.c19;
import defpackage.e19;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.qya;
import defpackage.uwg;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends mj8 implements Function1<SpannableStringBuilder, j6g> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SpannableStringBuilder spannableStringBuilder) {
        String string;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.getClass();
        PackageInfo packageInfoA = uwg.a(this.$context);
        if (packageInfoA == null) {
            string = "not available";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfoA.versionName);
            sb.append(" (");
            sb.append(Build.VERSION.SDK_INT >= 28 ? qya.a(packageInfoA) : packageInfoA.versionCode);
            sb.append(')');
            string = sb.toString();
        }
        spannableStringBuilder2.append((CharSequence) ("Android: " + Build.VERSION.RELEASE + '\n'));
        spannableStringBuilder2.append((CharSequence) ("Manufacturer: " + Build.MANUFACTURER + '\n'));
        spannableStringBuilder2.append((CharSequence) ("Model: " + Build.MODEL + '\n'));
        spannableStringBuilder2.append((CharSequence) ("Product: " + Build.PRODUCT + '\n'));
        spannableStringBuilder2.append((CharSequence) ("Brand: " + Build.BRAND + '\n'));
        spannableStringBuilder2.append((CharSequence) ("WebView version: " + string + '\n'));
        StringBuilder sb2 = new StringBuilder("Current locale: ");
        c19 c19Var = c19.b;
        sb2.append(new c19(new e19(LocaleList.getDefault())));
        spannableStringBuilder2.append((CharSequence) sb2.toString());
        return j6g.a;
    }
}
