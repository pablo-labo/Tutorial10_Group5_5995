package com.wlappdebug;

import android.content.pm.Signature;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.ut0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends mj8 implements Function1<SpannableStringBuilder, j6g> {
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DebugActivity debugActivity) {
        super(1);
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.getClass();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) "Name: ");
        spannableStringBuilder2.setSpan(styleSpan, length, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.append((CharSequence) (DebugActivity.A(this.this$0).b() + '\n'));
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length2 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) "Id: ");
        spannableStringBuilder2.setSpan(styleSpan2, length2, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.append((CharSequence) DebugActivity.A(this.this$0).a().concat("\n"));
        StyleSpan styleSpan3 = new StyleSpan(1);
        int length3 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) "Build: ");
        spannableStringBuilder2.setSpan(styleSpan3, length3, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.append((CharSequence) (DebugActivity.A(this.this$0).d() + '\n'));
        DebugActivity debugActivity = this.this$0;
        Signature[] signatureArr = debugActivity.getPackageManager().getPackageInfo(debugActivity.getPackageName(), 64).signatures;
        spannableStringBuilder2.append((CharSequence) (signatureArr != null ? ut0.t0(signatureArr, "\n\n", null, null, h.a, 30) : ""));
        return j6g.a;
    }
}
